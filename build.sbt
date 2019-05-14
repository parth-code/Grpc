import scalapb.compiler.Version.scalapbVersion
name := "Grpc"

version := "0.1"

scalaVersion := "2.12.8"

// compiles protobuf definitions into scala code

PB.targets in Compile := Seq(
  scalapb.gen() -> baseDirectory.value / "scala-protos"
)

//Project.inConfig(Test)(sbtprotoc.ProtocPlugin.protobufConfigSettings)

unmanagedSourceDirectories in Compile += baseDirectory.value / "scala-protos"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.2",
  "org.scalatest" % "scalatest_2.12" % "3.0.5" % "test",
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapbVersion % "protobuf",
  "io.grpc" % "grpc-netty" % scalapb.compiler.Version.grpcJavaVersion,
  "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapb.compiler.Version.scalapbVersion,
  "org.scalaj" % "scalaj-http_2.11" % "2.3.0"

)