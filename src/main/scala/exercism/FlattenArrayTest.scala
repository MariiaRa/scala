package exercism

object FlattenArrayTest extends App{

  class FlattenArray{

    def flatten(list: List[Any]): List[Int] = list.filter(_ != null).flatMap{
      case c: List[_] => flatten(c)
      case a: Int => List(a)
      }
    
    }


}
