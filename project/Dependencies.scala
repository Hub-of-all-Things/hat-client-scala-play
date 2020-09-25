/*
 * Copyright (C) 2016 HAT Data Exchange Ltd - All Rights Reserved
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 * Written by Andrius Aucinas <andrius.aucinas@hatdex.org>, 2 / 2017
 *
 */

import sbt._

object Dependencies {

  object Versions {
    val crossScala = Seq("2.12.11")
    val scalaVersion = crossScala.head
  }

  val resolvers = Seq(
    "Atlassian Releases" at "https://maven.atlassian.com/public/",
    "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases",
    "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/")

  object Library {
    object Play {
      val version = "2.6.17"
      val ws = "com.typesafe.play" %% "play-ahc-ws" % version
      val test = "com.typesafe.play" %% "play-test" % version % "compile" // Used by the MockHatServer
      val json = "com.typesafe.play" %% "play-json" % "2.6.9"
      val jsonJoda = "com.typesafe.play" %% "play-json-joda" % "2.6.9"
    }

    object Specs2 {
      private val version = "4.3.3"
      val core = "org.specs2" %% "specs2-core" % version % "test"
      val matcherExtra = "org.specs2" %% "specs2-matcher-extra" % version % "test"
      val mock = "org.specs2" %% "specs2-mock" % version % "test"
    }

    object Utils {
      val jodaTime = "joda-time" % "joda-time" % "2.10"
    }
  }
}
