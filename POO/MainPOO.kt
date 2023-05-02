package com.example.aprendiendokotlin.POO


fun main() {

    var curso = CursoAndroid("Curso de Android", Relator())

    var moises = Estudiante("18.593.077-7", "Moises", 28, "08/08/1994")
    var miguel = Estudiante("11.111.111-1", "Miguel", 28, "08/08/1994")
    var sergio = Estudiante("18.593.077-7", "Sergio", 28, "08/08/1994")


    moises.estudianteSePresenta()
    moises.estudianteAsiste()
    moises.estudianteHabla()


    miguel.estudianteSePresenta()
    miguel.estudianteCome()
    miguel.estudianteEstudia()


    curso.agregarEstudiante(sergio)
}