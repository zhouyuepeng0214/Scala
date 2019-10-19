package com.atguigu.bigdata.scala.chapter06

object Scala11_Class {

  def main(args: Array[String]): Unit = {

    //extends关键字继承父类
    val user = new User11()
  }

}

class Parent11(name : String){
  println(name)
  def this() {
    this("wangwu")
    println("aaaaaaaa")
  }
}
//在父类的后面增加小括号，等同于调用父类的构造方法
class User11(name : String) extends Parent11 {
  println("bbbbbbbbb")
  def this() {
    this("zhangsan")
    println("ccccccccccc")
  }
}

