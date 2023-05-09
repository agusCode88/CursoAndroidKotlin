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

    // Creación de una nueva instancia de la clase Pais con el método copy() de paisChile y cambio del nombre a "Venezuela"
    // y la población a 30
    var paisVenezuela = paisChile.copy(nombre = "Venezuela", poblacion = 30)

    // Impresión de la instancia paisVenezuela mediante su método toString()
    println(paisVenezuela.toString())

    // Declaración y asignación de variables usando la funcionalidad de "destructuring" en Kotlin para obtener el nombre y
    // la población de la instancia paisChile
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

    // Se define una variable "planets" que se le asigna un arreglo con todos los elementos de la enumeración Continente.
    // Planets usando la función "values()"
    var planets: Array<Continente.Planets> = Continente.Planets.values()

    // Se recorre el arreglo "planets" e imprime por pantalla cada elemento
    planets.forEach {
        println(it)
    }

    // Se muestra por pantalla la posición del planeta Marte en la enumeración usando la propiedad "ordinal"
    println("Mars position: ${Continente.Planets.Mars.ordinal}")

    // Se muestra por pantalla el nombre del planeta Marte en la enumeración usando la propiedad "name"
    println("Planets name: ${Continente.Planets.Mars.name}")

    // Se utiliza la estructura de control "when" para mostrar por pantalla el nombre del planeta que está almacenado en la
    // variable "planet"
    when (planet) {
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

    // Se llama a la función "getPlanetsSizes" de la enumeración Continente.Planets, aunque en el código proporcionado no se
    // muestra qué es lo que hace esta función
    Continente.Planets.getPlanetsSizes()

    var succededMessage = Continente.MessengerApp.SuccessMessage("It succed")
    var failedMessage = Continente.MessengerApp.ErrorMessage("It failed")

    failedMessage.showClass()
    succededMessage.showClass()

}

class Continente() {
    lateinit var nombre: String // El modificador 'lateinit' indica que esta variable no se inicializará en el momento
    // de su creación sino en un momento posterior.

    var pais by Delegates.notNull<String>() // Este modificador 'by Delegates.notNull' establece que la variable no

    // puede ser nula, por lo que debe ser inicializada antes de ser usada.
    var region by Delegates.notNull<Int>() // Al igual que la variable anterior, esta también usa el modificador 'by
    // Delegates.notNull' para evitar que la variable sea nula.

    fun mostrarNombreContinente() { // Esta función simplemente asigna valores a las variables anteriores y los imprime
        // por pantalla.
        nombre = "America"
        println("El nombre del continente es: $nombre")
        pais = "Chile"
        println("El pais del continente es: $pais")
        region = 1
        println("La región del continente es: $region")
    }

    class areaCirculo() {
        val pi: Float by lazy {
            3.14f // En este caso, 'lazy' es un modificador que indica que el valor se calculará la primera vez que se
            // accede a la variable y luego se almacenará en caché para futuras llamadas.
        }
        var radio = 5 // Esta variable simplemente almacena el radio del círculo.

        fun calcularAreaCirculo() {
            var area = pi * radio * radio // Calcula el área del círculo y lo almacena en la variable 'area'.
            println("El area del circulo es: $area") // Imprime el resultado por pantalla.
        }
    }

    class Computador :
        Any() {// Esta clase se extiende desde 'Any', lo que significa que hereda todos los métodos de 'Any'.


        /*equals(other: Any?): Esta función determina si dos objetos son iguales. En este caso, la función simplemente llama
a la implementación de equals() de la clase base Any y devuelve el resultado. La clase base Any usa la comparación de
referencia por defecto, lo que significa que dos objetos son iguales solo si son la misma instancia.*/

        override fun equals(other: Any?): Boolean {// Sobreescribe el método 'equals' para determinar si dos objetos son iguales.
            return super.equals(other)// En este caso, simplemente llama a la implementación de 'equals' de la clase base 'Any'.

        }
        /*hashCode(): Esta función devuelve un número entero que representa el objeto. En este caso, la función simplemente
llama a la implementación de hashCode() de la clase base Any y devuelve el resultado. La implementación de hashCode()
de la clase base devuelve un valor basado en la referencia del objeto.*/

        override fun hashCode(): Int { // Sobreescribe el método 'hashCode' para devolver un número entero que representa el objeto.
            return super.hashCode() // En este caso, simplemente llama a la implementación de 'hashCode' de la clase base 'Any'.

        }
        /*toString(): Esta función devuelve una representación en formato de cadena del objeto. En este caso, la función
simplemente llama a la implementación de toString() de la clase base Any y devuelve el resultado. La implementación
de toString() de la clase base devuelve una cadena que representa la clase y la referencia del objeto.*/

        override fun toString(): String { // Sobreescribe el método 'toString' para devolver una representación en formato de cadena del objeto.
            return super.toString()  // En este caso, simplemente llama a la implementación de 'toString' de la clase base 'Any'.

        }

    }

