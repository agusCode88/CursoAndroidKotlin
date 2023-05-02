package com.example.aprendiendokotlin.TareaPOO

class Alumno (
    val nombreAlumno:String,
    val apellidoAlumno:String,
    val rutAlumno:String ,
    var edad:Int,
    var notasAlumno:IntArray ) {

  init {
      val nombreAlumno = nombreAlumno
      val apellido = apellidoAlumno
      val rutAlumno = rutAlumno
      var asisteClase:Int = edad
      var notasAlumno = notasAlumno
  }

   constructor() : this ("","","",0,IntArray(0))

    fun mostrarDatosEstudiante(){

        println("Nombre:${nombreAlumno}")
        println("Apellido:${apellidoAlumno}")
        println("Rut:${rutAlumno}")
        println("Edad:${edad}")
        println("Notas: ${notasAlumno.joinToString()}")

    }

}