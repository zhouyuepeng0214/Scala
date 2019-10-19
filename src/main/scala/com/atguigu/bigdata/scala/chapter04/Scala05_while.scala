package com.atguigu.bigdata.scala.chapter04

import scala.util.control.Breaks

object Scala05_while {

  def main(args: Array[String]): Unit = {

//    var i = 0
//    while (i < 10) {
//      println("i =" + i)
//      i = i + 1
//    }

    var i = 0
    Breaks.breakable {
      while (i < 10) {
        if (i == 5) {
          Breaks.break()
        }
        println("i =" + i)
        i = i + 1
      }
    }

    println("***********")


  }

}
