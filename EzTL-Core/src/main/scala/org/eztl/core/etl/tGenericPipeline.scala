package org.eztl.core.etl

import org.apache.spark.sql.DataFrame

trait tGenericPipeline {

  def execute(): Unit

  protected def extract(): DataFrame

  protected def transform(extractedDf: DataFrame): DataFrame

  protected def load(transformedDf: DataFrame): Unit

}
