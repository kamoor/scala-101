package com.scala101.step3

/**
 * Created by kamoorr on 2/15/16.
 */
object MyList {



  def main(args: Array[String]) {



    println("Learning scala. List");

   //List in scala
    val list = List("a", "b", "c")

    println("Full List " + list);
    println("Random " +list(2))
    println("Head " +list.head)
    println("Tail " + list.tail)

    //Fill a list with hi, 10 times
    val largeList =  List.fill(10)("hi")

    println(largeList)

    println("reversed list " + list.reverse)


    println("using for loop to print list")
    //print using loop
    for( temp <- largeList){
      println(temp)

    }


  }



}
