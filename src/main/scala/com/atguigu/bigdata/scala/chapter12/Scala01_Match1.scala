package com.atguigu.bigdata.scala.chapter12

object Scala01_Match1 {

  def main(args: Array[String]): Unit = {

    /*
    val oper = '#'
    val n1 = 20
    val n2 = 10
    var res = 0
    n1 match {
      case 20 => res = n1 + n2
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      case _ => println("oper error")
    }

    oper match {
      case '+' => res = n1 + n2
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      case _ => println("oper error")
    }
    println("res=" + res)
    */

    // todo 模式匹配：匹配类型，不包含泛型
    // todo Map[String,Int] 中括号里是泛型
    // todo Array[Int] 中括号里不是泛型

    /*
    val a = 5
    val obj = if(a == 1) 1
    else if(a == 2) "2"
    else if(a == 3) BigInt(3)
    else if(a == 4) Map("aa" -> 1)
    else if(a == 5) Map(1 -> "aa")
    else if(a == 6) Array(1, 2, 3)
    else if(a == 7) Array("aa", 1)
    else if(a == 8) Array("aa")

    val result = obj match {
      case a : Int => a
      case b : Map[String, Int] => "对象是一个字符串-数字的Map集合"
      case c : Map[Int, String] => "对象是一个数字-字符串的Map集合"
      case d : Array[String] => "对象是一个字符串数组"
      case e : Array[Int] => "对象是一个数字数组"
      case f : BigInt => Int.MaxValue
      case _ => "啥也不是"
    }
    println(result)
    */

    for (pair <- Array((0, 1), (1, 0), (2, 1),(1,0,2))) {
      val result = pair match {
        case (0, _) => "0 ..."
        case (y, 0) => y
        case (a,b) => (b,a)
        case _ => "other"
      }
      println(result)
    }

    val (id,age,name) = (2,26,"bbb")
    println(s"id = $id,age = $age,name = $name")


  }

}
