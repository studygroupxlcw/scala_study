package study.cc.scala.function

object FunctionTest {

  def functionName(arg: String): String = {
    println(arg)
    "Hello"
  }

  // 没有参数的方法可以叫做过程，括号可以省略 最后一行是返回值
  def function: String = {
    "无参方法"
  }

  // 没有返回值的函数也可以省略,建议加上:Unit 返回类型方便阅读，形式上看起来就像一个闭包
  def functiontest = {
    println("无参无返回值")
  }

  def main(args: Array[String]): Unit = {
    println(functionName("test"))
    println(function)
    functiontest
  }
}
