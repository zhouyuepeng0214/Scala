package com.atguigu.bigdata.scala.chapter10

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Scala16_Queue {
  def main(args: Array[String]): Unit = {

    val strings: mutable.Queue[String] = new mutable.Queue[String]()

    //添加数据
//    strings.enqueue("1","2","3")
//    println(strings)

    //删除数据
//    val str: String = strings.dequeue()
//    println(strings)
//    println(str)

    def numsForm(n: BigInt) : Stream[BigInt] = n #:: numsForm(n + 1)
    val stream1 = numsForm(1)
    println(stream1)
    println(stream1.head)
    println(stream1.tail)
    println(stream1.tail.head)







  }

}
