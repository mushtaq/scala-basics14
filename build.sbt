import Dependencies._

inThisBuild(List(
  organization := "com.example",
  scalaVersion := "2.13.0-M5",
  version      := "0.1.0-SNAPSHOT",
  scalacOptions ++= Seq(
    "-encoding",
    "UTF-8",
    "-feature",
    "-unchecked",
    "-deprecation",
    //"-Xfatal-warnings",
    "-Xlint",
    "-Ywarn-dead-code",
    "-Xfuture",
    //      "-Xprint:typer"
  )
))

lazy val root = (project in file(".")).
  settings(
    name := "scala-basics-14",
    libraryDependencies += `play-json`,
    libraryDependencies += scalaTest % Test
  )
