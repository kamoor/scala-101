package com.scala101.step2

/**
 * Created by kamoorr on 2/15/16.
 */

object VarAndVals {

  def main(args: Array[String]) {

    println("Learning scala. var vs val, List");
    val v1 = "value 1"
    //Not allowed. val is immutable
    //v1 = "value 2"


    var v2 = "value 1"
    // can assign another value
    v2 = "value 2"


    //Muitple assignments in scala
    val (myVar1: Int, myVar2: String) = Pair(40, "Foo")

    println(myVar1)
    println(myVar2)



  }


}
