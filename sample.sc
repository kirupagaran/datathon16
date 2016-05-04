object sample {

  println("Welcome to the Scala worksheets")      //> Welcome to the Scala worksheets
 	1+1                                       //> res0: Int(2) = 2
 	val j = ModelAndTrain.enablerFilter()     //> Using Spark's default log4j profile: org/apache/spark/log4j-defaults.propert
                                                  //| ies
                                                  //| 16/05/05 06:42:20 INFO SparkContext: Running Spark version 1.5.0
                                                  //| 16/05/05 06:42:20 WARN NativeCodeLoader: Unable to load native-hadoop librar
                                                  //| y for your platform... using builtin-java classes where applicable
                                                  //| 16/05/05 06:42:20 INFO SecurityManager: Changing view acls to: preethi
                                                  //| 16/05/05 06:42:20 INFO SecurityManager: Changing modify acls to: preethi
                                                  //| 16/05/05 06:42:20 INFO SecurityManager: SecurityManager: authentication disa
                                                  //| bled; ui acls disabled; users with view permissions: Set(preethi); users wit
                                                  //| h modify permissions: Set(preethi)
                                                  //| 16/05/05 06:42:21 INFO Slf4jLogger: Slf4jLogger started
                                                  //| 16/05/05 06:42:21 INFO Remoting: Starting remoting
                                                  //| 16/05/05 06:42:21 INFO Remoting: Remoting started; listening on addresses :[
                                                  //| akka.tcp://sparkDriver@192.168.1.2:60622]
                                                  //| 16/05/05 06:42:21 INFO Utils: Successfully started service 'sparkDriver' on 
                                                  //| port 60622.
                                                  //| 16/05/05 06:42:21 INFO SparkEnv: Registering MapOutputTracker
                                                  //| 16/05/05 06:42:21 INFO SparkEnv: Registering BlockManagerMaster
                                                  //| 16/05/05 06:42:21 INFO DiskBlockManager: Created local directory at /private
                                                  //| /var/folders/9h/xyqx6xy54bv94nz2_cg7r91r0000gq/T/blockmgr-759235d1-2839-4d4f
                                                  //| -81c0-6206ceb110e6
                                                  //| 16/05/05 06:42:21 INFO MemoryStore: MemoryStore started with capacity 1966.1
                                                  //|  MB
                                                  //| 16/05/05 06:42:21 INFO HttpFileServer: HTTP File server directory is /privat
                                                  //| e/var/folders/9h/xyqx6xy54bv94nz2_cg7r91r0000gq/T/spark-670fea8c-1b5b-4d02-a
                                                  //| a71-26ea85787e30/httpd-a1cb4796-2d0b-4278-8016-97046dcc84c9
                                                  //| 16/05/05 06:42:21 INFO HttpServer: Starting HTTP Server
                                                  //| 16/05/05 06:42:21 INFO Utils: Successfully started service 'HTTP file server
                                                  //| ' on port 60623.
                                                  //| 16/05/05 06:42:21 INFO SparkEnv: Registering OutputCommitCoordinator
                                                  //| 16/05/05 06:42:21 INFO Utils: Successfully started service 'SparkUI' on port
                                                  //|  4040.
                                                  //| 16/05/05 06:42:21 INFO SparkUI: Started SparkUI at http://192.168.1.2:4040
                                                  //| 16/05/05 06:42:22 WARN MetricsSystem: Using default name DAGScheduler for so
                                                  //| urce because spark.app.id is not set.
                                                  //| 16/05/05 06:42:22 INFO Executor: Starting executor ID driver on host localho
                                                  //| st
                                                  //| 16/05/05 06:42:22 INFO Utils: Successfully started service 'org.apache.spark
                                                  //| .network.netty.NettyBlockTransferService' on port 60624.
                                                  //| 16/05/05 06:42:22 INFO NettyBlockTransferService: Server created on 60624
                                                  //| 16/05/05 06:42:22 INFO BlockManagerMaster: Trying to register BlockManager
                                                  //| 16/05/05 06:42:22 INFO BlockManagerMasterEndpoint: Registering block manager
                                                  //|  localhost:60624 with 1966.1 MB RAM, BlockManagerId(driver, localhost, 60624
                                                  //| )
                                                  //| 16/05/05 06:42:22 INFO BlockManagerMaster: Registered BlockManager
                                                  //| 16/05/05 06:42:23 INFO MemoryStore: ensureFreeSpace(110248) called with curM
                                                  //| em=0, maxMem=2061647216
                                                  //| 16/05/05 06:42:23 INFO MemoryStore: Block broadcast_0 stored as values in me
                                                  //| mory (estimated size 107.7 KB, free 1966.0 MB)
                                                  //| 16/05/05 06:42:23 INFO MemoryStore: ensureFreeSpace(10065) called with curMe
                                                  //| m=110248, maxMem=2061647216
                                                  //| 16/05/05 06:42:23 INFO MemoryStore: Block broadcast_0_piece0 stored as bytes
                                                  //|  in memory (estimated size 9.8 KB, free 1966.0 MB)
                                                  //| 16/05/05 06:42:23 INFO BlockManagerInfo: Added broadcast_0_piece0 in memory 
                                                  //| on localhost:60624 (size: 9.8 KB, free: 1966.1 MB)
                                                  //| 16/05/05 06:42:23 INFO SparkContext: Created broadcast 0 from textFile at Te
                                                  //| xtFile.scala:30
                                                  //| 16/05/05 06:42:23 INFO FileInputFormat: Total input paths to process : 1
                                                  //| 16/05/05 06:42:23 INFO SparkContext: Starting job: first at CsvRelation.scal
                                                  //| a:267
                                                  //| 16/05/05 06:42:23 INFO DAGScheduler: Got job 0 (first at CsvRelation.scala:2
                                                  //| 67) with 1 output partitions
                                                  //| 16/05/05 06:42:23 INFO DAGScheduler: Final stage: ResultStage 0(first at Csv
                                                  //| Relation.scala:267)
                                                  //| 16/05/05 06:42:23 INFO DAGScheduler: Parents of final stage: List()
                                                  //| 16/05/05 06:42:23 INFO DAGScheduler: Missing parents: List()
                                                  //| 16/05/05 06:42:23 INFO DAGScheduler: Submitting ResultStage 0 (MapPartitions
                                                  //| RDD[2] at filter at CsvRelation.scala:265), which has no missing parents
                                                  //| 16/05/05 06:42:23 INFO MemoryStore: ensureFreeSpace(4824) called with curMem
                                                  //| =120313, maxMem=2061647216
                                                  //| 16/05/05 06:42:23 INFO MemoryStore: Block broadcast_1 stored as values in me
                                                  //| mory (estimated size 4.7 KB, free 1966.0 MB)
                                                  //| 16/05/05 06:42:23 INFO MemoryStore: ensureFreeSpace(2838) called with curMem
                                                  //| =125137, maxMem=2061647216
                                                  //| 16/05/05 06:42:23 INFO MemoryStore: Block broadcast_1_piece0 stored as bytes
                                                  //|  in memory (estimated size 2.8 KB, free 1966.0 MB)
                                                  //| 16/05/05 06:42:23 INFO BlockManagerInfo: Added broadcast_1_piece0 in memory 
                                                  //| on localhost:60624 (size: 2.8 KB, free: 1966.1 MB)
                                                  //| 16/05/05 06:42:23 INFO SparkContext: Created broadcast 1 from broadcast at D
                                                  //| AGScheduler.scala:861
                                                  //| 16/05/05 06:42:23 INFO DAGScheduler: Submitting 1 missing tasks from ResultS
                                                  //| tage 0 (MapPartitionsRDD[2] at filter at CsvRelation.scala:265)
                                                  //| 16/05/05 06:42:23 INFO TaskSchedulerImpl: Adding task set 0.0 with 1 tasks
                                                  //| 16/05/05 06:42:23 INFO TaskSetManager: Starting task 0.0 in stage 0.0 (TID 0
                                                  //| , localhost, PROCESS_LOCAL, 2198 bytes)
                                                  //| 16/05/05 06:42:23 INFO Executor: Running task 0.0 in stage 0.0 (TID 0)
                                                  //| 16/05/05 06:42:23 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/job_clicks_all_V2.csv:0+33336163
                                                  //| 16/05/05 06:42:23 INFO deprecation: mapred.tip.id is deprecated. Instead, us
                                                  //| e mapreduce.task.id
                                                  //| 16/05/05 06:42:23 INFO deprecation: mapred.task.id is deprecated. Instead, u
                                                  //| se mapreduce.task.attempt.id
                                                  //| 16/05/05 06:42:23 INFO deprecation: mapred.task.is.map is deprecated. Instea
                                                  //| d, use mapreduce.task.ismap
                                                  //| 16/05/05 06:42:23 INFO deprecation: mapred.task.partition is deprecated. Ins
                                                  //| tead, use mapreduce.task.partition
                                                  //| 16/05/05 06:42:23 INFO deprecation: mapred.job.id is deprecated. Instead, us
                                                  //| e mapreduce.job.id
                                                  //| 16/05/05 06:42:23 INFO Executor: Finished task 0.0 in stage 0.0 (TID 0). 209
                                                  //| 3 bytes result sent to driver
                                                  //| 16/05/05 06:42:23 INFO TaskSetManager: Finished task 0.0 in stage 0.0 (TID 0
                                                  //| ) in 87 ms on localhost (1/1)
                                                  //| 16/05/05 06:42:23 INFO TaskSchedulerImpl: Removed TaskSet 0.0, whose tasks h
                                                  //| ave all completed, from pool 
                                                  //| 16/05/05 06:42:23 INFO DAGScheduler: ResultStage 0 (first at CsvRelation.sca
                                                  //| la:267) finished in 0.101 s
                                                  //| 16/05/05 06:42:23 INFO DAGScheduler: Job 0 finished: first at CsvRelation.sc
                                                  //| ala:267, took 0.157295 s
                                                  //| 16/05/05 06:42:23 INFO BlockManagerInfo: Removed broadcast_1_piece0 on local
                                                  //| host:60624 in memory (size: 2.8 KB, free: 1966.1 MB)
                                                  //| 16/05/05 06:42:23 INFO ContextCleaner: Cleaned accumulator 1
                                                  //| 16/05/05 06:42:23 INFO BlockManagerInfo: Removed broadcast_0_piece0 on local
                                                  //| host:60624 in memory (size: 9.8 KB, free: 1966.1 MB)
                                                  //| 16/05/05 06:42:24 INFO MemoryStore: ensureFreeSpace(61016) called with curMe
                                                  //| m=0, maxMem=2061647216
                                                  //| 16/05/05 06:42:24 INFO MemoryStore: Block broadcast_2 stored as values in me
                                                  //| mory (estimated size 59.6 KB, free 1966.1 MB)
                                                  //| 16/05/05 06:42:24 INFO MemoryStore: ensureFreeSpace(14119) called with curMe
                                                  //| m=61016, maxMem=2061647216
                                                  //| 16/05/05 06:42:24 INFO MemoryStore: Block broadcast_2_piece0 stored as bytes
                                                  //|  in memory (estimated size 13.8 KB, free 1966.1 MB)
                                                  //| 16/05/05 06:42:24 INFO BlockManagerInfo: Added broadcast_2_piece0 in memory 
                                                  //| on localhost:60624 (size: 13.8 KB, free: 1966.1 MB)
                                                  //| 16/05/05 06:42:24 INFO SparkContext: Created broadcast 2 from textFile at Te
                                                  //| xtFile.scala:30
                                                  //| 16/05/05 06:42:24 INFO FileInputFormat: Total input paths to process : 1
                                                  //| 16/05/05 06:42:24 INFO SparkContext: Starting job: aggregate at InferSchema.
                                                  //| scala:41
                                                  //| 16/05/05 06:42:24 INFO DAGScheduler: Got job 1 (aggregate at InferSchema.sca
                                                  //| la:41) with 1 output partitions
                                                  //| 16/05/05 06:42:24 INFO DAGScheduler: Final stage: ResultStage 1(aggregate at
                                                  //|  InferSchema.scala:41)
                                                  //| 16/05/05 06:42:24 INFO DAGScheduler: Parents of final stage: List()
                                                  //| 16/05/05 06:42:24 INFO DAGScheduler: Missing parents: List()
                                                  //| 16/05/05 06:42:24 INFO DAGScheduler: Submitting ResultStage 1 (MapPartitions
                                                  //| RDD[5] at mapPartitions at CsvRelation.scala:91), which has no missing paren
                                                  //| ts
                                                  //| 16/05/05 06:42:24 INFO MemoryStore: ensureFreeSpace(5864) called with curMem
                                                  //| =75135, maxMem=2061647216
                                                  //| 16/05/05 06:42:24 INFO MemoryStore: Block broadcast_3 stored as values in me
                                                  //| mory (estimated size 5.7 KB, free 1966.1 MB)
                                                  //| 16/05/05 06:42:24 INFO MemoryStore: ensureFreeSpace(3387) called with curMem
                                                  //| =80999, maxMem=2061647216
                                                  //| 16/05/05 06:42:24 INFO MemoryStore: Block broadcast_3_piece0 stored as bytes
                                                  //|  in memory (estimated size 3.3 KB, free 1966.1 MB)
                                                  //| 16/05/05 06:42:24 INFO BlockManagerInfo: Added broadcast_3_piece0 in memory 
                                                  //| on localhost:60624 (size: 3.3 KB, free: 1966.1 MB)
                                                  //| 16/05/05 06:42:24 INFO SparkContext: Created broadcast 3 from broadcast at D
                                                  //| AGScheduler.scala:861
                                                  //| 16/05/05 06:42:24 INFO DAGScheduler: Submitting 1 missing tasks from ResultS
                                                  //| tage 1 (MapPartitionsRDD[5] at mapPartitions at CsvRelation.scala:91)
                                                  //| 16/05/05 06:42:24 INFO TaskSchedulerImpl: Adding task set 1.0 with 1 tasks
                                                  //| 16/05/05 06:42:24 INFO TaskSetManager: Starting task 0.0 in stage 1.0 (TID 1
                                                  //| , localhost, PROCESS_LOCAL, 2198 bytes)
                                                  //| 16/05/05 06:42:24 INFO Executor: Running task 0.0 in stage 1.0 (TID 1)
                                                  //| 16/05/05 06:42:24 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/job_clicks_all_V2.csv:0+33336163
                                                  //| 16/05/05 06:42:26 INFO Executor: Finished task 0.0 in stage 1.0 (TID 1). 211
                                                  //| 8 bytes result sent to driver
                                                  //| 16/05/05 06:42:26 INFO TaskSetManager: Finished task 0.0 in stage 1.0 (TID 1
                                                  //| ) in 2421 ms on localhost (1/1)
                                                  //| 16/05/05 06:42:26 INFO DAGScheduler: ResultStage 1 (aggregate at InferSchema
                                                  //| .scala:41) finished in 2.421 s
                                                  //| 16/05/05 06:42:26 INFO TaskSchedulerImpl: Removed TaskSet 1.0, whose tasks h
                                                  //| ave all completed, from pool 
                                                  //| 16/05/05 06:42:26 INFO DAGScheduler: Job 1 finished: aggregate at InferSchem
                                                  //| a.scala:41, took 2.432582 s
                                                  //| 16/05/05 06:42:26 INFO MemoryStore: ensureFreeSpace(130208) called with curM
                                                  //| em=84386, maxMem=2061647216
                                                  //| 16/05/05 06:42:26 INFO MemoryStore: Block broadcast_4 stored as values in me
                                                  //| mory (estimated size 127.2 KB, free 1965.9 MB)
                                                  //| 16/05/05 06:42:26 INFO MemoryStore: ensureFreeSpace(14119) called with curMe
                                                  //| m=214594, maxMem=2061647216
                                                  //| 16/05/05 06:42:26 INFO MemoryStore: Block broadcast_4_piece0 stored as bytes
                                                  //|  in memory (estimated size 13.8 KB, free 1965.9 MB)
                                                  //| 16/05/05 06:42:26 INFO BlockManagerInfo: Added broadcast_4_piece0 in memory 
                                                  //| on localhost:60624 (size: 13.8 KB, free: 1966.1 MB)
                                                  //| 16/05/05 06:42:26 INFO SparkContext: Created broadcast 4 from textFile at Te
                                                  //| xtFile.scala:30
                                                  //| 16/05/05 06:42:26 INFO FileInputFormat: Total input paths to process : 1
                                                  //| 16/05/05 06:42:26 INFO SparkContext: Starting job: first at CsvRelation.scal
                                                  //| a:267
                                                  //| 16/05/05 06:42:26 INFO DAGScheduler: Got job 2 (first at CsvRelation.scala:2
                                                  //| 67) with 1 output partitions
                                                  //| 16/05/05 06:42:26 INFO DAGScheduler: Final stage: ResultStage 2(first at Csv
                                                  //| Relation.scala:267)
                                                  //| 16/05/05 06:42:26 INFO DAGScheduler: Parents of final stage: List()
                                                  //| 16/05/05 06:42:26 INFO DAGScheduler: Missing parents: List()
                                                  //| 16/05/05 06:42:26 INFO DAGScheduler: Submitting ResultStage 2 (MapPartitions
                                                  //| RDD[8] at filter at CsvRelation.scala:265), which has no missing parents
                                                  //| 16/05/05 06:42:26 INFO MemoryStore: ensureFreeSpace(4816) called with curMem
                                                  //| =228713, maxMem=2061647216
                                                  //| 16/05/05 06:42:26 INFO MemoryStore: Block broadcast_5 stored as values in me
                                                  //| mory (estimated size 4.7 KB, free 1965.9 MB)
                                                  //| 16/05/05 06:42:26 INFO MemoryStore: ensureFreeSpace(2832) called with curMem
                                                  //| =233529, maxMem=2061647216
                                                  //| 16/05/05 06:42:26 INFO MemoryStore: Block broadcast_5_piece0 stored as bytes
                                                  //|  in memory (estimated size 2.8 KB, free 1965.9 MB)
                                                  //| 16/05/05 06:42:26 INFO BlockManagerInfo: Added broadcast_5_piece0 in memory 
                                                  //| on localhost:60624 (size: 2.8 KB, free: 1966.1 MB)
                                                  //| 16/05/05 06:42:26 INFO SparkContext: Created broadcast 5 from broadcast at D
                                                  //| AGScheduler.scala:861
                                                  //| 16/05/05 06:42:26 INFO DAGScheduler: Submitting 1 missing tasks from ResultS
                                                  //| tage 2 (MapPartitionsRDD[8] at filter at CsvRelation.scala:265)
                                                  //| 16/05/05 06:42:26 INFO TaskSchedulerImpl: Adding task set 2.0 with 1 tasks
                                                  //| 16/05/05 06:42:26 INFO TaskSetManager: Starting task 0.0 in stage 2.0 (TID 2
                                                  //| , localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:26 INFO Executor: Running task 0.0 in stage 2.0 (TID 2)
                                                  //| 16/05/05 06:42:26 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:0+33554432
                                                  //| 16/05/05 06:42:26 INFO Executor: Finished task 0.0 in stage 2.0 (TID 2). 216
                                                  //| 3 bytes result sent to driver
                                                  //| 16/05/05 06:42:26 INFO TaskSetManager: Finished task 0.0 in stage 2.0 (TID 2
                                                  //| ) in 16 ms on localhost (1/1)
                                                  //| 16/05/05 06:42:26 INFO DAGScheduler: ResultStage 2 (first at CsvRelation.sca
                                                  //| la:267) finished in 0.017 s
                                                  //| 16/05/05 06:42:26 INFO TaskSchedulerImpl: Removed TaskSet 2.0, whose tasks h
                                                  //| ave all completed, from pool 
                                                  //| 16/05/05 06:42:26 INFO DAGScheduler: Job 2 finished: first at CsvRelation.sc
                                                  //| ala:267, took 0.027429 s
                                                  //| 16/05/05 06:42:26 INFO MemoryStore: ensureFreeSpace(130208) called with curM
                                                  //| em=236361, maxMem=2061647216
                                                  //| 16/05/05 06:42:26 INFO MemoryStore: Block broadcast_6 stored as values in me
                                                  //| mory (estimated size 127.2 KB, free 1965.8 MB)
                                                  //| 16/05/05 06:42:26 INFO MemoryStore: ensureFreeSpace(14119) called with curMe
                                                  //| m=366569, maxMem=2061647216
                                                  //| 16/05/05 06:42:26 INFO MemoryStore: Block broadcast_6_piece0 stored as bytes
                                                  //|  in memory (estimated size 13.8 KB, free 1965.8 MB)
                                                  //| 16/05/05 06:42:26 INFO BlockManagerInfo: Added broadcast_6_piece0 in memory 
                                                  //| on localhost:60624 (size: 13.8 KB, free: 1966.1 MB)
                                                  //| 16/05/05 06:42:26 INFO SparkContext: Created broadcast 6 from textFile at Te
                                                  //| xtFile.scala:30
                                                  //| 16/05/05 06:42:27 INFO FileInputFormat: Total input paths to process : 1
                                                  //| 16/05/05 06:42:27 INFO SparkContext: Starting job: aggregate at InferSchema.
                                                  //| scala:41
                                                  //| 16/05/05 06:42:27 INFO DAGScheduler: Got job 3 (aggregate at InferSchema.sca
                                                  //| la:41) with 20 output partitions
                                                  //| 16/05/05 06:42:27 INFO DAGScheduler: Final stage: ResultStage 3(aggregate at
                                                  //|  InferSchema.scala:41)
                                                  //| 16/05/05 06:42:27 INFO DAGScheduler: Parents of final stage: List()
                                                  //| 16/05/05 06:42:27 INFO DAGScheduler: Missing parents: List()
                                                  //| 16/05/05 06:42:27 INFO DAGScheduler: Submitting ResultStage 3 (MapPartitions
                                                  //| RDD[11] at mapPartitions at CsvRelation.scala:91), which has no missing pare
                                                  //| nts
                                                  //| 16/05/05 06:42:27 INFO MemoryStore: ensureFreeSpace(6000) called with curMem
                                                  //| =380688, maxMem=2061647216
                                                  //| 16/05/05 06:42:27 INFO MemoryStore: Block broadcast_7 stored as values in me
                                                  //| mory (estimated size 5.9 KB, free 1965.8 MB)
                                                  //| 16/05/05 06:42:27 INFO MemoryStore: ensureFreeSpace(3435) called with curMem
                                                  //| =386688, maxMem=2061647216
                                                  //| 16/05/05 06:42:27 INFO MemoryStore: Block broadcast_7_piece0 stored as bytes
                                                  //|  in memory (estimated size 3.4 KB, free 1965.8 MB)
                                                  //| 16/05/05 06:42:27 INFO BlockManagerInfo: Added broadcast_7_piece0 in memory 
                                                  //| on localhost:60624 (size: 3.4 KB, free: 1966.1 MB)
                                                  //| 16/05/05 06:42:27 INFO SparkContext: Created broadcast 7 from broadcast at D
                                                  //| AGScheduler.scala:861
                                                  //| 16/05/05 06:42:27 INFO DAGScheduler: Submitting 20 missing tasks from Result
                                                  //| Stage 3 (MapPartitionsRDD[11] at mapPartitions at CsvRelation.scala:91)
                                                  //| 16/05/05 06:42:27 INFO TaskSchedulerImpl: Adding task set 3.0 with 20 tasks
                                                  //| 16/05/05 06:42:27 INFO TaskSetManager: Starting task 0.0 in stage 3.0 (TID 3
                                                  //| , localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:27 INFO Executor: Running task 0.0 in stage 3.0 (TID 3)
                                                  //| 16/05/05 06:42:27 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:0+33554432
                                                  //| 16/05/05 06:42:27 INFO BlockManagerInfo: Removed broadcast_4_piece0 on local
                                                  //| host:60624 in memory (size: 13.8 KB, free: 1966.1 MB)
                                                  //| 16/05/05 06:42:27 INFO ContextCleaner: Cleaned accumulator 3
                                                  //| 16/05/05 06:42:27 INFO BlockManagerInfo: Removed broadcast_5_piece0 on local
                                                  //| host:60624 in memory (size: 2.8 KB, free: 1966.1 MB)
                                                  //| 16/05/05 06:42:27 INFO Executor: Finished task 0.0 in stage 3.0 (TID 3). 211
                                                  //| 8 bytes result sent to driver
                                                  //| 16/05/05 06:42:27 INFO TaskSetManager: Starting task 1.0 in stage 3.0 (TID 4
                                                  //| , localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:27 INFO Executor: Running task 1.0 in stage 3.0 (TID 4)
                                                  //| 16/05/05 06:42:27 INFO TaskSetManager: Finished task 0.0 in stage 3.0 (TID 3
                                                  //| ) in 649 ms on localhost (1/20)
                                                  //| 16/05/05 06:42:27 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:33554432+33554432
                                                  //| 16/05/05 06:42:28 INFO Executor: Finished task 1.0 in stage 3.0 (TID 4). 211
                                                  //| 8 bytes result sent to driver
                                                  //| 16/05/05 06:42:28 INFO TaskSetManager: Starting task 2.0 in stage 3.0 (TID 5
                                                  //| , localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:28 INFO Executor: Running task 2.0 in stage 3.0 (TID 5)
                                                  //| 16/05/05 06:42:28 INFO TaskSetManager: Finished task 1.0 in stage 3.0 (TID 4
                                                  //| ) in 559 ms on localhost (2/20)
                                                  //| 16/05/05 06:42:28 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:67108864+33554432
                                                  //| 16/05/05 06:42:28 INFO Executor: Finished task 2.0 in stage 3.0 (TID 5). 211
                                                  //| 8 bytes result sent to driver
                                                  //| 16/05/05 06:42:28 INFO TaskSetManager: Starting task 3.0 in stage 3.0 (TID 6
                                                  //| , localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:28 INFO Executor: Running task 3.0 in stage 3.0 (TID 6)
                                                  //| 16/05/05 06:42:28 INFO TaskSetManager: Finished task 2.0 in stage 3.0 (TID 5
                                                  //| ) in 756 ms on localhost (3/20)
                                                  //| 16/05/05 06:42:28 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:100663296+33554432
                                                  //| 16/05/05 06:42:29 INFO Executor: Finished task 3.0 in stage 3.0 (TID 6). 211
                                                  //| 8 bytes result sent to driver
                                                  //| 16/05/05 06:42:29 INFO TaskSetManager: Starting task 4.0 in stage 3.0 (TID 7
                                                  //| , localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:29 INFO Executor: Running task 4.0 in stage 3.0 (TID 7)
                                                  //| 16/05/05 06:42:29 INFO TaskSetManager: Finished task 3.0 in stage 3.0 (TID 6
                                                  //| ) in 589 ms on localhost (4/20)
                                                  //| 16/05/05 06:42:29 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:134217728+33554432
                                                  //| 16/05/05 06:42:30 INFO Executor: Finished task 4.0 in stage 3.0 (TID 7). 211
                                                  //| 8 bytes result sent to driver
                                                  //| 16/05/05 06:42:30 INFO TaskSetManager: Starting task 5.0 in stage 3.0 (TID 8
                                                  //| , localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:30 INFO Executor: Running task 5.0 in stage 3.0 (TID 8)
                                                  //| 16/05/05 06:42:30 INFO TaskSetManager: Finished task 4.0 in stage 3.0 (TID 7
                                                  //| ) in 572 ms on localhost (5/20)
                                                  //| 16/05/05 06:42:30 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:167772160+33554432
                                                  //| 16/05/05 06:42:30 INFO Executor: Finished task 5.0 in stage 3.0 (TID 8). 211
                                                  //| 8 bytes result sent to driver
                                                  //| 16/05/05 06:42:30 INFO TaskSetManager: Starting task 6.0 in stage 3.0 (TID 9
                                                  //| , localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:30 INFO Executor: Running task 6.0 in stage 3.0 (TID 9)
                                                  //| 16/05/05 06:42:30 INFO TaskSetManager: Finished task 5.0 in stage 3.0 (TID 8
                                                  //| ) in 647 ms on localhost (6/20)
                                                  //| 16/05/05 06:42:30 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:201326592+33554432
                                                  //| 16/05/05 06:42:31 INFO Executor: Finished task 6.0 in stage 3.0 (TID 9). 211
                                                  //| 8 bytes result sent to driver
                                                  //| 16/05/05 06:42:31 INFO TaskSetManager: Starting task 7.0 in stage 3.0 (TID 1
                                                  //| 0, localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:31 INFO Executor: Running task 7.0 in stage 3.0 (TID 10)
                                                  //| 16/05/05 06:42:31 INFO TaskSetManager: Finished task 6.0 in stage 3.0 (TID 9
                                                  //| ) in 649 ms on localhost (7/20)
                                                  //| 16/05/05 06:42:31 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:234881024+33554432
                                                  //| 16/05/05 06:42:32 INFO Executor: Finished task 7.0 in stage 3.0 (TID 10). 21
                                                  //| 18 bytes result sent to driver
                                                  //| 16/05/05 06:42:32 INFO TaskSetManager: Starting task 8.0 in stage 3.0 (TID 1
                                                  //| 1, localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:32 INFO Executor: Running task 8.0 in stage 3.0 (TID 11)
                                                  //| 16/05/05 06:42:32 INFO TaskSetManager: Finished task 7.0 in stage 3.0 (TID 1
                                                  //| 0) in 686 ms on localhost (8/20)
                                                  //| 16/05/05 06:42:32 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:268435456+33554432
                                                  //| 16/05/05 06:42:32 INFO Executor: Finished task 8.0 in stage 3.0 (TID 11). 21
                                                  //| 18 bytes result sent to driver
                                                  //| 16/05/05 06:42:32 INFO TaskSetManager: Starting task 9.0 in stage 3.0 (TID 1
                                                  //| 2, localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:32 INFO Executor: Running task 9.0 in stage 3.0 (TID 12)
                                                  //| 16/05/05 06:42:32 INFO TaskSetManager: Finished task 8.0 in stage 3.0 (TID 1
                                                  //| 1) in 671 ms on localhost (9/20)
                                                  //| 16/05/05 06:42:32 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:301989888+33554432
                                                  //| 16/05/05 06:42:33 INFO Executor: Finished task 9.0 in stage 3.0 (TID 12). 21
                                                  //| 18 bytes result sent to driver
                                                  //| 16/05/05 06:42:33 INFO TaskSetManager: Starting task 10.0 in stage 3.0 (TID 
                                                  //| 13, localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:33 INFO TaskSetManager: Finished task 9.0 in stage 3.0 (TID 1
                                                  //| 2) in 693 ms on localhost (10/20)
                                                  //| 16/05/05 06:42:33 INFO Executor: Running task 10.0 in stage 3.0 (TID 13)
                                                  //| 16/05/05 06:42:33 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:335544320+33554432
                                                  //| 16/05/05 06:42:34 INFO Executor: Finished task 10.0 in stage 3.0 (TID 13). 2
                                                  //| 118 bytes result sent to driver
                                                  //| 16/05/05 06:42:34 INFO TaskSetManager: Starting task 11.0 in stage 3.0 (TID 
                                                  //| 14, localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:34 INFO Executor: Running task 11.0 in stage 3.0 (TID 14)
                                                  //| 16/05/05 06:42:34 INFO TaskSetManager: Finished task 10.0 in stage 3.0 (TID 
                                                  //| 13) in 689 ms on localhost (11/20)
                                                  //| 16/05/05 06:42:34 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:369098752+33554432
                                                  //| 16/05/05 06:42:34 INFO Executor: Finished task 11.0 in stage 3.0 (TID 14). 2
                                                  //| 118 bytes result sent to driver
                                                  //| 16/05/05 06:42:34 INFO TaskSetManager: Starting task 12.0 in stage 3.0 (TID 
                                                  //| 15, localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:34 INFO Executor: Running task 12.0 in stage 3.0 (TID 15)
                                                  //| 16/05/05 06:42:34 INFO TaskSetManager: Finished task 11.0 in stage 3.0 (TID 
                                                  //| 14) in 643 ms on localhost (12/20)
                                                  //| 16/05/05 06:42:34 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:402653184+33554432
                                                  //| 16/05/05 06:42:35 INFO Executor: Finished task 12.0 in stage 3.0 (TID 15). 2
                                                  //| 118 bytes result sent to driver
                                                  //| 16/05/05 06:42:35 INFO TaskSetManager: Starting task 13.0 in stage 3.0 (TID 
                                                  //| 16, localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:35 INFO Executor: Running task 13.0 in stage 3.0 (TID 16)
                                                  //| 16/05/05 06:42:35 INFO TaskSetManager: Finished task 12.0 in stage 3.0 (TID 
                                                  //| 15) in 649 ms on localhost (13/20)
                                                  //| 16/05/05 06:42:35 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:436207616+33554432
                                                  //| 16/05/05 06:42:36 INFO Executor: Finished task 13.0 in stage 3.0 (TID 16). 2
                                                  //| 118 bytes result sent to driver
                                                  //| 16/05/05 06:42:36 INFO TaskSetManager: Starting task 14.0 in stage 3.0 (TID 
                                                  //| 17, localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:36 INFO Executor: Running task 14.0 in stage 3.0 (TID 17)
                                                  //| 16/05/05 06:42:36 INFO TaskSetManager: Finished task 13.0 in stage 3.0 (TID 
                                                  //| 16) in 643 ms on localhost (14/20)
                                                  //| 16/05/05 06:42:36 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:469762048+33554432
                                                  //| 16/05/05 06:42:36 INFO Executor: Finished task 14.0 in stage 3.0 (TID 17). 2
                                                  //| 118 bytes result sent to driver
                                                  //| 16/05/05 06:42:36 INFO TaskSetManager: Starting task 15.0 in stage 3.0 (TID 
                                                  //| 18, localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:36 INFO Executor: Running task 15.0 in stage 3.0 (TID 18)
                                                  //| 16/05/05 06:42:36 INFO TaskSetManager: Finished task 14.0 in stage 3.0 (TID 
                                                  //| 17) in 626 ms on localhost (15/20)
                                                  //| 16/05/05 06:42:36 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:503316480+33554432
                                                  //| 16/05/05 06:42:37 INFO Executor: Finished task 15.0 in stage 3.0 (TID 18). 2
                                                  //| 118 bytes result sent to driver
                                                  //| 16/05/05 06:42:37 INFO TaskSetManager: Starting task 16.0 in stage 3.0 (TID 
                                                  //| 19, localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:37 INFO Executor: Running task 16.0 in stage 3.0 (TID 19)
                                                  //| 16/05/05 06:42:37 INFO TaskSetManager: Finished task 15.0 in stage 3.0 (TID 
                                                  //| 18) in 583 ms on localhost (16/20)
                                                  //| 16/05/05 06:42:37 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:536870912+33554432
                                                  //| 16/05/05 06:42:37 INFO Executor: Finished task 16.0 in stage 3.0 (TID 19). 2
                                                  //| 118 bytes result sent to driver
                                                  //| 16/05/05 06:42:37 INFO TaskSetManager: Starting task 17.0 in stage 3.0 (TID 
                                                  //| 20, localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:37 INFO Executor: Running task 17.0 in stage 3.0 (TID 20)
                                                  //| 16/05/05 06:42:37 INFO TaskSetManager: Finished task 16.0 in stage 3.0 (TID 
                                                  //| 19) in 583 ms on localhost (17/20)
                                                  //| 16/05/05 06:42:37 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:570425344+33554432
                                                  //| 16/05/05 06:42:38 INFO Executor: Finished task 17.0 in stage 3.0 (TID 20). 2
                                                  //| 118 bytes result sent to driver
                                                  //| 16/05/05 06:42:38 INFO TaskSetManager: Starting task 18.0 in stage 3.0 (TID 
                                                  //| 21, localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:38 INFO Executor: Running task 18.0 in stage 3.0 (TID 21)
                                                  //| 16/05/05 06:42:38 INFO TaskSetManager: Finished task 17.0 in stage 3.0 (TID 
                                                  //| 20) in 569 ms on localhost (18/20)
                                                  //| 16/05/05 06:42:38 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:603979776+33554432
                                                  //| 16/05/05 06:42:39 INFO Executor: Finished task 18.0 in stage 3.0 (TID 21). 2
                                                  //| 118 bytes result sent to driver
                                                  //| 16/05/05 06:42:39 INFO TaskSetManager: Starting task 19.0 in stage 3.0 (TID 
                                                  //| 22, localhost, PROCESS_LOCAL, 2189 bytes)
                                                  //| 16/05/05 06:42:39 INFO Executor: Running task 19.0 in stage 3.0 (TID 22)
                                                  //| 16/05/05 06:42:39 INFO TaskSetManager: Finished task 18.0 in stage 3.0 (TID 
                                                  //| 21) in 566 ms on localhost (19/20)
                                                  //| 16/05/05 06:42:39 INFO HadoopRDD: Input split: file:/Users/preethi/Documents
                                                  //| /Datathon2016/MelbourneDatathon2016/v2/jobs_all.csv:637534208+12152584
                                                  //| 16/05/05 06:42:39 INFO Executor: Finished task 19.0 in stage 3.0 (TID 22). 2
                                                  //| 118 bytes result sent to driver
                                                  //| 16/05/05 06:42:39 INFO TaskSetManager: Finished task 19.0 in stage 3.0 (TID 
                                                  //| 22) in 203 ms on localhost (20/20)
                                                  //| 16/05/05 06:42:39 INFO TaskSchedulerImpl: Removed TaskSet 3.0, whose tasks h
                                                  //| ave all completed, from pool 
                                                  //| 16/05/05 06:42:39 INFO DAGScheduler: ResultStage 3 (aggregate at InferSchema
                                                  //| .scala:41) finished in 12.199 s
                                                  //| 16/05/05 06:42:39 INFO DAGScheduler: Job 3 finished: aggregate at InferSchem
                                                  //| a.scala:41, took 12.210044 s
                                                  //| org.apache.spark.sql.AnalysisException: cannot resolve 'hat' given input col
                                                  //| umns job_id	title	raw_location	location_id	subclasses	salary_t
                                                  //| ype	salary_min	salary_max	raw_job_type	abstract	Segment	
                                                  //| hat;
                                                  //| 	at org.apache.spark.sql.catalyst.analysis.package$AnalysisErrorAt.failAn
                                                  //| alysis(package.scala:42)
                                                  //| 	at org.apache.spark.sql.catalyst.analysis.CheckAnalysis$$anonfun$checkAn
                                                  //| alysis$1$$anonfun$apply$2.applyOrElse(CheckAnalysis.scala:56)
                                                  //| 	at org.apache.spark.sql.catalyst.analysis.CheckAnalysis$$anonfun$checkAn
                                                  //| alysis$1$$anonfun$apply$2.applyOrElse(CheckAnalysis.scala:53)
                                                  //| 	at org.apache.spark.sql.catalyst.trees.TreeNode$$anonfun$transformUp$1.a
                                                  //| pply(TreeNode.scala:293)
                                                  //| 	at org.apache.spark.sql.catalyst.trees.TreeNode$$anonfun$transformUp$1.a
                                                  //| pply(TreeNode.scala:293)
                                                  //| 	at org.apache.spark.sql.catalyst.trees.CurrentOrigin$.withOrigin(TreeNod
                                                  //| e.scala:51)
                                                  //| 	at org.apache.spark.sql.catalyst.trees.TreeNode.transformUp(TreeNode.sca
                                                  //| la:292)
                                                  //| 	at org.apache.spark.sql.catalyst.trees.TreeNode$$anonfun$5.apply(TreeNod
                                                  //| e.scala:290)
                                                  //| 	at org.apache.spark.sql.catalyst.trees.TreeNode$$anonfun$5.apply(TreeNod
                                                  //| e.scala:290)
                                                  //| 	at org.apache.spark.sql.catalyst.trees.TreeNode$$anonfun$4.apply(TreeNod
                                                  //| e.scala:249)
                                                  //| 	at scala.collection.Iterator$$anon$11.next(Iterator.scala:328)
                                                  //| 	at scala.collection.Iterator$class.foreach(Iterator.scala:727)
                                                  //| 	at scala.collection.AbstractIterator.foreach(Iterator.scala:1157)
                                                  //| 	at scala.collection.generic.Growable$class.$plus$plus$eq(Growable.scala:
                                                  //| 48)
                                                  //| 	at scala.collection.mutable.ArrayBuffer.$plus$plus$eq(ArrayBuffer.scala:
                                                  //| 103)
                                                  //| 	at scala.collection.mutable.ArrayBuffer.$plus$plus$eq(ArrayBuffer.scala:
                                                  //| 47)
                                                  //| 	at scala.collection.TraversableOnce$class.to(TraversableOnce.scala:273)
                                                  //| 	at scala.collection.AbstractIterator.to(Iterator.scala:1157)
                                                  //| 	at scala.collection.TraversableOnce$class.toBuffer(TraversableOnce.scala
                                                  //| :265)
                                                  //| 	at scala.collection.AbstractIterator.toBuffer(Iterator.scala:1157)
                                                  //| 	at scala.collection.TraversableOnce$class.toArray(TraversableOnce.scala:
                                                  //| 252)
                                                  //| 	at scala.collection.AbstractIterator.toArray(Iterator.scala:1157)
                                                  //| 	at org.apache.spark.sql.catalyst.trees.TreeNode.transformChildren(TreeNo
                                                  //| de.scala:279)
                                                  //| 	at org.apache.spark.sql.catalyst.trees.TreeNode.transformUp(TreeNode.sca
                                                  //| la:290)
                                                  //| 	at org.apache.spark.sql.catalyst.plans.QueryPlan.transformExpressionUp$1
                                                  //| (QueryPlan.scala:108)
                                                  //| 	at org.apache.spark.sql.catalyst.plans.QueryPlan.org$apache$spark$sql$ca
                                                  //| talyst$plans$QueryPlan$$recursiveTransform$2(QueryPlan.scala:118)
                                                  //| 	at org.apache.spark.sql.catalyst.plans.QueryPlan$$anonfun$2.apply(QueryP
                                                  //| lan.scala:126)
                                                  //| 	at scala.collection.Iterator$$anon$11.next(Iterator.scala:328)
                                                  //| 	at scala.collection.Iterator$class.foreach(Iterator.scala:727)
                                                  //| 	at scala.collection.AbstractIterator.foreach(Iterator.scala:1157)
                                                  //| 	at scala.collection.generic.Growable$class.$plus$plus$eq(Growable.scala:
                                                  //| 48)
                                                  //| 	at scala.collection.mutable.ArrayBuffer.$plus$plus$eq(ArrayBuffer.scala:
                                                  //| 103)
                                                  //| 	at scala.collection.mutable.ArrayBuffer.$plus$plus$eq(ArrayBuffer.scala:
                                                  //| 47)
                                                  //| 	at scala.collection.TraversableOnce$class.to(TraversableOnce.scala:273)
                                                  //| 	at scala.collection.AbstractIterator.to(Iterator.scala:1157)
                                                  //| 	at scala.collection.TraversableOnce$class.toBuffer(TraversableOnce.scala
                                                  //| :265)
                                                  //| 	at scala.collection.AbstractIterator.toBuffer(Iterator.scala:1157)
                                                  //| 	at scala.collection.TraversableOnce$class.toArray(TraversableOnce.scala:
                                                  //| 252)
                                                  //| 	at scala.collection.AbstractIterator.toArray(Iterator.scala:1157)
                                                  //| 	at org.apache.spark.sql.catalyst.plans.QueryPlan.transformExpressionsUp(
                                                  //| QueryPlan.scala:126)
                                                  //| 	at org.apache.spark.sql.catalyst.analysis.CheckAnalysis$$anonfun$checkAn
                                                  //| alysis$1.apply(CheckAnalysis.scala:53)
                                                  //| 	at org.apache.spark.sql.catalyst.analysis.CheckAnalysis$$anonfun$checkAn
                                                  //| alysis$1.apply(CheckAnalysis.scala:49)
                                                  //| 	at org.apache.spark.sql.catalyst.trees.TreeNode.foreachUp(TreeNode.scala
                                                  //| :103)
                                                  //| 	at org.apache.spark.sql.catalyst.trees.TreeNode$$anonfun$foreachUp$1.app
                                                  //| ly(TreeNode.scala:102)
                                                  //| 	at org.apache.spark.sql.catalyst.trees.TreeNode$$anonfun$foreachUp$1.app
                                                  //| ly(TreeNode.scala:102)
                                                  //| 	at scala.collection.immutable.List.foreach(List.scala:318)
                                                  //| 	at org.apache.spark.sql.catalyst.trees.TreeNode.foreachUp(TreeNode.scala
                                                  //| :102)
                                                  //| 	at org.apache.spark.sql.catalyst.analysis.CheckAnalysis$class.checkAnaly
                                                  //| sis(CheckAnalysis.scala:49)
                                                  //| 	at org.apache.spark.sql.catalyst.analysis.Analyzer.checkAnalysis(Analyze
                                                  //| r.scala:44)
                                                  //| 	at org.apache.spark.sql.SQLContext$QueryExecution.assertAnalyzed(SQLCont
                                                  //| ext.scala:908)
                                                  //| 	at org.apache.spark.sql.DataFrame.<init>(DataFrame.scala:132)
                                                  //| 	at org.apache.spark.sql.DataFrame$.apply(DataFrame.scala:51)
                                                  //| 	at org.apache.spark.sql.SQLContext.sql(SQLContext.scala:719)
                                                  //| 	at ModelAndTrain$.enablerFilter(ModelAndTrain.scala:152)
                                                  //| 	at sample$$anonfun$main$1.apply$mcV$sp(sample.scala:5)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at sample$.main(sample.scala:1)
                                                  //| 	at sample.main(sample.scala)
   
  
 	//ModelAndTrain.test()
                                            

}