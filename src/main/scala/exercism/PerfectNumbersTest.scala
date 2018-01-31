package exercism


object NumberType extends Enumeration {
  type NumberType = Value
  val Deficient, Perfect, Abundant = Value
}

object PerfectNumbersTest extends App{

  class PerfectNumbers {

    def findSum(x: Int):Int = {
      (1 until x).filter(s => x%s == 0).sum
          }

    def classify(x: Int): NumberType.NumberType = {
      findSum(x) match {
        case (a) if x == a => NumberType.Perfect
        case (b) if x > b => NumberType.Deficient
        case _ => NumberType.Abundant
      }
    }
  }

  val number = new PerfectNumbers
  println(number.classify(33550337))


}
