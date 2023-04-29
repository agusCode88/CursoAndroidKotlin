package com.example.aprendiendokotlin.materiaKotlin

/*Un mapa en Kotlin es una estructura de datos que permite almacenar pares de valores (clave, valor) de forma
eficiente. Cada clave en el mapa debe ser única, lo que significa que no puede haber dos claves iguales en un mismo mapa.
El valor asociado a una clave puede ser de cualquier tipo, incluyendo tipos de datos personalizados.
Un mapa se puede crear utilizando la función mapOf(), que acepta una lista de pares clave-valor como argumento*/

fun main() {
    // Aquí se crea un mapa de datos vacío utilizando la clase Map, que es inmutable
    var mapaDeDatos1: Map<String, Int> = mapOf()
    // Aquí se crea un mapa de datos utilizando la función mapOf(), que toma una serie de pares de valores clave-valor
    var mapaDeDatos2 = mapOf("Id1" to 1, "Id2" to 45, "Id3" to 465)
    // Aquí se crea un mapa de datos vacío utilizando la clase MutableMap, que es mutable
    var mapaDeDatos3: MutableMap<String, Int> = mutableMapOf()

    println("Este es el mapa de Datos 1: $mapaDeDatos1")
    println("Este es el mapa de Datos 2: " + mapaDeDatos2)

    // Aquí se rescata el valor del mapaDeDatos2 asociado a la clave "Id1" y se almacena en la variable valorRescatado
    var valorRescatado = mapaDeDatos2["Id1"]

    var valor = 35
    var identificador = "Id6"


    mapaDeDatos3["Id4"] = 32
    mapaDeDatos3.put("Id5", 122)
    mapaDeDatos3.put(identificador, valor)
    mapaDeDatos3["Id7"] = 57

    println("Key del elemento ${mapaDeDatos2.keys}")
    println("El valor del elemento ${mapaDeDatos2.values}")
    println("Este es el valor rescatado: $valorRescatado")

    for (elemento in mapaDeDatos3) {
        println(elemento)
    }
    println(mapaDeDatos3)

    mapaDeDatos3.forEach { (id, valor) ->
        println("$id: $valor")
    }
    for (texto in mapaDeDatos3) {
        println("Este es el valor: ${texto.value}")
        println("Esta es la llave: ${texto.key}")
    }
    for (texto in mapaDeDatos3) {
        println("Este es el valor: ${texto.value} y esta es la llave: ${texto.key}")
    }
    println("El valor del elemento con Id6 es: ${mapaDeDatos3["Id6"]}")
    println("El valor del elemento con Id6 es: " + mapaDeDatos3.get("Id6"))

    mapaDeDatos3.remove("Id4")
    println("Este es el nuevo mapa luego de borrar: $mapaDeDatos3")

    if ("Id6" in mapaDeDatos3.keys) {
        mapaDeDatos3.remove("Id6")
        println("Este es el nuevo mapa luego de borrar: $mapaDeDatos3")
    } else {
        println("No existe la clave Id6 en el mapa, el mapa se mantiene igual")
    }

    if (344 in mapaDeDatos3.values) {
        println("El valor 32 esta en el mapa")
    } else {
        println("No existe el número en el registro")
    }
    if ("Id5" in mapaDeDatos3.keys) {
        println("El valor encontrado es: ${mapaDeDatos3["Id5"]}")
        println("El valor encontrado es: ${mapaDeDatos3.get("Id5")}")
    } else {
        println("No existe el número en el registro")
    }
    if ("Id5" in mapaDeDatos3.keys) {
        println("Este es el nuevo mapa luego de borrar: ${mapaDeDatos3.remove("Id5")}")

    } else {
        println("No existe el Id en el registro, el mapa se mantiene igual")
    }
    if (mapaDeDatos3.containsValue(1232)) {
        println("El valor 1232 esta en el mapa")
    } else {
        println("No existe el valor en el registro, el mapa se mantiene igual")
    }
    if (mapaDeDatos3.containsKey("Id4")) {
        println("EL Id4 esta en el mapa")
    } else {
        println("No existe el Id en el registro, el mapa se mantiene igual")
    }

}
