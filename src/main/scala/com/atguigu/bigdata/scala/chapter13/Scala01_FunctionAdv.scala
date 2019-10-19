package com.atguigu.bigdata.scala.chapter13

object Scala01_FunctionAdv {
  def main(args: Array[String]): Unit = {

    val list = List(1,2,3,4,"abc")

    def addOne2(i : Any) : Any = {
      i match {
        case a : Int => a + 1
        case _ =>
      }
    }

    val list1: List[Any] = list.map(addOne2)

//    println(list1)

    new PartialFunction[Any,Int] {
       def isDefinedAt(x: Any): Boolean = {
        if (x.isInstanceOf[Int]) true
         else false
      }

      override def apply(v1: Any): Int = {
        v1.asInstanceOf[Int] + 1
      }
    }

    //偏函数：只对一部分数据进行操作的函数，称之为偏函数
    val addOne3: PartialFunction[Any, Int] = new PartialFunction[Any, Int] {
      override def isDefinedAt(x: Any): Boolean = {
        if (x.isInstanceOf[Int]) true
        else false
      }

      override def apply(v1: Any): Int = {
        v1.asInstanceOf[Int] + 1
      }
    }

    //map函数不能使用偏函数，他是全量函数

    //val ints: List[Int] = list.map(addOne3)
    val ints1: List[Int] = list.collect(addOne3)
    println(ints1)

    //Scala可以简化偏函数的操作，在支持偏函数的方法中直接使用case匹配就可以

    val ints11: List[Int] = list.collect {
      case x: Int => x + 1
    }
    println(ints11)

  }

}


