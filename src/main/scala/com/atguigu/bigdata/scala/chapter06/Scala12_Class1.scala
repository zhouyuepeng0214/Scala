package com.atguigu.bigdata.scala.chapter06

object Scala12_Class1 {

  def main(args: Array[String]): Unit = {
    val user = new User12()
  }
}

//一个类中有抽象方法，这个类一定是抽象类
//一个类是抽象类，但其中方法不一定是抽象方法

abstract class Parent12 {

  //抽象方法： 只有声明没有实现
  def test() : Unit

  //非抽象方法
  def test1(): Unit = {

  }
}

//抽象类一定要有子类才能构造对象
//子类如果重写父类的抽象方法，那么子类不是抽象类
//子类如果没有将父类的抽象方法补充完整，那么子类仍然是抽象类
class User12 extends Parent12 {
  //将抽象方法补充完整
  def test(): Unit = {

  }

  //todo 子类重写父类的完整方法，必须增加override关键字
  override def test1(): Unit = {

  }
}

