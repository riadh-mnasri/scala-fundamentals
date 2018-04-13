import org.scalatest.{FlatSpec, Matchers}

class DonutSpec extends FlatSpec with Matchers{


    it should "call demo methods" in {
        println("\nStep 4: How to instantiate Donut objects")
        val vanillaDonut: Donut = VanillaDonut("Vanilla Donut")
        vanillaDonut.printName

        val glazedDonut: Donut = GlazedDonut("Glazed Donut")
        glazedDonut.printName
    }
}
