package study.cc.scala.maps

object TestMap {
  def main(args: Array[String]): Unit = {
    val maptest: Map[String, String] = Map("1" -> "2", "3" -> "4")
    maptest.keys.foreach {
      i =>
        print("key = " + i)
        println(" value = " + maptest(i))
    }
  }
}
