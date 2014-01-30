
name := "SparkTest"

version := "1.0"

scalaVersion := "2.9.3"

libraryDependencies += "org.apache.spark" %% "spark-core" % "0.8.0-incubating"

resolvers += "Akka Repository" at "http://repo.akka.io/releases"


libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.0.0-mr1-cdh4.4.0"


