package com.atguigu.bigdata.scala.chapter06

import scala.beans.BeanProperty

object Scala04_Field {

  def main(args: Array[String]): Unit = {

    val user = new User04()

    // 给对象属性赋值等同于调用对象的属性的set方法
    //user.sex = "女"

    // 获取对象属性的值等同于调用对象的属性的get方法
    //println(user.address)


  }

}
//todo 下划线的用法
//1.包中所有类
//2.系统初始化
//3.将函数不执行直接返回
//4.参数占位符
//5.隐藏导入类
//6.标识符

class User04 {
  //声明属性
  //访问权限 var/val 属性名 ： 属性类型 = 属性值

  //类的属性在编译后全都是private的属性，但是同时提供了2个公共的方法（set，get）用于访问私有属性
  //todo 为了和java的开发规范匹配，提供注解(@BeanProperty)来生成2对set/get方法

  // Scala也可以给属性默认初始化,使用下划线

  //私有属性只能类的内部使用，外部无法使用
  //私有属性，不仅仅是属性私有化，编译后生成的set,get方法也是私有的。
  private var name : String = "zhangsan"

  //受保护的权限只能子类访问，同包访问不了
  protected var age : Int = 20

  // java中包访问权限为默认，但是在scala中，没有包访问权限的概念
  // 使用private作为访问修饰符
  // todo private 后加中括号,指明能访问的包的名称
  private[chapter06] var email : String = "afalf@afdacomm"

  //当属性前不加任何的访问权限时，默认为公共的，任何地方都可以访问
  // 类的属性前增加val关键字，等同于编译后增加final关键字
  var sex : String = "nan"

  @BeanProperty var address : String = _

}
class user066 extends User04{
  //this.age


}
