package com.example.codigospractica

import com.example.codigospractica.modelo.Bootcamp
import com.example.codigospractica.modelo.BootmapMapa
import com.example.codigospractica.modelo.Estudiante
import com.example.codigospractica.modelo.Persona
import com.example.codigospractica.modelo.Relator

/*

Necesario: Llenar la lista de estudiantes

Ideas:

Ordenar la lista de personas por nombre o por edad.
Permitir que el usuario busque una persona por nombre o por edad.
Guardar la lista de personas en un archivo y cargarla al iniciar el programa.
Agregar validación de entrada de usuario para evitar errores (por ejemplo, asegurarse de que la edad ingresada sea un número entero válido).
Agregar una función para mostrar la persona más joven y la persona más vieja en la lista.
Permitir al usuario actualizar la edad de una persona existente.
Agregar una función para mostrar la cantidad total de personas en la lista.
Agregar la posibilidad de agregar más información sobre la persona, como su dirección o su número de teléfono.

 */


fun main() {

    practicaAntesDeClases()

}


fun practicaAntesDeClases(){

    var notasEstudiante = intArrayOf(70, 45,50) // arreglo de notas del estudiante

    var bootcamp: Bootcamp = Bootcamp("Desarrollo de aplicaciones moviles en Android")
    var bootcampMapa: BootmapMapa = BootmapMapa()

    var relator:Relator = Relator("1.000.000",1)



//    nadador.nombre ="AgusCode"
//    nadador.rut="16990510-K"
//    nadador.edad=34
//    nadador.tipoPersona="Nadador"
//    nadador.laPersonaEs()`
//    nadador.mostraDatos()
//    nadador.laPersonaNoCome()
//
//    boxeador.laPersonaEs()
//    boxeador.mostraDatos()
//    boxeador.laPersonaCome()

    println("Bienvenido al programa:")

    bootcamp.nombreCurso
    println("Opcion 1 Estudiantes ")





}

fun interfazPrograma(){

    //    //val estudiantes = mutableMapOf<String, Estudiante>() // Diccionario de Esudiante (nombre y edad)
//    var cursoAndroid = CursoAndroid("Bootcamp Android")
//
//    do {
//        println("╔══════════════════════════════════╗")
//        println("║       MENÚ ESTUDIANTES ANDROID   ║")
//        println("╠══════════════════════════════════╣")
//        println("║ 1. Agregar estudiante            ║")
//        println("║ 2. Mostrar lista de estudiantes  ║")
//        println("║ 3. Eliminar estudiante           ║")
//        println("║ 4. Salir                         ║")
//        println("╚══════════════════════════════════╝")
//
//        print("Ingresa tu opción: ")
//        val opcion = readLine()?.toInt() ?: 0
//        var estudiante= Estudiante()
//        when (opcion) {
//            1 -> {
//                print("Ingresa el nombre de la persona: ")
//                val nombre = readLine()?.toString() ?: ""
//                print("Ingresa el Rut de la persona: ")
//                val rut = readLine()?.toString() ?: ""
//                print("Ingresa la edad de la persona: ")
//                val edad = readLine()?.toInt() ?: 0
//
//                estudiante = Estudiante(rut,nombre,edad)
//                cursoAndroid.agregarEstudiante(estudiante)
//
//            }
//            2 -> {
//               cursoAndroid.mostrarEstudiantes()
//            }
//            3 -> {
//                print("Ingresa el Rut de la persona que deseas eliminar: ")
//                val nombre = readLine()?.toString() ?: ""
//                cursoAndroid.eliminarEstudiante(nombre)
//
//            }
//            4 -> {
//                println("Saliendo del programa...")
//            }
//            else -> {
//                println("Opción inválida. Inténtalo de nuevo.")
//            }
//        }
//    } while (opcion != 4)

}