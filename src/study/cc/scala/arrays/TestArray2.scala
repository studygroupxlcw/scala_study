package study.cc.scala.arrays

import scala.Array.ofDim

object TestArray2 {
  def main(args: Array[String]): Unit = {
    var myMatrix = ofDim[Int](4, 4)
    // 创建二维方阵
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

    for(one <- myMatrix) {
      for (oneEle <- one) {
        print(" " + oneEle)
      }
    }
  }
}
