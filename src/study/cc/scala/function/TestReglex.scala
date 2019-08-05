package study.cc.scala.function

import scala.util.matching.Regex

object TestReglex {
  def main(args: Array[String]): Unit = {
    // 代表正则表达式
    val pattern = "sdf".r
    // 正则要去匹配的源字符串
    val str = "sdfsfsafsdf"
    val findValue = pattern findFirstIn str
    println(findValue.getOrElse("没取到"))

    val iter = pattern findAllIn str
    for (item <- iter) {
      println(item)
    }

    val pattern2 = new Regex("(十八|18)大")
    val str2 = "十八大是一个重要具有里程碑式大会议，18大以来"
    println((pattern2 findAllIn str2).mkString(","))

    val pattern3 = new Regex("[\\d]+")
    val str3 = "十八19大是一个重要具有里程碑式大会议，18大以来"
    println(pattern3.findAllIn(str3).mkString(","))
  }
}
