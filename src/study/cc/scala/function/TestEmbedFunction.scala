package study.cc.scala.function

object TestEmbedFunction {
  def main(args: Array[String]): Unit = {
    printMessage("hello")
  }

  def printMessage(msg: String): Unit = {

    def printMessageInner(msg: String): Unit = {
      println(msg)
    }

    printMessageInner(msg)
  }

}
