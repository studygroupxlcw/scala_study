package study.cc.scala.classtest

class TestProtected {

  class Anamal {
    protected def walk() {
      println("work")
    }
  }

  class Pig extends Anamal {
    walk()
  }

  class Cat extends Anamal {
    (new Cat).walk()
  }

}

object Test {
  def main(args: Array[String]): Unit = {
//    new TestProtected()
//    for( a <-  1 until 10) {
//      println(a)
//    }

    val stringList = List("one", "two", "three", "four", "five")

    var newStringList = for {
      str <- stringList if str != "two" && str != "three"
    } yield str

    for (str <- newStringList) {
      println(str)
    }

  }

}
