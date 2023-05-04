package TareaPoo

import poo.Estudiante

fun main() {

    var curso = Curso("Programacion Android")

    var opcion: Int = -1
    while (opcion != -2) {
        mostrarMenu()
        opcion = readLine()?.toIntOrNull()?: 0

        when (opcion) {
            1 -> {
                // agregar Estudiante

                curso.agregarEstudiante()

                continue
            }

            2 -> {
                // mostrar estudiantes
                curso.mostrarEstudiantesCurso()
            }

            3 -> {
                //buscar estudiante por Rut
                println("Ingrese el Rut del estudiante a buscar:")
                val rutIngresado = readLine() ?: continue
                curso.buscarEstudiantePorRut(rutIngresado)
            }

            4 -> {
                // actualizar estudiante por nombre o rut
                println("Ingrese el Rut o el nombre del estudiante a buscar:")
                val rutoNombre = readLine() ?: continue
                curso.actualizarEstudiantePorNombreORut(rutoNombre)
            }

            5 -> {
                // Ver promedio de notas
                println("Ingrese el Rut del estudiante del que se desea conocer el promedio:")
                val rutIngresado = readLine() ?: continue
                curso.PromedioPorRut(rutIngresado)
            }

            6-> {
                println("Ingrese el Rut del estudiante al que desea agregar nota:")
                val rutIngresado = readLine() ?: continue
                curso.agregarNotas(rutIngresado)
            }

            7 -> {
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
    println("6. Agregar notas")
    println("7. Salir")
}
