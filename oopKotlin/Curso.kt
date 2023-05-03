package com.example.aprendiendokotlin.oopKotlin

class Curso(nombre:String, id:Int) {


    var listadoEstudiantes = mutableListOf<Estudiante>()

    fun addStudent(estudiante: Estudiante) {
        listadoEstudiantes.add(estudiante)
    }

}