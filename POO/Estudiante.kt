package com.example.aprendiendokotlin.POO

class Estudiante(rutPersona: String, nombreEstudiante: String, edad: Int, fechaNacimiento: String) {

    // Atributos

    var rutPersona: String = rutPersona
    var nombreEstudiante: String = nombreEstudiante
    var edad: Int = edad
    var fechaNacimiento: String = fechaNacimiento

    constructor() : this("", "", 0, "") {}

    // Métodos

    fun estudianteHabla() {
        println("Estudiante $nombreEstudiante habla")
    }

    fun estudianteAsiste(): Boolean {
        var asiste = true
        return asiste
    }

    fun estudianteCome() {
        println("Estudiante $nombreEstudiante Come")
    }

    fun estudianteNoCome() {
        println("Estudiante $nombreEstudiante no come")
    }

    fun estudianteEstudia() {
        println("Estudiante $nombreEstudiante Estudia")
    }

    fun estudianteSePresenta() {
        println("Rut: $rutPersona")
        println("Nombre: $nombreEstudiante")
        println("Edad: $edad")
        println("Fecha de nacimiento: $fechaNacimiento")
    }
}


