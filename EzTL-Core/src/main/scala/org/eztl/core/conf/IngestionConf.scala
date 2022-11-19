package org.eztl.core.conf

import org.rogach.scallop.ScallopOption

trait IngestionConf extends GenericConf {

  val master: ScallopOption[String]
  val rawZonePath: ScallopOption[String]
  val curatedZonePath: ScallopOption[String]
  val pipeline: ScallopOption[String]
  val ingestPreviousDays: ScallopOption[Int]
  val terminateAfterMs: ScallopOption[Int]

}
