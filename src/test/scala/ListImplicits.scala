object ListImplicits {
    implicit class Yacine(etienne: List[String]){
        def babacar: Boolean = etienne.contains("Albano")
    }
}
