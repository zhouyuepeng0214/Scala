package com.atguigu.bigdata.scala.chapter06

object Scala14_Interface {

  def main(args: Array[String]): Unit = {

    // 由于Java中的接口难于理解,所以scala没有接口的概念和关键字
    // scala将多个类具有的相同的特征从对象中剥离出来，形成一个特殊的结构，称之为“特质”（trait）
    // 类似于java的抽象类

    // 如果一个对象符合某个特征（特质），那么可以将这个特征 "混入" 到对象中

    val user = new User14()
    //user.test()

    //todo 动态混入：创建对象的同时混入特质
    val p = new Parent144() with MyTrait14
    p.test()

  }
}

//特质中可以声明属性和方法
trait MyTrait14 {
  def test() : Unit = {
    println("test ....")
  }
}
// 如果没有父类，可以直接使用extends来混入特质
class User14 extends MyTrait14 {

}

class Parent144 {

}
//todo 如果有父类，可以使用with来混入特质
class User144 extends Parent144 with MyTrait14 {

}

