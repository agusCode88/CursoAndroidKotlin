package com.example.aprendiendokotlin

fun main(){

    mapsEnKotlin()
    //orientacionAObjetos()
}

/*
Los arreglos son estructuras de datos pero ordenados. Se ingresan los datos y llenan
el arreglo segun la posicion de entrada que el dato fue ingresado.

En el caso de los Maps o diccionario de datos , los datos no son ordenados. No importa el orden
en que llenamos de datos esta estrcutura de datos.
Los datos se agrupan segun una estrucutra y esta es < clave , valor>

En los maps , la clave no puede estar repetida, es unica para cada elemento del map.
Lo que si puede pasar,es que, 2 claves diferentes pueden tener el mismo valor

 */

fun mapsEnKotlin(){

    // Crear un mapa o diccionario vacio
    var mapaDeDatos:Map<String,Int> = mapOf()
    println(mapaDeDatos)

    var mapaDeDatos2: MutableMap<String,Int> = mutableMapOf()
    // Llenar un mapa de Datos
    // El mapOf si se llama , creara un diccionario nuevo, y es un mapa inmutable,
    // es decir , una vez agregado elementos, estos no se pueden cambiar
    mapaDeDatos = mapOf("Id1" to 1 ,"Id2" to 234 ,"Id4" to 569 ,"Id1" to 20 )
    println(mapaDeDatos)

    mapaDeDatos2 = mutableMapOf("Id1" to 1 ,"Id2" to 234 ,"Id4" to 569 ,"Id1" to 20 )

    var personas = mutableMapOf<String,Any>(

        "Agus" to 34,
        "Consu" to 30,
        "Matias" to 20
    )

    var contactos = mutableMapOf<String,Pair<String,String>>(
        "Agus" to Pair("976424587","Chacabuco 340"),
        "Consu" to Pair("976424587","Chacabuco 340"),
        "Mati" to Pair("976424587","Chacabuco 340")
    )

    personas["Agus"]= listOf("976424587","Chacabuco 340")


    println(personas)


    //Actualizar un valor del mapa
    mapaDeDatos2["Id5"] = 455
    mapaDeDatos2["Id5"] = 4566

    //Agregar un nuevo valor al mapa
    mapaDeDatos2["id6"]= 20
    mapaDeDatos2.put("Id7",77777)
    println(mapaDeDatos)

    // Acceder a datos de un mapa
    println(mapaDeDatos2["Id1"])


    // Borrar elemento del mapa
    mapaDeDatos2.remove("Id2")

    for(texto in mapaDeDatos2){

        println("Elemento ${texto.key} - Valor ${texto.value}")
    }


}

fun orientacionAObjetos(){

    var estudianteBootCamp = Estudiante("16.990.510-K","Agustin Romero",34,"+56976424587") // Constructor implicito
    var estudianteBootcamp2 = Estudiante()
    var listaEstudiantes:MutableList<Estudiante> = mutableListOf()

    // En java
    //Estudiante estudianteBootcamp = new Estudiante
    
    // Llenado de datos estudiante 2
    estudianteBootcamp2.rut="11.111.111-1"
    estudianteBootcamp2.nombre="Agus Code"
    estudianteBootcamp2.edad=36
    estudianteBootcamp2.telefono="+56976424587"

    listaEstudiantes.add(estudianteBootCamp)
    listaEstudiantes.add(estudianteBootcamp2)

    for (estudiante in listaEstudiantes){
        println(estudiante.nombre)
        println(estudiante.edad)
        estudiante.imprimirDatosEstudiante()
    }

}