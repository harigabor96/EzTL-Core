package org.eztl.core.conf

import org.rogach.scallop.ScallopOption

trait tStreamingDatamartConf extends tDatamartConf {

  override val master: ScallopOption[String]
  override val curatedZonePath: ScallopOption[String]
  override val pipeline: ScallopOption[String]
  val terminateAfterMs: ScallopOption[Int]

}
