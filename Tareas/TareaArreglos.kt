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

    val tamanioArreglo = solicitarTamañoArreglo()
    var arreglo = crearArreglo(tamanioArreglo)
    var opcion: Int? = null

    llenarArreglo(arreglo)

    while (opcion != 7) {

        println("╔══════════════════════════════════╗")
        println("║           MENÚ PRINCIPAL         ║")
        println("╠══════════════════════════════════╣")
        println("║ 1. Orden Inverso                 ║")
        println("║ 2. Orden Normal                  ║")
        println("║ 3. Primero y ultimo              ║")
        println("║ 4. Sumar Todos                   ║")
        println("║ 5. Actualizar Suma               ║")
        println("║ 6. Eliminar elemento             ║")
        println("║ 7. Elimina todo                  ║")
        println("║ 8. Salir                         ║")
        println("╚══════════════════════════════════╝")

        print("Ingresa tu opción: ")

        try {
            opcion = readLine()?.toInt()
            when (opcion) {
                1 -> mostrarArregloInverso(arreglo)
                2 -> mostrarArregloNormal(arreglo)
//                3 -> mostrarPrimerYUltimo(arreglo)
//                4 -> mostrarSumaArreglo(arreglo)
//                5 -> actualizarValor(arreglo)
//                6-> eliminarUnElemento(arreglo)
//                7-> borrarTodosLosDatos(arreglo)
                8 -> println("Hasta luego. Dale que puedes!")
                else -> println("Ingrese una opción válida.")
            }
        } catch (e: Exception) {
            println("Ingrese una opción válida.")
        }
    }
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