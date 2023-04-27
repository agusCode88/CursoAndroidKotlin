package com.example.aprendiendokotlin

fun main(){

    trabajandoConListasEnKotlin()
}


fun trabajandoConListasEnKotlin(){

    var listaDeNombres = arrayListOf<String>()

    var nombrePersona1: String ="Pedro"
    var nombrePersona2: String= "Pepe"
    var nombrePersona3: String ="Maria"
    var nombrePersona4: String= "Jose"
    var nombrePersona5: String ="Ana"
    var nombrePersona6: String= "Jesus"

    // Llenar un listado de nombres
    listaDeNombres.add(nombrePersona1)
    listaDeNombres.add(nombrePersona2)
    listaDeNombres.add(nombrePersona3)
    listaDeNombres.add(nombrePersona4)
    listaDeNombres.add(nombrePersona5)
    listaDeNombres.add(nombrePersona6)

    println(listaDeNombres)

//    for(i in listaDeNombres){
//        println(i)
//    }

    listaDeNombres.addAll(listOf("Nombre 7","Nombre 8"))

    for(i in listaDeNombres){
        println(i)
    }

    // Obtener un dato de la lista
    var nombreObtenido:String = listaDeNombres[2]
    println(nombreObtenido)

    // Actualizar elementos de la lista
    listaDeNombres[2] = "He actualizado Maria"
    println(listaDeNombres)

    //Funciones espciales de las listas

    var tamanioLista: Int = listaDeNombres.size
    var tamanioLista2: Int = listaDeNombres.count()

    println(tamanioLista)
    println(tamanioLista2)

    listaDeNombres.forEach {
        print(it) }

    var saberElPrimerNombre: String = listaDeNombres.first()
    var saberElUltimoNombre: String = listaDeNombres.last()

    println("Este es el primero de la lista ${saberElPrimerNombre}")
    println("Este es el el ultimo de la lista ${saberElUltimoNombre}")

    listaDeNombres.removeAt(2)

    listaDeNombres.clear()

}