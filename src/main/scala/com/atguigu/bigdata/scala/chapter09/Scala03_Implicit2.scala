package com.atguigu.bigdata.scala.chapter09

object Scala03_Implicit2 {
  def main(args: Array[String]): Unit = {

    //隐式变量
    implicit val str1 : String = "jack"
    implicit val str2 : Int = 2

    //隐式参数
    //隐式变量值可以覆盖默认参数
    def hello(implicit name : String = "tom"): Unit ={
      println(name + " hello")
    }

    hello
  }
}
