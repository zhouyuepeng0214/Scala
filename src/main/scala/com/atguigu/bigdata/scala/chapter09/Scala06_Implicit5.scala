package com.atguigu.bigdata.scala.chapter09

import com.atguigu.bigdata.scala.chapter09.Scala06_Implicit5.User

object Scala06_Implicit5 extends MyTrait06{
  def main(args: Array[String]): Unit = {

    val user = new User()

    //隐式转化实在编译出错时开始应用的

    user.insert()
    user.select()
  }
  class User {
    def insert(): Unit = {
      println ("user insert...")
    }
  }
}
trait MyTrait06 {

}

object MyTrait06 {
  implicit class UserExt(u : User) {
    def select(): Unit = {
      println ("select user...")
    }
  }
}

class Test {

}
