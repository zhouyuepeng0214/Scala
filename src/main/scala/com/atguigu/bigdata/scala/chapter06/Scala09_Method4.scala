package com.atguigu.bigdata.scala.chapter06

object Scala09_Method4 {

  def main(args: Array[String]): Unit = {

    //val user = new User09()
    val user = User09()

  }

}

class User09 private() {

}
// 伴生对象可以访问伴生类中的私有属性和方法
object User09 {
  def apply(): User09 = new User09()
}
