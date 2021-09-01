package one.digitalinnovation.collections

class TesteIntArray {

}
fun main(){
    val values = IntArray(5)
    values[0]= 1
    values[1]= 5
    values[2]= 4
    values[3]= 2
    values[4]= 3

    for(valor in values){
        println(valor)
    }

    values.forEach { valor->
        println(valor)
    }
    values.sort()
    for( index in values.indices){
        println(values[index])
    }
}