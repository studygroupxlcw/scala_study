package study.cc.scala.function

object TestOption {
  def main(args: Array[String]): Unit = {
    // 定义一个Map对象
    val mainLanguageMap = Map("java" -> "java程序设计", "python" -> "python程序设计")
    // 通过指定键值，获取可能的value，其返回值是一个Option[T]，代表有可能会存在该键值对应的value，也有可能不存在
    var javaDesc: Option[String] = mainLanguageMap.get("java")
    val phpDesc: Option[String] = mainLanguageMap.get("php")

    println("get java " + javaDesc)
    println("get php " + phpDesc)

    println("javaDesc.isEmpty " + javaDesc.isEmpty)
    println("phpDesc.isEmpty " + phpDesc.isEmpty)

    println(javaDesc.getOrElse("没有拿到Java的信息"))
    println(phpDesc.getOrElse("没有拿到Php的信息"))
  }
}
