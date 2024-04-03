import org.apache.spark.sql.SparkSession

val spark = SparkSession
  .builder()
  .appName("Spark SQL basic example")
  .config("spark.master", "local")  // Set Spark master if running locally
  .enableHiveSupport()               // Enable Hive support
  .getOrCreate()
