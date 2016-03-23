name := """fibonacci"""

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"
libraryDependencies += "com.rabbitmq" % "amqp-client" % "3.6.1"
libraryDependencies += "org.json4s" % "json4s-native_2.11" % "3.3.0"
// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

