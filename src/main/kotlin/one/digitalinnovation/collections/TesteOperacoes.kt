package one.digitalinnovation.collections

import kotlin.math.max

class TesteOperacoes {
}

fun main(){

    val salarios = doubleArrayOf(1000.0,3000.0,2000.0)

    salarios.forEach {
        println(it)

    }
    println("------------------")

    println(salarios.maxOrNull())
    println(salarios.minOrNull())
    println(salarios.average())

    println("-----------------")

    val filtroSalario = salarios.filter { it>1500.0 }
    println(filtroSalario)
    println("-----------------")
    filtroSalario.forEach { println(it) }
    println("-----------------")

    println(salarios.count{it in 2000.0..5000.0})
    println("-----------------")
    println(salarios.find { it == 500.0 })
    println("-----------------")
    println(salarios.any { it == 1000.0 })
}