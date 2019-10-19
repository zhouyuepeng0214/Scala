package com.atguigu.bigdata.scala.chapter13

object Scala02_FunctionAdv1 {
  def main(args: Array[String]): Unit = {

    //控制抽象
    //自己构建语法

    def tryX(p : => Unit): Unit = {
      p
    }

    tryX(println("zhangsan"))




  }

}


