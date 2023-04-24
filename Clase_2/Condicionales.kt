package com.example.aprendiendokotlin.Clase_2

    fun main (){
    ifBasicoSinParametros()
    }


fun ifBasicoSinParametros (){

    var nombrePersona: String = "Claudio"

    if (nombrePersona == "Claudio"){
        println("este es el nombre de la persona: $nombrePersona")
    }

    if (nombrePersona.equals("Claudio")) {
        println("este es el nombre de la persona: $nombrePersona")
    }
}