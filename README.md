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
* Spark Worker
* Spark Cluster Manager
* Solves the issue with Hadoop MapReduce where the disk reads & writes are very high.
* Reuses data by caching it in memory across the cluster.
* Unified engine for processing big data workloads - Replacing varios Apache products (Hadoop, Storm, Impala, Drill, Mahout, Giraph)
* Advantages
  * Multiprocessing, Multithreading
  * Creates DAG (Directed Acyclic Graph) for queries which can be decomposed into tasks and can be executed in parallel across the cluster.
  * Compact code execution using Tungsten executon engine - Uses whole stage code geenration.
  * Stores immediate results in memory.
  * Resilient Distributed Dataset (RDD) data structure at API core for simpplified programming upon which higer abstractions are built.
  * Supports batch processing to Streaming
  * Storage is decoupled from compute.
  * Can read from many data sources like HDFS, Hive, Cassandra, MongoDB, MySQL.
  * Spark Connectors can connect to many systems, external data sources, performance monitors.
* Components
  * SQL and DataFrames
  * Structured Streaming
  * MLlib
  * GraphX
