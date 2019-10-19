package com.atguigu.bigdata.scala.chapter06

object Scala16_Interface2 {

  def main(args: Array[String]): Unit = {


  }
}
//特质可以继承其他的类
trait MyTrait16 extends User166{

}
// 特质可以混入其他特质
trait MyTrait166 extends MyTrait16 {

}

trait MyTrait1666 {

}

class User166 {

}

// 类可以混入多个特质，混入时采用with关键字
class User16 extends MyTrait16 with MyTrait166 with MyTrait1666 {

}