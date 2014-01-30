import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

object SparkTest {
  def main(args: Array[String]) {
    val sc = new SparkContext("spark://ria-soft-master:7180","SparkTest","/ria/spark/spark-0.8.0-incubating",List("target/scala-2.9.3/sparktest_2.9.3-1.0.jar"))
    val f = sc.textFile("hdfs://ria-soft-master/data/MTN_IC/CDR/2012_01/")

    println(f.count)

  }
}

