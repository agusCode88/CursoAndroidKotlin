package com.example.codigospractica

/*
Principio de las clases

Las clases son publicas y final por defecto
que sea final la hace cerrada.

Si queremos que una clase pueda ser heredada, hay que abrirla con (open class xxx)


Estructura de una Clase:

declaracion clase (constructorPrimario) -> class NombreClase
atributos de una clase-> var nombre:String=""
init {
  println("permite inicializar cosas antes del constructur")
}
constructor secundario-> constructor() : this("")



Constructores : Una clase en Kotlin puede tener UN constructor primario y MUCHOS constructures secundarios

Constructor Primario o Explicito: se encuentra en la declaracion de la clase open class(constructor)
Secundario: Se encuentra adentro de la declaracion de la clase




 */


public final class Main2 {

    fun declaracionesDeClases(){

        class Persona
        class Persona2 constructor(val primerNombre:String)   // Con la palabra constructor
        class Persona3 (val primerNombre:String)   // Sin la palabra constructor
        class Persona4(val primerNombre:String, val apellido:String , var edad:Int) // Mutabilidad en Kotlin
        class Persona5(val primerNombre:String, val apellido:String , var edad:Int) {
            init {
                if(edad >= 18){
                    //HACER ALGO
                }
            }
        }// Uso de Init en Kotlin

        class Persona6(val primerNombre:String= "Agustin", val apellido:String="Romero" , var edad:Int=34){

            init {
                var nombrePersona=primerNombre
            }

        } // Seteo de valores por defeco en Kotlin


        /*
        Instancias de los objetos
         */
        val persona1 = Persona()
        //var persona5:Persona5 = Persona5("Hola","")

    }

}