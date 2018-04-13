class DonutShoppingCart extends DonutShoppingCartDao2 with DonutShoppingCartDao {
    override def add(donutName: String): Boolean = {
        println(s"I have ate : $donutName")
        super.add(donutName)
    }
}
