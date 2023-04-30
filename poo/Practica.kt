package com.example.codigospractica

fun main(){

    //forDeEjemplos()
    //recorriendoArrays()
    //primerWhileDeEjemplo(10)
    //doWhileEnKotlin()
    //crearUnalIstaArray()
    mapsEnKotlin()
}

fun forDeEjemplos(){

    for (i in 1..10){
        println("For normal: ${i}")
    }

    // Recorre todas las poosicones menos el ultimo
    for (i in 1 until 10){
        println("For Until: ${i}")
    }

    for (i in 1..10 step 2 ){
        println("For Step: ${i}")
    }

    for (i in 10 downTo 1 ){
        println("For Down To: ${i}")
    }

}

fun recorriendoArrays (){

    // Declarra un arreglo de tamanio N
    var arrayEnteros: IntArray = IntArray(5)

   // Asigna un rango de numero a un array
    var ranGoValoresArray:IntRange = (0..20)

    // Llenar un arreglo de tamanio n
    for (valor in arrayEnteros.indices){
        arrayEnteros[valor] = valor + 1
    }

    // Recorrer arreglo e imprimirlo normalmente
    for(valor in arrayEnteros){
        println(valor)
    }

    //Recorrer un array de otra forma
    for((indice,valor) in arrayEnteros.withIndex()){

    }

    // Recorrer un arreglo con rangos de valores e imprimirlo normalmente
    for(valor in ranGoValoresArray){
        println(valor)
    }

}

fun primerWhileDeEjemplo(valor : Int){

    var i = 0
    while (i <= valor){
        println("El valor es : $i")
        i++
    }
    println("Fuera del ciclo ")
}

fun doWhileEnKotlin(){
    var i = 1
    do {
        println(i)
        i++
    } while (i <= 5)
    println("Fuera del ciclo Do While")
}

fun crearUnalIstaArray(){

    //var listaArraysStrings: List<String> = arrayListOf()
    var listaArrayStrings2 = arrayListOf<String>()
    var tamanioString :Int? = 0

    var nombre1 = "Jose"
    var nombre2 = "Maria"
    var nombre3 = "Pepe"
    var nombre4 = "Judas"

    // Agregar datos a una lista
    listaArrayStrings2.add(nombre1)
    listaArrayStrings2.add(nombre2)
    listaArrayStrings2.add(nombre3)
    listaArrayStrings2.add(nombre4)

    // Agregar una lista a otra lista ya existente
    listaArrayStrings2.addAll(listOf("Jesus","Pilatos"))

    for(i in listaArrayStrings2) {
        println(i)
    }

    // Acceso a datos
    var nombreObtenido: String = listaArrayStrings2[1]
    println("El nombre de la posicon 2 es: $nombreObtenido")

    //Modificacion de los Datos
    listaArrayStrings2[5]="Hola esto es una modificacion"
    println(listaArrayStrings2)

    //Eliminacion de los datos
    listaArrayStrings2.removeAt(4)
    println(listaArrayStrings2)

    /*
    Funciones espaciales de las listas
     */

    // Me entrega la cantidad de elementos que hay en la lista
    tamanioString = listaArrayStrings2.count()
    println(tamanioString)

    // Me entrega la cantidad de elementos que hay en la lista
    tamanioString = listaArrayStrings2.size
    println(tamanioString)

    //Recorrer un arreglo
    listaArrayStrings2.forEach {
        println(it)
    }

    // Dejar en blanco un arreglo
    listaArrayStrings2.clear()

    // Traer el primer elemento
    listaArrayStrings2.first()

    //Traer al ultimo elemento
    listaArrayStrings2.last()

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
    val mapaDeNumeros2 = mapOf(1 to 1 , 2 to 30, 3 to 1323)
    var mapaDeDatos2: MutableMap<String,Int> = mutableMapOf()

    println("Mapa de Datos 1 :" + mapaDeDatos)
    println("Mapa de Numeros: " + mapaDeNumeros2)
    println("Mapa de Datos 2 : " + mapaDeDatos2)
    var valorRescatado= mapaDeNumeros2[1]
    println("Este es el valor rescatado del mapa : ${valorRescatado}")
    println("Clave: ${mapaDeNumeros2.keys} ")
    println("Valor: ${mapaDeNumeros2.values} ")

    // Llenar un mapa de Datos
    // El mapOf si se llama , creara un diccionario nuevo, y es un mapa inmutable,
    // es decir , una vez agregado elementos, estos no se pueden cambiar
    mapaDeDatos = mapOf("Id1" to 1 ,"Id2" to 234 ,"Id4" to 569 ,"Id1" to 20 )
    println("Mapa de Datos 1 lleno: {$mapaDeDatos}")

    mapaDeDatos2 = mutableMapOf("Id1" to 1 ,"Id2" to 234 ,"Id4" to 569 ,"Id1" to 20 )
    println("Mapa de Datos 2 lleno: {$mapaDeDatos2}")

    //Actualizar un valor del mapa
    mapaDeDatos2["Id5"] = 455
    mapaDeDatos2["Id5"] = 4566

    //Agregar un nuevo valor al mapa
    mapaDeDatos2["id6"]= 20

    // Otra forma de agregar un valor al mapa
    mapaDeDatos2.put("Id7",77777)
    mapaDeDatos2.put("Id7",8888)

    println(mapaDeDatos)
    // Acceder a datos de un mapa
    println(mapaDeDatos2["Id1"])

    // Mostrar llave y valor en un mapa
    for(numero in mapaDeDatos2){
        println(numero)
    }
    // Mostrar llave y valor en un mapa
    for(texto in mapaDeDatos2){
        println("Elemento ${texto.key} - Valor ${texto.value}")
    }

    mapaDeDatos2.forEach { (id, numero) ->
        println("- $id ($numero años)")
    }
    // Buscar numero estilo JAVA
    println("El numero para el id 4 es : "+ mapaDeDatos2["Id4"])
    println("El numero para el id 4 es : "+ mapaDeDatos2.get("Id4"))
    //Estilo Kotlin
    println("El numero para el id 4 es : ${mapaDeDatos2.get("Id4")}")

    // Borrar elemento del mapa
    mapaDeDatos2.remove("Id2")

    //Buscar un elemento en el mapa por clave
    if ("Id2" in mapaDeDatos){
        println("Para la clave\"Id2\" el valor es ${mapaDeDatos2.get("Id2")}")
    } else {
        println("La clave no existe")
    }

    //Buscar un elemento en el mapa
    if (455 in mapaDeDatos.values){
        println("Encuenbtra el valor 455")
    } else {
        println("El valor no lo encuentra")
    }
    //Buscar un elemento con contains
    if(mapaDeDatos2.containsValue(455)){
        println("Encuentra el valor 455 con containsValue")
    }else {
        print("No encuentra el valor 455 en el mapa")
    }

}