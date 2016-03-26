name := """example"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.0-RC1" % Test
)

libraryDependencies += "com.rabbitmq" % "amqp-client" % "3.6.1"
libraryDependencies += "org.json4s" % "json4s-native_2.11" % "3.3.0"
libraryDependencies += "com.eepa" %% "eepa-client" % "0.1-SNAPSHOT"

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
