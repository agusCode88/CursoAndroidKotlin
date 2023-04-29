package com.example.aprendiendokotlin

// Librería necesaria para trabajar con archivos
import java.io.File

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

//Necesito que el mapa esté fuera del main para que se pueda acceder a este desde las funciones
val estudiante = mutableMapOf<String, Int>(
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
    "Sergio" to 32)

fun main() {
    //Al inicio del programa el mapa se rellena con los estudiantes guardados en el archivo




    cargarListaDesdeArchivo()

    do {
        println("╔══════════════════════════════════╗")
        println("║       MENÚ ESTUDIANTES ANDROID   ║")
        println("╠══════════════════════════════════╣")
        println("║ 1. Agregar estudiante            ║")
        println("║ 2. Mostrar lista de estudiantes  ║")
        println("║ 3. Eliminar estudiante           ║")
        println("║ 5. Guardar lista en archivo      ║")
        println("║ 7. Salir                         ║")
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
            5 -> {
                guardarListaEnArchivo()
            }
            7 -> {
                println("Saliendo del programa...")
                System.exit(0)
            }
            else -> {
                println("Opción inválida. Inténtalo de nuevo.")
            }
        }
    } while (opcion != 4)
}

// Guarda la lista de estudiantes en un archivo de texto.
fun guardarListaEnArchivo(){

    val nombreArchivo = "estudiantes.txt"
    val archivo = File(nombreArchivo)

    try {
        archivo.bufferedWriter().use { out ->
            estudiante.forEach { (nombre, edad) ->
                out.write("$nombre,$edad\n")
            }
        }
        println("La lista ha sido guardada en el archivo $nombreArchivo.")
    } catch (ex: Exception) {
        println("Ha ocurrido un error al guardar la lista en el archivo.")
    }
}

// Carga la lista de estudiantes desde un archivo de texto.
fun cargarListaDesdeArchivo() {
    val nombreArchivo = "estudiantes.txt"
    val archivo = File(nombreArchivo)

    try {
        archivo.bufferedReader().useLines { lines ->
            lines.forEach {
                val valores = it.split(",")
                if (valores.size == 2) {
                    val nombre = valores[0]
                    val edad = valores[1].toInt()
                    estudiante[nombre] = edad
                }
            }
        }
        println("La lista ha sido cargada desde el archivo $nombreArchivo.")
    } catch (ex: Exception) {
        println("Ha ocurrido un error al cargar la lista desde el archivo.")
    }
}