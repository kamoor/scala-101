package com.scala101.step2

/**
 * Created by kamoorr on 2/15/16.
 */
object Loop {

  def  main (args: Array[String]){

    println("Scala - for loop ")

    print("for with 'to' ")
    for(a <- 1 to 5){
      println(a);
    }

    println("for with 'unitl' ")
    for(a <- 1 until 5){
      println(a);
    }
    println("for with multiple variables ")
    for( a <- 1 to 3; b <- 1 to 3){
      println( "Value of a: " + a )
      println( "Value of b: " + b )
    }

  }
}
