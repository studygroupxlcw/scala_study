package study.cc.scala.classtest

/**
  * 定义核心计算特征
  */
trait CalcuteCoreTrait {
  // 实体方法
  def add(a: Int, b: Int): Int = a + b

  def minus(a: Int, b: Int): Int = a - b

  // 抽象方法
  def factorial(n: Int): Int
}

class TLCalulator(oneName: String) extends CalcuteCoreTrait {
  var name = oneName

  def factorial(n: Int): Int = {
    if (n <= 1) {
      1
    } else {
      n * factorial(n - 1)
    }
  }
}

object TestTrait {
  def main(args: Array[String]): Unit = {
    var t1: CalcuteCoreTrait = new TLCalulator("计算器")
    var a = 3
    var b = 4

    println(t1.add(a, b))
    println(t1.minus(a, b))
    println(t1.factorial(b))
  }
}

