trait DonutShoppingCartDao {

    def add(donutName: String): Boolean= {
        println(s"TRAIT - I have eaten $donutName")
        true
    }
}

trait DonutShoppingCartDao2 {

    def add(donutName: String): Boolean= {
        println(s"TRAIT - I have eaten 2 $donutName")
        true
    }
}
