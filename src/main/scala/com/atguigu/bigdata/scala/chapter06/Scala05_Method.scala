package com.atguigu.bigdata.scala.chapter06

object Scala05_Method {

  def main(args: Array[String]): Unit = {

    // 类中的方法
    // 类中的方法其实就是函数，所以遵循函数的声明方式
    // 调用时，使用 对象.方法 方式

    val user = new User05()
    //println(user.login())
    //println(user.+("zhangsan"))

    println(user.isInstanceOf[User05])
    println(user.asInstanceOf[User05])

    //同java中类名.class
    //scala包中的Predef半生对象，在使用时可以省略
    val clazz: Class[User05] = classOf[User05]

  }

}

class User05 {
  var userid : Int = _
  //声明方法
  def login() : Boolean = {
    true
  }

  override def equals(o : scala.Any) : Boolean = {
    if (o.isInstanceOf[User05]) {
      val other = o.asInstanceOf[User05]
      this.userid == other.userid
    } else {
      false
    }
  }

}
