package com.example.aprendiendokotlin.Kotlin

/*
1)Mostrar el contenido del arreglo en orden inverso.
2)Imprimir el contenido y su indice del arreglo en orden normal.
3)Mostrar el primer y el ultimo elemento del arreglo.
4)Sumar los elementos del arreglo y mostrar el resultado por pantalla
5) Actualizar o agregar un nuevo valor al arreglo y mostrar la nueva suma

 */


fun main() {
    val tamañoArreglo = solicitarTamañoArreglo()
    val arreglo = crearArreglo(tamañoArreglo)

    //llenarArreglo(arreglo)
    //mostrarArregloInverso(arreglo)
    //mostrarArregloNormal(arreglo)
    //mostrarSumaArreglo(arreglo)
}


fun solicitarTamañoArreglo(): Int {
    var tamanio: Int? = null
    do {
        println("Ingrese la cantidad de elementos del arreglo:")
        try {
            tamanio = readLine()?.toInt()
            if (tamanio == null) throw Exception()
        } catch (e: Exception) {
            println("Ingrese un número válido.")
        }
    } while (tamanio == null)

    return tamanio

}

fun crearArreglo(tamaño: Int): IntArray {
    return IntArray(tamaño)
}