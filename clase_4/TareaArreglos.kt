package com.example.aprendiendokotlin.clase_4

/*
Cree un programa en Kotlin que pregunte por pantalla la cantidad de elementos que tendrá el arreglo.
Capture el dato de entrada y setee un arreglo de enteros del tamaño ingresado por el usuario.
Una vez que haya creado el arreglo e indicado la cantidad de elementos ,proceda a llenar el arreglo
con numeros por pantalla agregando cada elemento segun la cantidad que ingresó el usuario.
 Luego que haya llenado el arreglo ,muestre por pantalla un menu que indique las siguinetes opciones
 a realizar como usuario:

1)Mostrar el contenido del arreglo en orden inverso.
2)Imprimir el contenido y su indice del arreglo en orden normal.
3)Mostrar el primer y el ultimo elemento del arreglo.
4)Sumar los elementos del arreglo y mostrar el resultado por pantalla
5) Actualizar o agregar un nuevo valor al arreglo y mostrar la nueva suma
Considere hacer las validaciones correspondientes para que el programa no se caiga
y acepte solo enteros como entrada por teclado.
 */

fun main() {
    val tamañoArreglo = solicitarTamañoArreglo()
    val arreglo = crearArreglo(tamañoArreglo)

    llenarArreglo(arreglo)
    mostrarArregloInverso(arreglo)
    mostrarArregloNormal(arreglo)
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
    println()
}

fun llenarArreglo(arreglo: IntArray) {
    println("Ingrese los elementos del arreglo:")
    for (i in arreglo.indices) {
        var elemento: Int?
        do {
            elemento = readLine()?.toIntOrNull()
            if (elemento == null) {
                println("Ingrese un número válido.")
            }
        } while (elemento == null)
        arreglo[i] = elemento
    }
}


fun mostrarArregloInverso(arreglo: IntArray) {
    println("Este es el arreglo de atras para adelante:")
    for (i in arreglo.size - 1 downTo 0) {
        println("${arreglo[i]}")
    }
}

fun mostrarArregloNormal(arreglo: IntArray) {
    println("Este es el arreglo visto de forma normal")
    for (i in arreglo.indices){
        println("${arreglo[i]}")
    }
}