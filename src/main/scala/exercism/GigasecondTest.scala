package exercism

import java.time.format.DateTimeFormatter
import java.time.{LocalDate, LocalDateTime}

object GigasecondTest extends App {


  private def dateTime(str: String): LocalDateTime =
    LocalDateTime.from(DateTimeFormatter.ISO_DATE_TIME.parse(str))
  private def date(str: String): LocalDate =
    LocalDate.from(DateTimeFormatter.ISO_DATE.parse(str))


  class Gigasecond {

    val gigasecond = 1000000000

    def add(startDate: LocalDate): LocalDateTime = {
      val expected: LocalDateTime = startDate.atStartOfDay()
      expected.plusSeconds(gigasecond)
    }
  }

  val time = new Gigasecond
  val input = date("2011-04-25")
  val expected = dateTime("2043-01-01T01:46:40")
  println(time.add(input))
assert(time.add(input) == expected)

}
