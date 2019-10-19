package com.atguigu.bigdata.scala.chapter10

object Scala10_WordCount1 {
  def main(args: Array[String]): Unit = {

    val listWord: List[(String, Int)] = List(("Hello Scala",4),("Hello Spark",3),("Spark Scala",2))

    val strings: List[String] = listWord.map(t => {(t._1 + " ") * t._2})
    println(strings)

    val strings1: List[String] = strings.flatMap(list => list.split(" "))
    println(strings1)

    //list => list 不能用_代替，会有歧义，可能返回函数
    val stringToStrings: Map[String, List[String]] = strings1.groupBy(list => list)
    println(stringToStrings)

    val stringToInt: Map[String, Int] = stringToStrings.map(t => {(t._1,t._2.size)})
    println(stringToInt)

  }

}
