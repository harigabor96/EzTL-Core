package org.eztl.core.init

import org.apache.spark.sql.SparkSession
import org.eztl.core.conf.tGenericConf

trait tRouter {

  def executePipeline(spark: SparkSession, conf: tGenericConf): Unit

}
