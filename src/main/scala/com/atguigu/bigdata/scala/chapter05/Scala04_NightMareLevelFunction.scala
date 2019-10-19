package com.atguigu.bigdata.scala.chapter05

object Scala04_NightMareLevelFunction {

  def main(args: Array[String]): Unit = {

    def f1(name : String) : String= {
      return "Name:" + name
    }
    //声明函数后，可以将函数体最后一行代码作为函数的返回值，return 关键字可以省略
    def f2(name : String) : String = {
      "Name:" + name
    }

    //如果函数可以自动推断出返回值类型，那么返回值类型可以省略
    def f3(name : String) ={
      "Name:" + name
    }

    //如果函数逻辑只有一行代码，那么花括号可以省略
    def f4() = "abc"

    //如果参数列表没有参数，那么参数列表的的小括号可以省略
    //value f5 = "bcd"
    //统一访问原则

    def f5 = "abc"


    //如果函数的参数列表已声明，那么调用时可以使用小括号，也可以不用
    //如果函数的参数列表未声明，那么调用时不能使用小括号
    //println(f5)

    //如果函数体中有明确的return操作，那么函数必须声明返回值类型
    def f6(name : String) = {
      val flg = true
      if (flg) {
        "Name:" + name
      } else {
        1
      }
    }

    // 如果函数声明返回值类型为Unit,那么函数体中的return操作不起作用,应该省略
    def f7() :Unit = {
      return "zhangsan"
    }

    //如果unit类型也想省略，可以同时将等号省略
    //将这样的函数称之为过程
    def f8(){
      return 1
    }
    println(f8)

    //如果只关心逻辑，而不关心方法名称，那么函数名称可以省略，def关键字也可以省略
    //匿名函数

    //直接执行
    //() -> {println("xxxxxxxxxx")}

    //() => {println("yyyyyyyyy")}

    //scala语法中，万物皆函数，所以什么都可以是函数
    //变量也是函数
    val f9 = (i:Int,j : Int,k : Int) => {println("i =" + i)};

    //函数的类型:<function1> : 表是一个参数的函数，函数的参数最多只能有22个
    //println(f9)


  }
}
