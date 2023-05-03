package POO.Clase2

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

    var lanzador = Main2POO()
    lanzador.usoConstructorPrimario()
}


public final class Main2POO {

    fun usoConstructorPrimario(){

        class Persona // Casi 1 sin nada

        var persona = Persona()

        class Persona2 constructor( var nombrePersona:String) // Caso2 : Con la palabra constructor

        var persona2 = Persona2("Maria")
        persona2.nombrePersona = "Agustin"

        class Persona3(var nombrePersona:String) // Caso 3: Con propiedades en el constructor , distitno a parametro

        // Mutabilidad en Kotlin
        class Persona4(val nombrePersona:String,val apellidoPersona:String,val rutPersona:String,var edadPersona:Int,var descripcionPersona:String)

        var persona4 = Persona4("Agustin","Romero","1-1",34,"haciendo clases")

        persona4.edadPersona= 40
        persona4.descripcionPersona= ""

        class Persona5(val nombrePersona:String,val apellidoPersona:String,val rutPersona:String,var edadPersona:Int,var descripcionPersona:String){

            init {
                println("Estoy en el init")
                if(edadPersona > 18){
                    println("Es  mayor de edad")
                }
            }

        }

        var persona5 = Persona5("Agustin","Romero","1-1",34,"haciendo clases")


        // Valores por defecto , accediendo a un objeto dentro de la clase
        class Persona6(val nombrePersona:String= "Agustin",val apellidoPersona:String="Romero",
                       val rutPersona:String="16.990.510-K",var edadPersona:Int=34,
                       var descripcionPersona:String="descripcion"){

            var persona5 = Persona5("Agustin","Romero","1-1",34,"haciendo clases")
            var nombreCopia: String = ""

            init {
                nombreCopia = persona5.nombrePersona
                println("Ejemplo : $nombreCopia" )

            }
        }

        var persona6 = Persona6("Agustin","Romero","1-1",34,"haciendo clases")
        var persona6_1 = Persona6()
        persona6.nombrePersona

        var persona6_2 = Persona6("Agus")
        var persona6_3 = Persona6(edadPersona=30)
        var persona6_4 = Persona6(apellidoPersona = "Salazar", descripcionPersona = "Descripcion3")


    }
    fun usoDeConstructoresSecundarios(){
        class Persona7(val primerNombre:String , val apellido:String , var edad:Int){

            init {

            }

            constructor() : this ("","",0)

        }

        var persona7 = Persona7()
        var persona7_1 = Persona7("Agus","Romero",34)


        class Persona8 {

            init {

            }

            constructor (nombrePersona:String,apellidoPersona:String,edadPersona:Int)

        }


        var persona8 = Persona8("Maria","Maria",25)


    }

    fun gettersYsettersEnKotlin(){

        class Persona9(var nombrePersona:String)
        var persona9 = Persona9("Agustin")
        persona9.nombrePersona // Este es un get
        persona9.nombrePersona = "ana".capitalize() // Este es un Set
        println(persona9.nombrePersona)


        class Persona10{

            var nombrePersona = "curso"
                get() = field.capitalize()
                set(value) {
                    value.capitalize()
                }

            init {


            }

            constructor(nombre:String){

                nombrePersona = nombre
            }

        }





    }


}