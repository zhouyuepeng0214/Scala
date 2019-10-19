package com.atguigu.bigdata.scala.chapter06

import java.util.{HashMap,ArrayList}

object Scala03_Import {

  def main(args: Array[String]): Unit = {

    //import java.util.List
    //import java.util.*
    //import static java.xxxxxx.xxx
    //java.Lang


    //scala赋予import关键字更多的功能
    //1.import 关键字可以在任意的地方使用
    import java.util.Date
    //new Date()

    //2.todo 可以导入指定包中的类，java.lang,scala中的类不需要导入，可以直接使用
    //Array
    //3.导入指定包中的所有类，在Scala中使用下划线代替Java中的星号
    import java.util._
    new HashMap()
    //4.导入指定包中的多个类,可以使用大括号，声明在一行，用逗号分隔
    //import java.util.HashMap
    //import java.util._

    //5.scala中的import可以导包，如果是包对象，可以访问其属性和方法
    //import java.util
    //new util.ArrayList

    //6.scala可以在导类的时候隐藏指定的类
    //import scala.collection.mutable._
    //import java.util.{HashMap=>_,_}

    new java.util.HashMap()

    //7.scala 可以给导入的类起别名
    import java.util.{HashMap=>JavaHashMap,_}
    println(new JavaHashMap())
    //type hm = java.util.HashMap

    //8.scala中的包的概念其实是相对路径，这样可能会出现冲突，采用绝对路径的方式解决
    // new _root_.java.util.HashMap

    //类加载器 Java 双亲委派机制


  }
}
