package com.example.aprendiendokotlin

//Condicionales!

fun main() {

    ifBasicoSinParametros()
    ifBasicoConParametros("Felipe")

}

fun ifBasicoSinParametros() {

    var nombrePersona: String = "Claudio";

//    if (nombrePersona == "Claudio") {
//        println("Este es el nombre de la persona: $nombrePersona");
//    }

    if (nombrePersona.equals("Claudio")) {
        println("Este loco es el $nombrePersona");
    } else {
        println("Este loco no es na el Claudio, es el $nombrePersona")
    }
}

fun ifBasicoConParametros(nombrePersonaParametro: String) {

    var nombrePersona: String = "Roberto"

    if (nombrePersona.equals(nombrePersonaParametro)) {
        println("La persona se llama igual que la ingresada")
    } else {
        println("La persona no es la misma")
    }

}