package study.cc.scala.exception

import java.io.{FileNotFoundException, FileReader, IOException}

object TestException {
  def main(args: Array[String]): Unit = {
//    callMe()
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("不好意思，文件没有找到")
      }
      case ex: IOException => {
        println("不明原因的IO异常")
      }
    }
  }

  @throws(classOf[Exception])
  def callMe(): Unit = {
    throw new Exception("test")
//    println("i an in callMe method")
  }


}
