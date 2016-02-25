package com.scala101.step2

/**
 * Created by kamoorr on 2/15/16.
 */
object Literals {

  def main(args: Array[String]) {

    println("Learning scala. Literals");
    val sym1 = Symbol("mystring")
    val sym2 = Symbol("mystring")

    val str1 = new String("mystring")
    val str2 = new String("mystring")

    println("----Symbol Vs String----");
    println(sym1 eq (sym2))
    println(str1 eq (str2))

  }

}
