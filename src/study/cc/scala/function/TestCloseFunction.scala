package study.cc.scala.function

object TestCloseFunction {
  var factory = 1000
  def salaryMoney(i: Int): Int = {
    i * factory
  }

  def main(args: Array[String]): Unit = {
    println("月薪salaryMoney(8) value = " + salaryMoney(8))
    TestCloseFunction.factory = 10000
    println("年薪salaryMoney(8) value = " + salaryMoney(8))

  }
}
