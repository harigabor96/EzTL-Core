package org.eztl.core.conf

import org.rogach.scallop.ScallopOption

trait tBronzeConf extends tGenericConf {

  override val master: ScallopOption[String]
  val rawZonePath: ScallopOption[String]
  override val curatedZonePath: ScallopOption[String]
  override val pipeline: ScallopOption[String]
  val ingestPreviousDays: ScallopOption[Int]

}
