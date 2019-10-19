package com.atguigu.bigdata.scala.chapter10

import scala.collection.{immutable, mutable}

object Scala14_Method5 {
  def main(args: Array[String]): Unit = {

    val ints = List(1,2,3,4)
    val ints1 = List(4,5,6,7)

    //union : 合并 todo 可以重复
    val ints2: List[Int] = ints.union(ints1)
    println(ints2)

    //intersect : 交集
    val ints3: List[Int] = ints.intersect(ints1)
    println(ints3)

    //diff ： 差集
    val ints4: List[Int] = ints.diff(ints1)
    val ints5: List[Int] = ints1.diff(ints)
    println(ints4)
    println(ints5)

    //zip : 拉链
    val tuples: List[(Int, Int)] = ints.zip(ints1)
    tuples.foreach(println)


  }

}
