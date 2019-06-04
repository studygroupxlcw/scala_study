package study.cc.scala.function

object TestSwitchCase {
  def main(args: Array[String]): Unit = {
    println(selfMatch("javase"))
  }

  def selfMatch(x: String): String = x match {
    case "javase" => {
      var i = 3
      if (i > 3) {
        "Java开发标准版"
      } else {
        "Java开发标准版"
      }
    }
    case "javaee" => "Java开发企业版"
    case _ => "其他Java版本"
  }

  def selfMatch(x: Any): Any = x match {
    case "one" => 1
    case 2 => "two"
    case "III" => "希腊数字3"
    case _ => "其他"
  }

  def selfMatch(x: Int): String = x match {
    case _ if x < 12 => "幼年"
    case _ if x < 18 => "未成年"
    case _ if x >= 18 && x < 60 => "成年"
    case _ => "已经步入老年"
  }

  def selfMatchObj(x: Any): Any = x match {
    case _: Int => "传入的是整型"
    case _: String => "传入的是字符串"
    case _: TestPatternMatch => "传入的类型是TestPatternMatch"
    case _ => "不知道什么类型"
  }

}

class TestPatternMatch {

}