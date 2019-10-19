package com.atguigu.bigdata.scala.chapter10

import scala.util.Left

object Scala08_Method {
  def main(args: Array[String]): Unit = {

    //集合通用的方法
    val nums: List[Int] = List(1,3,4,2)


//    println(nums.head)
//    println(nums.tail)
//    println(nums.last)
    //除最后一个以外的
//    println(nums.init)
//    println(nums.size)
//    println(nums.length)

//
//    println(nums.sum)
//    println(nums.max)
//    println(nums.min)
    //乘积
    //println(nums.product)

    //反转
    //println(nums.reverse)
    //排序: 通过指定的规则来排序
    //val ints: List[Int] = nums.sortBy(num=>num)
    //val ints: List[Int] = nums.sortWith((x,y)=>{x>y})
    //过滤
    //val ints: List[Int] = nums.filter((num)=>{true})
    //val ints: List[Int] = nums.filter((num)=>{num % 2 == 0})
    //

    val wordList = List("Hello","Hbase","Hadoop","Scala","Spark")

    // todo Scala 中 == 与java不一样，可以比较内容
    val strings: List[String] = wordList.filter((word)=>{word.substring(0,1).equals("S")})
    //println(strings)

    //Map : 映射

    //val ints: List[Int] = for (i <- nums) yield i * 2

    //val ints: List[Int] = nums.map(a=>a*2)
    //val ints: List[Int] = nums.map(_*2)

    //val tuples: List[(Int, Int)] = nums.map((_,1))
    val tuples: List[(Int, Int)] = nums.map(a=>{(a,1)})

    //println(ints)
    //println(tuples)

    //flatMap : 扁平化

    val list: List[List[Int]] = List(List(1,2),List(3,4),List(5,6))

    val ints: List[Int] = list.flatMap(list=>list)

    //println(ints)

    val strings1: List[String] = List("Hello Scala","Hello Hbase","Hello Hadoop","Hello Spark")
    val strings2: List[String] = strings1.flatMap(list=>list.split(" "))

    //println(strings2)

    //groupBy
    //Map(分组key -> 元素)
    //println(nums.groupBy(num => num % 2))
    //println(strings1.groupBy(s => s.substring(0, 1)))

    //集合的循环遍历
    //nums.foreach(println)

    //mapper <= => reduce
    //reduce : 聚合（数据的减少，最终获取值）

    //从源码的角度，reduce方法调用的reduceLeft
    //val i: Int = nums.reduce((x,y) => {x + y})
    //val i: Int = nums.reduce(_ + _)
    val i: Int = nums.reduce(_ - _)
    println(i)

    //reduceRight  (1-(3-(4-2)))
    println(nums.reduceRight(_ - _))






  }

}
