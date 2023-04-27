package Kotlin;
/*
1)Mostrar el contenido del arreglo en orden inverso.
2)Imprimir el contenido y su indice del arreglo en orden normal.
3)Mostrar el primer y el ultimo elemento del arreglo.
4)Sumar los elementos del arreglo y mostrar el resultado por pantalla
5) Actualizar o agregar un nuevo valor al arreglo y mostrar la nueva suma

 */
fun main() {
    var tamañoArreglo = solicitarTamañoArreglo() // listo
    var arreglo = crearArreglo(tamañoArreglo)

    llenarArreglo(arreglo)

    var opcion: Int
    do {
        opcion = mostrarMenu()
        when (opcion) {
            1 -> mostrarArregloInverso(arreglo)
            2 -> mostrarArregloNormal(arreglo)
            3 -> mostrarPrimerYUltimo(arreglo)
            4 -> mostrarSumaArreglo(arreglo)
            5 -> actualizarValor(arreglo)
            else -> println("Opción no válida.")
        }
    } while (opcion != 0)
}
//hacer el menu
fun mostrarMenu(): Int {
    println("Seleccione una opción:")
    println("1. Mostrar el contenido del arreglo en orden inverso")
    println("2. Imprimir el contenido y su indice del arreglo en orden normal")
    println("3. Mostrar el primer y el ultimo elemento del arreglo")
    println("4. Sumar los elementos del arreglo y mostrar el resultado por pantalla")
    println("5. Actualizar o agregar un nuevo valor al arreglo y mostrar la nueva suma")
    println("0. Salir")

    var opcion: Int? = null
    do {
        try {
            opcion = readLine()?.toInt()
            if (opcion == null || opcion < 0 || opcion > 5) throw Exception()
        } catch (e: Exception) {
            println("Ingrese una opción válida.")
        }
    } while (opcion == null || opcion < 0 || opcion > 5)

    return opcion
}


//Solicitar la cantidad de elementos que tendrá el arreglo y que devuelva ese numero
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

// crea un arreglo de enteros del tamaño que le pida
fun crearArreglo(tamaño: Int): IntArray {
    return IntArray(tamaño)
}

//ingresar los valores para cada posicion del arreglo y que los guarde
fun llenarArreglo(arreglo: IntArray) {
    for (i in arreglo.indices) {
        var numero: Int? = null
        do {
            println("Ingrese el indice  $i:")
            try {
                numero = readLine()?.toInt()
                if (numero == null) throw Exception()
            } catch (e: Exception) {
                println("Ingrese un número válido.")
            }
        } while (numero == null)
        arreglo[i] = numero
    }
}

//muestra el contenido del arreglo en orden inverso
fun mostrarArregloInverso(arreglo: IntArray) {
    println("Contenido del arreglo en orden inverso:")
    for (i in arreglo.indices.reversed()) {
        println(arreglo[i])
    }
}

//muestra el contenido del arreglo junto con el indice que corresponde a cada valor, en orden normal
fun mostrarArregloNormal(arreglo: IntArray) {
    println("Contenido del arreglo en orden normal:")
    for ((indice, valor) in arreglo.withIndex()) {
        println("Índice $indice: $valor")
    }
}

// muestra primer y ultimo elemento del arreglo
fun mostrarPrimerYUltimo(arreglo: IntArray) {
    println("Primer elemento: ${arreglo.firstOrNull()}")
    println("Último elemento: ${arreglo.lastOrNull()}")
}
// calcula la suma de los elementos y la muestra por pantalla
fun mostrarSumaArreglo(arreglo: IntArray) {
    var suma = arreglo.sum()
    println("Suma de los elementos del arreglo: $suma")
}

//ingresar el indice del valor que se desa actualizar o -1 para agregar un nuevo valor, actualiza el arreglo y muestra la nueva suma

fun actualizarValor(arreglo: IntArray) {
    println("Ingrese el índice del valor a actualizar o -1 para agregar un nuevo valor:")
    val indice = readLine()?.toIntOrNull()



    if (indice == null) {
        println("Ingrese un índice válido o -1.")
        return
    }

    if (indice == -1) {
        println("Ingrese el nuevo valor:")
        var valor = readLine()?.toIntOrNull()
        if (valor != null) {
            arreglo[indice]+= valor
            println("Arreglo actualizado: ${arreglo.contentToString()}")
        }
    } else if (indice in arreglo.indices) {
        println("Ingrese el nuevo valor:")
        var valor = readLine()?.toIntOrNull()
        if (valor != null) {
            arreglo[indice] = valor
            println("Arreglo actualizado: ${arreglo.contentToString()}")
        }
    } else {
        println("El índice ingresado no existe en el arreglo.")
    }
}
