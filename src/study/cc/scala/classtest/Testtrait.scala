package study.cc.scala.classtest

/**
  * 定义核心计算特征
  * 1. 当做接口
  * 2. 带有具体实现的接口
  * 3. 带有特质的对象
  * 4. 特质从左到右被构造
  */
trait CalcuteCoreTrait {
  // 实体方法
  def add(a: Int, b: Int): Int = a + b

  def minus(a: Int, b: Int): Int = a - b

  // 抽象方法
  def factorial(n: Int): Int
}

trait CaculateCoreTrait2 extends CalcuteCoreTrait {
  // 重写父类实体方法
  override def add(a: Int, b: Int): Int = {
    a + b + a
  }
}

class TLCalulator(oneName: String) extends CalcuteCoreTrait {
  var name = oneName

  def test(a: Int, b: Int) = {
    println(add(a, b))
  }

  def factorial(n: Int): Int = {
    if (n <= 1) {
      1
    } else {
      n * factorial(n - 1)
    }
  }
}

abstract class Account {
  def save
}

// 带有特质的对象（一个类可以通过 with 扩展多个特质，特质是从左到右被构造）
class MyAccount extends Account with CaculateCoreTrait2 {
  override def save: Unit = {
    println("------从MyAccount打出add方法：" + add(1, 2))
  }

  override def factorial(n: Int): Int = {
    if (n <= 1) {
      1
    } else {
      n * factorial(n - 1)
    }
  }
}

// 启动方法有两种，1是实现main方法，2是extends App
object TestTrait {
  def main(args: Array[String]): Unit = {
    // 指定变量类型
    var t1: CalcuteCoreTrait = new TLCalulator("计算器")
    // 不指定变量类型
    var t2 = new TLCalulator("测试")
    var a = 3
    var b = 4

    // 直接调用父类的add方法
    println(t1.add(a, b))
    // 也可以封装一层
    t2.test(a, b)
    println(t1.minus(a, b))
    println(t1.factorial(b))

    println("----------------分界线--------------")

    var t3: MyAccount = new MyAccount()
    t3.save
    // 打印出父类的父类的方法
    println(t3.minus(4, 3))
    // 另外一种方法，同类的不同对象可以添加不同的特质
    val m = new MyAccount with CalcuteCoreTrait
    val c = new MyAccount with CaculateCoreTrait2
    //可以为类和对象添加多个互相调用的特质，从最后一个开始。
    // 对于需要分阶段加工处理某个值的场景非常有用。实际上，哪个函数被调用是由特质添加的顺序来决定的
    val d = new MyAccount with CalcuteCoreTrait with CaculateCoreTrait2
  }
}

