import org.apache.spark.mllib.classification.NaiveBayes  
import org.apache.spark.mllib.regression.LabeledPoint  
import org.apache.spark.{SparkContext, SparkConf}  
import org.apache.spark.mllib.feature.{IDF, HashingTF}
import org.apache.spark.rdd._
import org.apache.spark.mllib.linalg.Vector

//import scala.Vector

object ModelAndTrain {  
    val sparkConfig = new SparkConf().setAppName("Jobs Rating Classifier").setMaster("local[1]")
      val sc = new SparkContext(sparkConfig)
  def test() //main(args:Array[String])
    {

    

      /*
        This loads the data from HDFS.
        HDFS is a distributed file storage system so this technically 
        could be a very large multi terabyte file
      */      
      val dataFile = sc.textFile("/Users/preethi/Sites/scala/datathon16/datathon16/resources/hat_10_hattitle.txt")

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
val filtered = dataFile.filter { x =>  
           val c = x.split(";")
        c match {
             case Array(rating, synopsis) => 
               true
             case _ => false
           }
      }
      
      
      val ratings=filtered.map{x=>x.split(";")
        match {
          case Array(rating,synopsis) =>
            rating.toDouble
        }
      }
      
      
      //ratings.take(20).foreach(println);
      val synopsis_frequency_vector:RDD[Vector] = filtered.map{x=>
        val c = x.split(";")
        c match {
          case Array(rating,synopsis) =>
            val stemmed=Stemmer.tokenize(synopsis)
            hashingTF.transform(stemmed)
        }
      }

     // println("******** PRINTING ******")
      //synopsis_frequency_vector.take(1000).foreach(println) 
      synopsis_frequency_vector.cache()
println("finished")
      
      /*
       http://en.wikipedia.org/wiki/Tf%E2%80%93idf
       https://spark.apache.org/docs/1.3.0/mllib-feature-extraction.html
      */
    //}
      
 // def synopsis(synopsis_frequency_vector: RDD[Vector], ratings: RDD[Double], hashingTF: HashingTF) {

      
      val idf = new IDF().fit(synopsis_frequency_vector)
      val tfidf=idf.transform(synopsis_frequency_vector)

      /*produces (rating,vector) tuples*/
      val zipped=ratings.zip(tfidf)

      /*Now we transform them into LabeledPoints*/
      val labeledPoints = zipped.map{case (label,vector)=> LabeledPoint(label,vector)}

      val model = NaiveBayes.train(labeledPoints)

      /*--- Model is trained now we get it to classify our test file with only synopsis ---*/
      val testDataFile = sc.textFile("/Users/preethi/Sites/scala/datathon16/datathon16/resources/hat_neg_title.txt")

      /*We only have synopsis now. The rating is what we want to achieve.*/
      val testVectors=testDataFile.map{x=>
        val stemmed=Stemmer.tokenize(x)
        hashingTF.transform(stemmed)
      }
      testVectors.cache()

      val tfidf_test = idf.transform(testVectors)

      val result = model.predict(tfidf_test)

      //result.take(20).foreach(x=>println("Predicted rating for the title is: "+x))
      //testDataFile.take(20).foreach(x=>println("Predicted rating for the title is: "+x))
      //}
      println(result.count())
      println(testDataFile.count())
      val toIntResult = result.map ( x => x.toInt)
      toIntResult.saveAsTextFile("/tmp/CSVFolder")

    }
}
