package com.example.aprendiendokotlin

fun main() {

    //Crea un diccionario vacio inmutable por defecto
    var mapaDatos: Map<String, Int> = mapOf()

    //Crear un diccionario inmutable con datos.
    var mapaDatos1 = mapOf("Id" to true, "Id1" to "hola", "Id2" to 3)
    println(mapaDatos1)

    //Capturar todos las llaves y valores
    println("Key del elemento ${mapaDatos1.keys}")
    println("Values del elemento ${mapaDatos1.values}")

    //Crea un diccionario mutable vacío
    var mapaDatosMutable: MutableMap<String, Int> = mutableMapOf()  //Cuando es vacío
    println(mapaDatosMutable)

    //Setear llave y valor a un diccionario mutable.
    mapaDatosMutable.put("Id1", 2)
    mapaDatosMutable.put("Id3", 3)
    println(mapaDatos)

    //Capturar un valor de un mapa por su Key
    var valor = mapaDatos1["Id"]
    println(valor)

    mapaDatos1.forEach{
        (id, valor) -> println("$id:$valor")
    }

    for(i in mapaDatos1){
        println("${i.key}")
        println("${i.value}")
    }

    mapaDatosMutable.remove("Id1")
    println(mapaDatosMutable)

    //Ver si un valor esta dentro del diccionario
    if(35 in mapaDatos1.values){
        println(true)
    }else{
        println(false)
    }

    //Sirve para mutables e inmutables
    if(mapaDatosMutable.containsValue(2)){
        println(true)
    }else{
        println(false)
    }

    //Ver si una llave esta dentro del diccionario
    if("Id4" in mapaDatos1.keys){
        println(true)
    }else{
        println(false)
    }

    if(mapaDatos.containsKey("Id1")){
        println(true)
    }else{
        println(false)
    }






}