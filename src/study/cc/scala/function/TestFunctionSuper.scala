package study.cc.scala.function

object TestFunctionSuper {
  // 概念说明
  // 传名调用：将为计算的参数表达式直接应用到函数内部，用=>来设置传名调用
  // 传值调用：先计算参数表达式的值，再应用到函数内部，把=>去掉即可，即按原始的方式
  // 延迟计算，调用了才计算方法，加了=>就是传名，去掉了就是正常调用方式

  def main(args: Array[String]): Unit = {
    delayedCalculator(transmitMe())
    printBabyNames(name2 = "2", name1 = "1")
    printAllParasValue("a", "b")
  }

  def transmitMe(): String = {
    println("我在transmitMe中调用")
    "trainsmitMe 返回值"
  }

  def delayedCalculator(t: => String): Unit = {
    println("在delayedCalculator方法开始---")
    println("正式调用传过来的函数 " + t)
    println("在delayedCalculator方法结束----")
  }

  def printBabyNames(name1: String, name2: String): Unit = {
    println(name1 + " " + name2)
  }

  def printAllParasValue(paras: String*): Unit = {
    for (tmp <- paras) {
      println(tmp)
    }
  }

  def defaultMethod(a: Int = 5, unit: Int = 10) = {
    println(a * unit)
  }


}
