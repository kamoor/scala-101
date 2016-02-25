package com.scala101.step4

/**
 * Created by kamoorr on 2/15/16.
 */
object Functions {


  /**
   * "Unit" is same as void in java
   */
  def printMe(str: String): Unit = {
    println(" Message " + str);
  }


  /**
   * This function takes List of Int and return an int
   * @param vals
   * @return
   */
  def add(vals: List[Int]) : Int = {
    var sum = 0;
    for(temp <- vals){
      sum = sum + temp;
    }
    return sum;
  }




  def main(args: Array[String]) {

    println("Learning scala. Some sample functions ");

    println("Sum "+ add(List(1,10,23)));



  }



}
