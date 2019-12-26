import ammonite.ops._

import mill._
import mill.scalalib._

object template extends ScalaModule {
  def scalaVersion = "2.12.10"

  def scalacOptions = Seq(
    "-Xsource:2.11",
  )

  override def ivyDeps = Agg(
    ivy"edu.berkeley.cs::chisel3:3.2.2",
    ivy"edu.berkeley.cs::firrtl:1.2.2"
  )

  def millSourcePath = super.millSourcePath / ammonite.ops.up

  //def unmanagedClasspath = T {
  //  if (!ammonite.ops.exists(millSourcePath / "lib")) Agg()
  //  else Agg.from(ammonite.ops.ls(millSourcePath / "lib").map(PathRef(_)))
  //}
}
