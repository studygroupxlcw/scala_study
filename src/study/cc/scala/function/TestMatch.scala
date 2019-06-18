package study.cc.scala.function

object TestMatch {
  def main(args: Array[String]): Unit = {
    List("Sunday", 1, "Monday", 1.0,'h').map(matchMethod(_)).foreach(println)
  }

  def matchMethod(day: Any): String = day match {
    case "Sunday" => "Eat...PlayGame..."
    case 1 => "这是1，数值类型"
    case "Monday" => "work...work..."
    case _ => "不知道什么类型，通配符"
  }
}
