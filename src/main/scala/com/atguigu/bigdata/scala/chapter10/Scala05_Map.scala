package com.atguigu.bigdata.scala.chapter10

import scala.collection.mutable

object Scala05_Map {
  def main(args: Array[String]): Unit = {

    //映射集合 Map
    //Scala 的键值对 ： K-V

    //声明集合
    val stringToInt: mutable.Map[String, Int] = mutable.Map("a"->1,"b"->2,"c"->3)

    //增加数据
    val stringToInt1: mutable.Map[String, Int] = stringToInt.+("d"->4)

    val stringToInt2: mutable.Map[String, Int] = stringToInt.updated("b",5)

    //获取指定key的数据
    // Option 选项类型，只有两个对象： Some, None
    //val maybeInt: Option[Int] = stringToInt.get("b")
    val i: Int = stringToInt.getOrElse("d",-1)

    //打印集合
    //println(maybeInt.get)
    //println(maybeInt.getOrElse(0))

    println(i)

  }
}
