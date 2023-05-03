package com.example.codigospractica

import com.example.codigospractica.modelo.Persona

/*
Principio de las clases

Las clases son publicas y final por defecto
que sea final la hace que no pueda ser heredada

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

fun main(){

    var lanzador = Main2()
   // lanzador.usoConstructorPrimario()

/*    var perro = Perro()
    perro.color= "negro"
    perro.edad = 10
    perro.razaPerro="Siberiano"
    perro.ladrar()
    perro.comer()

    var gato = Gato()
    gato.color="Blanco"
    gato.edad= 2
    gato.maullar()
    gato.comer()

    var animal = Animal()
    animal.edad=1
    animal.color="Verde"
    animal.comer()

    var perro2 = Perro()
    perro2.comer()

    var gato2 = Gato()
    gato2.comer()*/

    var perro3 = Perro()
    perro3.comer()
    println(perro3.color)

    var gato3 = Gato()
    gato3.comer()
    println(gato3.color)

}
public final class Main2 {

    /*
    Clase 8 de POO ****************************************************************************************************
     */
    fun usoConstructorPrimario(){

        class Persona
        class Persona2 constructor(val primerNombre:String)   // Con la palabra constructor
        class Persona3 (val primerNombre:String)   // Sin la palabra constructor
        class Persona4(val primerNombre:String, val apellido:String , var edad:Int) // Mutabilidad en Kotlin
        class Persona5(val primerNombre:String, val apellido:String , var edad:Int) {
            init {
                if(edad >= 18){
                    println("La persona es mayor de edad ")
                }
            }
        }// Uso de Init en Kotlin. El init  es lo primero que se ejecuta cuando se instancia una clase

        class Persona6(val primerNombre:String= "Agustin", val apellido:String="Romero" , var edad:Int=34){

            var persona5 = Persona5(primerNombre,apellido,34)
            var nombrePersona = ""

            init {
                this.nombrePersona=persona5.primerNombre
                println(nombrePersona)
            }

        } // Seteo de valores por defeco en Kotlin


        /*
        Instancias de los objetos
         */
        val persona1 = Persona()
        val persona2:Persona2 =Persona2("Agustin")
        val persona3:Persona3 =Persona3("Agustin")
        val persona4:Persona4 =Persona4("Agustin","Romero",34)
        val persona5:Persona5 =Persona5("Roberto","Perez",30)
        val persona6_1:Persona6 =Persona6("Roberto","Perez",28)
        val persona6_2:Persona6 =Persona6("Roberto")
        val persona6_3:Persona6 =Persona6()
        val persona6_4:Persona6 =Persona6(edad=30)

    }
    fun usoConstructorSecundario(){
        class Persona7(primerNombre:String , apellido:String , edad:Int) {
            init{
                // Aqui si podemos trabajar con los atrinutos manteniendo el constrcutor secundario
            }
            constructor(): this ("","",0)
        }

        class Persona8 {
            init {

            }
            constructor(primerNombre:String, apellido:String, edad:Int) // No permite el uso de valores en este constructor
        }

        val persona7:Persona7 =Persona7 ()
        val persona7_1:Persona7 = Persona7("Agustin","Romero",37)
        val persona8:Persona8 = Persona8("Maria","Juana",45)

    }
    fun diferenciaDeUsosConstructores(){
        class Persona1(primerNombre:String) // No puedo acceder al valor primernOmbre
        class Persona2(var primerNombre:String)// Puedo acceder a la variable y cambiar su valor
        class Persona3(val primerNombre:String) // Puedo acceder al parametro pero no cambiar su valor


        var p1 = Persona1("Agustin")
        //p1.nombre error

        var p2 = Persona2("Agustin")
        p2.primerNombre = "Pedro"

        val p3 = Persona3("Agustin")
        p3.primerNombre
        //p3.primerNombre = "Hola" No puedo porque es val


    }
    fun usoDeGettersYsettersEnKotlin(){

        class Persona1 (var primerNombre:String)

        var p1 = Persona1("agustin")
        p1.primerNombre // Esto es un equivalente a un get de Java
        p1.primerNombre = "Alejandro" // Esto es un equivalente a un set en Java
        println(p1.primerNombre) // get el nombre en mayúscula: "Juan"

        class Persona2{

            var primerNombre:String
                get()=field.capitalize()
                set(value) {
                    field= value.capitalize()
                }

            constructor(primerNombre:String,segundoNombre:String){
                this.primerNombre = primerNombre

            }

        }

    }
   /*
   **********************************************************************************************
    */
    fun herenciaEnKotlin(){

        open class Persona1(var nombrePersona:String)
        open class Persona2(open var nombrePersona:String)
        open class Persona3(var nombrePersona:String)

       // Las porpiedades de la clase hija no se pueden llamar igual que las de la clase padre , las hereda
       // class PersonaNueva(var nombrePersona:String): Persona1(nombrePersona)
        class PersonaNueva2(override var nombrePersona:String) : Persona2(nombrePersona) // Es necesario que la clase padre tenga open el atributo y que la clase hija utilice el overrride

    }

}

open class ModificadoresAccesso{

    // private -> Solo visible dentro la clase
    // protected ->Solo visible  denttro de la clase y sus suv-clases (herencia). Es un private un poco mas flexible
    // public -> visible dentre de la clase , sus subclases y desxe afuera

    public val propiedad1 ="Propiedad publica que viene por defecto en Kotlin" // Es reduncante en una clase que ya es public
    protected  val propiedad2 = "Propiedad 2 que marque como protegida" // No tiene sentido utilizarlo en una clase cerrada, es igual a que sea privado
    private val propiedad3 = "Propiedad que marque como privada"

    public fun probandoAccesos(){

        val testAccesos = ModificadoresAccesso()
        testAccesos.propiedad1 // No hay problema porque es publica
        testAccesos.propiedad2 // ¿ Por que me está dejando si es privada? -> Mismo contexto de la clase
        testAccesos.propiedad3 // Idem a 2

        testAccesos.propiedad1 // Este es de la instancia
        this.propiedad1 // Este es el de la clase
       // propiedad1 // Se puede omitir el this , pero sirve cuando vienen parametros para poder identificarlas

    }

}

class ModificadoresAccesoHijo : ModificadoresAccesso(){
    private fun probandoAccesos2(){
        super.probandoAccesos()
        propiedad1 // Puedo acceder a esta propiedad , es publica
        this.propiedad1
        this.propiedad2 // Puedo aceder porque es protected , la clase pade e hijas pueden acceder a ellas pero nada de afuera
        //this.propiedad3 // No puedo porque es privada , solo la clase padre puede contenerla
    }

}

class ClaseCualquiera {

    private fun probandoAccesos(){

        val acceso = ModificadoresAccesso()
        acceso.propiedad1 // Puedo porque es publica

    }
}


open class Animal{
    open var color:String = "Blanco"
    open fun comer(){
        println("Animal Come")
    }

}

class Perro:Animal(){

    override var color:String = "Negro"
    fun ladrar(){
        println("Ladrar")
    }
    override fun comer(){
        super.comer()
        println("Perro Come")
    }
}
class Gato:Animal(){

    override var color:String = "Amarillo"
    fun maullar(){
        println("Maullar")
    }

    override fun comer(){
        super.comer()
        println(" Gato Come")
    }

}