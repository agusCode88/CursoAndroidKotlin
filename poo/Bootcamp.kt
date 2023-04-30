package com.example.codigospractica.modelo

import com.example.codigospractica.MensajesError


/*
POO La importancia de la orientacion a objetos.

Concretar la realidad que percibimos en un programa de computacion.

Cualquier cosa que percibimos es un objeto

Se abre la imaginacion

Existen los lenguajes para que tod@s hablemos el mismo idioma.

La POO , es un paradigma , un estilo, un comun acuerdo de como programar objetos en informatica.
 */
class Bootcamp(nombreCurso: String) {

    var nombreCurso = nombreCurso
    var listaPersonas = mutableListOf<Persona>()
    var listaPersona2: MutableList<Persona> = mutableListOf()
    var mensajes: MensajesError = MensajesError()

    fun agregarPersona(persona: Persona) {

        listaPersonas.add(persona)
        mensajes.estudianteAgregado(persona)
        if (listaPersonas.isEmpty()) {
            mensajes.personaNoAgregada
        }
    }

    fun mostrarListadoEstudiantes() {

        var mensajes: MensajesError = MensajesError()
        if (listaPersonas.isEmpty()) {
            mensajes.listadoVacio
        } else {
            listaPersonas.forEach { persona ->
                persona.mostraDatosPersonales()
            }
        }
    }

    fun eliminarDelListado(nombrePersona: String) {

        var personaEncontrada = listaPersonas.find { it -> (it.nombre == nombrePersona) }
        if (personaEncontrada != null) {
            listaPersonas.remove(personaEncontrada)
            mensajes.personaEliminada
        }

    }

    fun verDatosDeEstudiante(persona: Persona) {

        var estudianteEncontrado = listaPersonas.find { it.nombre == persona.nombre }
        if (estudianteEncontrado != null) {
            estudianteEncontrado.mostraDatosPersonales()
        } else {
            mensajes.personaNoEncontrada
        }
    }

    fun actualizarDatosDelEstudiante(persona: Persona, nombreActualizado:String){

        var estudianteEncontrado = listaPersonas.find { it.nombre == persona.nombre }
        if (estudianteEncontrado != null) {
            persona.nombre = nombreActualizado
        } else {
            mensajes.personaNoEncontrada
        }

    }

}