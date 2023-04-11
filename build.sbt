val scala3Version = "3.2.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "sc-project",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-effect" % "3.3.1",
      "org.typelevel" %% "cats-core" % "2.7.0",
      "org.typelevel" %% "munit-cats-effect-3" % "1.0.7" % Test
    )
  )
