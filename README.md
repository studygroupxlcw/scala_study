# scala_study
## Scala List 常用方法
| 序号 | 方法及描述 |
| --- | --- |
| 1 | def +:(elem: A): List[A] 为列表预添加元素 |
| 2 | def ::(x: A): List[A] 在列表开头添加元素 |
| 3 | def :::(prefix: List[A]): List[A]  在列表开头添加指定列表的元素|
| 4 | def :+(elem: A): List[A] 复制添加元素后列表。 |
| 5 | def addString(b: StringBuilder): StringBuilder 将列表的所有元素添加到 StringBuilder |
| 6 | def addString(b: StringBuilder, sep: String): StringBuilder 将列表的所有元素添加到 StringBuilder，并指定分隔符 |
| 7 | def apply(n: Int): A  通过列表索引获取元素|
| 8 | def contains(elem: Any): Boolean 检测列表中是否包含指定的元素 |
| 9 | def copyToArray(xs: Array[A], start: Int, len: Int): Unit 将列表的元素复制到数组中 |
| 10 | def distinct: List[A] 去除列表的重复元素，并返回新列表 |
| 11 | def drop(n: Int): List[A] 丢弃前n个元素，并返回新列表 |
| 12 | def dropRight(n: Int): List[A]   丢弃最后n个元素，并返回新列表 |
| 13 | def dropWhile(p: (A) => Boolean): List[A] 从左向右丢弃元素，直到条件p不成立 |
| 14 | def endsWith[B](that: Seq[B]): Boolean 检测列表是否以指定序列结尾 |
| ... | ... |



### 例子
序号1：
  
    scala> val x = List(1)
    x: List[Int] = List(1)
    
    scala> val y = 2 +: x
    y: List[Int] = List(2, 1)
    
    scala> println(x)
    List(1)

序号4：
    
    scala> val a = List(1)
    a: List[Int] = List(1)
    
    scala> val b = a :+ 2 
    b: List[Int] = List(1, 2)


##参考资料
Scala List 常用方法
> https://www.runoob.com/scala/scala-lists.html