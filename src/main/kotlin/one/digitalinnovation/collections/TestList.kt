package one.digitalinnovation.collections

fun main(){
    val joao  = Empregado ("João", 1000.0,"clt")
    val maria = Empregado ("Maria", 2000.0,"pj")
    val pedro = Empregado ("Pedro", 3000.0,"pj")


    val funcionarios = listOf(joao,maria,pedro)

    funcionarios.forEach{println(it)}
    println("--------------------")

    println(funcionarios.find { it.nome =="Maria" })

    println("--------------------")

    funcionarios.sortedBy { it.salario }.forEach { println(it) }
    println("--------------------")

    funcionarios.groupBy { it.tipo }.forEach { println(it) }
}

data class Empregado(val nome: String, val salario: Double, val tipo: String) {

    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
            tipo: $tipo
        """.trimIndent()

}

