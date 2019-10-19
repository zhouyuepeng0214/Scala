package com.atguigu.bigdata.scala.chapter06

object Scala08_Method3 {

  def main(args: Array[String]): Unit = {

    //构造方法
    val user = new User08(20)

  }
}

// 1. 构造函数可以有参数
// 2. 声明多个构造函数
// 3.todo scala中构造函数分为2大类：主构造函数（类后声明的构造函数）& 辅助构造函数（使用this声明构造函数）
// 4.todo 辅助构造函数一定要直接或间接的调用主构造函数
// 5.todo 辅助构造方法在调用其他构造方法时，必须保证已经声明过其他的构造方法
class User08(s : String) {
  println("aaaaaaaaa")

  // 声明多个构造函数需要特殊的操作
  // 构造函数的名称有特殊的要求
  def this() {
    this("zhangsan")
    println("bbbbbb")
  }

  def this( i : Int ) {
    this()
    println("ccccccc")
  }
}
