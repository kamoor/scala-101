package com.scala101.step1

import java.util._

/**
 *
 * Option 1:
 * create an object and main.
 *
 * Option 2:
 * create as object and "extends App"
 *
 * This example also shows how to make use an existing java class.
 *
 * @see App
 *
 *
 */
object HelloWorldAsApp extends App {

  println("Learning scala. HelloWorld as trait App");

  val d = new Date

  println("Hello world. Time now " + d.toString);


}
