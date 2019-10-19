package com.atguigu.bigdata.scala.chapter06

object Scala18_Interface4 {

  def main(args: Array[String]): Unit = {

    val mysql = new Mysql()
    mysql.insert()

  }
}

trait Operate {
  def insert(): Unit ={
    println("插入数据")
  }
}

trait DB extends Operate{
  override def insert(): Unit ={
    print("向数据库表中")
    super.insert()
  }
}

trait LogFile extends Operate{
  override def insert(): Unit ={
    print("向日志文件中")
    // 当前super关键字不是父特质的概念，而是上一个特质的意思
    //todo 如果非要让super指向上一级而不是上一个，需要特殊的方式指定
    super[Operate].insert()
  }
}
// 类混入多个特质时，初始化顺序为从左到右
// 执行特质中的功能时，是从右向左执行
class Mysql extends DB with LogFile {

}


