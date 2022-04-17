# Scala
* Released in 2004. Latest is Scala 3 released in 2021.
* Requires less code
* Supports both object-oriented & functional programming (immutable).
* Functional - Compute by evaluating functions and minimizing need to maintain state.
* Compiles to Java Byte code which can run under JVM next to Java code.
* Staticially typed language.
* Other Languages for data science - Python & R
* Why Scala - Scalability (when working with large datasets) - Using Parallel Processing (Multiple cores, parallel collections)
* SQL connectivity with JDBC as in Java.
* Scalar Data Types - Byte, Short, Int, Long, Float, Double, Char
* Collections (mutable, immutable) - Sequences(Vectors, Streams, Lists, Queues, Strings, Stacks), Sets(HashSet, SortedSet, TreeSet, BitSet, ListSet), Maps(HashMaps, SortedMaps, TreeMaps, ListMaps)

# Spark
* Distributed Cluster Processing System (parallel data processing framework) with Driver (Leader) & Executor (Worker).
* Big data platform written in Scala. Spark also works with Python, Java, and R.
* Solves the issue with Hadoop MapReduce where the disk reads & writes are very high. Spark Pipelining (perform as many tasks as possible before writing) & Shuffle persistence (writes to file when data needs to be moved across nodes & reused)
* Reuses data by caching it in memory across the cluster.
* Unified engine for processing big data workloads - Replacing varios Apache products (Hadoop, Storm, Impala, Drill, Mahout, Giraph)
* Advantages
  * Multiprocessing, Multithreading
  * Creates DAG (Directed Acyclic Graph) for queries which can be decomposed into tasks and can be executed in parallel across the cluster.
  * Compact code execution using Tungsten executon engine - Uses whole stage code geenration.
  * Stores immediate results in memory.
  * Resilient Distributed Dataset (RDD) data structure at API core for simpplified programming upon which higer abstractions are built.
  * API's: Higher-level: DataFrames & Datasets, Lower-level: RDDs
  * Supports batch processing to Streaming. Storage is decoupled from compute.
  * Can read from many data sources like HDFS, Hive, Cassandra, MongoDB, MySQL.
  * Spark Connectors can connect to many systems, external data sources, performance monitors.
* Components
  * SQL and DataFrames
  * Structured Streaming
  * MLlib
  * GraphX
* Architecture
  * Driver - Heart of the Spark app. Analyzes, Distributes and schedules work among executors. Converts Operations into DAG components.
  * SparkSession - Driver accesses distributed components of the cluster(executrs & cluster manager) using SparkSession. Read data from sources and write DataFrames & Datasets.
  * Executors - Executes code and report the status back to driver. Data Locality (tasks work on data in close proximity) reduces network bandwidth.
  * Cluster Manager - Manages physical resources of cluster - Local, Built-in Stand Alone, Hadoop YARN, Kubernetes, Apache Mesos. Executor Modes - Client (Client machine responsible for Driver) Vs. Cluster (Driver & Executor inside the cluster)
* App Life Cycle: spark-submit -> triggers driver process or RM -> executes user code -> SparkSession -> SparkCluster (driver & executor) -> SparkSession talks to Cluster Manager Daemon or RM -> Driver assigns tasks to Executor
* Spark App - App -> Job -> DAG Scheduler -> DAG of Stages -> Task -> -> Task Scheduler (Process-local, Node-local, Rack-local, Arbitrary nonlocal) -> Schedular Backend -> Executor -> Deserialize Task code -> execute code in JVM -> Serialize result.
  * Transformations - Lazily Evaluated. Business Logic. Changes DF/DS without alterting original data. Narrow transformation - One I/P to One O/P (map, union, filter). Wide Transformation - One I/P to Many O/P (groupByKey, distinct, join)
  * Actions - Triggers computation on an RDD. Immediately Evaluated. Eg: show, take, collect, count, save.
* spark-shell / spark-submit -> Spark checks correctness -> Converts code to unresolved logical plan -> Resolved plan through Catalyst engine -> Planned for physical execution after evaluating the cost
* Spark Job - DAC of stages -> spark engine starts new Shuffle Operation for each stage -> Shuffle map & result tasks -> one task per partition
