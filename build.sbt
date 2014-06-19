import play.Project._

name := "livefeed"

version := "1.0"

libraryDependencies ++= Seq(
  javaJdbc, 
  javaJpa, 
  javaEbean,
  "org.hibernate" % "hibernate-entitymanager" % "3.6.9.Final"
  )

playJavaSettings
