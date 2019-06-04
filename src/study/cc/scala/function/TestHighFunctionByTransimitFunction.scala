package study.cc.scala.function

object TestHighFunctionByTransimitFunction {
  def main(args: Array[String]): Unit = {
    var mySalaryFun = multiplyBy(1000)
    println(mySalaryFun(10))
  }

  // (x: Int)是一个函数 前一个函数 = (x: Int) 这个函数，=>后面是实现
  def multiplyBy(salaryUnit: Int) = (x: Int) => salaryUnit * x

}
