package com.example.aprendiendokotlin.ClaseKotlin3

fun main() {

    nulabilidadEnKotlinEjemplo()
    //operadorElvisEjemplo()
}


fun nulabilidadEnKotlinEjemplo() {

    var nombrePersona: String? = null

    println(nombrePersona?.length)

    //println("estoy seguro que esto no es nullo ${nombrePersona!!.length}")


}

fun operadorElvisEjemplo() {

    var nombrePersona: String? = null

    println("El tamaño del string es ${nombrePersona?.length ?: "Esta variable es nula, ojo"}")

}

