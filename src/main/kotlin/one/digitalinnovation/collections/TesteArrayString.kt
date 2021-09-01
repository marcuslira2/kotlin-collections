package one.digitalinnovation.collections

class TesteArrayString {
}

fun main() {
    val names = Array(3) { "" }
    names[0] = "Marcus"
    names[1] = "Thayna"
    names[2] = "Gabriel"

    names.forEach {
        println(it)
    }

    println("---------------------")

    names.sort()
    names.forEach {
        println(it)

    }
    println("---------------------")
    val nomes = arrayOf("marcus","thayna","Gabriel")

    nomes.forEach {
        println(it)
    }
    nomes.sort()
    println("---------------------")
    nomes.forEach {
        println(it)
    }
}
