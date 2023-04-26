package com.example.aprendiendokotlin


class Condicional {

    fun main(){

        nulabilidad()




    }

    fun ifSinParametros(){

        var nombrePersona = "Claudia"

        if(nombrePersona  == "Claudia"){
            println("este es el nombre: $nombrePersona")
        }
        if (nombrePersona.equals("Claudia")){
            println("este es el nombre: $nombrePersona")
        }

    }

    fun ifConParametro(){

    }


    fun nulabilidad(){

        var nombrePersona = null
        println(nombrePersona)




    }


}
