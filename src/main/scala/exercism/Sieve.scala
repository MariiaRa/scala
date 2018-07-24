package exercism

object Sieve {

  def findPrimes(limit: Int) = {
    def primes(list: List[Int]): List[Int] = list.headOption match {
      case None => list
      case Some(head) => head :: primes(list.tail.filter(_ % head != 0))
    }

    primes((2 to limit).toList)
  }
}
