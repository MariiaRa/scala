package exercism

object SpaceAgeTest extends App{

 class SpaceAge {

   def roundToTwo(x: Double): Double = {
     (Math.round(x * 100)) / 100.0
   }


   def toYears(seconds: Double, orbitalRotation: Double): Double = {
     val yearInSeconds = 31557600.0 * orbitalRotation
        roundToTwo(seconds / yearInSeconds)
   }

   def calculateAge(seconds: Double, planet: String): Unit = {

     planet match {
       case "Earth" => println(s"This person is ${toYears(seconds, 1)}  Earth-years old")

       case "Mercury" => println(s"This person is ${toYears(seconds, 0.2408467)}  Mercury-years old")

       case "Venus" => println(s"This person is ${toYears(seconds, 0.61519726)}  Venus-years old")

       case "Mars" => println(s"This person is ${toYears(seconds, 1.8808158)}  Mars-years old")

       case "Jupiter" => println(s"This person is ${toYears(seconds, 11.862615)}  Jupiter-years old")

       case "Saturn" => println(s"This person is ${toYears(seconds, 29.447498)}  Saturn-years old")

       case "Uranus" => println(s"This person is ${toYears(seconds, 84.016846)}  Uranus-years old")

       case "Neptune" => println(s"This person is ${toYears(seconds, 164.79132)}  Neptune-years old")

       case _ => println("Invalid solar system planet")
     }

   }
 }

  new SpaceAge().calculateAge(8.210123456E9, "Neptune")


}
