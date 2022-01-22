package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class HigherOrderFunctionTest extends AnyFlatSpec {

  val hof = new HigherOrderFunction

  "A condition" should "square the element" in {
    assert(9 == hof.higherOrderFunction(hof.square, 3))
  }
  "A condition" should "cube the element" in {
    assert(8 == hof.higherOrderFunction(hof.cube, 2))
  }
}