abstract class Donut(name: String) {
    def printName: Unit
}


case class VanillaDonut (name: String ) extends Donut(name) {
    override def printName: Unit = println (s"VanillaDonut::: $name")
}

case class GlazedDonut(name: String) extends Donut(name){
    override def printName: Unit = println(s"GlazedDonut::: $name")
}
