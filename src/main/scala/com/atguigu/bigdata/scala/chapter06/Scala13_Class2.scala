package com.atguigu.bigdata.scala.chapter06

object Scala13_Class2 {

  def main(args: Array[String]): Unit = {
    val user = new User13()
    println(user)

  }
}

//一个类中如果有抽象属性，那么这个类为抽象类
abstract class Parent13 {

  //sjcala语言中属性也是可以抽象的
  //抽象属性：声明属性但未初始化
  //todo 抽象属性，在编译时不会生成属性，而是提供了2个抽象的方法（set，get）
  var name : String
  val age : Int = 20

}
class User13 extends Parent13 {
  //将抽象属性补充完整
  //抽象属性补充完整，其实等同于重写属性的set方法，get方法
  var name: String = "zhangsan"

  //子类可以重写父类的完整属性，但是必须增加override关键字
  override val age : Int = 30

}

