package org.eztl.core.init

import org.apache.spark.sql.SparkSession
import org.eztl.core.conf.GenericConf

trait GenericSparkApp {

  def run(spark: SparkSession, conf: GenericConf): Unit

}
