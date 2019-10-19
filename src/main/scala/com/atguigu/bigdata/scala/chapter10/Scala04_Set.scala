package com.atguigu.bigdata.scala.chapter10

import scala.collection.mutable

object Scala04_Set {
  def main(args: Array[String]): Unit = {

    // 集 (无序)
    // Set(不可变)
    //val ints: Set[Int] = Set(1,2,3,4,4,4,4,4,5,6,7,8,9)

    //可变Set
    val ints: mutable.Set[Int] = mutable.Set(1,2,3,4)

    //ints.update(2,false)
    // 删除数据，传递的参数不再是索引的概念，因为set无序

    //ints.remove(3)

    val ints1: mutable.Set[Int] = ints.-(2)

    println(ints1)

  }
}
