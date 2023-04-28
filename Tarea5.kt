package com.example.aprendiendokotlin

/*

Necesario: Llenar la lista de estudiantes

Ideas:

*Ordenar la lista de personas por nombre o por edad.
*Permitir que el usuario busque una persona por nombre o por edad.
*Guardar la lista de personas en un archivo y cargarla al iniciar el programa.
//Agregar validación de entrada de usuario para evitar errores (por ejemplo, asegurarse de que la edad ingresada sea un número entero válido).
*Agregar una función para mostrar la persona más joven y la persona más vieja en la lista.
*Permitir al usuario actualizar la edad de una persona existente.
*Agregar una función para mostrar la cantidad total de personas en la lista.
*Agregar la posibilidad de agregar más información sobre la persona, como su dirección o su número de teléfono.
 */

val estudiante = mutableMapOf<String, Int>() // Diccionario de Esudiante (nombre y edad)

fun main() {

    menu()
}


fun ingresarEstudiante() {

    var x = 1  //Contador de estudiantes
    var exit = "y"  //Opcion de salida

    while (exit == "y") {
        print("\nIngresa el nombre del estudiante ${x} --> ")
        val nombre = readLine().toString().uppercase()
        if (!nombre.matches(Regex("[a-zA-Z][a-zA-Z\\s]*"))) {
            println("Nombre ingresado no valido, intentelo")
            continue
        }

    var edadFinal: Int? = null
        while (edadFinal == null) {
            print("Ingresa la edad de la persona --> "); val edad: String = readLine().toString()
            if (edad.matches(Regex("\\d+"))) {
                edadFinal = edad.toInt()
            } else {
                println("Edad ingresada no valida")
            }
        }
        estudiante[nombre] = edadFinal
        println("Él/La estudiante $nombre ha sido agregado/a correctamente.")
        x++
        do {
            print("¿Desea seguir? --> y/n ")
            exit = readLine().toString().toLowerCase()
        } while (exit != "y" && exit != "n")
    }
    println("Operación finalizada.")
}

fun mostrarLista(){
    if (estudiante.isEmpty()) {
        println("No hay personas en la lista.")
    } else {
        println("Lista de personas:")
        estudiante.forEach { (name, age) ->
            println("- $name ($age años)")
        }
    }
}

fun eliminarEstudiante(){

    print("Ingresa el nombre de la persona que deseas eliminar --> ")
    val nombre = readLine().toString().uppercase()
    if (estudiante.containsKey(nombre)) {
        estudiante.remove(nombre)
        println("La persona $nombre ha sido eliminada correctamente.")
    } else {
        println("La persona $nombre no se encontró en la lista.")
    }
}

fun menu(){
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
        val opcion : String = readLine().toString()
        if(opcion.matches(Regex("\\d+"))){

            when (opcion) {
                "1" -> {
                    ingresarEstudiante()
                }
                "2" -> {
                    mostrarLista()
                }
                "3" -> {
                    eliminarEstudiante()
                }
                "4" -> {
                    println("Saliendo del programa...")
                }
                else -> {
                    println("Opción inválida. Inténtalo de nuevo.")
                }
            }
        }else{
            println("Dato ingresado no valido")
        }
    } while (opcion != "4")
}