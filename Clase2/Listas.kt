package com.example.aprendiendokotlin.Clase2

fun main(){

    trabajandoConListasEnKotlin()

}

fun trabajandoConListasEnKotlin(){

    var listaDeNombres = arrayListOf<String>() // ésta es la lista

    var nombrePersona1: String = "Pedro" // llenando la lista, hacia abajo
    var nombrePersona2: String = "Ana"
    var nombrePersona3: String = "Clara"
    var nombrePersona4: String = "Rodrigo"
    var nombrePersona5: String = "Pepe"
    var nombrePersona6: String = "Manuel"

    println(listaDeNombres)
//para agregar nombres a la lista
    listaDeNombres.add(nombrePersona1)
    listaDeNombres.add(nombrePersona2)
    listaDeNombres.add(nombrePersona3)
    listaDeNombres.add(nombrePersona4)
    listaDeNombres.add(nombrePersona5)
    listaDeNombres.add(nombrePersona6)

    println(listaDeNombres)

    for(i in listaDeNombres){
        println(i)
    }

    listaDeNombres.addAll(listOf("Nombre 7", "Nombre 8"))

    for(i in listaDeNombres){
        println(i)
    }
    //Obtener un dato de la lista
    var nombreObtenido: String = listaDeNombres[2]
    println(nombreObtenido)

    listaDeNombres[2] = "He actualizado Clara"
    println(listaDeNombres)

}