package com.example.aprendiendokotlin.POO

class Estudiante(
    val rutEstudiante: String,
    var nombreEstudiante: String,
    val edad: Int,
    var fechaNacimiento: String,
    var carrera: String,
    var matriculado: Boolean = false,
    var notas: MutableList<Double> = mutableListOf()
) {

    // Constructor vacio
    constructor() : this("", "", 0, "", "")

    // Comportamientos
    fun estudiarr() {
        println("$nombreEstudiante está estudiando ${if (matriculado) "en $carrera" else ""}")
    }

    fun tomarRamos(vararg ramos: String) {
        println("$nombreEstudiante ha tomado los ramos: ${ramos.joinToString()}")
    }

    fun matricular() {
        matriculado = true
        println("$nombreEstudiante se ha matriculado en $carrera")
    }

    fun desmatricular() {
        matriculado = false
        println("$nombreEstudiante se ha desmatriculado de $carrera")
    }

    fun agregarNota(nota: Double) {
        notas.add(nota)
    }

    fun promedio(): Double {
        if (notas.isEmpty()) {
            return 0.0
        }
        return notas.sum() / notas.size
    }
}

