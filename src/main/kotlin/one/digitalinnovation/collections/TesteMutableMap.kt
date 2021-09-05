package one.digitalinnovation.collections

fun main(){
    val joao  = Funcionario("João", 1000.0)
    val maria = Funcionario ("Maria", 2000.0)
    val pedro = Funcionario ("Pedro", 3000.0)

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.find(joao.nome))

    println("----------------")

    repositorio.finAll().forEach { println(it) }

    println("----------------")

    repositorio.remove(maria.nome)

    repositorio.finAll().forEach { println(it) }

}