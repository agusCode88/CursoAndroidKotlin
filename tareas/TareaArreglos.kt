package com.example.aprendiendokotlin

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



fun main(args: Array<String>) {
    val tamanioArreglo = solicitarTamanioArreglo()
    val arreglo = crearArreglo(tamanioArreglo)
    var opcion: Int? = null

    llenarArreglo(arreglo)

    while (opcion != 6) {
        println("╭───────────────────────────────────╮")
        println("│           MENÚ PRINCIPAL          │")
        println("├───────────────────────────────────┤")
        println("│ 1. Orden Inverso                  │")
        println("│ 2. Orden Normal                   │")
        println("│ 3. Primero y Último               │")
        println("│ 4. Sumar Todos                    │")
        println("│ 5. Actualizar Suma                │")
        println("│ 6. Salir                          │")
        println("╰───────────────────────────────────╯")



        print("Ingresa tu opción: ")
        try {
            opcion = readLine()?.toInt()
            when (opcion) {
                1 -> mostrarArregloInverso(arreglo)
                2 -> mostrarArregloNormal(arreglo)
                3 -> mostrarPrimerYUltimoElemento(arreglo)
                4 -> mostrarSumaArreglo(arreglo)
                5 -> agregarUnNuevoElementoYSumarlo(arreglo)
                6 -> System.exit(0)
                else -> println("Ingrese una opción válida.")
            }
        } catch (e: Exception) {
            println("Ingrese una opción válida.")
        }
    }
}

fun solicitarTamanioArreglo(): Int {
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

fun crearArreglo(tamanio: Int): IntArray {
    return IntArray(tamanio)
}

fun llenarArreglo(arreglo: IntArray) {
    for (i in arreglo.indices) {
        var valor: Int? = null
        do {
            println("Ingrese el elemento número ${i + 1}:")
            try {
                val input = readLine()
                if (input != null && input.toIntOrNull() != null) {
                    valor = input.toInt()
                } else {
                    throw NumberFormatException()
                }
            } catch (e: NumberFormatException) {
                println("Ingrese un número válido.")
            }
        } while (valor == null)
        arreglo[i] = valor
    }
}

fun mostrarArregloInverso(arreglo: IntArray) {
    val arregloInverso = arreglo.copyOf().apply { reverse() }
    println("Arreglo en orden inverso:")
    for (elemento in arregloInverso) {
        println(elemento)
    }
}

fun mostrarArregloNormal(arreglo: IntArray) {
    println("Arreglo en orden normal:")
    for (elemento in arreglo) {
        println(elemento)
    }
}

fun mostrarSumaArreglo(arreglo: IntArray) {
    var suma = 0
    println("Suma del arreglo:")
    for (elemento in arreglo) {
        suma += elemento
    }
    println(suma)
}

fun mostrarPrimerYUltimoElemento(arreglo: IntArray) {
    println("El primer elemento del arreglo es: ${arreglo[0]}")
    println("El último elemento del arreglo es: ${arreglo[arreglo.size - 1]}")
}

fun agregarUnNuevoElementoYSumarlo(arreglo: IntArray) {
    var nuevoElemento: Int? = null

    do {
        println("Ingrese un nuevo elemento para sumar a los existentes en el arreglo:")
        try {
            nuevoElemento = readLine()?.toInt()
            if (nuevoElemento == null) throw Exception()
        } catch (e: Exception) {
            println("Ingrese un número válido.")
        }
    } while (nuevoElemento == null)

    val nuevoArreglo = arreglo.plus(nuevoElemento)
    var suma = 0
    for (elemento in nuevoArreglo) {
        suma += elemento
    }

    println("La nueva suma del arreglo es: $suma")
}


