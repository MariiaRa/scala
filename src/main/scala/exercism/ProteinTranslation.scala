package exercism

object ProteinTranslation {
  val codonTable: Map[List[String], String] = Map(
    List("AUG") -> "Methionine",
    List("UUU", "UUC") -> "Phenylalanine",
    List("UUA", "UUG") -> "Leucine",
    List("UCU", "UCC", "UCA", "UCG") -> "Serine",
    List("UAU", "UAC") -> "Tyrosine",
    List("UGU", "UGC") -> "Cysteine",
    List("UGG") -> "Tryptophan",
    List("UAA", "UAG", "UGA") -> "STOP"
  )

  val flatCodonTable: Map[String, String] = codonTable.flatMap(elem => elem._1.flatMap(ch => Map(ch -> elem._2)))

  def translation(rna: String): List[String] = {
    val codons = rna.grouped(3).toList

    codons.takeWhile(codon => flatCodonTable(codon) != "STOP").map(codon => flatCodonTable(codon))

  }
}
