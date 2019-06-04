package study.cc.scala.arrays

import scala.Array.concat

object ArrayConcat {
  def main(args: Array[String]): Unit = {
    val array1 = Array("1", "2", "3", "4")
    val array2 = Array("5", "6", "7", "8")

    val array3 = concat(array1, array2)

    for(ele <- array3) {
      println(ele)
    }
  }

}
