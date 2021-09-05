package one.digitalinnovation.collections

fun main(){
    val joao  = Empregado ("João", 1000.0,"clt")
    val maria = Empregado ("Maria", 2000.0,"pj")
    val pedro = Empregado ("Pedro", 3000.0,"pj")


    val funcionarios1 = listOf(joao,pedro)
    val funcionarios2 = listOf(maria)
    val funcionariosUnion = funcionarios1.union(funcionarios2)
    funcionariosUnion.forEach{ println(it)}

    println("---------------")

    val funcionarios3 = listOf(joao, pedro, maria)
    val funcionarioSubtracted = funcionarios3.subtract(funcionarios2)
    funcionarioSubtracted.forEach { println(it) }

    println("---------------")

    val funcionarioIntersect = funcionarios3.intersect(funcionarios2)
    funcionarioIntersect.forEach { println(it) }

}