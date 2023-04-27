package com.example.aprendiendokotlin

/*

Cree un programa en Kotlin que pregunte por pantalla la cantidad de elementos que tendrá el arreglo.
Capture el dato de entrada y setee un arreglo de enteros del tamaño ingresado por el usuario.
Una vez que haya creado el arreglo e indicado la cantidad de elementos ,proceda a llenar el arreglo
con numeros por pantalla agregando cada elemento segun la cantidad que ingresó el usuario.
 Luego que haya llenado el arreglo ,muestre por pantalla un menu que indique las siguientes opciones
 a realizar como usuario:

1)Mostrar el contenido del arreglo en orden inverso.
2)Imprimir el contenido y su indice del arreglo en orden normal.
3)Mostrar el primer y el ultimo elemento del arreglo.
4)Sumar los elementos del arreglo y mostrar el resultado por pantalla
5) Actualizar o agregar un nuevo valor al arreglo y mostrar la nueva suma

Considere hacer las validaciones correspondientes para que el programa no se caiga
y acepte solo enteros como entrada por teclado.
 */

import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    print("Ingresa la cantidad de elementos del arreglo: ")
    val n = scanner.nextInt()

    val numeros = IntArray(n)

    for (i in 0 until n) {
        print("Ingresa el elemento ${i+1}: ")
        numeros[i] = scanner.nextInt()
    }

    var opcion: Int

    do {
        println("Selecciona una opción:")
        println("1. Mostrar el contenido del arreglo en orden inverso")
        println("2. Imprimir el contenido y su índice del arreglo en orden normal")
        println("3. Mostrar el primer y el último elemento del arreglo")
        println("4. Sumar los elementos del arreglo y mostrar el resultado")
        println("5. Agregar un nuevo valor al arreglo y mostrar la nueva suma")
        println("0. Salir")
        opcion = scanner.nextInt()

        when (opcion) {
            1 -> {
                println("Contenido del arreglo en orden inverso:")
                for (i in numeros.size-1 downTo 0) {
                    println(numeros[i])
                }
            }
            2 -> {
                println("Contenido y índice del arreglo en orden normal:")
                for (i in numeros.indices) {
                    println("[$i] = ${numeros[i]}")
                }
            }
            3 -> {
                println("Primer elemento: ${numeros.first()}")
                println("Último elemento: ${numeros.last()}")
            }
            4 -> {
                val suma = numeros.sum()
                println("La suma de los elementos del arreglo es: $suma")
            }
            5 -> {
                print("Ingresa el nuevo valor: ")
                val nuevoValor = scanner.nextInt()
                val nuevoArreglo = numeros.plus(nuevoValor)
                val nuevaSuma = nuevoArreglo.sum()
                println("El arreglo actualizado es: ${nuevoArreglo.contentToString()}")
                println("La nueva suma de los elementos del arreglo es: $nuevaSuma")
            }
            0 -> {
                println("¡Loh vimos!")
            }
            else -> {
                println("Opción inválida")
            }
        }
    } while (opcion != 0)
}

