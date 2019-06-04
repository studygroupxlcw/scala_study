package study.cc.scala.arrays

object TestList {
  def main(args: Array[String]): Unit = {
    //    val language: List[String] = List("1", "java")
    //    val nums: List[Int] = List(1, 2, 3)
    //    val empty: List[Nothing] = List()
    //    val dim: List[List[Int]] = List(
    //      List(1, 0, 0),
    //      List(0, 1, 0),
    //      List(0, 0, 1)
    //    )
    // 字符串列表
    val language = "java" :: ("python" :: ("c++" :: Nil))
    // 整型列表
    val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
    // 空列表
    val empty = Nil
    // 二维列表
    val dim = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil

    println(language.head)
    println(language.tail)

    val squares = List.tabulate(6)(n => n * n)
    println()
  }
}
