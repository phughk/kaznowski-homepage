package com.kaznowski.hugh.homepage

import org.eclipse.jetty.server.Server
import org.scalacheck.Prop.forAll
import org.scalatest._

/**
 * Created by Hugh on 26/10/2015.
 */
class SimpleScalacheckTest extends FlatSpec {
  "A Application" should "extend jetty Server" in {
    assert(Application.isInstanceOf[Server])
  }
}
