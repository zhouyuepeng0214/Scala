package com.atguigu.bigdata.scala.chapter06

object Scala10_Method5 {

  def main(args: Array[String]): Unit = {

    val user = new User10("zhangsan")

    println(user.username)

  }

}
//todo Scala为了简化属性赋值的操作，可以将构造参数作为类的属性使用,需要在参数前增加var|val
class User10(val username : String) {

}

