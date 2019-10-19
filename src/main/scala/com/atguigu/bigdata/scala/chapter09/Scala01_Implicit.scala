package com.atguigu.bigdata.scala.chapter09

object Scala01_Implicit {
  def main(args: Array[String]): Unit = {

    //隐式转换 ==>自动转换 类型转换
    //val b : Byte = 10
    //val i : Int = b
    //println(i)

    implicit def transform(d : Double) : Int = {
      d.toInt
    }

    //todo Implicit 隐式转换：scala编译器在发现编译错误时，可以再次尝试转换规则重新编译，看看能否通过编译
    val i : Int = 2.0

    println(i)
  }

}