    /* la clase data en la definición de la clase Pais. Cuando una clase se declara como data, automáticamente se generan
las funciones equals, hashCode y toString con una implementación que se basa en los valores de sus atributos, y no
en la referencia del objeto. */

    data class Pais(
        var nombre: String,
        var poblacion: Int
    )  // Esta es una clase de datos que se utiliza para representar un país. El modificador 'data' indica que se generan
    // automáticamente las funciones 'equals', 'hashCode' y 'toString' para la clase.


    object User {// Este es un objeto singleton que representa a un usuario.

        var name: String = "Bianca" // Esta variable simplemente almacena el nombre del usuario.

        fun getUsersName() {// Esta función imprime el nombre del usuario por pantalla.


            println("The person's name is: $name")
        }

    }


    // Clase ManagerDB con patrón Singleton que permite crear una única instancia de la base de datos.

    class ManagerDB private constructor() { // Se define la clase ManagerDB con constructor privado.
        companion object Client { // Se define la clase anidada Companion Object Client.

            private var instance: ManagerDB? = null // Se declara una variable privada instance que puede ser nula.
            var id: Int = -1 // Se declara una variable pública id de tipo entero que se inicializa en -1.

            fun getInstance() =
                synchronized(this) { // Se define una función pública getInstance que devuelve la instancia de ManagerDB.
                    if (instance == null) { // Si la instancia no ha sido creada todavía.
                        instance = ManagerDB() // Se crea la instancia.
                        instance // Se devuelve la instancia creada.
                    }
                }
        }
    }

    // Interfaces Asteroid y BlackHole que definen los métodos que deben implementar las clases que los implementan.

    interface Asteroid {
        fun isAsteroid() // Se define la función isAsteroid sin implementación.
    }

    interface BlackHole {
        fun itsAbsorbed(): Boolean // Se define la función itsAbsorbed que devuelve un valor booleano sin implementación.
    }

    // Enumerado Planets que implementa las interfaces Asteroid y BlackHole.

    enum class Planets(val atmosphere: Int) : Asteroid,
        BlackHole { // Se define el enumerado Planets que implementa las interfaces Asteroid y BlackHole.
        Mercury(22200) { // Cada valor enum se define con su valor y su cuerpo.
            override fun isAsteroid() { // Se implementa la función isAsteroid.
                TODO("Not yet implemented") // Se deja sin implementar.
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
            // La función getPlanetsSizes() muestra la cantidad de planetas con el mensaje en la consola.
            fun getPlanetsSizes() {
                println("The amount of planets is: ${values().size}")
            }

        }
    }

    // Se define una clase sellada llamada MessengerApp, que tiene dos subclases: SuccessMessage y ErrorMessage.
    // Cada subclase tiene un mensaje que puede ser una cadena de caracteres.
    // La función showClass() imprime en la consola el mensaje enviado en la subclase.
    // La función getMessage() toma un objeto MessengerApp como parámetro y devuelve el mensaje del objeto.
    sealed class MessengerApp(val message: String) {
        class SuccessMessage(message: String) : MessengerApp(message)
        class ErrorMessage(message: String) : MessengerApp(message)

        /*
        La siguiente función muestra el mensaje que se recibe como parámetro.
        */
        fun showClass() {
            println("This is the sent message: $message")
        }

        /*
        La siguiente función recibe un objeto de la clase MessengerApp y devuelve el mensaje que contiene.
        */
        fun getMessage(message: MessengerApp): String {
            // Con la estructura de control when, se evalúa el tipo de mensaje que se ha recibido
            when (message) {
                // Si es un ErrorMessage, se llama a la función showClass del objeto message
                is MessengerApp.ErrorMessage -> message.showClass()
                // Si es un SuccessMessage, también se llama a la función showClass del objeto message
                is MessengerApp.SuccessMessage -> message.showClass()
            }
            // Se devuelve el mensaje que contiene el objeto message
            return message.message
        }
    }
}
