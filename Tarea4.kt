package com.example.aprendiendokotlin

fun main() {

    val arreglo = elementos()
    menu(arreglo)


}

fun elementos() : IntArray {

    var cantidad: Int?
    var arreglo = intArrayOf()

    do {

        println("Ingrese la cantidad de elementos de la lista --> ")

        try {
            cantidad = readln().toInt()
            if (cantidad == null) throw Exception()

            arreglo = IntArray(cantidad)

            for(i in arreglo.indices){
                print("Ingrese un numero para la lista --> ")
                arreglo[i] = readLine()?.toInt() ?: 0
            }

        } catch (e: Exception) {
            println("Ingrese un número válido.")
            cantidad = null
        }

    }while (cantidad == null)

    return arreglo
}

fun menu(arreglo: IntArray) {
    var opc: Int

    do {
        println("\nMENU PRINCIPAL")
        println("-------------------------")
        println("\n1.-Mostrar lista orden normal")
        println("2.-Mostrar lista orden inverso")
        println("3.-Mostrar primer y ultimo elemento")
        println("4.-Sumar los elementos de la lista y mostrar")
        println("5.-Actualizar o agregar un elemento a la lista y mostrar la nueva suma")
        println("6.-Eliminar todos los elementos")
        println("7.-Eliminar elemento por indice")
        println("8.-Salir")
        println("\nELIGE TU OPCION [1-2-3-4-5-6] --> ")
        opc = readLine()?.toIntOrNull() ?: 0

        when (opc) {

            1 -> mostrarNormal(arreglo)
            2 -> mostrarInverso(arreglo)
            3 -> mostrarPrimerUltimoElemento(arreglo)
            4 -> sumaElementos(arreglo)
            5 -> modificar(arreglo)
            6 -> eliminarTodo(arreglo)
            7 -> eliminarElemento(arreglo)
            8 -> println("Adios")
            else -> println("Opcion no valida")
        }
    }while (opc != 7)
}

fun mostrarNormal(arreglo : IntArray){
    //contentToString retorna una representacion en forma de String de los elementos del array como si fuera una Lista.
   println("Lista orden normal --> ${arreglo.contentToString()}") //Muestra los elementos
}

fun mostrarInverso(arreglo : IntArray){

    arreglo.reverse() //Invierte el orden
    println("Lista en orden invertido --> ${arreglo.contentToString()}")
}

fun mostrarPrimerUltimoElemento(arreglo : IntArray){

    println("El primer elemento es --> ${arreglo.first()}") //Muestra el primer elemento
    println("El ultimo elemento es --> ${arreglo.last()}")  //Muestra el último elemento
}
fun sumaElementos(arreglo: IntArray){

    println("La suma de todos los elementos es --> ${arreglo.sum()}")  //Suma todos los elementos
}

fun modificar(arreglo: IntArray) {

    println("Ingresa la posicion del elemento que desea modificar --> ")
    val posicion = readLine()?.toIntOrNull() ?: 0
    println("Ingrese el valor del elemento --> ")
    val valor = readLine()?.toIntOrNull() ?: 0
    arreglo[posicion] = valor
    sumaElementos(arreglo)
}

fun eliminarElemento(arreglo: IntArray){

    println("Ingresa la posicion del elemento que desea eliminar --> ")
    val posicion = readLine()?.toIntOrNull() ?: 0

    val nuevoArreglo = arreglo.toMutableList()
    nuevoArreglo.removeAt(posicion)
    val arregloFinal = nuevoArreglo.toIntArray()

    println(nuevoArreglo)
}

fun eliminarTodo(arreglo: IntArray){

    val backupArreglo : IntArray = arreglo

    arreglo.fill(0)
    println(arreglo.contentToString())

}





