package com.example.aprendiendokotlin.poo

fun main(){

    /*var perro = Perro("Negro","Labrador")
    var gato = Gato("Blanco","Tigre")
    var gato2 = Gato("Amarillo","Puma",10)
    println(gato2.colorGato)
*/

    var persona = Persona("Paolo","Espinola",35,56)

    var alumno = Alumno("Paolo","Espinola",65)

    var relator = Relator("Agustin","Romero",1000000 )

    persona.saludar()
    alumno.saludar()
    relator.saludar()


}

open class Animal(var color:String){

    init {
        println("Init , datos del Animal : Color ${color} ")
    }

}

class Perro(color:String ,var raza:String): Animal(color) {

    init {
        println("Init , datos del Perro : Color ${color} - Raza ${raza}")
    }

}

class Gato(color: String, var razaGato:String): Animal(color) {

    var colorGato = ""
    init {
        println("Init , datos del Gato : Color ${color} - Raza ${razaGato}")
    }

  constructor(color:String ,razaGato:String, edadGato:Int) : this(color,razaGato){
      super.color

      this.colorGato = color
  }

}


// private -> Solo visible dentro la clase
// protected ->Solo visible  denttro de la clase y sus sub-clases (herencia). Es un private un poco mas flexible
// public -> visible dentre de la clase , sus subclases y desxe afuera
open class Persona(var nombre:String,val apellido: String ){

    private var id:Int = 0
    protected var edad:Int = 0

    constructor(nombre: String,apellido: String,edad:Int, promedioNotas: Int) : this(nombre, apellido){
        this.edad = edad
    }


    open fun saludar(){
         println("La persona esta saludando")

    }


}


class Alumno(nombre: String,apellido: String,promedioNotas:Int):Persona(nombre,apellido){

    protected  var promedioNotas=promedioNotas

    init {
       probandoAccesos()
    }



    override fun saludar(){
        super.saludar()
        println("Estudiante esta saludando")
    }

    fun promedioNotas(){
        println("Promedio de notas : $promedioNotas")
    }

    fun probandoAccesos(){

        println("Init Estudiante")
        println(this.nombre)
        println(this.apellido)
        println(this.edad)
        println(this.promedioNotas)

    }

}

class Relator(nombre: String, apellido:String , sueldo:Int) :Persona (nombre, apellido){

   protected var sueldo=sueldo


   init {
       probandoAccesos()
   }
    

    override fun saludar(){
        super.saludar()
        println("Relator esta saludando")
    }

    fun mostrarSueldo(){
        println("Sueldo relator(a): ${this.sueldo}")

    }

    fun probandoAccesos(){

        println("Init Relator(a)")
        println(this.nombre)
        println(this.apellido)
        println(this.edad)
        println(this.sueldo)

    }


}