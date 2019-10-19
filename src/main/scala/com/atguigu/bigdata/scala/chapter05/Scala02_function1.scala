package com.atguigu.bigdata.scala.chapter05

object Scala02_function1 {

  def main(args: Array[String]): Unit = {

    def f1 (): Unit = {
      println("f1...")
    }

    //f1()

    def f2 (name : String,age : Int): Unit = {
      println(s"name = $name,age = $age")
    }

    //f2("zhangsan",20)

    def f3(name : String) : String = {
      return "name:" + name
    }

    println(f3("zhangsan"))

    //无参有返回值
    def f4() : Int = {
      return 10 +10
    }

  }
}
