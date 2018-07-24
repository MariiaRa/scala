package exercism

object NucleotideCount {
  private val nucleotides = Set('A', 'T', 'G', 'C')

  private def checkNucleotide(nucleotide: Char) =
    nucleotides.contains(nucleotide)

  private def chackStrand(strand: String) =
    strand.forall {
      checkNucleotide(_)
    }

  def count(strand: String): Option[Map[Char, Int]] = {
    if (chackStrand(strand.toUpperCase))
      Some(strand.groupBy(identity).mapValues(_.length))
    else None
  }
}
