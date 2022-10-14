package org.eztl.core.conf

import org.rogach.scallop.ScallopOption

trait tGenericConf {

  val master: ScallopOption[String]
  val curatedZonePath: ScallopOption[String]
  val pipeline: ScallopOption[String]

}
