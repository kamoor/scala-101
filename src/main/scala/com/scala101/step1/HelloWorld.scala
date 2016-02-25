package com.scala101.step1

import java.util.Date

/**
 *
 * Option 1:
 * create an object and main.
 *
 * Option 2:
 * create as object and extend trait App aka "extends App"
 *
 * This example also shows how to make use an existing java class.
 *
 *
 */
object HelloWorld {

  def main(args: Array[String]) {
    println("Learning scala. Hello World");
    val l = new Date;
    println("Time now is " + l.toString)

    val s = Symbol("Aaa")

    val s1 = Symbol("Aaa")

    val s2 = new String("sdad");
    val s3 = new String("sdad");

    println(s eq (s1))

    println(s2 eq (s3))

  }

}
