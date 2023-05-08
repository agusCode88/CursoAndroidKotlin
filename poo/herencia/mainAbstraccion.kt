package poo.herencia

fun main(){

    var notas:IntArray = intArrayOf(30,45,55)
   // var persona = Persona("Generica","Ejemplo","12-1",40)
    var estudiante = Estudiante("Luciano","Alarcone","1-1",33,notas,75)
    var profesor = Docente("Oscar","Gonzalez","12-1",40,3000000,2)

   // persona.mostrarDatos()

    estudiante.despertar()
    estudiante.respirar()
    estudiante.caminar()
    estudiante.comer()
    estudiante.mostrarDatos()

    profesor.despertar()
    profesor.respirar()
    profesor.caminar()
    profesor.comer()
    profesor.mostrarDatos()

}

/*
Las interfaces te permiten definir tipos cuyos comportamientos pueden ser compartidos por varias clases que no están relacionadas,
 con el fin de crear instancias se adopten a un dominio específico.

 Es como firmar un contrato , al firmarlo , la clase esta obligada a cumplir con
 todas las clausulas del contrato . Estas clausulas son funcionalidades independientes que
 pueden ser uilizadas por la clase , lo que le da mayor capacidad de adpatacion a las clases
 creadas y que pueda utlizar metodos que no tengan realcion con el tipo de clase que es
 pero que le pueden ser utiles.
 */


interface eventListener2{

    fun caminar()
    fun respirar(){
        println("Esta respirando con la interfaz 2")
    }
}


interface eventListener{

    fun dormir()
    fun despertar()
    fun respirar(){
        println("Esta respirando con la interfaz 1")
    }

}

/*
Clases Abtractas
Pueden ser declaradas abstractos: las clases , los atributos y los metodos de las clases.

Con las clases abtractas no se crean instancias del objeto

Es como tener superclases disponibles en el codigo que pueden hacer metodos
de utilidad en algun momento de la aplicacion sin la necesidad de darle datos
y crear un ojeto.

Los metodos de una clase Abstracta no llevan cuerpo, solo es la declaracion que en algun
momento del programa alguien va a invocar para implementar.
Y Ese alguien es la clase interna o hija de la abstracta quien tiene que implenetarlos,
si no lo hace Kotlin arroja error y no permite compilar.


 */

abstract class Persona(open var nombre:String,open var apellido:String,
                open val rut:String,open var edad:Int){

    abstract var id:Int
    abstract fun comer()

    open fun mostrarDatos(){
        println("Datos de la persona \n" +
                "Nombre:$nombre \n" +
                "Apellido:$apellido \n" +
                "Edad: $edad")
    }

    fun mostrarEdad(){
        println("Esta es la edad de la persona $edad")
    }

}

class Estudiante(
    override var nombre:String, override var apellido:String,
    override val rut:String, override var edad:Int,
    _notas:IntArray, _asistencia:Int)
    :Persona(nombre, apellido, rut, edad),eventListener,eventListener2{

    var notas:IntArray = _notas
    var asistencia:Int = _asistencia

     private fun calcularPromedio():Double= notas.average()

    override var id: Int
        get() = TODO("Not yet implemented")
        set(value) {}

    override fun comer() {
        println("Estudiante $nombre esta comiendo")
    }


    override fun mostrarDatos(){
        super.mostrarDatos()
        println("Notas Estudiante : \n" +
                "Notas: ${this.notas.toList()}\n" +
                "Asistencia: ${this.asistencia}")
    }

    override fun dormir() {
        println("Estudiante $nombre esta durmiendo")
    }

    override fun despertar() {
        println("Estudiante $nombre se ha despertado")
    }

    override fun caminar() {
        println("Estudiante $nombre esta caminando")
    }

    override fun respirar() {

        println("Estudiante $nombre esta respirando")
        super<eventListener>.respirar()
        super<eventListener2>.respirar()
    }


}

class Docente(nombre:String, apellido:String,
              rut:String, edad:Int, sueldo:Long, override var id: Int
):Persona(nombre, apellido, rut, edad),eventListener,eventListener2{

    var sueldo:Long = sueldo

    override fun comer() {
        println("Docente $nombre esta comiendo")
    }


    override fun mostrarDatos(){
          super.mostrarDatos()
          println("Datos Profesor: \n" +
                  "Sueldo: ${sueldo}")
      }

    override fun dormir() {
        println("Profesor $nombre esta durmiendo")
    }

    override fun despertar() {
        println("Profesor $nombre se ha despertado")
    }

    override fun respirar() {
        println("Profesor $nombre esta respirando")
    }

    override fun caminar() {
        println("Profesor $nombre esta caminando")
    }

}

