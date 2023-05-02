package com.example.aprendiendokotlin.TareaPOO

import com.example.codigospractica.modelo.Estudiante
import com.example.codigospractica.modelo.Persona

class Curso {

    var nombreCurso: String
        get() = field.capitalize()
        set(value) {
            field = value.capitalize()
        }

    var cantidadEstudiantes: Int
        get() = field.toInt()
        set(value) {
            field = value.toInt()
        }

    var listaEstudiantes = mutableMapOf<String,Alumno>()
    var estudianteEncontrado:Alumno? = Alumno()

    constructor(nombreCurso: String, cantidadEstudiantes: Int) {
        this.nombreCurso = nombreCurso
        this.cantidadEstudiantes = cantidadEstudiantes

    }

    constructor() : this ("",0){
    }

    fun agregarEstudiante(estudiante :Alumno) {
        listaEstudiantes.put(estudiante.rutAlumno,estudiante)
        cantidadEstudiantes++
        println("Estudiante agregado correctamente.")
    }

    fun mostrarEstudiantesCurso() {
        for((key,value) in listaEstudiantes){
            println("${value.mostrarDatosEstudiante()}")
        }
    }

    fun buscarEstudiantePorRut(rutPersona:String):Alumno?{

       val encontrado = listaEstudiantes.contains(rutPersona)

        if(encontrado){
             estudianteEncontrado= listaEstudiantes.get(rutPersona)!!

        } else{
            println("Estudiante no se encuentra en la lista")
            estudianteEncontrado = null
        }

        return estudianteEncontrado

    }


    fun buscarEstudiantePorNombre(nombrePersona:String):Alumno?{

        val encontrado = listaEstudiantes.contains(nombrePersona)
        var estudianteEncontrado:Alumno = Alumno()
        if(encontrado){
            estudianteEncontrado = listaEstudiantes.get(nombrePersona)!!
            estudianteEncontrado.mostrarDatosEstudiante()
        }

        return estudianteEncontrado
    }


    fun actualizarEstudiantePorNombreORut(nombreOrut:String){

        if (nombreOrut.contains("-")) {
            estudianteEncontrado=buscarEstudiantePorRut(nombreOrut)
        } else {
            estudianteEncontrado=buscarEstudiantePorNombre(nombreOrut)
        }
        if (estudianteEncontrado != null) {

            println("Ingrese la nueva edad del estudiante (o dejar en blanco para no modificar):")
            val nuevaEdad = readLine()
            if (!nuevaEdad.isNullOrEmpty()) {
                estudianteEncontrado!!.edad = nuevaEdad.toInt()
                println("Ingrese las nuevas notas del estudiante (o dejar en blanco para no modificar):")
                val nuevasNotas = readLine()
                if (!nuevasNotas.isNullOrEmpty()) {
                    for (i in 0 until nuevasNotas.length) {
                        println("Ingrese la nota ${i + 1}:")
                        estudianteEncontrado!!.notasAlumno[i] = readLine()?.toInt() ?: continue
                    }
                }
                /*   println("Ingrese la nueva asistencia del estudiante (o dejar en blanco para no modificar):")
                   val nuevaAsistencia = readLine()
                   if (!nuevaAsistencia.isNullOrEmpty()) {
                       estudiante.asistencia = nuevaAsistencia.toInt()
                   }*/
                println("Estudiante actualizado exitosamente.")
            }

        } else {
            println("No se encontró el estudiante.")
        }

    }
}