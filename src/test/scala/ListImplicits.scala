object ListImplicits {
    implicit class RiadhFirstNamesList(myList: List[String]){
        def containsFirstNameRiadh: Boolean = myList.contains("Riadh")
    }
}
