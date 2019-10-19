package com.atguigu.bigdata.scala.chapter10

import scala.collection.mutable.ArrayBuffer

object Scala02_Array {
  def main(args: Array[String]): Unit = {

   //数组的创建，需要 todo 增加泛型

    val array : Array[String] = new Array[String](3)
    //修改数据，需要使用特殊的符号（小括号）来进行访问

    array(0) = "1"
    array(1) = "2"
    array(2) = "3"

    //println(array)
    //println(array.mkString(","))


    val array1 : Array[String] = new Array[String](3)
    array1(0) = "11"
    array1(1) = "22"
    array1(2) = "33"

    //方法
    //println(array(2))
    //println(array.length)
    //array.update(1,"a")
    val strings: Array[String] = array.++(array1)

//    for (elem <- strings) {
//      println(elem)
//    }

    //循环打印
//    for (elem <- strings ) {
//      println(elem)
//    }

    //todo 构建数组的其他方式
    //val array: Array[Any] = Array(1,"2",3,4)


    // todo 可变数组
    //val buffer = new ArrayBuffer()
    val ints: ArrayBuffer[Any] = ArrayBuffer("1","2","3","4")

    //追加数据
    ints.append(5,6,7,8)
    //修改 两种方法一致
    //ints.update(0,9)
    //ints(0) = 9
    //按照索引删除几个数据
    //ints.remove(2,3)
    //println(ints)
    //查询数据
    //println(ints(0))
    /*
    def test(a : Any): Unit = {
      println(a)
    }
    */
    //ints.foreach((a: Any)=>{println(a)})
    //ints.foreach((a: Any)=>println(a))
    //ints.foreach(println(_))
    //ints.foreach(println)
    println(ints)
    println(ints.mkString("-"))

  }

}
