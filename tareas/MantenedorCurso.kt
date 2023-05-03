package com.example.aprendiendokotlin.TareaPOO

import poo.Estudiante

fun main() {

    var curso = mutableListOf<Alumno>()
    var alumno1: Alumno = Alumno("Beatriz", "Urzua", "19247574-0", 28, intArrayOf(3, 4, 5))
    var alumno2: Alumno = Alumno("Felipe", "Termini", "1-1", 28, intArrayOf(4, 2, 4))

    curso.add(alumno1)
    curso.add(alumno2)

    var opcion: Int = -1
    while (opcion != 0) {
        mostrarMenu()
        opcion = readLine()?.toInt() ?: continue

        when (opcion) {
            1 -> {
                // agregar Estudiante
                println("Ingrese el nombre del estudiante:")
                val nombre = readLine() ?: continue

                println("Ingrese el apellido del estudiante:")
                val apellido = readLine() ?: continue

                println("Ingrese el Rut del estudiante:")
                val rut = readLine() ?: continue

                println("Ingrese la edad del estudiante:")
                val edad = readLine()?.toInt() ?: continue

                println("Ingrese la cantidad de notas del estudiante:")
                val cantidadNotas = readLine()?.toInt() ?: continue
                val listaDeNotas = IntArray(cantidadNotas)

                for (nota in 0 until cantidadNotas) {
                    println("Ingrese la nota ${nota + 1}:")
                    listaDeNotas[nota] = readLine()?.toInt() ?: continue
                }
                var estudiante = Alumno(nombre, apellido, rut, edad, listaDeNotas)
                curso.add(estudiante)
                continue
            }

            2 -> {
                // mostrar estudiantes
                mostrarEstudiantesCurso(curso)
            }

            3 -> {
                //buscar estudiante por Rut
                println("Ingrese el Rut del estudiante a buscar:")
                val rutIngresado = readLine() ?: continue
                buscarEstudiantePorRut(curso, rutIngresado)//
            }

            4 -> {
                // actualizar estudiante por nombre o rut
                println("Ingrese el Rut o el nombre del estudiante a buscar:")
                val rutoNombre = readLine() ?: continue
                actualizarEstudiantePorNombreORut(curso, rutoNombre)
            }

            5 -> {
                // Ver promedio de notas y de asitencia estudiante
                println("Ingrese el Rut del estudiante del que se desea conocer el promedio:")
                val rutIngresado = readLine() ?: continue
                PromedioPorRut(curso, rutIngresado)
            }

            0 -> {
                println("Adiós!")
                System.exit(0)
            }

            else -> {
                println("Opción inválida. Intente de nuevo.")
            }
        }
    }
}


fun mostrarMenu() {
    println("Seleccione una opción:")
    println("1. Agregar estudiante")
    println("2. Mostrar lista de estudiantes")
    println("3. Buscar estudiante por rut")
    println("4. Actualizar estudiante por nombre o rut")
    println("5. Ver promedio de notas y asistencia de estudiante")
    println("0. Salir")
}

fun mostrarEstudiantesCurso(curso: MutableList<Alumno>) {

    println("Listado de estudiantes")

    curso.forEach {
        println("${it.nombre} ${it.apellido}")
    }
}

fun buscarEstudiantePorRut(curso: MutableList<Alumno>, rutIngresado: String) {

    var alumnoEncontrado = curso.find { it.rut.equals(rutIngresado) }

    if (alumnoEncontrado != null) {

        println("Nombre: ${alumnoEncontrado.nombre}")
        println("Apellido: ${alumnoEncontrado.apellido}")
        println("Rut: ${alumnoEncontrado.rut}")
        println("Edad: ${alumnoEncontrado.edad}")
        println("Notas: [${alumnoEncontrado.nota.toList()}]")

    } else {
        println("Alumno no encontrado")
    }
}

fun actualizarEstudiantePorNombreORut(curso: MutableList<Alumno>, rutoNombre:String){

    var alumnoEncontrado = curso.find { it.rut.equals(rutoNombre) || it.nombre.equals(rutoNombre) }

    if (alumnoEncontrado != null) {

        println("Nombre: ${alumnoEncontrado.nombre}")
        println("Apellido: ${alumnoEncontrado.apellido}")
        println("Rut: ${alumnoEncontrado.rut}")
        println("Edad: ${alumnoEncontrado.edad}")
        println("Notas: [${alumnoEncontrado.nota.toList()}]")

        println("Seleccione atributo a editar")
        println("1.-Nombre , 2.-Apellido, 3.-Edad")
        var opcion = readln().toInt()

        when(opcion){

            1-> {
                println("Ingrese el nombre del estudiante:")
                val nombreNuevo = readLine()!!
                alumnoEncontrado.nombre = nombreNuevo

                println("Modificacion exitosa")
                 }

            2-> {
                println("Ingrese el nuevo apellido del estudiante:")
                val apellidoNuevo = readLine()!!
                alumnoEncontrado.apellido = apellidoNuevo

                println("Modificacion exitosa")
            }

            3-> { println("Ingrese la nueva edad del estudiante:")
                val edadNueva = readln().toInt()
                alumnoEncontrado.edad = edadNueva

                println("Modificacion exitosa")
            }

        }

    } else {
        println("Alumno no encontrado")
    }
}

fun PromedioPorRut(curso: MutableList<Alumno>, rutIngresado: String) {

    var alumnoEncontrado = curso.find { it.rut.equals(rutIngresado) }

    if (alumnoEncontrado != null) {

        val notas = alumnoEncontrado.nota
        val promedio = notas.average()

        println("El promedio es: $promedio")


    } else {
        println("Alumno no encontrado")
    }
}




class Alumno(
    var nombre: String,
    var apellido: String,
    val rut: String,
    var edad: Int,
    var nota: IntArray
) {

}








