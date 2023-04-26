package com.example.aprendiendokotlin



fun main(){
    //forMasBasico()
    magico()
}

fun forMasBasico(){

    for (x in 1..10){
        println("Es es el valor de x: $x")
    }

    for (x in -5..5){
        println(x)
    }
}

fun magico(){
    var nombrePersona1: String? = "Mokita"
    var nombrePersona2: String? = "Barbara"
    var nombrePersona3: String? = "Camilin"
    var nombrePersona4: String? = "Romina"
    var nombrePersona5: String? = "Rocio"
    var nombrePersona6: String? = null


    var family = arrayOf(nombrePersona1,nombrePersona2,nombrePersona3,nombrePersona4,nombrePersona5,nombrePersona6)
    

    for (nombre in family){
        println(nombre)
    }
}


