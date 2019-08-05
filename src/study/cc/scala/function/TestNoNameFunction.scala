package study.cc.scala.function

object TestNoNameFunction {
  def main(args: Array[String]): Unit = {
    var inc = (x: Int) => x + 1
    var x = inc(8)
    println(x)
  }
}
