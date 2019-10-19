package com.atguigu.bigdata.scala.chapter09

object Scala04_Implicit3 {
  def main(args: Array[String]): Unit = {

    implicit val str1: String = "jack"

    def hello(implicit name: String): Unit = {
      println(name + " hello")

      def hello(): Unit = {
        println("aaa")
      }
    }
    hello
  }
  def hello(): Unit = {
    println("bb")
  }

}
