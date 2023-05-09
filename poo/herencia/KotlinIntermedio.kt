package com.example.aprendiendokotlin.poo.herencia

import kotlin.properties.Delegates

fun main() {
    // Creación de una instancia de la clase Continente
    var continente: Continente = Continente()

// Llamada al método mostrarNombreContinente() de la instancia continente
    continente.mostrarNombreContinente()

// Creación de una instancia de la clase Circulo con el método estático areaCirculo() de la clase Continente
    var circulo = Continente.areaCirculo()

// Llamada al método calcularAreaCirculo() de la instancia circulo
    circulo.calcularAreaCirculo()

// Creación de dos instancias de la clase Pais con el constructor de clase interna de la clase Continente
    var paisChile = Continente.Pais("Chile", 20)
    var paisArgentina = Continente.Pais("Argentina", 35)

// Comparación de las instancias paisChile y paisArgentina y muestra de un mensaje en función del resultado
    if (paisChile.equals(paisArgentina)) {
        println("Son iguales")
    } else {
        println("No son iguales")
    }

// Creación de una nueva instancia de la clase Pais con el método copy() de paisChile y cambio del nombre a "Colombia"
    var paisColombia = paisChile.copy(nombre = "Colombia")

// Impresión de las instancias paisColombia, paisChile y paisArgentina mediante su método toString()
    println(paisColombia.toString())
    println(paisChile.toString())
    println(paisArgentina.toString())

// Creación de una nueva instancia de la clase Pais con el método copy() de paisChile y cambio del nombre a "Venezuela" y la población a 30
    var paisVenezuela = paisChile.copy(nombre = "Venezuela", poblacion = 30)

// Impresión de la instancia paisVenezuela mediante su método toString()
    println(paisVenezuela.toString())

// Declaración y asignación de variables usando la funcionalidad de "destructuring" en Kotlin para obtener el nombre y la población de la instancia paisChile
    val (nombre, poblacion) = paisChile

// Impresión del nombre y la población de la instancia paisChile
    println("El nombre del pais es $nombre y su poblacion es $poblacion")

// Llamada a la propiedad "name" de la clase interna "User" de la clase Continente
    Continente.User.name

// Impresión del nombre de la propiedad "name" de la clase interna "User" de la clase Continente
    println("Person's name is ${Continente.User.name}")

// Llamada al método "getUsersName()" de la clase interna "User" de la clase Continente
    Continente.User.getUsersName()

// Llamada al método estático "getInstance()" de la clase interna "ManagerDB" de la clase Continente
    Continente.ManagerDB.getInstance()


    // Se define una variable llamada "planet" que se asigna con el valor "Uranus" de la enumeración Continente.Planets
    var planet: Continente.Planets = Continente.Planets.Uranus

// Se define una variable llamada "jupitersName" que se le asigna el valor del nombre del planeta que se encuentra en la variable "planet"
    var jupitersName = planet.name

// Se muestra por pantalla el nombre del planeta almacenado en la variable "jupitersName" usando la interpolación de cadenas
    println("The planet name is: $jupitersName")

// Se define una variable "planets" que se le asigna un arreglo con todos los elementos de la enumeración Continente.Planets usando la función "values()"
    var planets:Array<Continente.Planets> = Continente.Planets.values()

// Se recorre el arreglo "planets" e imprime por pantalla cada elemento
    planets.forEach {
        println(it)}

// Se muestra por pantalla la posición del planeta Marte en la enumeración usando la propiedad "ordinal"
    println("Mars position: ${Continente.Planets.Mars.ordinal}")

// Se muestra por pantalla el nombre del planeta Marte en la enumeración usando la propiedad "name"
    println("Planets name: ${Continente.Planets.Mars.name}")

// Se utiliza la estructura de control "when" para mostrar por pantalla el nombre del planeta que está almacenado en la variable "planet"
    when(planet) {
        Continente.Planets.Mercury -> println("Planets name: ${Continente.Planets.Mercury.name}")
        Continente.Planets.Venus -> println("Planets name: ${Continente.Planets.Venus.name}")
        Continente.Planets.Earth -> println("Planet´s name: ${Continente.Planets.Earth.name}")
        Continente.Planets.Mars -> println("Planet´s name: ${Continente.Planets.Mars.name}")
        Continente.Planets.Jupiter -> println("Planet´s name: ${Continente.Planets.Jupiter.name}")
        Continente.Planets.Saturn -> println("Planet´s name: ${Continente.Planets.Saturn.name}")
        Continente.Planets.Uranus -> println("Planet´s name: ${Continente.Planets.Uranus.name}")
        Continente.Planets.Neptune -> println("Planet´s name: ${Continente.Planets.Neptune.name}")
        Continente.Planets.Pluto -> println("Planet´s name: ${Continente.Planets.Pluto.name}")
    }

// Se llama a la función "getPlanetsSizes" de la enumeración Continente.Planets, aunque en el código proporcionado no se muestra qué es lo que hace esta función
    Continente.Planets.getPlanetsSizes()

    var succededMessage = MessengerApp.succesedMessage("It was succed")

    class Continente() {
    lateinit var nombre: String //lateinit es para que no se inicialice el valor de la variable al momento de su

    // creación si no que se puede usar mas tarde y así no ocupar esa memoria.
    var pais by Delegates.notNull<String>()
    var region by Delegates.notNull<Int>()


    fun mostrarNombreContinente() {
        nombre = "America"
        println("El nombre del continente es: $nombre")
        pais = "Chile"
        println("El pais del continente es: $pais")
        region = 1
        println("La región del continente es: $region")

    }

    class areaCirculo() {
        val pi: Float by lazy {
            3.14f
        }
        var radio = 5
        fun calcularAreaCirculo() {

            var area = pi * radio * radio
            println("El area del circulo es: $area")

        }
    }

    class Computador : Any() {

        /*equals(other: Any?): Esta función determina si dos objetos son iguales. En este caso, la función simplemente llama
a la implementación de equals() de la clase base Any y devuelve el resultado. La clase base Any usa la comparación de
referencia por defecto, lo que significa que dos objetos son iguales solo si son la misma instancia.*/

        override fun equals(other: Any?): Boolean {
            return super.equals(other)
        }
        /*hashCode(): Esta función devuelve un número entero que representa el objeto. En este caso, la función simplemente
llama a la implementación de hashCode() de la clase base Any y devuelve el resultado. La implementación de hashCode()
de la clase base devuelve un valor basado en la referencia del objeto.*/

        override fun hashCode(): Int {
            return super.hashCode()
        }
        /*toString(): Esta función devuelve una representación en formato de cadena del objeto. En este caso, la función
simplemente llama a la implementación de toString() de la clase base Any y devuelve el resultado. La implementación
de toString() de la clase base devuelve una cadena que representa la clase y la referencia del objeto.*/

        override fun toString(): String {
            return super.toString()
        }

    }

    /* la clase data en la definición de la clase Pais. Cuando una clase se declara como data, automáticamente se generan
las funciones equals, hashCode y toString con una implementación que se basa en los valores de sus atributos, y no
en la referencia del objeto. */

    data class Pais(var nombre: String, var poblacion: Int)


    object User {
        var name: String = "Bianca"
        fun getUsersName() {

            println("The person's name is: $name")
        }

    }

    class ManagerDB private constructor() {
        companion object Client {
            private var instance: ManagerDB? = null
            var id: Int = -1

            fun getInstance() = synchronized(this) {
                if (instance == null) {
                    instance = ManagerDB()
                    instance
                }
            }
        }
    }

    interface Asteroid {
        fun isAsteroid()
    }

    interface BlackHole {
        fun itsAbsorbed(): Boolean
    }


    enum class Planets(val atmosphere: Int) : Asteroid, BlackHole {
        Mercury(22200) {
            override fun isAsteroid() {
                TODO("Not yet implemented")
            }

            override fun itsAbsorbed(): Boolean {
                TODO("Not yet implemented")
            }
        },
        Venus(12100) {
            override fun isAsteroid() {
                TODO("Not yet implemented")
            }

            override fun itsAbsorbed(): Boolean {
                TODO("Not yet implemented")
            }
        },
        Earth(6371) {
            override fun isAsteroid() {
                TODO("Not yet implemented")
            }

            override fun itsAbsorbed(): Boolean {
                TODO("Not yet implemented")
            }
        },
        Mars(3389) {
            override fun isAsteroid() {
                TODO("Not yet implemented")
            }

            override fun itsAbsorbed(): Boolean {
                TODO("Not yet implemented")
            }
        },
        Jupiter(69911) {
            override fun isAsteroid() {
                TODO("Not yet implemented")
            }

            override fun itsAbsorbed(): Boolean {
                TODO("Not yet implemented")
            }
        },
        Saturn(58232) {
            override fun isAsteroid() {
                TODO("Not yet implemented")
            }

            override fun itsAbsorbed(): Boolean {
                TODO("Not yet implemented")
            }
        },
        Uranus(25362) {
            override fun isAsteroid() {
                TODO("Not yet implemented")
            }

            override fun itsAbsorbed(): Boolean {
                TODO("Not yet implemented")
            }
        },
        Neptune(24622) {
            override fun isAsteroid() {
                TODO("Not yet implemented")
            }

            override fun itsAbsorbed(): Boolean {
                TODO("Not yet implemented")
            }
        },
        Pluto(11) {
            override fun isAsteroid() {
                TODO("Not yet implemented")
            }

            override fun itsAbsorbed(): Boolean {
                TODO("Not yet implemented")
            }
        };

        companion object {
            fun getPlanetsSizes() {
                println("The amount of planets is: ${values().size}")
            }
        }
    }

}
sealed class MessengerApp(val message:String){
    class SuccessMessage(message:String):MessengerApp(message)
    class ErrorMessage(message:String):MessengerApp(message)

    fun showClass(){
        println("This is the sent message: $message")
    }
}
fun getMessage(message:AppsMessenger):String{
    when(message){
        is MessengerApp.ErrorMessage -> message.showClass()
        is MessengerApp.SuccessMessage -> message.showClass()
    }
}