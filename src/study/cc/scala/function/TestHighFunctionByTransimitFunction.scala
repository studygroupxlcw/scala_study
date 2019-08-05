package study.cc.scala.function

object TestHighFunctionByTransimitFunction {
  def main(args: Array[String]): Unit = {
    var mySalaryFun = multiplyBy(1000)

    println("基本薪资： "+ mySalaryFun(1))

    println("10倍最终薪水： " + mySalaryFun(10))
    println("最终薪水： " + mySalaryFun(2))
  }

  // (x: Int)是一个函数 前一个函数 = (x: Int) 这个函数，=>后面是实现
  def multiplyBy(salaryUnit: Int) = (kpi: Int) => salaryUnit * kpi

}
