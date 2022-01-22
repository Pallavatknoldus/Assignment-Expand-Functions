package com.knoldus

class Add {

  val add: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    def apply(firstElement: Int, secondElement: Int): Int = firstElement + secondElement
  }
}