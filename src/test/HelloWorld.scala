package test

object HelloWorld {
  def main(args: Array[String]): Unit = {
    var lines = List("hello hello world jerry", "hello kitty hello china")
    // map 把每个元素取出来进行相应操作
    // 方法1 groupBy后面的参数是组成Map时，将map的哪个参数作为key，会自动将key相同的值放到一个集合中
    val wc = lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).map(t => (t._1, t._2.size)).toList.sortBy(_._2).reverse
    // 方法2 利用mapValues方法集中处理v
    val wc2 = lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).mapValues(_.size).toList.sortBy(_._2).reverse
    // 方法3 主动自己加，初始值是0
    val wc3 = lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).mapValues(_.foldLeft(0)(_ + _._2))
    println(wc)
  }
}
