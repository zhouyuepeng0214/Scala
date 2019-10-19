package com.atguigu.bigdata.scala.chapter10

object Scala17_Par {
  def main(args: Array[String]): Unit = {

    (1 to 5).foreach(println(_))
    println()
    (1 to 5).par.foreach(println(_))








  }

}
