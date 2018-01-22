package exercism

object CollatzConjectureTest extends App {

  class CollatzConjecture {
    var count = 0
    def steps(n:Int) : Any = {
      if (n == 1) {
        count
      }else if(n == 0 || n< 0)
       None
      else {
        count += 1
                  if (n % 2 == 0){

          steps(n / 2)}
        else {
       steps((3 * n) + 1)
              }
        count
      }
    }


  }
val steps = new CollatzConjecture
  println(steps.steps(1000000))

}
