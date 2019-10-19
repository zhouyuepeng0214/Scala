package com.atguigu.bigdata.scala.chapter09

object Scala02_Implicit1 {
  def main(args: Array[String]): Unit = {

    //User ==> UserExt
    //隐式转换还可以扩展功能
    //只能有一个参数
    //相同环境下，不允许有相同的隐式转换规则出现
    implicit def transform(user: User) : UserExt = {
      new UserExt()
    }

    val user = new User()

    user.select()

  }
  class User {
    def insert(): Unit = {
      println ("user insert...")
    }
  }
  class UserExt() {
    def select(): Unit = {
      println ("select user...")
    }
  }
  /*
  trait UserTrait {
    def select(): Unit = {
      println ("select user...")
    }
  }
  */

}
