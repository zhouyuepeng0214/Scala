package com.atguigu.bigdata.scala.chapter05


object Scala05_HellLevelFunction {

  def main(args: Array[String]): Unit = {

    //函数的参数是函数
    //将一个函数作为参数传给另外个函数
    //声明的方式：参数名：参数类型
    //f : (Int)=>Unit  ==>此处表示函数只有一个参数，类型为Int，没有返回值
    def f(param : (Int) =>Unit): Unit = {
      param(10)
    }
    //调用函数
    def ff(i : Int) : Unit = {
      println("i =" + i)
    }

    //f(ff)

    def f1(param : () =>Unit): Unit = {
      param()
    }
    //调用函数
    def f11() : Unit = {
      println("f111111")
    }
    //f1(f11)

    // todo 将一个函数作为函数的返回值返回，不执行这个函数

    def f22(): Unit = {
      println("f222222222")
    }

    //如果函数作为返回值返回，需要增加返回值类型
    def f2() : () => Unit ={
      f22
    }

    //f2()()

    // _ 编译器自动推断返回函数的类型，需要在返回函数的后面增加 _
    //意味着函数不执行，而是用于返回
    def f222()={
      f22 _
    }

    //f222()()

    //嵌套函数中一般返回值都是使用自动推断
    def f3(i : Int) = {
      def f33(j : Int) = {
        def f333(f : (Int,Int) => Int)={
          f(i,j)
        }
        f333 _
      }
      f33 _
    }
    def  innerFunction(x:Int,y:Int): Int = {
      x*y
    }

    //println(f3(10)(10)(innerFunction))
    //使用匿名函数传递参数
    //println(f3(10)(10)((x:Int,y:Int) => {x+y}))
    //println(f3(10)(10)((x,y) => {x+y}))
    //todo 如果匿名函数中的参数值使用了一次，可以使用下划线代替
    //println(f3(10)(10)(_*_))

    //函数柯里化
    //就是将多个函数声明融合成一个函数声明，只不过传递多个参数列表而已
    def f4(i:Int)(j:Int)(p:(Int,Int) => Int) : Int = {
      p(i,j)
    }

    //函数闭包：如果函数中使用外部的变量，为了防止变量数据丢失，
    // 将变量包含到函数的内部，形成闭合的效果，称之为闭包，可以改变变量的生命周期
    // 函数柯里化基本上都会有闭包操作
    println(f4(5)(10)(_-_))

    def f5(i : Int)(j : Int)(p : (Int,Int) => Int) : Int = {
      p(i,j)
    }

    println(f5(5)(10)(_+_))

  }
}
