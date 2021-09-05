package one.digitalinnovation.collections

fun main(){

    val pair: Pair<String,Double> = Pair("marcus",2000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k,v) -> println("Chave: $k, valor: $v")  }

    val map2 = mapOf(
        "lucas" to 2000.0,
        "leona" to 3000.0
    )

    map2.forEach { (k, v) -> println("chave : $k, valor: $v") }


}