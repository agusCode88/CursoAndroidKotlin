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
// Crea una instancia de la clase Scanner para leer la entrada del usuario.
    val scanner = Scanner(System.`in`)

    // Solicita al usuario la cantidad de elementos que tendrá el arreglo.
    print("Ingresa la cantidad de elementos del arreglo: ")
    val n = scanner.nextInt()

    // Crea un nuevo arreglo de enteros con el tamaño especificado por el usuario.
    val numeros = IntArray(n)

    // Solicita al usuario los valores de cada elemento del arreglo.
    for (i in 0 until n) {
        print("Ingresa el elemento ${i+1}: ")
        numeros[i] = scanner.nextInt()
    }

    // Inicializa la variable opcion, que se utilizará en el ciclo do-while.
    var opcion: Int

    // Comienza el ciclo do-while que permitirá al usuario seleccionar qué acción realizar.
    do {
        // Muestra las opciones disponibles al usuario.

        println("-----------------------------------------------------------------------------")
        println("|                             MENÚ PRINCIPAL                                |")
        println("-----------------------------------------------------------------------------")
        println("|        1. Mostrar el contenido del arreglo en orden inverso               |")
        println("|        2. Imprimir el contenido y su índice del arreglo en orden normal   |")
        println("|        3. Mostrar el primer y el último elemento del arreglo              |")
        println("|        4. Sumar los elementos del arreglo y mostrar el resultado          |")
        println("|        5. Agregar un nuevo valor al arreglo y mostrar la nueva suma       |")
        println("|        0. Salir                                                           |")
        println("-----------------------------------------------------------------------------")

        // Lee la opción seleccionada por el usuario.
        opcion = scanner.nextInt()

        // Ejecuta una acción dependiendo de la opción seleccionada por el usuario.
        when (opcion) {

            // Si el usuario selecciona la opción 1, muestra los elementos del arreglo en orden inverso.
            1 -> {
                println("Contenido del arreglo en orden inverso:")
                for (i in numeros.size-1 downTo 0) {
                    println(numeros[i])
                }
            }

            // Si el usuario selecciona la opción 2, muestra los elementos del arreglo y su índice en orden normal.
            2 -> {
                println("Contenido y índice del arreglo en orden normal:")
                for (i in numeros.indices) {
                    println("[$i] = ${numeros[i]}")
                }
            }

            // Si el usuario selecciona la opción 3, muestra el primer y último elemento del arreglo.
            3 -> {
                println("Primer elemento: ${numeros.first()}")
                println("Último elemento: ${numeros.last()}")
            }

            // Si el usuario selecciona la opción 4, suma los elementos del arreglo y muestra el resultado.
            4 -> {
                val suma = numeros.sum()
                println("La suma de los elementos del arreglo es: $suma")
            }

            // Si el usuario selecciona la opción 5, solicita un nuevo valor para agregar al arreglo y muestra la nueva suma.
            5 -> {
                print("Ingresa el nuevo valor: ")
                val nuevoValor = scanner.nextInt()
                val nuevoArreglo = numeros.plus(nuevoValor)
                val nuevaSuma = nuevoArreglo.sum()
                println("El arreglo actualizado es: ${nuevoArreglo.contentToString()}")
                println("La nueva suma de los elementos del arreglo es: $nuevaSuma")
            }

            // Si el usuario selecciona la opción 0, finaliza el programa.
            0 -> {
                println("¡Nos vemos!")
            }
            else -> {
                println("Opción inválida")
            }
        }
    } while (opcion != 0)
}

