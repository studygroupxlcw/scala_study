package study.cc.scala.function

object TestPartialParasFunction {
  def main(args: Array[String]): Unit = {
    val name = "张三"

    // 偏应用函数
    val partialSay = sayHello(name, _: String)

//    def sayHello2(name: String = "张三", msg: String): Unit = {
//      println(name + " " + msg)
//    }

    partialSay("你好")
    partialSay("再见")

  }

  def sayHello(name: String, msg: String): Unit = {
    println(name + " " + msg)
  }
}
