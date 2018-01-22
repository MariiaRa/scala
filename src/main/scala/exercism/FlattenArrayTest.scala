package exercism

object FlattenArrayTest{

  class FlattenArray  {



    def flatten(list: List[Any]): List[Any] = list.filter(_ != null).flatMap{
      case c: List[_] => flatten(c)
      case b: List[Int] => b
        case a: Int => List(a)

      }


    }

  def main(args: Array[String]): Unit = {

    val x = new FlattenArray
    println(x.flatten(      List(0,
      2,
      List(List(2, 3), 8, List(List(100)), null, List(List(null))),
      -2)))
  }

}
