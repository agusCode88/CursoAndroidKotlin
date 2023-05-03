package com.example.aprendiendokotlin.oopKotlin

import kotlin.math.E

fun main(){

    var estudiante1 = Estudiante("Martin", "18234332-5", 30, "12/04/1993")

estudiante1.mostrarDatos()

    var estudiante2 = Estudiante("Sergio", "16488233-0",36, "21/03/1987")

    estudiante2.mostrarDatos()

    val message = Message()
    val addStudent = Curso("android", 101)

    addStudent.addStudent(estudiante1)
    println(message.estudianteAgragado)

}

