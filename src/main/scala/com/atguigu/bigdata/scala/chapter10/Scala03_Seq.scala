package com.atguigu.bigdata.scala.chapter10

import scala.collection.mutable.ListBuffer

object Scala03_Seq {
  def main(args: Array[String]): Unit = {
    /*
    //序列
    //Java : List
    val numList = List(1,2,3,4)

    //增加数据,等同于产生新的集合
    //val ints: List[Int] = numList:+(5)
    //val ints1: List[Int] = 6+:(numList)
    //val value : Any = numList::(6)

    //修改数据
    //val ints2: List[Int] = numList.updated(0,9)

    //todo List集合无法使用小括号方式
    //numList(1)= 8

    //删除数据 todo 删除前几个
    //val ints2: List[Int] = numList.drop(2)


    //打印数据
    //println(ints)
    //println(ints1)


    //构建List集合的其他方法   ===   List() ==> Nil

    println(Nil)
    //::这个运算符的规则是从右向左
    //val list = 1::2::3::numList::Nil

    // 扁平化：将一个整体拆分成一个一个的个体，进行操作
    // 集合的:::用于扁平化操作
    val list = 1::2::3::numList:::Nil

    // 3::List() ==> List(3)
    // 2::List(3) ==> List(2,3)
    // 1::List(2,3) ==> List(1,2,3)
    // 1::2::3::Nil ==> List(1,2,3)

    println(list)

    */
    //可变集合 Seq
    val ints: ListBuffer[Int] = ListBuffer(1,2,3,4)

    //ints.append(5,6,7,8)
    //ints.insert(1,6,7,8)
    //ints(0) = 8
    //ints.update(1,6)

    //ints.remove(2)
    ints.remove(2,2)

    println(ints.mkString("-"))
    println(ints(0))
    ints.foreach(println)


  }

}
