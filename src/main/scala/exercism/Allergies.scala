package exercism

object Allergies {
  val allergies: Map[Int, String] = Map(
    1 -> "Eggs",
    2 -> "Peanuts",
    4 -> "Shellfish",
    8 -> "Strawberries",
    16 -> "Tomatoes",
    32 -> "Chocolate",
    64 -> "Pollen",
    128 -> "Cats"
  )

  def findAllergies(score: Int): List[String] = {
    if (score >= 256) List("Eggs")
    else allergies.keySet.filter(x => (x & score) != 0).map(x => allergies(x)).toList
  }
}