package org.eztl.core.conf

import org.rogach.scallop.ScallopOption

trait tDatamartConf extends tGenericConf {

  override val master: ScallopOption[String]
  override val curatedZonePath: ScallopOption[String]
  override val pipeline: ScallopOption[String]

}
