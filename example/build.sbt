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

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"