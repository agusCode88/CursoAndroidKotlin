package com.example.aprendiendokotlin.poo

fun main(){

    /*var perro = Perro("Negro","Labrador")
    var gato = Gato("Blanco","Tigre")
    var gato2 = Gato("Amarillo","Puma",10)
    println(gato2.colorGato)
*/

    /*var persona = Persona("Paolo","Espinola",35,56)

    var alumno = Alumno("Paolo","Espinola",65)

    var relator = Relator("Agustin","Romero",1000000 )

    persona.saludar()
    alumno.saludar()
    relator.saludar()*/

  /*  var view= View()
    var boton = Button("Login","center")
    var bordes = BorderButton("Registrase","center",40)

    view.pintar()
    boton.pintar()
    bordes.pintar()*/

    val mensajeExito = Mensajeria.Exito("Se ha realizado la accion")
    val mensajeError = Mensajeria.Error("Ha fallado la accion")
    getMensajeria(mensajeError)




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


/*


HERENCIA EN KOTLIN


 */

// private -> Solo visible dentro la clase
// protected ->Solo visible  denttro de la clase y sus sub-clases (herencia). Es un private un poco mas flexible
// public -> visible dentre de la clase , sus subclases y desxe afuera
open class Persona(val nombre:String,val apellido: String ){

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


open  class View {
    open fun pintar(){
        println("Pintando en la vista")
    }
}

open class Button(val texto:String , val posicion:String):View(){

    override fun pintar(){
        println("Dibujando el boton")
        super.pintar()

    }

}

class BorderButton(texto:String,posicion: String,bordes:Int):Button(texto,posicion){

    override fun pintar() {
        println("Dibujando los bordes del boton")
        super.pintar()
    }
}






/*


Una clase sellada (o sealed class) permite representar jerarquías restringidas en las que un objeto sólo puede ser de un tipo de las dadas.

Es decir, tenemos un clase con un número específico de subclases. Lo que obtenemos al final es un concepto muy similar al de un enumerado.
La diferencia radica en que en los enumerados sólo tenemos un único objeto por tipo,
 mientras que en las sealed classes podemos tener varios objetos de la misma clase.

3.3. Ventajas de las clases selladas
Las ventajas frente a los enumerados vienen dadas por lo que ya hemos comentado,
que es el hecho de que los elementos sean clases (class, data class, object e incluso sealed class):

La más importante es que cada subclase puede tener sus propios valores y sus propios métodos,
a diferencia de los enumerados, cuyos elementos siguen todos la misma estructura.
Además, los enumerados solamente pueden tener una instancia, mientras que las subclases de clases selladas
 pueden tener varias instancias, cada una con su estado, o una si la definimos como object.

 */


fun getMensajeria(mensajeria:Mensajeria){

    when(mensajeria){

        is Mensajeria.Error -> mensajeria.mostrarMensajeria()
        is Mensajeria.Exito -> mensajeria.mostrarMensajeria()
    }

}


sealed class Mensajeria(val mensaje:String){
    class Exito(mensaje:String):Mensajeria(mensaje)
    class Error(mensaje:String):Mensajeria(mensaje)

    fun mostrarMensajeria(){
        println("Mensajeria : $mensaje")
    }

}