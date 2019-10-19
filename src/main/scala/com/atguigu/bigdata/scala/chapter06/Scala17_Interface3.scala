package com.atguigu.bigdata.scala.chapter06

object Scala17_Interface3 {

  def main(args: Array[String]): Unit = {

    new User177()
  }
}

trait MyTrait17 {
  println("1.....")
}

trait MyTrait177 {
  println("3.....")
}

trait MyTrait1777 {
  println("4.....")
}

// 如果类存在特质，那么会首先初始化特质
// 特质初始化后，才会进行类的初始化
class User17 extends MyTrait17 {
  println("2..........")
}

// 如果类存在父类，会首先初始化父类
// 父类初始化完成后，如果类存在多个特质，会从左到右依次初始化
// 特质只会初始化一次，所以如果之前已经初始化了，那么不会再次初始化。
class User177 extends User17 with MyTrait17 with MyTrait177 with MyTrait1777 {
  println("5...........")
}

