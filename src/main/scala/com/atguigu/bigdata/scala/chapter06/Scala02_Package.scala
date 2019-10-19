package com.atguigu.bigdata.scala.chapter06

package test {
  class Emp {

  }
  package object test {
    def test (): Unit = {

    }
    val name : String = "zhangsan"
  }
  package test1 {

    import com.atguigu.bigdata.scala.chapter06.test.test2.Student

    class Person {
     def test(args : Array[String]): Unit = {
       val emp = new Emp()
       println(emp)
       val s = new Student
     }
    }
  }
  package test2 {
    class Student {

    }
  }

}

object Scala02_Package {

  def main(args: Array[String]): Unit = {

    // 包的起名
    // 域名的反写 + 项目名 + 模块 + 程序类型
    // com.atguigu.sparkmall.user.service
    // c.a.s.u.service

    // 包的作用
    // 1. 分门别类的管理的类
    // 2. 区分相同名称的类 Date
    // 3. 包访问权限

    // Scala给package关键字赋予了更多的功能

    // 1. package关键字可以多次声明
    // 2. scala源码和包的名称没有直接的关系
    // 3. package可以声明作用域
    // 4. scala将包当成一个对象
    println("package.....")

  }
}
