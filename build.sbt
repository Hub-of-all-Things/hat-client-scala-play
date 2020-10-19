import Dependencies._

libraryDependencies ++= Seq(
  Library.Play.ws,
  Library.Play.test,
  Library.Play.json,
  Library.Play.jsonJoda,
  Library.Specs2.matcherExtra,
  Library.Specs2.mock,
  Library.Specs2.core,
  Library.Utils.jodaTime,
  Library.Play.playAkkaHttpServer
)

publishTo := {
  val prefix = if (isSnapshot.value) "snapshots" else "releases"
  Some(
    s3resolver
      .value("HAT Library Artifacts " + prefix,
             s3("library-artifacts-" + prefix + ".hubofallthings.com")
      ) withMavenPatterns
  )
}

inThisBuild(
  List(
    semanticdbEnabled := true,
    semanticdbVersion := scalafixSemanticdb.revision,
    scalafixScalaBinaryVersion := scalaBinaryVersion.value
  )
)
