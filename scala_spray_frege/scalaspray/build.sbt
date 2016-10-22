import Dependencies._

name := "spray-tutorial"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++=
  Seq(
    sprayCan,
    sprayRouting,
    akkaActor
  )
