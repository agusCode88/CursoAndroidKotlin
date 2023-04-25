package com.example.aprendiendokotlin.ejerciciosKotlin


/*

Cree un programa en Kotlin que pregunte por pantalla la cantidad de elementos que tendrá el arreglo.
Capture el dato de entrada y setee un arreglo de enteros del tamaño ingresado por el usuario.
Una vez que haya creado el arreglo e indicado la cantidad de elementos , proceda a llenar el arreglo con numeros por pantalla
agregando cada elemento segun la cantidad que ingresó ek usuario.

Una vez que ya tenga con contenido el arreglo, crear 3 funcionalidades de este programa:

1)Mostrar el contenido del arreglo en orden inverso
2)Imprimir el contenido del arreglo en orden normal
3)Sumar los elementos del arreglo y mostrar el resultado por pant

Considere hacer las validaciones correspondientes para que el programa no se caiga
y acepte solo enteros como entrada por teclado.
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
    var tamaño: Int? = null
    while (tamaño == null) {
        println("Ingrese la cantidad de elementos del arreglo:")
        try {
            tamaño = readLine()?.toInt()
            if (tamaño == null) throw Exception()
        } catch (e: Exception) {
            println("Ingrese un número válido.")
        }
    }
    return tamaño
}

fun crearArreglo(tamaño: Int): IntArray {
    return IntArray(tamaño)
}


