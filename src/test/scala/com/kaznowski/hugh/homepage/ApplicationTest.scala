package com.kaznowski.hugh.homepage

import org.eclipse.jetty.server.Server
import org.junit.Test
import org.scalacheck.Prop.forAll
import org.scalatest._
import org.junit.Assert._

/**
 * Created by Hugh on 26/10/2015.
 */
class ApplicationTest extends FlatSpec {
  @Test def isServerTest = {
    assertTrue("Application should be an instance of Jetty Server", Application.isInstanceOf[Server])
  }
}
