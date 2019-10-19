package com.atguigu.bigdata.scala.chapter10

import scala.collection.{immutable, mutable}

object Scala10_WordCount2 {
  def main(args: Array[String]): Unit = {

    //使用2种不同的方式统计集合中含有H字母单词的数量
    val lineList = List(("Hadoop Hbase Hive",5), ("Hadoop Kafka Hive",4), ("Kafka Hive",3), ("Hive", 2))

    //(Hadoop,5),(Hbase,5),(Hive,5)
    val wordToCountList: List[(String, Int)] = lineList.flatMap {
      case (line,count) => {
        val words: mutable.ArrayOps[String] = line.split(" ")
        words.map{
          word => (word,count)
        }
      }
    }
    println(wordToCountList)

    val tuples: List[(String, Int)] = wordToCountList.filter {
      case (word, count) => {
        word.substring(0, 1) == "H"
      }
    }
    println(tuples)

    val stringToTuples: Map[String, List[(String, Int)]] = tuples.groupBy(list => list._1 )
    println(stringToTuples)

    val stringToInts: Map[String, List[Int]] = stringToTuples.mapValues {
      list => {
        list.map {
          case (word, count) => count
        }
      }
    }
    println(stringToInts)

    /*
    val stringToInts: Map[String, List[Int]] = stringToTuples.map {
      case (word, list) => {
        (word, list.map {
          case (w, count) => (count)
        })
      }
    }
    println(stringToInts)
    */

    val stringToInt: Map[String, Int] = stringToInts.map {
      case (word, list) => (word, list.sum)
    }
    println(stringToInt)


  }

}
