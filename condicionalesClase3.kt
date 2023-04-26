package com.example.aprendiendokotlin

fun nulabilidadEnKotlinEjemplo() {
    var nombrePersona: String? = null
    println(nombrePersona?.length)

}

fun nulabilidadEnKotlinEjemplo2() {
    var nombrePersona: String? = null
    println(nombrePersona!!.length)

}