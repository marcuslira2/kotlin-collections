package one.digitalinnovation.collections

class TesteDoubleArray {
}

fun main(){

    val salarios = DoubleArray(3)
    salarios[0]= 1000.0
    salarios[1]= 3000.0
    salarios[2]= 2000.0

    for(valor in salarios){
        println(valor)
    }

    println("--------------------------")

    salarios.sort()
    salarios.forEach {
        println(it)
    }

    println("---------------")

    val payments = doubleArrayOf(1000.0,3000.0,2000.0)

    for(value in payments){
        println(value)

    }

    println("---------------")

    payments.forEachIndexed { index, salarios->
        payments[index] = salarios * 1.1

    }
    for(value in payments){
        println(value)

    }

}