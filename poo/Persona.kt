package com.example.codigospractica.modelo

open class Persona (rut:String ,nombre:String,edad:Int,tipoPersona:String) {

    //Caracteristicas de una persona
    var rut: String = rut
    var nombre:String = nombre
    var edad: Int= edad
    var tipoPersona : String = tipoPersona

    constructor() : this ("","",0,"")

    // Comportamientos de una persona

    //Metodo global para todas las clases hijas
    fun mostraDatosPersonales(){
        println("Nombre persona: $nombre")
        println("Edad persona: $edad")
        println("Rut: $rut")
        println("$tipoPersona")

    }
}