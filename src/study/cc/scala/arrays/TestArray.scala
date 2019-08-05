package study.cc.scala.arrays

import scala.Array.{concat, ofDim}



/**
  * Array数组
  */
object TestArray {
  def main(args: Array[String]): Unit = {
    //
    // 数组之间concat
    //
    var array1 = Array("1", "2", "3", "4")
    val array2 = Array("5", "6", "7", "8")

    array1 = "0" +: array1

    array1 = array1 :+ "9"

    val cc = array1.head
    val dd = array1.tail

    println(cc)
    println(dd)

    for(a <- dd) {
      println(a)
    }

    // 按照顺序进行拼接
    val array3 = concat(array1, array2)

    for (ele <- array3) {
      println(ele)
    }

    println("----------------------分割线---------------------")

    //
    // 数组，用圆括号取值，数组下标从0开始，没有给赋值的为null
    //
    var programArray = new Array[String](5)
    programArray(1) = "java"
    programArray(2) = "python"
    programArray(3) = "3"
    for (test <- programArray) {
      println(test)
    }

    //
    // 二位方阵的例子
    //
    var myMatrix = ofDim[Int](4, 4)
//    for(int i= 0;i<myMatrix.length ;i++)
    for (i <- 0 until myMatrix.length) {
      for (j <- 0 until myMatrix(i).length) {
        myMatrix(i)(j) = (i + 1) * (j + 1)
      }
    }

    for (i <- 0 until myMatrix.length) {
      for (j <- 0 until myMatrix.length) {
        print(" " + myMatrix(i)(j))
      }
    }

    println("----------------------分割线---------------------")

    // 第二种遍历方法
    for (one <- myMatrix) {
      for (oneEle <- one) {
        print(" " + oneEle)
      }
    }

    println("----------------------分割线---------------------")

    // until和to的区别
    (1 to 5).foreach(println(_))
    (1 until 5).foreach(println)
  }

}
