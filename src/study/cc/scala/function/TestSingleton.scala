package study.cc.scala.function

/**
  * 伴生类
  * 其构造方法是私有的
  */
class TaskManager private(oneName: String) {
  // 将构造方法传入的局部变量，传递成类的成员变量，方便在后续外部使用
  var name: String = oneName

  // 定义成员方法
  def getName(): String = {
    name
  }
}

/**
  * 定义伴生对象
  */
object TaskManager {
  var taskManager = new TaskManager("windows任务管理器")

  def getSingletonInstance(): TaskManager = {
    taskManager
  }
}

/**
  * 测试单例模式
  */
object TestSingleton {
  def main(args: Array[String]): Unit = {
    var singleton = TaskManager.getSingletonInstance()
    println(singleton.getName())
  }
}


