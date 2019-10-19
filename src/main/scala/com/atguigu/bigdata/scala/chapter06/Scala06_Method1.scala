package com.atguigu.bigdata.scala.chapter06

object Scala06_Method1 {

  def main(args: Array[String]): Unit = {

    //不使用new关键字构建对象
    // Scala中允许不使用new的方式构建对象，会调用伴生对象的特殊方法(apply)来构建对象

    println(Emp06("zhangsan"))

    val xxxx = Emp06(10)
    println(xxxx)
  }

}

class Emp06 {

}
object Emp06 {

  //apply 方法可以用于直接构建对象，而不需要使用new关键字
  def apply():Emp06 = new Emp06()

  def apply(s : String): Emp06 = new Emp06()
  //也可以构建其他类型的对象
  def apply(i : Int) : XXXXX = new XXXXX()
}
class XXXXX{

}
