package com.example.aprendiendokotlin

fun main(){

    //forMasBasico()
    //forMagico()
    //practicaDeBucleFor
    //recorriendoArraysConFor()
    //nuestroPrimerWhile(5)

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

fun practicaDeBucleFor(){

    // Recorrer un rango de numeros
    for(indice in 0..10){
        println("For normal ${indice}")
    }

    // Recorre el rango pero deja afuera el ultimo
    for(indi in 1 until 10){
        println("For until ${indi}")
    }

    // Recorre el rango pero con saltos indicados en el usuario
    for(i in 1..10 step 3){
        println("For Step: $i")
    }

    // Recorrer el rango de numeros en orden descendente
    for(i in 10 downTo 1){
        println("For con DownTo: $i")
    }
}

fun recorriendoArraysConFor(){

    var arregloDeNumeros: IntArray = IntArray(10)
    var arregloDeNumerosRango: IntRange = (1..20)

    for(numero in arregloDeNumerosRango){
        println(numero)
    }

    for(numero in arregloDeNumeros){
        println(numero)
    }

    for(valor in arregloDeNumeros.indices){
        arregloDeNumeros[valor] = valor+1
    }

    for(valor in arregloDeNumeros){
        println(valor)
    }

    for((indice,valor) in arregloDeNumeros.withIndex()){
        println("Este es el ${indice} y este es el valor${valor}")
    }

}

fun nuestroPrimerWhile(valor: Int){

   var i=0
    while ( i<= valor){
        println("Este es el valor dentro del ciclo ${i} ")
        i++
    }
    println("Se salio del ciclo")
}

fun nuestroPrimerDoWhile(valor: Int){

    var i= 1
    do {
        println("Este es el valor en el Do While ${i}")
        i++
    }while (i<= valor)
    println("Estoy afuera del ciclo")

}

