package exercism

object HelloWorldTest {

  class HelloWorld {
    def hello() = println("Hello World!")
  }

  def main(args: Array[String]): Unit = {
    val print = new HelloWorld()
    print.hello()
  }
}