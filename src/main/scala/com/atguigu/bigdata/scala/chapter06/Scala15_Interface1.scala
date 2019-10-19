package com.atguigu.bigdata.scala.chapter06

object Scala15_Interface1 {

  def main(args: Array[String]): Unit = {


  }
}
//特质中也可以有抽象的属性和方法
trait MyTrait15 {
  def test(): Unit
  val username : String

  def test1(): Unit ={

  }
}

class User15 extends MyTrait15 {
  //类可以重写特质中的抽象方法
  override def test(): Unit = {

  }
  override val username: String = "zhangsan"
  override def test1(): Unit ={

  }

}


