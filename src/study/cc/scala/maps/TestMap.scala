package study.cc.scala.maps

object TestMap {
  def main(args: Array[String]): Unit = {
    val maptest: Map[String, String] = Map("1" -> "2", "3" -> "4")
    //    val maps: Map[String, String] = new

    maptest.keys.foreach {
      i =>
        print("key = " + i)
        println(" value = " + maptest(i))
    }

    println ("--------")

    maptest.values.foreach {
      v =>
        println("value = " + v)
    }
  }
}
