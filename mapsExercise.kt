package com.example.aprendiendokotlin

fun main() {
    val estudiante = mutableMapOf<String, Int>() // Diccionario de Esudiante (nombre y edad)

    do {
        println("╔══════════════════════════════════╗")
        println("║       MENÚ ESTUDIANTES ANDROID   ║")
        println("╠══════════════════════════════════╣")
        println("║ 1. Agregar estudiante            ║")
        println("║ 2. Mostrar lista de estudiantes  ║")
        println("║ 3. Eliminar estudiante           ║")
        println("║ 4. Mostrar cantidad de personas  ║")
        println("║ 5. Actualizar datos de estudiante║")
        println("║ 6. Salir                         ║")
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
                println("La cantidad total de personas en la lista es: ${estudiante.size}")
            }
            5 -> {
                print("Ingresa el nombre de la persona cuyos datos quieres actualizar: ")
                val nombre = readLine()?.toString() ?: ""
                if (estudiante.containsKey(nombre)) {
                    print("Ingresa la nueva edad de la persona: ")
                    val edad = readLine()?.toInt() ?: 0
                    estudiante[nombre] = edad
                    println("La edad de la persona $nombre ha sido actualizada correctamente.")
                } else {
                    println("La persona $nombre no se encontró en la lista.")
                }
            }
            6 -> {
                println("Saliendo del programa...")
            }
            else -> {
                println("Opción inválida. Inténtalo de nuevo.")
            }
        }
    } while (opcion != 6)
}
