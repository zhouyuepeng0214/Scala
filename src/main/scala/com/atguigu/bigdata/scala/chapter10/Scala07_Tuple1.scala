package com.atguigu.bigdata.scala.chapter10

object Scala07_Tuple1 {
  def main(args: Array[String]): Unit = {

    val t = ("a",1)
    val stringToInt: Map[String, Int] = Map(t)

    val stringToInt1: Map[String, Int] = Map(("a",1),("b",2),("c",3))

    println(stringToInt1)
    stringToInt1.foreach(println(_))
    stringToInt1.foreach((t)=>{println(t._1 + "=" + t._2)})

    //获取集合的key/values
    val keys: Iterable[String] = stringToInt1.keys
    val values: Iterable[Int] = stringToInt1.values

    for (elem <- values) {
      println(elem)
    }


  }

}
