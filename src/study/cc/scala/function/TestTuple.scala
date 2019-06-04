package study.cc.scala.function

object TestTuple {
  def main(args: Array[String]): Unit = {
    // 直接定义元组
    var personInfo = ("s0001", "张三", 21, 1.3)
    // 通过TupleN来定义，N可以是1-22可选的元组个数
    var personInfoTuple5 = new Tuple5("s0001", "zhangsan", 21, "河北", 1.80)

    /**
      * 元组访问，通过元组索引下标访问，从1开始，元组对象._1代表第一个元素，._2代表第二个元素
      */
    println("元组访问--------")
    println("学号： " + personInfoTuple5._1)
    println("姓名： " + personInfoTuple5._2)
    println("年龄： " + personInfoTuple5._3)
    println("地点： " + personInfoTuple5._4)
    println("身高： " + personInfoTuple5._5)

    // 元组遍历
    println("元组遍历---------")
    personInfo.productIterator.foreach { i => println("元素值： " + i) }

    /**
      * 元组转换成字符串
      */
    println("元组转换成字符串")
    println(personInfo.toString())

  }
}
