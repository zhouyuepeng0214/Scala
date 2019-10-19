package com.atguigu.bigdata.scala.chapter10

object Scala06_Tuple {
  def main(args: Array[String]): Unit = {

    //Tuple : 元组
    //scala将无关的数据当成一个整体来使用
    //元组的声明： todo 小括号（1，"zhangsan",40）
    //元组的元素最多只能放22个
    //只有2个元素，称之为对偶，键值对
    val tuple1: (Int, String) = (1,"wangwu")
    val tuple: (Int, String, Int) = (1,"zhangsan",40)
    val tuple2: (Int, String, Int, Int) = (1,"lisi",40,50)
    //println(tuple)

    //访问数据
    //循环打印
    for (elem <- tuple.productIterator) {
      //println(elem)
    }
    //获取指定位置的数据
    println(tuple.productElement(2))

    //可以根据数据的顺序来访问： 元组._顺序号
    println(tuple2._2)

    for (elem <- Array(1, 7, 2, 9).sorted) {
      println(elem)
    }
  }

}
