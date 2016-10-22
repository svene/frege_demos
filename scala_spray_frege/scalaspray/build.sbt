import Dependencies._

name := "spray-tutorial"

version := "1.0"

scalaVersion := "2.11.8"

//resolvers += Resolver.mavenLocal
resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"

libraryDependencies ++=
  Seq(
    sprayCan,
    sprayRouting,
    akkaActor,
    fregeLib
  )
