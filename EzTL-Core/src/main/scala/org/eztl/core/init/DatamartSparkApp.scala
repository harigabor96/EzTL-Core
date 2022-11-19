package org.eztl.core.init

import org.apache.spark.sql.SparkSession
import org.eztl.core.conf.DatamartConf

trait DatamartSparkApp {

  def run(spark: SparkSession, conf: DatamartConf): Unit

}
