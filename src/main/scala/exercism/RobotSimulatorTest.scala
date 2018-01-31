package exercism

object RobotSimulatorTest extends  App {


  object Bearing extends Enumeration {
    type Bearing = Value
    val North, East, South, West = Value
  }


  case class Robot (bearing : Bearing.Bearing, coordinates : (Int, Int)) {

    def turnRight(): Robot = Robot(Bearing.apply((bearing.id + 1) % 4), coordinates)


    def turnLeft(): Robot = {
      val newBearing = if (bearing.id == 0) 3 else  bearing.id - 1
      Robot(Bearing.apply(newBearing), coordinates)
    }

    def advance(): Robot = {
      bearing.id match {
        case 0 => Robot(bearing, (coordinates._1, coordinates._2+1))
        case 1 => Robot(bearing, (coordinates._1+1, coordinates._2))
        case 2 => Robot(bearing, (coordinates._1, coordinates._2-1))
        case 3 => Robot(bearing, (coordinates._1-1, coordinates._2))
      }
    }

    def simulate(commands: String) : Robot = {

      commands.foldLeft(this){
        (Robot, letter) =>
          if (letter == 'R') Robot.turnRight()
          else if (letter == 'L') Robot.turnLeft()
          else  Robot.advance()}
    }

  }

  val robot2 = Robot(Bearing.South, (0, 0))
  println("Moved: " + robot2.advance.coordinates)
  println(robot2.advance.bearing)

  val robot3 = Robot(Bearing.East, (2, -7))
  println(robot3.simulate("RRAAAAALA"))

}