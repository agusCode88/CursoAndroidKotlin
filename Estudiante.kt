package com.example.aprendiendokotlin


/*

Kotlin nos permite utilizar la metodología de programación orientada a objetos.
Con la metodología de programación orientada a objetos (POO) se irán introduciendo conceptos de:
objeto, clase, propiedad, campo, método, constructor, herencia etc.

Prácticamente todos los lenguajes desarrollados en los últimos 25 años implementan la posibilidad
 de trabajar con POO (Programación Orientada a Objetos)



Objeto : Es una entidad independiente cons sus propios datos(caracteristicas) y programacion(metodos)

Clase :
Una Clase, o una Entidad , es una plantilla o molde, desde la cual vamos a
generar instancias u objetos dentro de nuestra aplicacion.
Debemos crear una clase antes de crear la instancia de un objeto`


Estructura de una clase

class NombreClase (constructor explicito){
   // Atributos de una clase
   // Metodos de una clase ( Comportamiento en POO)
   // Constructor implicito
}
 */

// Constructor explicito en la clase
class Estudiante (rut:String,nombre:String,edad:Int,telefono:String) {

    /*
    Atributos de una clase, son los datos de la entidad
     */
//    var rut: String = ""
//    var nombre: String = ""
//    var edad: Int = 0
//    var telefono: String = ""

    var rut: String = rut
    var nombre: String = nombre
    var edad: Int = edad
    var telefono: String = telefono


    /*
    Constructor implicito
     */
    constructor(): this ("","",0,"") {
        println("Entre al constructor")
    }

//    public Estudiante(String rut , String nombre, Int edad, String telefono){
//        this.rut = rut
//        this.nombre = nombre
//        this.edad = edad
//        this.telefono = telefono
//    }



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