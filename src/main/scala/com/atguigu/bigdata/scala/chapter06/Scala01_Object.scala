package com.atguigu.bigdata.scala.chapter06

object Scala01_Object {

  def main(args: Array[String]): Unit = {

    /*
    域名的反写 + 项目名 + 模块 + 程序类型
    com.atguigu.sparkmall.user.service

    c.a.s.u.service

     */

    //scala 面向对象

    //
    val user = new User
    println(user.name)
    println(user.login())


  }

}
class User {

  val name : String = "zhangsan"

  def  login() : Boolean = {
    true
  }
}
