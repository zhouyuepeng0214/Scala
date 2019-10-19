package com.atguigu.bigdata.scala.chapter10

import scala.collection.mutable

object Scala12_Method3 {
  def main(args: Array[String]): Unit = {

    val map1 = mutable.Map(("a",1),("b",2),("c",3))
    val map2 = mutable.Map(("a",2),("b",5),("d",4))
    //Map(("a",3),("b",7),("c",3)("d",4)
    val stringToInt: mutable.Map[String, Int] = map1.foldLeft(map2){
      (map,kv) => {
        map(kv._1) = map.getOrElse(kv._1,0) + kv._2
        map
      }
    }
    println(stringToInt)


  }

}
