package one.digitalinnovation.collections



class TesteIntArrayOf {
}

fun main(){
    val values = intArrayOf(5,6,7,2,3,1,3,4)

    values.forEach {
        println(it)

    }
    println("------------------")

    values.sort()
    values.forEach {
        println(it)
    }

}