package study.cc.scala.arrays

/**
  * 列表
  */
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

    // 独特的 连接运算“::”读：cons 在列表的开头添加元素
    // x :: xs  表示 结果是 一个 List，它的第一个元素是 x,
    // 它后面跟着一个List xs(跟着这个表xs的所有元素)，用 Nil 表示空表
    // 这个运算符要求前一个是 元素， 后一个是 List,如果两个都是List，要用 三个冒号的“:::”
    // 这个等价于 val language:List[String] = List("java","python","c++")
    val language = "java" :: ("python" :: ("c++" :: Nil))
    // 整型列表
    val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
    // 空列表
    val empty = Nil
    // 二维列表
    // 这个相当于List[List[Int]]
    val dim = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil

    println(language.head) // 获取第一个元素
    println(language.tail) // 获取除第一个元素外的所有元素
    println("----------------------分割线---------------------")
    //
    // List.tabulate() 方法是通过给定的函数来创建列表
    //
    val squares = List.tabulate(6)(n => n * n)
    println("一维： " + squares)
    // 创建二维列表
    // 通配符传入的是行和列，4行5列的数组，
    val mul = List.tabulate(4, 5)(_ * _)
    println("多维 : " + mul)
    println("----------------------分割线---------------------")
    //
    // 两个列表连接操作
    //
    val site1 = "Runoob" :: ("Google" :: ("Baidu" :: Nil))
    val site2 = "Facebook" :: ("Taobao" :: Nil)
    // 使用 ::: 运算符
    var fruit = site1 ::: site2
    println("site1 ::: site2 : " + fruit)
    // 使用 List.:::() 方法
    fruit = site1.:::(site2)
    println("site1.:::(site2) : " + fruit)
    // 使用 concat 方法
    fruit = List.concat(site1, site2)
    println("List.concat(site1, site2) : " + fruit)
    println("----------------------分割线---------------------")

    //我们可以使用 List.fill() 方法来创建一个指定重复数量的元素列表
    val site = List.fill(3)("Runoob") // 重复 Runoob 3次
    println("site : " + site)

    val num = List.fill(10)(2) // 重复元素 2, 10 次
    println("num : " + num)

    println("----------------------分割线---------------------")
    // 从左向右丢弃元素，直到条件p不成立,一旦成立就退出
    val test3 = List("test1", "test2", "test3")
    val test4 = test3.dropWhile(p => p.equals("test1"))
    println(test4)

  }
}
