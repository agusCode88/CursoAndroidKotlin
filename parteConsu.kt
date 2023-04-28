package com.example.aprendiendokotlin.tareas


/*

Necesario: Llenar la lista de estudiantes e invemta a otras funciones

Ideas:

*Ordenar la lista de personas por nombre o por edad.
*Permitir que el usuario busque una persona por nombre o por edad.
*Guardar la lista de personas en un archivo y cargarla al iniciar el programa.
*Agregar validación de entrada de usuario para evitar errores (por ejemplo, asegurarse de que la edad ingresada sea un número entero válido).
*Agregar una función para mostrar la persona más joven y la persona más vieja en la lista.
*Permitir al usuario actualizar la edad de una persona existente.
*Agregar una función para mostrar la cantidad total de personas en la lista.
*Agregar la posibilidad de agregar más información sobre la persona, como su dirección o su número de teléfono.

 */


fun main() {
    val estudiante = mutableMapOf<String, Int>() // Diccionario de Esudiante (nombre y edad)


    do {
        println("╔═════════════════════════════════════╗")
        println("║       MENÚ ESTUDIANTES ANDROID      ║")
        println("╠═════════════════════════════════════╣")
        println("║ 1. Agregar estudiante               ║")
        println("║ 2. Mostrar lista de estudiantes     ║")
        println("║ 3. Mostrar lista por Nombre         ║")
        println("║ 4. Mostrar lista por Edad           ║")
        println("║ 5. Buscar Estudiante (nombre, edad) ║")
        println("║ 6. Eliminar estudiante              ║")
        println("║ 7. Salir                            ║")
        println("╚═════════════════════════════════════╝")

        print("Ingresa tu opción: ")
        val opcion = readLine()?.toInt() ?: 0

        when (opcion) {
            1 -> {
                print("Ingresa el nombre de la persona: ")
                val nombre = readLine()?.toString() ?: ""
                print("Ingresa la edad de la persona: ")
                val edad = readLine()?.toInt() ?: 0
                estudiante[nombre] = edad
                println("La persona $nombre ha sido agregada correctamente.")
            }
            2 -> {
                if (estudiante.isEmpty()) {
                    println("No hay personas en la lista.")
                } else {
                    println("Lista de personas:")
                    estudiante.forEach { (name, age) ->
                        println("- $name ($age años)")
                    }
                }
            }
            3 -> {
                val listaOrdenadaPorNombre = estudiante.toList().sortedBy { it.first }
                println("Lista ordenada por nombre:")
                listaOrdenadaPorNombre.forEach { (name, age) ->
                    println("- $name ($age años)")
                }
            }
            4 -> {
                val listaOrdenadaPorEdad = estudiante.toList().sortedBy { it.second }
                println("Lista ordenada por edad:")
                listaOrdenadaPorEdad.forEach { (name, age) ->
                    println("- $name ($age años)")
                }
            }
            5 -> {
                print("Ingresa el criterio de búsqueda (nombre o edad): ")
                val criterio = readLine()?.toString()?.toLowerCase() ?: ""
                when (criterio) {
                    "nombre" -> {
                        print("Ingresa el nombre de la persona que deseas buscar: ")
                        val nombre = readLine()?.toString() ?: ""
                        if (estudiante.containsKey(nombre)) {
                            println("La persona $nombre tiene ${estudiante[nombre]} años.")
                        } else {
                            println("La persona $nombre no se encontró en la lista.")
                        }
                    }
                    "edad" -> {
                        print("Ingresa la edad de la persona que deseas buscar: ")
                        val edad = readLine()?.toInt() ?: 0
                        val nombres = estudiante.filterValues { it == edad }.keys
                        if (nombres.isNotEmpty()) {
                            println("Las personas con $edad años son:")
                            nombres.forEach { nombre ->
                                println("- $nombre")
                            }
                        } else {
                            println("No hay personas en la lista con $edad años.")
                        }
                    }
                    else -> {
                        println("Criterio de búsqueda inválido.")
                    }
                }
            }

            6 -> {
                print("Ingresa el nombre de la persona que deseas eliminar: ")
                val nombre = readLine()?.toString() ?: ""
                if (estudiante.containsKey(nombre)) {
                    estudiante.remove(nombre)
                    println("La persona $nombre ha sido eliminada correctamente.")
                } else {
                    println("La persona $nombre no se encontró en la lista.")
                }
            }
            7 -> {
                println("Saliendo del programa...")
            }
            else -> {
                println("Opción inválida. Inténtalo de nuevo.")
            }
        }
    } while (opcion != 7)
}
/*
*Ordenar la lista de personas por nombre o por edad.
*Permitir que el usuario busque una persona por nombre o por edad.
*/

/* 1.
Se crea un MutableMap con los nombres y edades de los estudiantes.
El mapa se convierte en una lista utilizando toList()
Se aplica sortedBy() para ordenar la lista por el segundo elemento que es " la edad"
Se convierte la lista ordenada a un nuevo Map utilizando toMap()
Se imprime en pantalla.
 */
/* Esto es inutil pero me sirve para saber como hacer la lista

fun listaDePersonas() {

    var estudiantes: MutableMap<String, Int> = mutableMapOf(
            "Bárbara" to 29,
            "Luis" to 24,
            "Lautaro" to 33,
            "Consuelo" to 32,
            "Beatríz" to 28,
            "David" to 54,
            "Javier" to 32,
            "José" to 32,
            "Steven" to 37,
            "Moises" to 28,
            "Javiera" to 33,
            "Leo" to 32,
            "Sergio" to 32,
    )
    var listaEnOrden = estudiantes.toList().sortedBy { it.second }
    var mapaEnOrden = listaEnOrden.toMap()

    //no funciona
    mapaEnOrden.forEach{(name, age} ->
    println("- $name ($age años")
}
*/



