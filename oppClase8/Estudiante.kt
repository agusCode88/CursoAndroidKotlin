package com.example.aprendiendokotlin.oppClase8

class Estudiante(var nombre: String, var apellido: String, var rut: String, var edad: Int, var notas: IntArray) {

    // Función para calcular el promedio de notas del estudiante
    fun calcularPromedioNotas(): Double {
        return notas.average()
    }

    // Función para calcular el porcentaje de asistencia del estudiante
    // Supongamos que el estudiante tiene 100% de asistencia
    fun calcularPorcentajeAsistencia(): Double {
        return 100.0
    }

    // Función para mostrar los datos del estudiante
    fun mostrarDatosEstudiante() {
        println("Nombre: $nombre $apellido")
        println("RUT: $rut")
        println("Edad: $edad")
        println("Notas: ${notas.joinToString(", ")}")
        println("Promedio de notas: ${calcularPromedioNotas()}")
        println("Porcentaje de asistencia: ${calcularPorcentajeAsistencia()}%")
    }

    fun nombreCompleto(): String {
        return nombre + " " + apellido
    }

}
