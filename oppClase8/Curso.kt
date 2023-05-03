package com.example.aprendiendokotlin.oppClase8

class Curso(val nombre: String, val duracion: Int) {
    private val estudiantes: MutableList<Estudiante> = mutableListOf()

    fun agregarEstudiante(estudiante: Estudiante) {
        estudiantes.add(estudiante)
    }

    fun mostrarEstudiantesCurso() {
        if (estudiantes.isEmpty()) {
            println("No hay estudiantes en el curso")
        } else {
            println("Lista de estudiantes:")
            estudiantes.forEach { it.mostrarDatosEstudiante() }
        }
    }

    fun buscarEstudiantePorRut(rut: String): Estudiante? {
        return estudiantes.find { it.rut == rut }
    }

    fun actualizarEstudiantePorNombreORut(rutoNombre: String) {
        val estudiante = estudiantes.find { it.rut == rutoNombre || it.nombreCompleto() == rutoNombre }
        if (estudiante != null) {
            println("Ingrese la nueva información del estudiante:")
            println("Nombre:")
            val nombre = readLine() ?: return

            println("Apellido:")
            val apellido = readLine() ?: return

            println("Rut:")
            val rut = readLine() ?: return

            println("Edad:")
            val edad = readLine()?.toInt() ?: return

            println("Cantidad de notas:")
            val cantidadNotas = readLine()?.toInt() ?: return
            val notas = IntArray(cantidadNotas)

            for (i in 0 until cantidadNotas) {
                println("Ingrese la nota ${i + 1}:")
                notas[i] = readLine()?.toInt() ?: continue
            }

            estudiante.nombre = nombre
            estudiante.apellido = apellido
            estudiante.rut = rut
            estudiante.edad = edad
            estudiante.notas = notas

            println("Estudiante actualizado:")
            estudiante.mostrarDatosEstudiante()
        } else {
            println("Estudiante no se encuentra en la lista")
        }
    }

    fun verPromedioDeNotasYAsistenciaDeEstudiante(rut: String) {
        val estudiante = buscarEstudiantePorRut(rut)
        if (estudiante != null) {
            val promedioNotas = estudiante.notas.average()
            val porcentajeAsistencia = estudiante.calcularPorcentajeAsistencia()
            println("Promedio de notas de ${estudiante.nombreCompleto()}: $promedioNotas")
            println("Porcentaje de asistencia de ${estudiante.nombreCompleto()}: $porcentajeAsistencia")
        } else {
            println("Estudiante no se encuentra en la lista")
        }
    }

    }
