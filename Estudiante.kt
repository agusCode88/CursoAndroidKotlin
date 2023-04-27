package com.example.aprendiendokotlin


/*
Una Clase, o una Entidad , es una plantilla desde la cual vamos a
generar instancias u objetos dentro de nuestras

Estructura de una clase

class NombreClase {

   // Atributos de una clase
   // Metodos de una clase ( Comportamiento en POO)

}

 */

class Estudiante {

    /*
    Atributos de una clase, son los datos de la entidad
     */
    var rut: String = ""
    var nombre: String = ""
    var edad: Int = 0
    var telefono: String = ""

    //Metodos de una clase
    fun estudiar(){
        println("Estudiante esta estudiando Kotlin")
    }
    fun movilizarse(){
        println("estudiante se esta movilizando a clases")
    }
    fun irACoffeBreak(){
        println("estudiante se fue a cofee break")
    }
    fun imprimirDatosEstudiante(){
        var informacion = "Rut: $rut \n Nombre: $nombre \n Edad: $edad \n Telefono: $telefono"
        println(informacion)
    }

}