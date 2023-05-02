package com.example.aprendiendokotlin.POO

class CursoAndroid (nombreCurso: String, relator: Relator ) {

    var listaEstudiante = mutableListOf<Estudiante>()
    val mensajeria = Mensajeria()

    constructor():this("", Relator())

    fun agregarEstudiante(estudiante: Estudiante) {
        listaEstudiante.add(estudiante)
        if (listaEstudiante.contains(estudiante)) {
            println(mensajeria.estudianteAgregado)
        } else {
            println(mensajeria.estudianteNoAgregado)
        }
    }

    fun listarEstudiantesCurso(){
        if(listaEstudiante.isEmpty()){
            println("No hay estudiantes")
        }else{
            listaEstudiante.forEach {
                estudiante->estudiante.estudianteSePresenta()}
            for (estudiante in listaEstudiante){
                estudiante.estudianteSePresenta()
            }
        }
    }
}