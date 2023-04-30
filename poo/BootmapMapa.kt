package com.example.codigospractica.modelo

import com.example.codigospractica.MensajesError

class BootmapMapa() {

    var listaEstudiantesMapa = mutableMapOf<String, Persona>()
    var mensajeria = MensajesError()

    fun agregarPersonasAlMapa(persona: Persona){
        listaEstudiantesMapa.put(persona.nombre,persona)
        mensajeria.estudianteAgregado(persona)
    }

    fun mostrarListadoPersonaMapa(){
        mensajeria.tituloMapaDatosEstudiante()
        listaEstudiantesMapa.forEach { (key,value)->
            println("${key}: ${value.mostraDatosPersonales()}")
        }
    }
    fun eliminarDelListadoPersonasMapas(persona: Persona){
        listaEstudiantesMapa.remove(persona.nombre)
    }

    fun actualizarPersonaMapa(persona: Persona){
        listaEstudiantesMapa.put(persona.nombre,persona)
    }


}