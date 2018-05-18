class DonutShoppingCart extends DonutShoppingCartDao2 with DonutShoppingCartDao {
    override def add(donutName: String): Boolean = {
        println(s"I have eaten : $donutName")
        super.add(donutName)
    }
}
