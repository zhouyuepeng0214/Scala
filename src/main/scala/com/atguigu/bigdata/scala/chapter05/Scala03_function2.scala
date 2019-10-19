package com.atguigu.bigdata.scala.chapter05

object Scala03_function2 {

  def main(args: Array[String]): Unit = {

    //可变参数
    def  f1(name : String*): Unit = {
      println(name)
    }

    //f1("zhangsan","lisi"

    //可变参数应该在参数列表的最后声明
    def  f2(email : String,name : String*): Unit = {
      println(email + "," + name)
    }

    //f2("sfsdf@163.com","zhangsan","lisi")

    def f3(name : String,age : Int = 30): Unit = {
      println(s"name = $name,age = $age")
    }

    //f3("zhangsan",24)

    //参数列表复制的时候时从左到右
    def f4(email : String = "xxxxxxxx",name : String): Unit = {
      println(s"name = $name,email = $email")
    }

    //带名参数
    f4(name="zhangsan")

  }
}
