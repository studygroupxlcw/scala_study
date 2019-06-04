package study.cc.scala.classtest

abstract class Person2

case class Student2(name: String, age: Int, studentNo: Int) extends Person2

object TestExtractor extends App {

  // case class 会自动生成apply方法，从而省去new操作
  val p: Person2 = Student2("john", 18, 1024)

  p match {
    case Student2(name, age, studentNo) => println(name + ":" + age + ":" + studentNo)
  }

  //  def main(args: Array[String]): Unit = {

  //    val a = (1 to 100).toList
  //    val sum = a.reduceLeft(_ + _)
  //    println(sum)
  //
  //    println((1 to 100).reduceLeft(_ + _))

  //    val mutableSet = Set(2, 3, 4, 5, 6)
  //    mutableSet.add(1)
  //
  //    for(ele <- mutableSet) {
  //      println(ele)
  //    }
  //
  //
  //    val s = scala.collection.mutable.ListBuffer.empty[Int]
  //    s += 1
  //    s.foreach(println(_))

  //
  //    val applymethod = TestExtractor("cc", "10.1.234.3")
  //    println(applymethod)
  //
  //    applymethod match {
  //      case TestExtractor(username, ip) => println(username + "登陆了" + ip)
  //      case _ => println(applymethod)
  //    }
  //  }

  def apply(username: String, ip: String) = {
    username + "@" + ip
  }

  def unapply(str: String): Option[(String, String)] = {
    val value = str split "@"
    if (value.length == 2) {
      Some(value(0), value(1))
    } else {
      None
    }
  }
}
