import org.scalatest.{FlatSpec, Matchers}
import ListImplicits._

class DemoScalaFundamentalsSpec extends FlatSpec with Matchers {
    val donutsToBuy: Int = 5
    lazy val donutService = "initialize some donut service"

    def callMe(): Unit = {
        var favoriteDonut: String = "Glazed Donut"
        favoriteDonut = "Vanilla Donut"
    }

    def printMessage(): Unit = {
        println("Step 1: Using String interpolation to print a variable")
        val favoriteDonut: String = "Glazed Donut"
        println(s"My favorite donut = $favoriteDonut")
    }

    def stringInterploation(): Unit = {
        println("\nStep 2: Using String interpolation on object properties")
        case class Donut(name: String, tasteLevel: String)
        val favoriteDonut2: Donut = Donut("Glazed Donut", "Very Tasty")
        println(s"My favorite donut name = ${favoriteDonut2.name}, tasteLevel = ${favoriteDonut2.tasteLevel}")

    }

    def escapeCharachters(): Unit = {
        println("\nStep 3: Using triple quotes \"\"\" to escape characters")
        val donutJson3: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
        println(s"donutJson3 = $donutJson3")
        val donutJson4: String =
            """
                |{
                |"donut_name":"Glazed Donut",
                |"taste_level":"Very Tasty",
                |"price":2.50
                |}
            """
                .stripMargin
        println(donutJson4)
    }

    def patternMatching() : Unit = {
        println("\nStep 6: Pattern matching by types")
        val priceOfDonut: Any = 2.50
        val priceType = priceOfDonut match {
            case price: Int => "Int"
            case price: Double => "Double"
            case price: Float => "Float"
            case price: String => "String"
            case price: Boolean => "Boolean"
            case price: Char => "Char"
            case price: Long => "Long"
        }
        println(s"Donut price type = $priceType")
    }

    def tuple() : Unit = {
        val glazedDonutTuple = Tuple2("Glazed Donut", "Very Tasty")
        val donutType = glazedDonutTuple._1
        val donutTasteLevel = glazedDonutTuple._2
        println(s"$donutType taste level is $donutTasteLevel")
    }

    def option() : Unit = {
        val glazedDonutTaste: Option[String] = Some("Very Tasty")
        println(s"Glazed Donut taste = ${glazedDonutTaste.get}")
    }

    def implicitClasses() : Unit = {
        val myList = List("Riadh", "Alphano", "Etienne", "Babacar", "Yacine")
        println(s"List contains 'Riadh' = ${myList.containsFirstNameRiadh}")
    }
    
    it should "call demo methods\"" in {
        callMe()
        printMessage()
        stringInterploation()
        escapeCharachters()
        patternMatching()
        tuple()
        option()
        implicitClasses()
    }
}
