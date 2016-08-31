enablePlugins(ScalaJSPlugin)

scalaVersion := "2.11.8"

scalaJSUseRhino in Global := false

persistLauncher in Compile := true

persistLauncher in Test := false