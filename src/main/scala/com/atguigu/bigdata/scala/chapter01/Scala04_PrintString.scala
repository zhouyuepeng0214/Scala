package com.atguigu.bigdata.scala.chapter01

object Scala04_PrintString {
  def main(args: Array[String]): Unit = {

    var username = "zhangsan"

    var age = 20

    println(s"{'姓名':'${username.length}','age':$age} \n xxxxx")
    println(raw"{'姓名':'${username.length}','age':$age}" +
      raw"" +
      raw"" +
      raw"" +
      raw" xxxxx")
    println("""{'姓名':'${username.length}','age':$age}
      ddddd
      ddddd
      xxxxx""")

  }

}
