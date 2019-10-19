package com.atguigu.bigdata.scala

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

object Scala_exer {
  def main(args: Array[String]): Unit = {

    //12.1 编写函数values(fun:(Int)=>Int,low:Int,high:Int),该函数输出一个集合，对应给定区间内给定函数的输入
    // 和输出。比如，values(x=>x*x,-5,5)应该产出一个对偶的集合(-5,25),(-4,16),(-3,9),…,(5,25)

    def values(fun:(Int)=>Int,low:Int,high:Int): ListBuffer[(Int,Int)] = {
      val tuples: ListBuffer[(Int, Int)] = new ListBuffer[(Int,Int)]()
      for (i <- low to high) {
        tuples.append((i,fun(i)))
      }
      tuples
    }

    //val tuples: ListBuffer[(Int, Int)] = values(x => x * x,-5,5)
    //println(tuples)

    //12.2 如何用reduceLeft得到数组中的最大元素?

    val ints: Array[Int] = Array(3,6,4,1,8,9)

    //val max: Int = ints.reduceLeft((x,y) => {if (x > y) x else y})
    //println(i)

    //12.3 用to和reduceLeft实现阶乘函数,不得使用循环或递归

    val i = 5
    val product: Int = (1 to i).reduceLeft((x,y) => x * y)
    //println(product)

    //12.5 编写函数largest(fun:(Int)=>Int,inputs:Seq[Int]),输出在给定输入序列中给定函数的最大值。举例来说，
    // largest(x=>10*x-x*x,1 to 10)应该返回25.不得使用循环或递归

    def largest(fun:(Int)=>Int,inputs:Seq[Int]) : Int={
      inputs.map(fun).max
    }
    val maxValue: Int = largest(x=>10*x-x*x,1 to 10)
    //println(maxValue)

    //12.6 wordcount
    val lines =List("hello scala","hello spark","hello atguigu")

    val strings: List[String] = lines.flatMap(list => list.split(" "))
    println(strings)

    val stringToStrings: Map[String, List[String]] = strings.groupBy(word => word)
    println(stringToStrings)

    val stringToInt: Map[String, Int] = stringToStrings.map(list => (list._1,list._2.size))
    println(stringToInt)

    //12.7 Int * 2 ,String => Int
    val list = List(1,"2",3,"4",5,"6")
    val list1: List[Int] = list.map({
      case a: Int => a * 2
      case b: String => b.toInt
    })
    println(list)
    println(list1)


    val tokens: Array[String] = "one two three four two two three four".split(" ")
    val map = new mutable.HashMap[String,Int]
    for(key <- tokens){
      map(key) = map.getOrElse(key,0) + 1
      println(key + " " + map(key))
    }
    //问 ： map(four) = ?
    println(map)

  }

}


