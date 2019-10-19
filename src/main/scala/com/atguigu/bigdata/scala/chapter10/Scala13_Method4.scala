package com.atguigu.bigdata.scala.chapter10

import scala.collection.{immutable, mutable}

object Scala13_Method4 {
  def main(args: Array[String]): Unit = {

    val nums = List(1,2,3,4)

    //scan
    val ints: List[Int] = nums.scan(0)(_+_)
    println(ints)

    //take :
    //println(nums.take(2))

    //sliding : 滑动
    //将集合的一部分数据作为一个整体，称之为窗口，其中的数据称之为窗口数据，
    //对这个窗口做的操作，称之为窗口函数，窗口是可以滑动的

    val range = Range(1,10)
    val iterator: Iterator[immutable.IndexedSeq[Int]] = range.sliding(3,4)
    for (elem <- iterator) {
      //println(elem.sum)
      println(elem)
    }


  }

}
