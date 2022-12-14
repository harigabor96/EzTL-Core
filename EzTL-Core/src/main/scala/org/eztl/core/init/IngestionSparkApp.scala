package org.eztl.core.init

import org.apache.spark.sql.SparkSession
import org.eztl.core.conf.IngestionConf

trait IngestionSparkApp {

  def run(spark: SparkSession, conf: IngestionConf): Unit

}
