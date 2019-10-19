package com.atguigu.bigdata.scala.chapter05

object Scala01_function {

  def main(args: Array[String]): Unit = {
    //函数的声明：方法其实就是函数
    /*
    def 函数名（参数列表）：函数的返回值类型 = {
        函数体
  }
  */
    //scala语法非常的松散，任何的语法结构都可以嵌套
    //方法中可以声明函数，函数中可以声明函数，但是方法中不能声明方法
    //方法其实就是函数，将类中函数称之为方法，方法有重载和重写概念
    //函数没有重写和重载的概念
  def test () : Unit = {
    println("xxxxxxx")
    }
    //调用函数
    test()
  }
}
