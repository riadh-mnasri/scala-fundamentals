import java.time.{DayOfWeek, LocalDate}

import org.scalatest.{FlatSpec, Matchers}

class NoIfSpec extends FlatSpec with Matchers {


  def countOdds(arrayOfIntegers: List[Int]) : Int = {
    arrayOfIntegers.count(i => i % 2 != 0)
  }

  it should "count odd number" in {
    val arrayOfIntegers = List (1, 4, 5, 9, 0, -1, 5)
    assert(countOdds(arrayOfIntegers)== 5)
  }

  def weekendOrWeekday(dayOfWeek: LocalDate): String = {
    val dictionnaire = Map("SUNDAY"-> "weekend","SATURDAY" -> "weekend")

   if(dayOfWeek.getDayOfWeek.name() == "SUNDAY" || dayOfWeek.getDayOfWeek.name() ==  "SATURDAY" )
     "weekend"
   else
     "weekday"

   dictionnaire.getOrElse(dayOfWeek.getDayOfWeek.name(), "weekday")

  }

  it should "weekend Or Weekday" in {
    assert(weekendOrWeekday(LocalDate.of(2018, 5, 18))=="weekday")
    assert(weekendOrWeekday(LocalDate.of(2018, 5, 19))=="weekend")
  }

}
