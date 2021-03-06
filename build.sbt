import Dependencies._

ThisBuild / scalaVersion     := "2.12.10"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"
//ThisBuild / useCoursier := false
//ThisBuild / updateOptions := updateOptions.value.withCachedResolution(true)

def csrConfigurationSettings(): sbt.Def.SettingsDefinition = csrConfiguration := csrConfiguration.value.withChecksums(Vector(None))

lazy val root = (project in file("."))
  .settings(
    name := "Scala Seed Project",
  )
  .settings(csrConfigurationSettings())
  .dependsOn(core, util)
  .dependsOn(x.map(x => x: ClasspathDep[ProjectReference]):_*)
  .aggregate(core, util)
  .aggregate(x.map(x => x: ProjectReference):_*)

lazy val core = (project in file("modules/core"))
  .settings(
    name := "core",
    libraryDependencies += spark,
    libraryDependencies += scalaTest % Test
  )
  .settings(csrConfigurationSettings())

lazy val util = (project in file("modules/util"))
  .settings(
    name := "core",
    libraryDependencies += spark,
    libraryDependencies += scalaTest % Test
  )
  .settings(csrConfigurationSettings())

val x: Seq[Project] = for {
  i <- 1 to 40
} yield
  Project(s"x$i", file(s"modules/module$i"))
    .settings(
      name := s"x$i",
    )
    .settings(csrConfigurationSettings())
    .dependsOn(core, util)


//override lazy val projects = root +: x

lazy val x1 = x(0)
lazy val x2 = x(1)
lazy val x3 = x(2)
lazy val x4 = x(3)
lazy val x5 = x(4)
lazy val x6 = x(5)
lazy val x7 = x(6)
lazy val x8 = x(7)
lazy val x9 = x(8)
lazy val x10 = x(9)
lazy val x11 = x(10)
lazy val x12 = x(11)
lazy val x13 = x(12)
lazy val x14 = x(13)
lazy val x15 = x(14)
lazy val x16 = x(15)
lazy val x17 = x(16)
lazy val x18 = x(17)
lazy val x19 = x(18)
lazy val x20 = x(19)

lazy val x21 = x(20)
lazy val x22 = x(21)
lazy val x23 = x(22)
lazy val x24 = x(23)
lazy val x25 = x(24)
lazy val x26 = x(25)
lazy val x27 = x(26)
lazy val x28 = x(27)
lazy val x29 = x(28)
lazy val x30 = x(29)
lazy val x31 = x(30)
lazy val x32 = x(31)
lazy val x33 = x(32)
lazy val x34 = x(33)
lazy val x35 = x(34)
lazy val x36 = x(35)
lazy val x37 = x(36)
lazy val x38 = x(37)
lazy val x39 = x(38)
lazy val x40 = x(39)

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
