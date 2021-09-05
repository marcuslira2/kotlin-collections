package one.digitalinnovation.collections

fun main(){
    val joao  = Empregado ("João", 1000.0,"clt")
    val maria = Empregado ("Maria", 2000.0,"pj")
    val pedro = Empregado ("Pedro", 3000.0,"pj")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }
    println("----------")

    //SET

    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("----------")

    //DELET

    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }


}