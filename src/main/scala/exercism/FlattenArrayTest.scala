package exercism

object FlattenArrayTest extends App{

  class FlattenArray{

<<<<<<< HEAD


    def flatten(list: List[Any]): List[Int] = list.filter(_ != null).flatMap{
      case a: List[_] => flatten(a)
      case b: Int => List(b)

=======
    def flatten(list: List[Any]): List[Int] = list.filter(_ != null).flatMap{
      case c: List[_] => flatten(c)
      case a: Int => List(a)
>>>>>>> 30206a8fc50479711b498209292bae6bf94dfa26
      }
    
    }

<<<<<<< HEAD
  def main(args: Array[String]): Unit = {

    val x = new FlattenArray
    println(x.flatten(      List(null,
      List(List(List(null))),
      null,
      null,
      List(List(null, null), null),
      null)))
  }
=======
>>>>>>> 30206a8fc50479711b498209292bae6bf94dfa26

}
