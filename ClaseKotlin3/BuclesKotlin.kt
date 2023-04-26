package com.example.aprendiendokotlin.ClaseKotlin3

fun main() {

    //forMasBasico()
    forMagico()

}

fun forMasBasico() {

    for (i in 1..2000) {
        println("Este es el valor de i: $i")
    }

    for (i in 1..300) {

        println("Este es el valor de i: $i")

    }
}

fun forMagico() {

    var nombrePersona1: String? = "Maria Magdalena"
    var nombrePersona2: String? = "Pedro"
    var nombrePersona3: String? = "Maria"
    var nombrePersona4: String? = "Jose"
    var nombrePersona5: String? = "Yisus CRaist"

    var familiaBiblica =
        arrayOf(nombrePersona1, nombrePersona2, nombrePersona3, nombrePersona4, nombrePersona5)

    for (nombre in familiaBiblica) {

        println(nombre)
    }
}