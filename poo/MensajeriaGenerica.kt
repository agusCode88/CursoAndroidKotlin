package com.example.codigospractica

import com.example.codigospractica.modelo.Persona

data class MensajeriaGenerica(var persona: Persona) {

    var personaNoAgregada:String = "No se ha podido ingresar el registro"
    var listadoVacio = "Listado vacio"
    var tituloListado = "Listado del curso : "
    var personaNoEncontrada = " ${persona.nombre} no ha esta en el listado"
    var personaEliminada = "${persona.nombre}  eliminad@ del listado"
    var personaAgregada = " ${persona.nombre} se ha agregado la persona al curso"

    constructor(): this(Persona())
}