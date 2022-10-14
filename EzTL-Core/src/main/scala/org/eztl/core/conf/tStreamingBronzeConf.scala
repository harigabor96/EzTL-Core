package org.eztl.core.conf

import org.rogach.scallop.ScallopOption

trait tStreamingBronzeConf extends tBronzeConf {

  override val master: ScallopOption[String]
  override val rawZonePath: ScallopOption[String]
  override val curatedZonePath: ScallopOption[String]
  override val pipeline: ScallopOption[String]
  override val ingestPreviousDays: ScallopOption[Int]
  val terminateAfterMs: ScallopOption[Int]

}
