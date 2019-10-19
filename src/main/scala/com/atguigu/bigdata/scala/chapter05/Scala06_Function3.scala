package com.atguigu.bigdata.scala.chapter05

object Scala06_Function3 {

  def main(args: Array[String]): Unit = {

   //递归函数
    //1.函数自己调用自己
    //2.函数应该有跳出递归的逻辑
    //3.函数调用自身的深度不要太深
    //4.递归函数在调用时，需要传递的参数有规律
    //5.Scala中递归函数不能省略返回值类型

    def test (i : Int):Int = {
      if (i == 1) {
        i
      } else {
        i * test(i - 1)
      }
    }
    println(test(5))
  }
}
