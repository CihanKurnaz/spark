/*
Coalesce hints allow Spark SQL users to control the number of output files just like coalesce, repartition and repartitionByRange in the Dataset API, 
they can be used for performance tuning and reducing the number of output files. The “COALESCE” hint only has a partition number as a parameter. 
The “REPARTITION” hint has a partition number, columns, or both/neither of them as parameters. The “REPARTITION_BY_RANGE” hint must have column names and a partition number is optional. 
The “REBALANCE” hint has an initial partition number, columns, or both/neither of them as parameters.
*/


SELECT /*+ COALESCE(3) */ * FROM t;
SELECT /*+ REPARTITION(3) */ * FROM t;
SELECT /*+ REPARTITION(c) */ * FROM t;
SELECT /*+ REPARTITION(3, c) */ * FROM t;
SELECT /*+ REPARTITION */ * FROM t;
SELECT /*+ REPARTITION_BY_RANGE(c) */ * FROM t;
SELECT /*+ REPARTITION_BY_RANGE(3, c) */ * FROM t;
SELECT /*+ REBALANCE */ * FROM t;
SELECT /*+ REBALANCE(3) */ * FROM t;
SELECT /*+ REBALANCE(c) */ * FROM t;
SELECT /*+ REBALANCE(3, c) */ * FROM t;
