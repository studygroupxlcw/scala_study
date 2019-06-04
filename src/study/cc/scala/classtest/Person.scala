package study.cc.scala.classtest

class Person(oneName: String, oneGender: String, oneAge: Int) {
  var name: String = oneName
  var gender: String = oneGender
  var age: Int = oneAge

  def makeMoney(method: String): Unit = {
    println("make Money method : " + method)
  }
}

/**
  * 只要构造方法于父类同名，可以直接继承过来
  */
class Student(oneStdNo: String, oneName: String, oneGender: String, oneAge: Int) extends Person(oneName, oneGender, oneAge) {
  var stdNo = oneStdNo

  override def makeMoney(method: String): Unit = {
    println("我是个学生，我的学号是：" + this.stdNo + ",makeMoney method= " + method)
  }

}

object TestPerson {
  def main(args: Array[String]): Unit = {
    var person = new Student("s001", "张一", "male", 20)
    println("person.stdno=" + person.stdNo)
    println("person.name=" + person.name)
    println("person.gender=" + person.gender)
    println("person.age=" + person.age)

    person.makeMoney("coding")

  }
}
