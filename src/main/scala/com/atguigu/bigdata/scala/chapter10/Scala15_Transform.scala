package com.atguigu.bigdata.scala.chapter10

import scala.collection.mutable.ArrayBuffer

object Scala15_Transform {
  def main(args: Array[String]): Unit = {

    val arr = ArrayBuffer("1", "2", "3")

    import scala.collection.JavaConversions.bufferAsJavaList
    val javaArr = new ProcessBuilder(arr)
    val arrList = javaArr.command()

    println(arrList)

    import scala.collection.JavaConversions.asScalaBuffer
    import scala.collection.mutable

    // java.util.List ==> Buffer
    val scalaArr: mutable.Buffer[String] = arrList

    scalaArr.append("jack")
    println(scalaArr)




  }

}
