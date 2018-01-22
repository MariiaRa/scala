package exercism

object LeapTest extends App {

  class Leap {

    def isLeapYear(year: Int) : Boolean =
    {
      ((year % 4) == 0) && !(
        ((year % 100) == 0) &&
          !((year % 400) == 0))

    }
  }

  val checkYear = new Leap()
  println(checkYear.isLeapYear(2000))


}
