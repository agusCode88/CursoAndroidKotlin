package com.example.aprendiendokotlin.tareas

/*

Necesario: Llenar la lista de estudiantes

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
        println("╔══════════════════════════════════╗")
        println("║       MENÚ ESTUDIANTES ANDROID   ║")
        println("╠══════════════════════════════════╣")
        println("║ 1. Agregar estudiante            ║")
        println("║ 2. Mostrar lista de estudiantes  ║")
        println("║ 3. Eliminar estudiante           ║")
        println("║ 4. Salir                         ║")
        println("╚══════════════════════════════════╝")

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
                print("Ingresa el nombre de la persona que deseas eliminar: ")
                val nombre = readLine()?.toString() ?: ""
                if (estudiante.containsKey(nombre)) {
                    estudiante.remove(nombre)
                    println("La persona $nombre ha sido eliminada correctamente.")
                } else {
                    println("La persona $nombre no se encontró en la lista.")
                }
            }
            4 -> {
                println("Saliendo del programa...")
            }
            else -> {
                println("Opción inválida. Inténtalo de nuevo.")
            }
        }
    } while (opcion != 4)
}
