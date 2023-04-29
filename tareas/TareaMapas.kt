package com.example.aprendiendokotlin.tareas
import com.example.aprendiendokotlin.estudiante
import com.example.aprendiendokotlin.guardarListaEnArchivo
import java.io.File

val estudiante = mutableMapOf<String, Int>() // Diccionario de Esudiante (nombre y edad)

fun main() {

    cargarListaDesdeArchivo()


    do {
        println("╔══════════════════════════════════╗")
        println("║       MENÚ ESTUDIANTES ANDROID   ║")
        println("╠══════════════════════════════════╣")
        println("║ 1. Agregar estudiante            ║")
        println("║ 2. Mostrar lista de estudiantes  ║")
        println("║ 3. Eliminar estudiante           ║")
        println("║ 4. Mostrar mayor y menor         ║")
        println("║ 5. Guardar lista en archivo      ║")
        println("║ 6. Total de estudiantes          ║")
        println("║ 7. Salir                         ║")
        println("╚══════════════════════════════════╝")

        print("Ingresa tu opción: ")
        val opcion = readLine()?.toIntOrNull() ?: 0

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

            4-> {
                var alumnoMayor= estudiante.maxOf { it.value }
                var alumnoMenor= estudiante.minOf { it.value }

                println("La mayor edad es: $alumnoMayor , y la menor edad es $alumnoMenor")
            }

            5 -> {
                guardarListaEnArchivo()
            }

            6-> {
                mostrarDeCantidadPersonas(estudiante)}
            7 -> {
                println("Saliendo del programa...")
            }
            else -> {
                println("Opción inválida. Inténtalo de  nuevo.")
            }
        }
    } while (opcion != 7)
}
fun mostrarDeCantidadPersonas(estudiante: MutableMap<String, Int>) {
    val cantidadDePersonas = estudiante.size
    println("Hay $cantidadDePersonas estudiantes Android.")
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

