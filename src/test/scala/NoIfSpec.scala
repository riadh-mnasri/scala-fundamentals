import java.time.{DayOfWeek, LocalDate}

import org.scalatest.{FlatSpec, Matchers}

class NoIfSpec extends FlatSpec with Matchers {


  def countOdds(arrayOfIntegers: List[Int]): Int = {
    arrayOfIntegers.count(i => i % 2 != 0)
  }

  it should "count odd number" in {
    val arrayOfIntegers = List(1, 4, 5, 9, 0, -1, 5)
    assert(countOdds(arrayOfIntegers) == 5)
  }

  def weekendOrWeekday(dayOfWeek: LocalDate): String = {
    val dictionnaire = Map("SUNDAY" -> "weekend", "SATURDAY" -> "weekend")

    /*
       if(dayOfWeek.getDayOfWeek.name() == "SUNDAY" || dayOfWeek.getDayOfWeek.name() ==  "SATURDAY" )
         "weekend"
       else
         "weekday"
    */

    dictionnaire.getOrElse(dayOfWeek.getDayOfWeek.name(), "weekday")

  }

  it should "weekend Or Weekday" in {
    assert(weekendOrWeekday(LocalDate.of(2018, 5, 18)) == "weekday")
    assert(weekendOrWeekday(LocalDate.of(2018, 5, 19)) == "weekend")
  }

  def doubler(input: Int): Int = {
    input * 2
  }

  def doubler(input: Any): Any = input.getClass.getName match {
    //case "java.lang.Integer" =>  input.asInstanceOf[Int] * 2
    case "java.lang.String" => input.toString.map(c => c.toString + c).mkString("")
    case _ => "Invalid type"

  }


  it should "return double of the number" in {
    1.isInstanceOf[Int]
    assert(doubler(5) == 10)
    assert(doubler("hello") == "hheelllloo")

  }
}
