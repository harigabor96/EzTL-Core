package org.eztl.core.conf

import org.rogach.scallop.ScallopOption

trait DatamartConf extends GenericConf {

  val master: ScallopOption[String]
  val curatedZonePath: ScallopOption[String]
  val pipeline: ScallopOption[String]
  val terminateAfterMs: ScallopOption[Int]

}
