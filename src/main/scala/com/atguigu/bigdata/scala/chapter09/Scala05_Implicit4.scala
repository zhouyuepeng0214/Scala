package com.atguigu.bigdata.scala.chapter09

object Scala05_Implicit4 {
  def main(args: Array[String]): Unit = {

    val user = new User()

    //隐式转化实在编译出错时开始应用的
    user.select()
    user.insert()
  }
  class User {
    def insert(): Unit = {
      println ("user insert...")
    }
  }
  implicit class UserExt(user : User) {
    def select(): Unit = {
      println ("select user...")
    }
  }

}
