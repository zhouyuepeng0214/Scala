package com.atguigu.bigdata.scala.chapter10

object Scala11_Method2 {
  def main(args: Array[String]): Unit = {

    //集合通用的方法
    val nums: List[Int] = List(1,2,3,4)

    //fold : 折叠 todo 同foldLeft
//    val i: Int = nums.foldLeft(100)(_ - _)
//    println(i)

    // 先reverse，再交换后运算
    val i1: Int = nums.foldRight(0)(_ - _)
    println(i1)


  }

}
