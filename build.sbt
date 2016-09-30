enablePlugins(JavaAppPackaging)

name := "pokemon-go"
organization := "robert.makyla"
version := "1.0"
scalaVersion := "2.11.8"

libraryDependencies ++= {
  val akkaV            = "2.4.7"
  val sprayJsonV       = "1.3.2"
  val scalaTestV       = "2.2.6"
  Seq(
    "com.typesafe.akka" %% "akka-http-core"                    % akkaV,
    "com.typesafe.akka" %% "akka-http-experimental"            % akkaV,
    "com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaV,
    "com.typesafe.akka" %% "akka-http-testkit"                 % akkaV,
    "org.scalatest"     %% "scalatest"                         % scalaTestV % "test",
    "io.spray"          %% "spray-json"                        % sprayJsonV
  )
}

Revolver.settings