object sample {

  println("Welcome to the Scala worksheets")      //> Welcome to the Scala worksheets
 	1+1                                       //> res0: Int(2) = 2
 	
 	ModelAndTrain.test()                      //> Using Spark's default log4j profile: org/apache/spark/log4j-defaults.properti
                                                  //| es
                                                  //| 16/05/04 01:12:07 INFO SparkContext: Running Spark version 1.5.0
                                                  //| 16/05/04 01:12:07 WARN NativeCodeLoader: Unable to load native-hadoop library
                                                  //|  for your platform... using builtin-java classes where applicable
                                                  //| 16/05/04 01:12:07 INFO SecurityManager: Changing view acls to: preethi
                                                  //| 16/05/04 01:12:07 INFO SecurityManager: Changing modify acls to: preethi
                                                  //| 16/05/04 01:12:07 INFO SecurityManager: SecurityManager: authentication disab
                                                  //| led; ui acls disabled; users with view permissions: Set(preethi); users with 
                                                  //| modify permissions: Set(preethi)
                                                  //| 16/05/04 01:12:08 INFO Slf4jLogger: Slf4jLogger started
                                                  //| 16/05/04 01:12:08 INFO Remoting: Starting remoting
                                                  //| 16/05/04 01:12:08 INFO Remoting: Remoting started; listening on addresses :[a
                                                  //| kka.tcp://sparkDriver@192.168.1.7:63589]
                                                  //| 16/05/04 01:12:08 INFO Utils: Successfully started service 'sparkDriver' on p
                                                  //| ort 63589.
                                                  //| 16/05/04 01:12:08 INFO SparkEnv: Registering MapOutputTracker
                                                  //| 16/05/04 01:12:08 INFO SparkEnv: Registering BlockManagerMaster
                                                  //| 16/05/04 01:12:08 INFO DiskBlockManager: Created local directory at /private/
                                                  //| var/folders/9h/xyqx6xy54bv94nz2_cg7r91r0000gq/T/blockmgr-548770a8-36d7-49cb-8
                                                  //| 209-3cd8a8ac7c09
                                                  //| 16/05/04 01:12:08 INFO MemoryStore: MemoryStore started with capacity 1966.1 
                                                  //| MB
                                                  //| 16/05/04 01:12:08 INFO HttpFileServer: HTTP File server directory is /private
                                                  //| /var/folders/9h/xyqx6xy54bv94nz2_cg7r91r0000gq/T/spark-8bb0dadf-e233-493f-9af
                                                  //| b-b71a2422403b/httpd-e9d7cc78-e34a-4c9c-b09f-d255d6e3100c
                                                  //| 16/05/04 01:12:08 INFO HttpServer: Starting HTTP Server
                                                  //| 16/05/04 01:12:08 INFO Utils: Successfully started service 'HTTP file server'
                                                  //|  on port 63590.
                                                  //| 16/05/04 01:12:08 INFO SparkEnv: Registering OutputCommitCoordinator
                                                  //| 16/05/04 01:12:09 INFO Utils: Successfully started service 'SparkUI' on port 
                                                  //| 4040.
                                                  //| 16/05/04 01:12:09 INFO SparkUI: Started SparkUI at http://192.168.1.7:4040
                                                  //| 16/05/04 01:12:09 WARN MetricsSystem: Using default name DAGScheduler for sou
                                                  //| rce because spark.app.id is not set.
                                                  //| 16/05/04 01:12:09 INFO Executor: Starting executor ID driver on host localhos
                                                  //| t
                                                  //| 16/05/04 01:12:09 INFO Utils: Successfully started service 'org.apache.spark.
                                                  //| network.netty.NettyBlockTransferService' on port 63591.
                                                  //| 16/05/04 01:12:09 INFO NettyBlockTransferService: Server created on 63591
                                                  //| 16/05/04 01:12:09 INFO BlockManagerMaster: Trying to register BlockManager
                                                  //| 16/05/04 01:12:09 INFO BlockManagerMasterEndpoint: Registering block manager 
                                                  //| localhost:63591 with 1966.1 MB RAM, BlockManagerId(driver, localhost, 63591)
                                                  //| 16/05/04 01:12:09 INFO BlockManagerMaster: Registered BlockManager
                                                  //| 16/05/04 01:12:10 INFO MemoryStore: ensureFreeSpace(110248) called with curMe
                                                  //| m=0, maxMem=2061647216
                                                  //| 16/05/04 01:12:10 INFO MemoryStore: Block broadcast_0 stored as values in mem
                                                  //| ory (estimated size 107.7 KB, free 1966.0 MB)
                                                  //| 16/05/04 01:12:10 INFO MemoryStore: ensureFreeSpace(10065) called with curMem
                                                  //| =110248, maxMem=2061647216
                                                  //| 16/05/04 01:12:10 INFO MemoryStore: Block broadcast_0_piece0 stored as bytes 
                                                  //| in memory (estimated size 9.8 KB, free 1966.0 MB)
                                                  //| 16/05/04 01:12:10 INFO BlockManagerInfo: Added broadcast_0_piece0 in memory o
                                                  //| n localhost:63591 (size: 9.8 KB, free: 1966.1 MB)
                                                  //| 16/05/04 01:12:10 INFO SparkContext: Created broadcast 0 from textFile at Mod
                                                  //| elAndTrain.scala:23
                                                  //| finished
                                                  //| 16/05/04 01:12:10 INFO FileInputFormat: Total input paths to process : 1
                                                  //| 16/05/04 01:12:10 INFO SparkContext: Starting job: treeAggregate at IDF.scala
                                                  //| :56
                                                  //| 16/05/04 01:12:10 INFO DAGScheduler: Got job 0 (treeAggregate at IDF.scala:56
                                                  //| ) with 2 output partitions
                                                  //| 16/05/04 01:12:10 INFO DAGScheduler: Final stage: ResultStage 0(treeAggregate
                                                  //|  at IDF.scala:56)
                                                  //| 16/05/04 01:12:10 INFO DAGScheduler: Parents of final stage: List()
                                                  //| 16/05/04 01:12:10 INFO DAGScheduler: Missing parents: List()
                                                  //| 16/05/04 01:12:10 INFO DAGScheduler: Submitting ResultStage 0 (MapPartitionsR
                                                  //| DD[5] at treeAggregate at IDF.scala:56), which has no missing parents
                                                  //| 16/05/04 01:12:10 INFO MemoryStore: ensureFreeSpace(4472) called with curMem=
                                                  //| 120313, maxMem=2061647216
                                                  //| 16/05/04 01:12:10 INFO MemoryStore: Block broadcast_1 stored as values in mem
                                                  //| ory (estimated size 4.4 KB, free 1966.0 MB)
                                                  //| 16/05/04 01:12:10 INFO MemoryStore: ensureFreeSpace(2433) called with curMem=
                                                  //| 124785, maxMem=2061647216
                                                  //| 16/05/04 01:12:10 INFO MemoryStore: Block broadcast_1_piece0 stored as bytes 
                                                  //| in memory (estimated size 2.4 KB, free 1966.0 MB)
                                                  //| 16/05/04 01:12:10 INFO BlockManagerInfo: Added broadcast_1_piece0 in memory o
                                                  //| n localhost:63591 (size: 2.4 KB, free: 1966.1 MB)
                                                  //| 16/05/04 01:12:10 INFO SparkContext: Created broadcast 1 from broadcast at DA
                                                  //| GScheduler.scala:861
                                                  //| 16/05/04 01:12:10 INFO DAGScheduler: Submitting 2 missing tasks from ResultSt
                                                  //| age 0 (MapPartitionsRDD[5] at treeAggregate at IDF.scala:56)
                                                  //| 16/05/04 01:12:10 INFO TaskSchedulerImpl: Adding task set 0.0 with 2 tasks
                                                  //| 16/05/04 01:12:10 INFO TaskSetManager: Starting task 0.0 in stage 0.0 (TID 0,
                                                  //|  localhost, PROCESS_LOCAL, 2192 bytes)
                                                  //| 16/05/04 01:12:10 INFO Executor: Running task 0.0 in stage 0.0 (TID 0)
                                                  //| 16/05/04 01:12:10 INFO CacheManager: Partition rdd_4_0 not found, computing i
                                                  //| t
                                                  //| 16/05/04 01:12:10 INFO HadoopRDD: Input split: file:/Users/preethi/Sites/scal
                                                  //| a/datathon16/datathon16/resources/hat_10_hattitle.txt:0+33554432
                                                  //| 16/05/04 01:12:10 INFO deprecation: mapred.tip.id is deprecated. Instead, use
                                                  //|  mapreduce.task.id
                                                  //| 16/05/04 01:12:10 INFO deprecation: mapred.task.id is deprecated. Instead, us
                                                  //| e mapreduce.task.attempt.id
                                                  //| 16/05/04 01:12:10 INFO deprecation: mapred.task.is.map is deprecated. Instead
                                                  //| , use mapreduce.task.ismap
                                                  //| 16/05/04 01:12:10 INFO deprecation: mapred.task.partition is deprecated. Inst
                                                  //| ead, use mapreduce.task.partition
                                                  //| 16/05/04 01:12:10 INFO deprecation: mapred.job.id is deprecated. Instead, use
                                                  //|  mapreduce.job.id
                                                  //| 16/05/04 01:12:21 INFO MemoryStore: ensureFreeSpace(98283248) called with cur
                                                  //| Mem=127218, maxMem=2061647216
                                                  //| 16/05/04 01:12:21 INFO MemoryStore: Block rdd_4_0 stored as values in memory 
                                                  //| (estimated size 93.7 MB, free 1872.3 MB)
                                                  //| 16/05/04 01:12:21 INFO BlockManagerInfo: Added rdd_4_0 in memory on localhost
                                                  //| :63591 (size: 93.7 MB, free: 1872.4 MB)
                                                  //| 16/05/04 01:12:22 INFO Executor: Finished task 0.0 in stage 0.0 (TID 0). 8432
                                                  //| 508 bytes result sent to driver
                                                  //| 16/05/04 01:12:22 INFO TaskSetManager: Starting task 1.0 in stage 0.0 (TID 1,
                                                  //|  localhost, PROCESS_LOCAL, 2192 bytes)
                                                  //| 16/05/04 01:12:22 INFO Executor: Running task 1.0 in stage 0.0 (TID 1)
                                                  //| 16/05/04 01:12:22 INFO CacheManager: Partition rdd_4_1 not found, computing i
                                                  //| t
                                                  //| 16/05/04 01:12:22 INFO HadoopRDD: Input split: file:/Users/preethi/Sites/scal
                                                  //| a/datathon16/datathon16/resources/hat_10_hattitle.txt:33554432+12036120
                                                  //| 16/05/04 01:12:22 INFO TaskSetManager: Finished task 0.0 in stage 0.0 (TID 0)
                                                  //|  in 11857 ms on localhost (1/2)
                                                  //| 16/05/04 01:12:26 INFO MemoryStore: ensureFreeSpace(34918224) called with cur
                                                  //| Mem=98410466, maxMem=2061647216
                                                  //| 16/05/04 01:12:26 INFO MemoryStore: Block rdd_4_1 stored as values in memory 
                                                  //| (estimated size 33.3 MB, free 1839.0 MB)
                                                  //| 16/05/04 01:12:26 INFO BlockManagerInfo: Added rdd_4_1 in memory on localhost
                                                  //| :63591 (size: 33.3 MB, free: 1839.1 MB)
                                                  //| 16/05/04 01:12:26 INFO Executor: Finished task 1.0 in stage 0.0 (TID 1). 8432
                                                  //| 508 bytes result sent to driver
                                                  //| 16/05/04 01:12:26 INFO TaskSetManager: Finished task 1.0 in stage 0.0 (TID 1)
                                                  //|  in 4466 ms on localhost (2/2)
                                                  //| 16/05/04 01:12:26 INFO DAGScheduler: ResultStage 0 (treeAggregate at IDF.scal
                                                  //| a:56) finished in 16.285 s
                                                  //| 16/05/04 01:12:26 INFO TaskSchedulerImpl: Removed TaskSet 0.0, whose tasks ha
                                                  //| ve all completed, from pool 
                                                  //| 16/05/04 01:12:26 INFO DAGScheduler: Job 0 finished: treeAggregate at IDF.sca
                                                  //| la:56, took 16.365690 s
                                                  //| 16/05/04 01:12:26 INFO MemoryStore: ensureFreeSpace(8388664) called with curM
                                                  //| em=133328690, maxMem=2061647216
                                                  //| 16/05/04 01:12:26 INFO MemoryStore: Block broadcast_2 stored as values in mem
                                                  //| ory (estimated size 8.0 MB, free 1831.0 MB)
                                                  //| 16/05/04 01:12:26 INFO MemoryStore: ensureFreeSpace(537342) called with curMe
                                                  //| m=141717354, maxMem=2061647216
                                                  //| 16/05/04 01:12:26 INFO MemoryStore: Block broadcast_2_piece0 stored as bytes 
                                                  //| in memory (estimated size 524.7 KB, free 1830.5 MB)
                                                  //| 16/05/04 01:12:26 INFO BlockManagerInfo: Added broadcast_2_piece0 in memory o
                                                  //| n localhost:63591 (size: 524.7 KB, free: 1838.6 MB)
                                                  //| 16/05/04 01:12:26 INFO SparkContext: Created broadcast 2 from broadcast at ID
                                                  //| F.scala:181
                                                  //| 16/05/04 01:12:26 INFO SparkContext: Starting job: collect at NaiveBayes.scal
                                                  //| a:401
                                                  //| 16/05/04 01:12:26 INFO DAGScheduler: Registering RDD 9 (map at NaiveBayes.sca
                                                  //| la:383)
                                                  //| 16/05/04 01:12:26 INFO DAGScheduler: Got job 1 (collect at NaiveBayes.scala:4
                                                  //| 01) with 2 output partitions
                                                  //| 16/05/04 01:12:26 INFO DAGScheduler: Final stage: ResultStage 2(collect at Na
                                                  //| iveBayes.scala:401)
                                                  //| 16/05/04 01:12:26 INFO DAGScheduler: Parents of final stage: List(ShuffleMapS
                                                  //| tage 1)
                                                  //| 16/05/04 01:12:26 INFO DAGScheduler: Missing parents: List(ShuffleMapStage 1)
                                                  //| 
                                                  //| 16/05/04 01:12:26 INFO DAGScheduler: Submitting ShuffleMapStage 1 (MapPartiti
                                                  //| onsRDD[9] at map at NaiveBayes.scala:383), which has no missing parents
                                                  //| 16/05/04 01:12:26 INFO MemoryStore: ensureFreeSpace(6152) called with curMem=
                                                  //| 142254696, maxMem=2061647216
                                                  //| 16/05/04 01:12:26 INFO MemoryStore: Block broadcast_3 stored as values in mem
                                                  //| ory (estimated size 6.0 KB, free 1830.5 MB)
                                                  //| 16/05/04 01:12:26 INFO MemoryStore: ensureFreeSpace(3185) called with curMem=
                                                  //| 142260848, maxMem=2061647216
                                                  //| 16/05/04 01:12:26 INFO MemoryStore: Block broadcast_3_piece0 stored as bytes 
                                                  //| in memory (estimated size 3.1 KB, free 1830.5 MB)
                                                  //| 16/05/04 01:12:26 INFO BlockManagerInfo: Added broadcast_3_piece0 in memory o
                                                  //| n localhost:63591 (size: 3.1 KB, free: 1838.6 MB)
                                                  //| 16/05/04 01:12:26 INFO SparkContext: Created broadcast 3 from broadcast at DA
                                                  //| GScheduler.scala:861
                                                  //| 16/05/04 01:12:26 INFO DAGScheduler: Submitting 2 missing tasks from ShuffleM
                                                  //| apStage 1 (MapPartitionsRDD[9] at map at NaiveBayes.scala:383)
                                                  //| 16/05/04 01:12:26 INFO TaskSchedulerImpl: Adding task set 1.0 with 2 tasks
                                                  //| 16/05/04 01:12:26 INFO TaskSetManager: Starting task 0.0 in stage 1.0 (TID 2,
                                                  //|  localhost, PROCESS_LOCAL, 2355 bytes)
                                                  //| 16/05/04 01:12:26 INFO Executor: Running task 0.0 in stage 1.0 (TID 2)
                                                  //| 16/05/04 01:12:26 INFO HadoopRDD: Input split: file:/Users/preethi/Sites/scal
                                                  //| a/datathon16/datathon16/resources/hat_10_hattitle.txt:0+33554432
                                                  //| 16/05/04 01:12:26 INFO BlockManager: Found block rdd_4_0 locally
                                                  //| 16/05/04 01:12:28 INFO Executor: Finished task 0.0 in stage 1.0 (TID 2). 2254
                                                  //|  bytes result sent to driver
                                                  //| 16/05/04 01:12:28 INFO TaskSetManager: Starting task 1.0 in stage 1.0 (TID 3,
                                                  //|  localhost, PROCESS_LOCAL, 2355 bytes)
                                                  //| 16/05/04 01:12:28 INFO Executor: Running task 1.0 in stage 1.0 (TID 3)
                                                  //| 16/05/04 01:12:28 INFO TaskSetManager: Finished task 0.0 in stage 1.0 (TID 2)
                                                  //|  in 1257 ms on localhost (1/2)
                                                  //| 16/05/04 01:12:28 INFO HadoopRDD: Input split: file:/Users/preethi/Sites/scal
                                                  //| a/datathon16/datathon16/resources/hat_10_hattitle.txt:33554432+12036120
                                                  //| 16/05/04 01:12:28 INFO BlockManager: Found block rdd_4_1 locally
                                                  //| 16/05/04 01:12:28 INFO Executor: Finished task 1.0 in stage 1.0 (TID 3). 2254
                                                  //|  bytes result sent to driver
                                                  //| 16/05/04 01:12:28 INFO TaskSetManager: Finished task 1.0 in stage 1.0 (TID 3)
                                                  //|  in 416 ms on localhost (2/2)
                                                  //| 16/05/04 01:12:28 INFO DAGScheduler: ShuffleMapStage 1 (map at NaiveBayes.sca
                                                  //| la:383) finished in 1.670 s
                                                  //| 16/05/04 01:12:28 INFO TaskSchedulerImpl: Removed TaskSet 1.0, whose tasks ha
                                                  //| ve all completed, from pool 
                                                  //| 16/05/04 01:12:28 INFO DAGScheduler: looking for newly runnable stages
                                                  //| 16/05/04 01:12:28 INFO DAGScheduler: running: Set()
                                                  //| 16/05/04 01:12:28 INFO DAGScheduler: waiting: Set(ResultStage 2)
                                                  //| 16/05/04 01:12:28 INFO DAGScheduler: failed: Set()
                                                  //| 16/05/04 01:12:28 INFO DAGScheduler: Missing parents for ResultStage 2: List(
                                                  //| )
                                                  //| 16/05/04 01:12:28 INFO DAGScheduler: Submitting ResultStage 2 (ShuffledRDD[10
                                                  //| ] at combineByKey at NaiveBayes.scala:383), which is now runnable
                                                  //| 16/05/04 01:12:28 INFO MemoryStore: ensureFreeSpace(2936) called with curMem=
                                                  //| 142264033, maxMem=2061647216
                                                  //| 16/05/04 01:12:28 INFO MemoryStore: Block broadcast_4 stored as values in mem
                                                  //| ory (estimated size 2.9 KB, free 1830.5 MB)
                                                  //| 16/05/04 01:12:28 INFO MemoryStore: ensureFreeSpace(1567) called with curMem=
                                                  //| 142266969, maxMem=2061647216
                                                  //| 16/05/04 01:12:28 INFO MemoryStore: Block broadcast_4_piece0 stored as bytes 
                                                  //| in memory (estimated size 1567.0 B, free 1830.5 MB)
                                                  //| 16/05/04 01:12:28 INFO BlockManagerInfo: Added broadcast_4_piece0 in memory o
                                                  //| n localhost:63591 (size: 1567.0 B, free: 1838.6 MB)
                                                  //| 16/05/04 01:12:28 INFO SparkContext: Created broadcast 4 from broadcast at DA
                                                  //| GScheduler.scala:861
                                                  //| 16/05/04 01:12:28 INFO DAGScheduler: Submitting 2 missing tasks from ResultSt
                                                  //| age 2 (ShuffledRDD[10] at combineByKey at NaiveBayes.scala:383)
                                                  //| 16/05/04 01:12:28 INFO TaskSchedulerImpl: Adding task set 2.0 with 2 tasks
                                                  //| 16/05/04 01:12:28 INFO TaskSetManager: Starting task 0.0 in stage 2.0 (TID 4,
                                                  //|  localhost, PROCESS_LOCAL, 1901 bytes)
                                                  //| 16/05/04 01:12:28 INFO Executor: Running task 0.0 in stage 2.0 (TID 4)
                                                  //| 16/05/04 01:12:28 INFO ShuffleBlockFetcherIterator: Getting 2 non-empty block
                                                  //| s out of 2 blocks
                                                  //| 16/05/04 01:12:28 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches 
                                                  //| in 3 ms
                                                  //| 16/05/04 01:12:28 WARN BLAS: Failed to load implementation from: com.github.f
                                                  //| ommil.netlib.NativeSystemBLAS
                                                  //| 16/05/04 01:12:28 WARN BLAS: Failed to load implementation from: com.github.f
                                                  //| ommil.netlib.NativeRefBLAS
                                                  //| 16/05/04 01:12:28 INFO Executor: Finished task 0.0 in stage 2.0 (TID 4). 1686
                                                  //| 0653 bytes result sent to driver
                                                  //| 16/05/04 01:12:28 INFO TaskSetManager: Starting task 1.0 in stage 2.0 (TID 5,
                                                  //|  localhost, PROCESS_LOCAL, 1901 bytes)
                                                  //| 16/05/04 01:12:28 INFO Executor: Running task 1.0 in stage 2.0 (TID 5)
                                                  //| 16/05/04 01:12:28 INFO ShuffleBlockFetcherIterator: Getting 0 non-empty block
                                                  //| s out of 2 blocks
                                                  //| 16/05/04 01:12:28 INFO ShuffleBlockFetcherIterator: Started 0 remote fetches 
                                                  //| in 0 ms
                                                  //| 16/05/04 01:12:28 INFO Executor: Finished task 1.0 in stage 2.0 (TID 5). 1161
                                                  //|  bytes result sent to driver
                                                  //| 16/05/04 01:12:28 INFO TaskSetManager: Finished task 1.0 in stage 2.0 (TID 5)
                                                  //|  in 14 ms on localhost (1/2)
                                                  //| 16/05/04 01:12:28 INFO TaskSetManager: Finished task 0.0 in stage 2.0 (TID 4)
                                                  //|  in 185 ms on localhost (2/2)
                                                  //| 16/05/04 01:12:28 INFO DAGScheduler: ResultStage 2 (collect at NaiveBayes.sca
                                                  //| la:401) finished in 0.185 s
                                                  //| 16/05/04 01:12:28 INFO TaskSchedulerImpl: Removed TaskSet 2.0, whose tasks ha
                                                  //| ve all completed, from pool 
                                                  //| 16/05/04 01:12:28 INFO DAGScheduler: Job 1 finished: collect at NaiveBayes.sc
                                                  //| ala:401, took 1.894374 s
                                                  //| 16/05/04 01:12:28 INFO MemoryStore: ensureFreeSpace(61016) called with curMem
                                                  //| =142268536, maxMem=2061647216
                                                  //| 16/05/04 01:12:28 INFO MemoryStore: Block broadcast_5 stored as values in mem
                                                  //| ory (estimated size 59.6 KB, free 1830.4 MB)
                                                  //| 16/05/04 01:12:28 INFO MemoryStore: ensureFreeSpace(14119) called with curMem
                                                  //| =142329552, maxMem=2061647216
                                                  //| 16/05/04 01:12:28 INFO MemoryStore: Block broadcast_5_piece0 stored as bytes 
                                                  //| in memory (estimated size 13.8 KB, free 1830.4 MB)
                                                  //| 16/05/04 01:12:28 INFO BlockManagerInfo: Added broadcast_5_piece0 in memory o
                                                  //| n localhost:63591 (size: 13.8 KB, free: 1838.6 MB)
                                                  //| 16/05/04 01:12:28 INFO SparkContext: Created broadcast 5 from textFile at Mod
                                                  //| elAndTrain.scala:90
                                                  //| 16/05/04 01:12:28 INFO MemoryStore: ensureFreeSpace(130208) called with curMe
                                                  //| m=142343671, maxMem=2061647216
                                                  //| 16/05/04 01:12:28 INFO MemoryStore: Block broadcast_6 stored as values in mem
                                                  //| ory (estimated size 127.2 KB, free 1830.3 MB)
                                                  //| 16/05/04 01:12:28 INFO MemoryStore: ensureFreeSpace(14119) called with curMem
                                                  //| =142473879, maxMem=2061647216
                                                  //| 16/05/04 01:12:28 INFO MemoryStore: Block broadcast_6_piece0 stored as bytes 
                                                  //| in memory (estimated size 13.8 KB, free 1830.3 MB)
                                                  //| 16/05/04 01:12:28 INFO BlockManagerInfo: Added broadcast_6_piece0 in memory o
                                                  //| n localhost:63591 (size: 13.8 KB, free: 1838.6 MB)
                                                  //| 16/05/04 01:12:28 INFO SparkContext: Created broadcast 6 from textFile at Mod
                                                  //| elAndTrain.scala:91
                                                  //| 16/05/04 01:12:28 INFO MemoryStore: ensureFreeSpace(8388664) called with curM
                                                  //| em=142487998, maxMem=2061647216
                                                  //| 16/05/04 01:12:28 INFO MemoryStore: Block broadcast_7 stored as values in mem
                                                  //| ory (estimated size 8.0 MB, free 1822.3 MB)
                                                  //| 16/05/04 01:12:28 INFO MemoryStore: ensureFreeSpace(537342) called with curMe
                                                  //| m=150876662, maxMem=2061647216
                                                  //| 16/05/04 01:12:28 INFO MemoryStore: Block broadcast_7_piece0 stored as bytes 
                                                  //| in memory (estimated size 524.7 KB, free 1821.7 MB)
                                                  //| 16/05/04 01:12:28 INFO BlockManagerInfo: Added broadcast_7_piece0 in memory o
                                                  //| n localhost:63591 (size: 524.7 KB, free: 1838.0 MB)
                                                  //| 16/05/04 01:12:28 INFO SparkContext: Created broadcast 7 from broadcast at ID
                                                  //| F.scala:181
                                                  //| 16/05/04 01:12:28 INFO MemoryStore: ensureFreeSpace(33554792) called with cur
                                                  //| Mem=151414004, maxMem=2061647216
                                                  //| 16/05/04 01:12:28 INFO MemoryStore: Block broadcast_8 stored as values in mem
                                                  //| ory (estimated size 32.0 MB, free 1789.7 MB)
                                                  //| 16/05/04 01:12:29 INFO MemoryStore: ensureFreeSpace(2053816) called with curM
                                                  //| em=184968796, maxMem=2061647216
                                                  //| 16/05/04 01:12:29 INFO MemoryStore: Block broadcast_8_piece0 stored as bytes 
                                                  //| in memory (estimated size 2005.7 KB, free 1787.8 MB)
                                                  //| 16/05/04 01:12:29 INFO BlockManagerInfo: Added broadcast_8_piece0 in memory o
                                                  //| n localhost:63591 (size: 2005.7 KB, free: 1836.1 MB)
                                                  //| 16/05/04 01:12:29 INFO SparkContext: Created broadcast 8 from broadcast at Na
                                                  //| iveBayes.scala:89
                                                  //| 16/05/04 01:12:29 INFO FileInputFormat: Total input paths to process : 1
                                                  //| 16/05/04 01:12:29 INFO SparkContext: Starting job: count at ModelAndTrain.sca
                                                  //| la:108
                                                  //| 16/05/04 01:12:29 INFO DAGScheduler: Got job 2 (count at ModelAndTrain.scala:
                                                  //| 108) with 1 output partitions
                                                  //| 16/05/04 01:12:29 INFO DAGScheduler: Final stage: ResultStage 3(count at Mode
                                                  //| lAndTrain.scala:108)
                                                  //| 16/05/04 01:12:29 INFO DAGScheduler: Parents of final stage: List()
                                                  //| 16/05/04 01:12:29 INFO DAGScheduler: Missing parents: List()
                                                  //| 16/05/04 01:12:29 INFO DAGScheduler: Submitting ResultStage 3 (MapPartitionsR
                                                  //| DD[17] at mapPartitions at NaiveBayes.scala:90), which has no missing parents
                                                  //| 
                                                  //| 16/05/04 01:12:29 INFO MemoryStore: ensureFreeSpace(4296) called with curMem=
                                                  //| 187022612, maxMem=2061647216
                                                  //| 16/05/04 01:12:29 INFO MemoryStore: Block broadcast_9 stored as values in mem
                                                  //| ory (estimated size 4.2 KB, free 1787.8 MB)
                                                  //| 16/05/04 01:12:29 INFO MemoryStore: ensureFreeSpace(2466) called with curMem=
                                                  //| 187026908, maxMem=2061647216
                                                  //| 16/05/04 01:12:29 INFO MemoryStore: Block broadcast_9_piece0 stored as bytes 
                                                  //| in memory (estimated size 2.4 KB, free 1787.8 MB)
                                                  //| 16/05/04 01:12:29 INFO BlockManagerInfo: Added broadcast_9_piece0 in memory o
                                                  //| n localhost:63591 (size: 2.4 KB, free: 1836.1 MB)
                                                  //| 16/05/04 01:12:29 INFO SparkContext: Created broadcast 9 from broadcast at DA
                                                  //| GScheduler.scala:861
                                                  //| 16/05/04 01:12:29 INFO DAGScheduler: Submitting 1 missing tasks from ResultSt
                                                  //| age 3 (MapPartitionsRDD[17] at mapPartitions at NaiveBayes.scala:90)
                                                  //| 16/05/04 01:12:29 INFO TaskSchedulerImpl: Adding task set 3.0 with 1 tasks
                                                  //| 16/05/04 01:12:29 INFO TaskSetManager: Starting task 0.0 in stage 3.0 (TID 6,
                                                  //|  localhost, PROCESS_LOCAL, 2190 bytes)
                                                  //| 16/05/04 01:12:29 INFO Executor: Running task 0.0 in stage 3.0 (TID 6)
                                                  //| 16/05/04 01:12:29 INFO CacheManager: Partition rdd_15_0 not found, computing 
                                                  //| it
                                                  //| 16/05/04 01:12:29 INFO HadoopRDD: Input split: file:/Users/preethi/Sites/scal
                                                  //| a/datathon16/datathon16/resources/hat_neg_title.txt:0+6960053
                                                  //| 16/05/04 01:12:30 INFO MemoryStore: ensureFreeSpace(22341128) called with cur
                                                  //| Mem=187029374, maxMem=2061647216
                                                  //| 16/05/04 01:12:30 INFO MemoryStore: Block rdd_15_0 stored as values in memory
                                                  //|  (estimated size 21.3 MB, free 1766.5 MB)
                                                  //| 16/05/04 01:12:30 INFO BlockManagerInfo: Added rdd_15_0 in memory on localhos
                                                  //| t:63591 (size: 21.3 MB, free: 1814.8 MB)
                                                  //| 16/05/04 01:12:30 INFO Executor: Finished task 0.0 in stage 3.0 (TID 6). 2662
                                                  //|  bytes result sent to driver
                                                  //| 16/05/04 01:12:30 INFO TaskSetManager: Finished task 0.0 in stage 3.0 (TID 6)
                                                  //|  in 1787 ms on localhost (1/1)
                                                  //| 16/05/04 01:12:30 INFO DAGScheduler: ResultStage 3 (count at ModelAndTrain.sc
                                                  //| ala:108) finished in 1.787 s
                                                  //| 16/05/04 01:12:30 INFO TaskSchedulerImpl: Removed TaskSet 3.0, whose tasks ha
                                                  //| ve all completed, from pool 
                                                  //| 16/05/04 01:12:30 INFO DAGScheduler: Job 2 finished: count at ModelAndTrain.s
                                                  //| cala:108, took 1.794242 s
                                                  //| 199915
                                                  //| 16/05/04 01:12:30 INFO SparkContext: Starting job: count at ModelAndTrain.sca
                                                  //| la:109
                                                  //| 16/05/04 01:12:30 INFO DAGScheduler: Got job 3 (count at ModelAndTrain.scala:
                                                  //| 109) with 1 output partitions
                                                  //| 16/05/04 01:12:30 INFO DAGScheduler: Final stage: ResultStage 4(count at Mode
                                                  //| lAndTrain.scala:109)
                                                  //| 16/05/04 01:12:30 INFO DAGScheduler: Parents of final stage: List()
                                                  //| 16/05/04 01:12:30 INFO DAGScheduler: Missing parents: List()
                                                  //| 16/05/04 01:12:30 INFO DAGScheduler: Submitting ResultStage 4 (MapPartitionsR
                                                  //| DD[12] at textFile at ModelAndTrain.scala:90), which has no missing parents
                                                  //| 16/05/04 01:12:30 INFO MemoryStore: ensureFreeSpace(3040) called with curMem=
                                                  //| 209370502, maxMem=2061647216
                                                  //| 16/05/04 01:12:30 INFO MemoryStore: Block broadcast_10 stored as values in me
                                                  //| mory (estimated size 3.0 KB, free 1766.5 MB)
                                                  //| 16/05/04 01:12:30 INFO MemoryStore: ensureFreeSpace(1816) called with curMem=
                                                  //| 209373542, maxMem=2061647216
                                                  //| 16/05/04 01:12:30 INFO MemoryStore: Block broadcast_10_piece0 stored as bytes
                                                  //|  in memory (estimated size 1816.0 B, free 1766.5 MB)
                                                  //| 16/05/04 01:12:30 INFO BlockManagerInfo: Added broadcast_10_piece0 in memory 
                                                  //| on localhost:63591 (size: 1816.0 B, free: 1814.8 MB)
                                                  //| 16/05/04 01:12:30 INFO SparkContext: Created broadcast 10 from broadcast at D
                                                  //| AGScheduler.scala:861
                                                  //| 16/05/04 01:12:30 INFO DAGScheduler: Submitting 1 missing tasks from ResultSt
                                                  //| age 4 (MapPartitionsRDD[12] at textFile at ModelAndTrain.scala:90)
                                                  //| 16/05/04 01:12:30 INFO TaskSchedulerImpl: Adding task set 4.0 with 1 tasks
                                                  //| 16/05/04 01:12:30 INFO TaskSetManager: Starting task 0.0 in stage 4.0 (TID 7,
                                                  //|  localhost, PROCESS_LOCAL, 2190 bytes)
                                                  //| 16/05/04 01:12:30 INFO Executor: Running task 0.0 in stage 4.0 (TID 7)
                                                  //| 16/05/04 01:12:30 INFO HadoopRDD: Input split: file:/Users/preethi/Sites/scal
                                                  //| a/datathon16/datathon16/resources/hat_neg_title.txt:0+6960053
                                                  //| 16/05/04 01:12:30 INFO Executor: Finished task 0.0 in stage 4.0 (TID 7). 2082
                                                  //|  bytes result sent to driver
                                                  //| 16/05/04 01:12:30 INFO TaskSetManager: Finished task 0.0 in stage 4.0 (TID 7)
                                                  //|  in 48 ms on localhost (1/1)
                                                  //| 16/05/04 01:12:30 INFO DAGScheduler: ResultStage 4 (count at ModelAndTrain.sc
                                                  //| ala:109) finished in 0.048 s
                                                  //| 16/05/04 01:12:30 INFO TaskSchedulerImpl: Removed TaskSet 4.0, whose tasks ha
                                                  //| ve all completed, from pool 
                                                  //| 16/05/04 01:12:30 INFO DAGScheduler: Job 3 finished: count at ModelAndTrain.s
                                                  //| cala:109, took 0.053809 s
                                                  //| 199915
                                                  //| 16/05/04 01:12:30 INFO FileInputFormat: Total input paths to process : 1
                                                  //| 16/05/04 01:12:30 INFO SparkContext: Starting job: saveAsTextFile at ModelAnd
                                                  //| Train.scala:113
                                                  //| 16/05/04 01:12:30 INFO DAGScheduler: Got job 4 (saveAsTextFile at ModelAndTra
                                                  //| in.scala:113) with 1 output partitions
                                                  //| 16/05/04 01:12:30 INFO DAGScheduler: Final stage: ResultStage 5(saveAsTextFil
                                                  //| e at ModelAndTrain.scala:113)
                                                  //| 16/05/04 01:12:30 INFO DAGScheduler: Parents of final stage: List()
                                                  //| 16/05/04 01:12:30 INFO DAGScheduler: Missing parents: List()
                                                  //| 16/05/04 01:12:30 INFO DAGScheduler: Submitting ResultStage 5 (MapPartitionsR
                                                  //| DD[21] at saveAsTextFile at ModelAndTrain.scala:113), which has no missing pa
                                                  //| rents
                                                  //| 16/05/04 01:12:30 INFO MemoryStore: ensureFreeSpace(97968) called with curMem
                                                  //| =209375358, maxMem=2061647216
                                                  //| 16/05/04 01:12:30 INFO MemoryStore: Block broadcast_11 stored as values in me
                                                  //| mory (estimated size 95.7 KB, free 1766.4 MB)
                                                  //| 16/05/04 01:12:30 INFO MemoryStore: ensureFreeSpace(32618) called with curMem
                                                  //| =209473326, maxMem=2061647216
                                                  //| 16/05/04 01:12:30 INFO MemoryStore: Block broadcast_11_piece0 stored as bytes
                                                  //|  in memory (estimated size 31.9 KB, free 1766.3 MB)
                                                  //| 16/05/04 01:12:30 INFO BlockManagerInfo: Added broadcast_11_piece0 in memory 
                                                  //| on localhost:63591 (size: 31.9 KB, free: 1814.7 MB)
                                                  //| 16/05/04 01:12:30 INFO Spa
                                                  //| Output exceeds cutoff limit.

}