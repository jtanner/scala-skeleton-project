name := "PROJECT_NAME"

// organization := "com.???"

versionWithGit

sbtVersion := "0.13.9"

scalaVersion := "2.11.6"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Sonatype Releases"   at "http://oss.sonatype.org/content/repositories/releases",
  "Sonatype Snapshots"  at "https://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
)

// lazy val lib = project.in( file("sym-link-to-repo-in-project-root/") )

// lazy val root = project.in( file(".") ).dependsOn(lib) // .dependsOn(lib, lib2)
