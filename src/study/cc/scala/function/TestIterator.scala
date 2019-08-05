package study.cc.scala.function

object TestIterator {
  def main(args: Array[String]): Unit = {
    val it1 = Iterator("java", "python", "c++")
    val it2 = Iterator("java", "python", "c++")
    val it3 = Iterator("java", "python", "c++")
    val it4 = Iterator("java", "python", "c++")
    val it5 = Iterator("java", "python", "c++")

    /**
      * 迭代器遍历集合
      */
    println("遍历集合")
    while (it1.hasNext) {
      println(it1.next())
    }

    println("----------")
    /**
      * 迭代器求集合最大值
      */
    println(it2.max)

    println("----------")
    /**
      * 迭代器集合的最小值
      */
    println(it3.min)

    println("----------")
    /**
      * 迭代器长度
      */
    println(it4.length)
    println(it5.size)
  }
}
