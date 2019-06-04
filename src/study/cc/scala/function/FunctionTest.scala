package study.cc.scala.function

object FunctionTest {
  def functionName(arg: String): String = {
    // function body
    println(arg)
    "Hello"
  }

  def main(args: Array[String]): Unit = {
    println(functionName("test"))
  }
}
