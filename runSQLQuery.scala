// Register the DataFrame as a SQL temporary view
df.createOrReplaceTempView("people")

//call tempView like a db table
val sqlDF = spark.sql("SELECT * FROM people")
sqlDF.show()
// +----+-------+
// | age|   name|
// +----+-------+
// |null|Michael|
// |  30|   Andy|
// |  19| Justin|
// +----+-------+
