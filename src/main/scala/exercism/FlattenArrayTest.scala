package exercism

object FlattenArrayTest{

  class FlattenArray  {



    def flatten(list: List[Any]): List[Int] = list.filter(_ != null).flatMap{
      case a: List[_] => flatten(a)
      case b: Int => List(b)

      }


    }

  def main(args: Array[String]): Unit = {

    val x = new FlattenArray
    println(x.flatten(      List(null,
      List(List(List(null))),
      null,
      null,
      List(List(null, null), null),
      null)))
  }

}
