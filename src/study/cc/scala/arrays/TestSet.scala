package study.cc.scala.arrays

import scala.collection.mutable.Set

object TestSet {
  def main(args: Array[String]): Unit = {
    //    val set = Set(1, 2, 3, 4, 5, 6)
    //    // 得到对应的set路径
    //    println(set.getClass.getName)
    //    // 利用exists方法，判断集合元素是否存在%2==0的元素
    //    println(set.exists(_ % 2 == 0))
    //    // 打印当前集合序列
    //    println(set)
    //    // 从集合中删除一个元素
    //    println(set.drop(1))
    //    // 再次打印之前的集合
    //    println(set)
    val mutableSet = Set(1, 2, 3, 4, 5, 6)
    mutableSet.add(4)
    // 删除元素1
    mutableSet.remove(1)
    println("删除元素1后： " + mutableSet)
    mutableSet += 7
    println("+7 后： " + mutableSet)
    mutableSet -= 2
    println("-2后： " + mutableSet)

    //将可变set转换成不可变set
    val another = mutableSet.toSet
    println(another.getClass.getName)
    //对不可变集合做删除1个元素的操作
    println("对不可变集合做删掉元素1操作=" + another.drop(1))
    //重新打印不可变集合
    println("another=" + another)

  }
}
