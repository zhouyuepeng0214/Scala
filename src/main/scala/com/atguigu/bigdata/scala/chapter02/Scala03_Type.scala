package com.atguigu.bigdata.scala.chapter02

object Scala03_Type {

  def main(args: Array[String]): Unit = {

    val b : Byte = 10
    val s : Short = 10
    val i : Int = 10
    val lon : Long = 10

    val f : Float = 10.0F
    val g : Double = 10.0

    val h : Boolean = true
    val string : String = null

    val ssss = null

    println(string) //String 类型
    println(ssss) // null类型

    var c2 : Char = 'a' + 1
    println(c2)

  }

  def test() : Nothing = {
    throw new Exception
  }



}
