package com.knoldus

class HigherOrderFunction {

  def square(value: Int): Int = value * value

  def cube(value: Int): Int = value * value * value

  val higherOrderFunction: Function2[Int => Int, Int, Int] = new Function2[Int => Int, Int, Int] {
    def apply(function: Int => Int, anOtherValue: Int): Int = function(anOtherValue)
  }
}