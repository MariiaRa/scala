package exercism

object GradeSchoolTest extends App {

  class School {

    var gradeMap = Map[Int, Seq[String]]()





  def add(name: String, grade: Int) =
    {
   gradeMap = gradeMap + (grade -> (gradeMap(grade) :+ name))
    }
  }

  val school = new School
  school.add("Aimee", 2)
  school.add("James", 2)
  school.add("Blair", 2)
  school.add("Paul", 2)

  println(school.gradeMap)


}
