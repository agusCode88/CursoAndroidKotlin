package com.example.aprendiendokotlin

fun main() {

    /*for(i in 0 .. 10){
        println(i)
    }

    for (i in 0 until 10){ //Recorre un rango de números dejando fuera el último número
        println(i)
    }

    for (i in 0 .. 10 step 2){ //Recorre un rango de números con saltos de 2 en 2
        println(i)
    }

    for (i in 10 downTo 1 ){  //Recorre un rango de números al revez
        println(i)
    }

    var arregloNumeros: IntArray = IntArray(5)
    var arreglo2 : IntRange = (1..20)

   for(i in arregloNumeros.indices){
        arregloNumeros[i] = i+1
    }

    for (i in arregloNumeros){
        println(i)
    }

    for ((indice, valor) in arregloNumeros.withIndex()){

        println("Este es el ${indice} y este es el ${valor}")
    }

    var bool : Boolean = true

    while(bool){

        print("Ingresa un numero --> ")
        var num : Int = readln().toInt()

        if (num %2 == 0){
            println("Es par")

        }else if (num%2 != 0){
            println("No es par")

        }else
            bool = false
        }
    }*/

    // Lista String con datos
    var listaNombres = arrayListOf<String>("Lunes", "Martes", "Miercoles", "Viernes")

    // Lista String vacía
    var listaApellidos = arrayListOf<String>()

    var apellido1 : String = "Perez"
    var apellido2 : String = "Joseles"

    // Agregar elementos a lista
    listaApellidos.add(apellido1)

    // Obtener dato de lista
    var nombreObtenido : String = listaNombres[2]
   println(nombreObtenido)

    // Actualizar elementos lista
    listaNombres[2] = "Jueves"
    println(listaNombres[2])

    listaNombres.forEach{
        println(it)
    }

   // Eliminar un elemento por su indice
    listaNombres.removeAt(2)

    // Eliminar todos los elementos de lista
    listaNombres.clear()

    // Ver tamaño de lista
    println(listaNombres.size)

    // Saber primer y último elemento de una lista
    println(listaNombres.first())
    println(listaNombres.last())

    // Para saber si existe un elemento existe dentro de la lista (devuelve true)
    println(listaNombres.contains("Viernes"))

}