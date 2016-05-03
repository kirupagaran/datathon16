import org.apache.spark.mllib.classification.NaiveBayes  
import org.apache.spark.mllib.regression.LabeledPoint  
import org.apache.spark.{SparkContext, SparkConf}  
import org.apache.spark.mllib.feature.{IDF, HashingTF}

object ModelAndTrain {  
  def main(args:Array[String])
    {

      val sparkConfig = new SparkConf().setAppName("Jobs Rating Classifier").setMaster("local[4]")
      val sc = new SparkContext(sparkConfig)

      /*
        This loads the data from HDFS.
        HDFS is a distributed file storage system so this technically 
        could be a very large multi terabyte file
      */      
      val dataFile = sc.textFile("hdfs://localhost/user/cloudera/kirupa/hat_10_hattitle.txt")

      /*
        HashingTF and IDF are helpers in MLlib that helps us vectorize our
        synopsis instead of doing it manually
      */       
      val hashingTF = new HashingTF()

      /*
        Our ultimate goal is to get our data into a collection of type LabeledPoint.
        The MLlib implementation uses LabeledPoints to train the Naive Bayes model.
        First we parse the file for ratings and vectorize the synopses
       */

      val ratings=dataFile.map{x=>x.split(";")
        match {
          case Array(rating,synopsis) =>
            rating.toDouble
        }
      }
      //ratings.take(20).foreach(println);
      val synopsis_frequency_vector=dataFile.map{x=>x.split(";")
        match {
          case Array(rating,synopsis) =>
            val stemmed=Stemmer.tokenize(synopsis)
            hashingTF.transform(stemmed)
        }
      }

      synopsis_frequency_vector.cache()

      /*
       http://en.wikipedia.org/wiki/Tf%E2%80%93idf
       https://spark.apache.org/docs/1.3.0/mllib-feature-extraction.html
      */
      val idf = new IDF().fit(synopsis_frequency_vector)
      //val tfidf=idf.transform(synopsis_frequency_vector)

      /*produces (rating,vector) tuples*/
      /*val zipped=ratings.zip(tfidf)

      /*Now we transform them into LabeledPoints*/
      val labeledPoints = zipped.map{case (label,vector)=> LabeledPoint(label,vector)}

      val model = NaiveBayes.train(labeledPoints)

      /*--- Model is trained now we get it to classify our test file with only synopsis ---*/
      val testDataFile = sc.textFile("hdfs://localhost/user/cloudera/kirupa/hat_neg_title.txt")

      /*We only have synopsis now. The rating is what we want to achieve.*/
      val testVectors=testDataFile.map{x=>
        val stemmed=Stemmer.tokenize(x)
        hashingTF.transform(stemmed)
      }
      testVectors.cache()

      val tfidf_test = idf.transform(testVectors)

      val result = model.predict(tfidf_test)

      result.collect.foreach(x=>println("Predicted rating for the title is: "+x))*/

    }
}
