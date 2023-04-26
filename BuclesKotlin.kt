package com.example.aprendiendokotlin

fun main(){

    //forMasBasico()
    forMagico()
}

fun forMasBasico(){

    for (i in 1..2000000) {

        println("Este es el valor del i : $i")
    }

}

fun forMagico(){

    var nombrePersona1 : String? = "Maria Magdalena"
    var nombrePersona2 : String? = "Pedro"
    var nombrePersona3 : String? = "Maria"
    var nombrePersona4 : String? = "Jose"
    var nombrePersona5 : String? = "Jesus"

    /*
    Declaracion de array 1
     */
    var familiaBiblia = arrayOf(nombrePersona1,nombrePersona2,nombrePersona3,nombrePersona4,nombrePersona5)

    for (nombre in familiaBiblia){
        println(nombre)
    }


}