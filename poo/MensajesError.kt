package com.example.codigospractica

import com.example.codigospractica.modelo.Persona

class MensajesError(persona: Persona) {

    var personaNoAgregada:String = "No se ha podido ingresar el registro"
    var listadoVacio = "Listado vacio"
    var tituloListado = "Listado del curso : "
    var personaNoEncontrada = " ${persona.nombre} no ha esta en el listado"
    var personaEliminada = "${persona.nombre}  eliminad@ del listado"
    var tituloListadoMapa= "Mapa de Datos del curso :"


    constructor() : this (Persona())

    fun estudianteAgregado(persona: Persona){
        var personaAgregada = "${persona.nombre} se ha agregado  al curso"
        println(personaAgregada)
    }
    fun tituloMapaDatosEstudiante(){
        println(tituloListadoMapa)
    }

}