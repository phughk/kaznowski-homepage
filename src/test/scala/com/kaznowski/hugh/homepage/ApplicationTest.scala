package com.kaznowski.hugh.homepage

import org.eclipse.jetty.server.Server
import org.junit.Test
import org.junit.runner.RunWith
import org.scalacheck.Prop.forAll
import org.scalatest._
import org.junit.Assert._
import org.scalatest.junit.JUnitRunner

/**
 * Created by Hugh on 26/10/2015.
 */
@RunWith(classOf[JUnitRunner])
class ApplicationTest extends FunSuite with Matchers{

  test("Application is instance of jetty Server") {
    Application.isInstanceOf[Server] should be(true)
  }
/*
  def isServerTest = {
    assertTrue("Application should be an instance of Jetty Server", Application.isInstanceOf[Server])
  }
*/
}
