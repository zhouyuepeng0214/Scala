package com.atguigu.bigdata.scala.chapter10

object Scala09_WordCount {
  def main(args: Array[String]): Unit = {

    val lineList: List[String] = List("Hello Scala","Scala Spark ","Hello Spark")

    val wordList: List[String] = lineList.flatMap(line => line.split(" "))

    val wordGroupMap: Map[String, List[String]] = wordList.groupBy(word => word)
    println(wordGroupMap)



    val stringToInt: Map[String, Int] = wordGroupMap.map(t => {(t._1,t._2.size)})
    println(stringToInt)

  }

}
