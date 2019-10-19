package com.atguigu.bigdata.scala.chapter04

object Scala03_for {

  def main(args: Array[String]): Unit = {

    // <- 表示循环时将集合的每一个元素给箭头的左边
    for(i <- 1 to 3;j <- 1 to 3) {
      //println(j)
    }

    for (j <- 1 to 10 if j % 2 == 0) {
      //println("j = " + j)
    }

    for (i <- 1 to 10;j = 4 -i) {
      //println(i + "--" + j)
    }

    val resualt = for (i <- 1 to 5) yield i * 2
      //println(resualt)

    for (i <- 1.to(10,2)) {
      //println(i)
    }

    for (i <- Range(1,10,2)) {
      //println(i)
    }

    for {
      i <- Range(1,18,2)
      j = (18 - i)/2
    } {
      println(" " * j + "*" * i)
    }

  }

}
