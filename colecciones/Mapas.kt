package com.example.aprendiendokotlin


/*
Los arreglos son estructuras de datos pero ordenados. Se ingresan los datos y llenan
el arreglo segun la posicion de entrada que el dato fue ingresado.

En el caso de los Maps o diccionario de datos , los datos no son ordenados. No importa el orden
en que llenamos de datos esta estrcutura de datos.
Los datos se agrupan segun una estrucutra y esta es < clave , valor>

En los maps , la clave no puede estar repetida, es unica para cada elemento del map.
Lo que si puede pasar,es que, 2 claves diferentes pueden tener el mismo valor

 */
fun main() {

    var mapaDeDatos1: MutableMap<String, Int> = mutableMapOf()
    var mapaDeDatos2 = mapOf("Id1" to 1, "Id2" to 45, "Id3" to 545)
    var mapaDeDatos3: MutableMap<String,Int> = mutableMapOf()

    println("Este es el mapa de Datos 1:" + mapaDeDatos1)
    println("Este es el mapa de Datos 2: $mapaDeDatos2" )

    //Rescatar un el elemento del mapa
    var valorRescatado = mapaDeDatos2["Id5"]

    var valor=35
    var identificador="Id10"

    // Agrehgar elemnto al mapa
    mapaDeDatos3["Id5"]= 32
    mapaDeDatos3["Id6"]= 1232
    mapaDeDatos3.put("Id7",333)
    mapaDeDatos3.put(identificador,valor)
    // Mostrar todas las llaves y valores
    println("Key del elemento ${mapaDeDatos3.keys}")
    println("El valor del elemnto es: ${mapaDeDatos3.values}")
    println("El valor rescatado es : $valorRescatado")

    for(elemento in mapaDeDatos3){
        println(elemento)
    }

    println(mapaDeDatos3)

    mapaDeDatos3.forEach{ (id,valor)-> println("$id:$valor") }

    for(texto in mapaDeDatos3){

        print("Este es el valor ${texto.value}")
        println("Este es la llave ${texto.key}")
    }

    // Tradicionale stilo java
    // Buscar en el diccionario de Datos
    println("El valor del elemento con Id7 es :  " + mapaDeDatos3["Id7"])
    println("El valor del elemento con Id7 es :  " + mapaDeDatos3.get("Id7"))

    //Eliminar un registro del diccionaro de Datos
    mapaDeDatos3.remove("Id7")

    println("Este es el nuevo mapa luego de borrar"+ mapaDeDatos3)

     if(31 in mapaDeDatos3.values){
         println("Valor encontrado es 32")
     } else {
         println("No existe en el mapa el registro")
     }

    if("Id5" in mapaDeDatos3.keys){
        println("Valor encontrado es ${mapaDeDatos3.getValue("Id5")}")
    } else {
        println("No existe en el mapa el registro")
    }

    if(mapaDeDatos3.containsValue(1232)){

        print("El valor 1232 existe")
    }

    if(mapaDeDatos3.containsKey("Id6")){
        print("El valor 1232 existe")
    }



}