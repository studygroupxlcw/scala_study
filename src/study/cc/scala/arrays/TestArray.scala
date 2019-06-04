package study.cc.scala.arrays

object TestArray {
  def main(args: Array[String]): Unit = {
//    val programArray = Array("a","b","c")
//    for(test <- programArray) {
//      println(test)
//    }

    var programArray = new Array[String](5)
    programArray(1) = "java"
    programArray(2) = "python"
    programArray(3) = "3"
    for(test <- programArray) {
      println(test)
    }

  }

}
