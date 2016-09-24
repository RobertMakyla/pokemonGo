name := "pokemonGo"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += Resolver.jcenterRepo

libraryDependencies ++= {
  val akkaVersion            = "2.4.7"
  val sprayJsonVersion       = "1.3.2"
  Seq(
    "com.typesafe.akka" %% "akka-http-core"                    % akkaVersion,
    "com.typesafe.akka" %% "akka-http-experimental"            % akkaVersion,
    "com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaVersion,
    "io.spray"          %% "spray-json"                        % sprayJsonVersion
  )
}