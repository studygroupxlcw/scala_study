package study.cc.scala.function

object TestFunctionSuper {

  def main(args: Array[String]): Unit = {
//    delayedCalculator(transmitMe())
//    printBabyNames(name2 = "2", name1 = "1")
    printAllParasValue("a","b")
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

  def printBabyNames(name1: String, name2: String):Unit = {
    println(name1 + " " + name2)
  }

  def printAllParasValue(paras: String*):Unit = {
    for(tmp <- paras) {
      println(tmp)
    }
  }

  def defaultMethod(a: Int = 5, unit: Int = 10) = {
    println(a * unit)
  }


}
