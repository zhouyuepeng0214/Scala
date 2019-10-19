package com.atguigu.bigdata.scala.chapter06

object Scala19_Interface5 {

  def main(args: Array[String]): Unit = {



  }
}

trait MyTrait19 {

  //约束
  this:Exception =>
  def test(): Unit = {
    println(getMessage())
  }
}
class User19 extends Exception with MyTrait19 {

}


