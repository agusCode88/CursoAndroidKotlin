import com.example.aprendiendokotlin.oppClase8.Curso
import com.example.aprendiendokotlin.oppClase8.Estudiante

fun main() {
    val curso = Curso("Introducción a Kotlin", 10)

    while (true) {
        println("MENU:")
        println("1. Agregar estudiante")
        println("2. Mostrar lista de estudiantes")
        println("3. Actualizar información de estudiante")
        println("4. Ver promedio de notas y asistencia de estudiante")
        println("5. Salir")

        val opcion = readLine()?.toIntOrNull() ?: continue

        when (opcion) {
            1 -> {
                println("Ingrese los datos del estudiante:")
                println("Nombre:")
                val nombre = readLine() ?: continue

                println("Apellido:")
                val apellido = readLine() ?: continue

                println("Rut:")
                val rut = readLine() ?: continue

                println("Edad:")
                val edad = readLine()?.toIntOrNull() ?: continue

                println("Cantidad de notas:")
                val cantidadNotas = readLine()?.toIntOrNull() ?: continue
                val notas = IntArray(cantidadNotas)

                for (i in 0 until cantidadNotas) {
                    println("Ingrese la nota ${i + 1}:")
                    notas[i] = readLine()?.toIntOrNull() ?: continue
                }

                val estudiante = Estudiante(nombre, apellido, rut, edad, notas)
                curso.agregarEstudiante(estudiante)
                println("Estudiante agregado:")
                estudiante.mostrarDatosEstudiante()
            }

            2 -> {
                curso.mostrarEstudiantesCurso()
            }

            3 -> {
                println("Ingrese el rut o nombre completo del estudiante a actualizar:")
                val rutoNombre = readLine() ?: continue
                curso.actualizarEstudiantePorNombreORut(rutoNombre)
            }

            4 -> {
                println("Ingrese el rut del estudiante:")
                val rut = readLine() ?: continue
                curso.verPromedioDeNotasYAsistenciaDeEstudiante(rut)
            }

            5 -> {
                println("Hasta luego!")
                return
            }

            else -> {
                println("Opción inválida, por favor ingrese un número del 1 al 5")
            }
        }
    }
}
