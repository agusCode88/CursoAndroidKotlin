package com.example.codigospractica.modelo

import com.example.codigospractica.MensajesError

class Estudiante : Persona {

    var porcentajeAsistencia= 0
    var notasArreglo = IntArray(0)


    constructor(porcentajeAsistencia:Int,nota1:IntArray,rut:String,nombre:String,edad:Int,tipoPersona:String)
            :super(rut,nombre,edad,tipoPersona){
    }

    //Funcion especial del estudiante
    fun mostrarDatosEstudiante(){
        println("Asistencia:${porcentajeAsistencia}")
        notasArreglo.forEach { it-> println("Nota $it") }

    }


    /*
    Encapsulacion , permite proteger nuestros datos
     */

}