package com.example.aprendiendokotlin

// nuabilidad

fun main(){
    nulabilidadEnKotlin()
}


fun nulabilidadEnKotlin(){
    var nombrePersona: String? = null
    nombrePersona = "Mokita"
    println(nombrePersona?.length)

    println("El tamaño del String es: ${nombrePersona?.length ?: "Esta variable es nula, ojo"}")
    println("Estoy seguro que esto no es nulo ${nombrePersona!!.length}")

    if(nombrePersona == null){
        println("Ojo el valor es nulo")
    }else{
        println(nombrePersona.length)
    }

}