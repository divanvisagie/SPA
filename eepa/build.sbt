name := """EEPA Client"""

organization := "com.eepa"

version := "0.1-SNAPSHOT"

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))

javacOptions ++= Seq("-source", "1.6", "-target", "1.6")

scalaVersion := "2.11.7"


//crossScalaVersions := Seq("2.11.3", "2.11.7")
//credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1" % "test"
)

libraryDependencies += "com.rabbitmq" % "amqp-client" % "3.6.1"
libraryDependencies += "org.json4s" % "json4s-native_2.11" % "3.3.0"

bintraySettings

com.typesafe.sbt.SbtGit.versionWithGit


fork in run := true

// sbt publish-local
// libraryDependencies += "com.eepa" % "eepa" % "0.0.1"