@file:Suppress("UNUSED_EXPRESSION", "UNREACHABLE_CODE")

package com.example.aprendiendokotlin

/*

Necesario: Llenar la lista de estudiantes

Ideas:

*1.Ordenar la lista de personas por nombre o por edad.
*2.Permitir que el usuario busque una persona por nombre o por edad.
*3.Guardar la lista de personas en un archivo y cargarla al iniciar el programa.
*4.Agregar validación de entrada de usuario para evitar errores (por ejemplo, asegurarse de que la edad ingresada sea un número entero válido).
*5.Agregar una función para mostrar la persona más joven y la persona más vieja en la lista.
*6.Permitir al usuario actualizar la edad de una persona existente.
*7.Agregar una función para mostrar la cantidad total de personas en la lista.
*8.Agregar la posibilidad de agregar más información sobre la persona, como su dirección o su número de teléfono.

 */


fun main() {

    val estudiante = mutableMapOf<String, Int>() // Diccionario de Esudiante (nombre y edad)
    class Estudiante(val nombre: String, var edad: Int, var direccion: String?, var telefono: String?)

    do {
        println("╔══════════════════════════════════╗")
        println("║       MENÚ ESTUDIANTES ANDROID   ║")
        println("╠══════════════════════════════════╣")
        println("║ 1. Agregar estudiante            ║")
        println("║ 2. Mostrar lista de estudiantes  ║")
        println("║ 3. Eliminar estudiante           ║")
        println("║ 4. actualizar la edad            ║")
        println("║ 5. Salir                         ║")
        println("╚══════════════════════════════════╝")

        print("Ingresa tu opción: ")
        val opcion = readLine()?.toInt() ?: 0

        when (opcion) {
            1 -> {
                print("Ingresa el nombre de la persona: ")
                val nombre = readLine()?.toString() ?: ""
                print("Ingresa la edad de la persona: ")
                val edad = readLine()?.toInt() ?: 0
                print("Ingresa la dirección de la persona (opcional): ")
                val direccion = readLine()?.toString()
                print("Ingresa el número de teléfono de la persona (opcional): ")
                val telefono = readLine()?.toString()
                val est = Estudiante(nombre, edad, direccion, telefono)
                estudiante[nombre] = est.edad
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


            6 -> {
                print("Ingresa el nombre de la persona que deseas actualizar la edad: ")
                val nombre = readLine()?.toString() ?: ""
                if (estudiante.containsKey(nombre)) {
                    print("Ingresa la nueva edad de la persona: ")
                    val edad = readLine()?.toInt() ?: 0
                    estudiante[nombre] = edad
                    println("La edad de $nombre ha sido actualizada correctamente.")
                } else {
                    println("La persona $nombre no se encontró en la lista.")
                }
            }

            else -> {
                println("Opción inválida. Inténtalo de nuevo.")
            }
        }
    } while (opcion != 5)
}