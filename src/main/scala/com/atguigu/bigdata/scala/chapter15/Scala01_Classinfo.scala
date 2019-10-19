package com.atguigu.bigdata.scala.chapter15

object Scala01_Classinfo {
  def main(args: Array[String]): Unit = {

    //类型的协变（+）,逆变（-）
    val a : AAA[User] = new AAA[ParentUser]()
//    println(a)

    test(new SubUser())
    test1(new SubUser())

  }

  // 泛型的上限
  def test[T <: User](t:T): Unit = {
    println(t)
  }

  // Scala泛型没有下限
  def test1[T >: User](t:T): Unit = {
    println(t)
  }

}

class ParentUser {

}
class User extends ParentUser {

}

class SubUser extends User {

}

class AAA[-User] {

}


