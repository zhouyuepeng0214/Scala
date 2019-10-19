package com.atguigu.bigdata.scala.chapter06

object Scala07_Method2 {

  def main(args: Array[String]): Unit = {

    //构造方法
    val user = new User07()

  }
}

//scala语言，万物皆对象，万物皆函数
//类其实也是函数
//todo 类的后面使用小括号声明的参数列表，其实就是构造函数的参数列表
class User07() {

  //todo 构造函数体 & 类体
  println("user07 init....")

  // 此方法不是构造方法，是一个普通方法，只是巧了，和类名一样
  def User07(){
    println("user07....")
  }

}
