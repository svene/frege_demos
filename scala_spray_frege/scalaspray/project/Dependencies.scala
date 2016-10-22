object Dependencies {
  import Versions._
  import sbt._

  val sprayCan = "io.spray" %% "spray-can" % sprayVersion
  val sprayRouting = "io.spray" %% "spray-routing" % sprayVersion
  val playJson = "com.typesafe.play" %% "play-json" % playVersion
  val akkaActor = "com.typesafe.akka" %% "akka-actor" % akkaVersion
}
