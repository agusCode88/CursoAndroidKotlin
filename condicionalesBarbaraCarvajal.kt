package com.example.aprendiendokotlin

fun main(){
    //ifBasicoSinParametros()
    ifBasicoConParametros("Camilo")

}

fun ifBasicoSinParametros(){

    var nomprePersona: String = "Bárbara"

    if (nomprePersona.equals("Bárbara")) {
        println("La persona si se llama Bárbara")
    }
    if (nomprePersona == ("Bárbara")) {
        println("La persona si se llama Bárbara")

    }else{
        println("La persona se llama $nomprePersona")
    }

}


fun ifBasicoConParametros(nombrePersonaParametro: String){

    var nombrePersona: String = "Mokita"

    if (nombrePersona.equals(nombrePersonaParametro)){
        println("La persona se llama igual a la que ingresaste")
    }else{
        println("La persona no se llama igual a $nombrePersona, si no, $nombrePersonaParametro")
    }
}