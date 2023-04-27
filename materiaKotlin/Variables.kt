package com.example.aprendiendokotlin.materiaKotlin

// se declaran tres variables: una de tipo Int, otra de tipo Float y otra de tipo Double
var resultado = 0
var resultadoFloat: Float = 0f
var resultadoDouble: Double = 0.0

// se define la función main, que se ejecuta cuando se inicia el programa
fun main(argumento: Array<String>) {

    // se llama a la función aprendiendoVariablesEnKotlin() y llamadoAlasFunciones()
    aprendiendoVariablesEnKotlin()
    llamadoAlasFunciones()

    val booleanEjemplo: Boolean = true

}

// se define la función llamadoAlasFunciones()
fun llamadoAlasFunciones() {

    // se llama a la función devolviendoUnEnteroEnKotlin(), se le asigna su resultado a la variable resultado y se imprime
    resultado = devolviendoUnEnteroEnKotlin()
    println("Este es el resultado de la funcion suma sin parametros $resultado")

    // se llama a la función recibiendoParametrosEnteros() con los valores 30 y 40, se le asigna su resultado a la variable resultado y se imprime
    resultado = recibiendoParametrosEnteros(30, 40)
    println("Este es el resultado de la funcion suma con parametros $resultado")

    // se llama a la función sumandoLongsYEnteros() y se imprime un mensaje
    println("+++++++++++++++++++++++Suma de Long con Int ++++++")
    sumandoLongsYEnteros()

    // se llama a la función sumandoVariablesFloat() con los valores 4.2f y 5.4f, se le asigna su resultado a la variable resultadoFloat y se imprime
    println("+++++++++++++++++++++++Suma de Floats ++++++")
    resultadoFloat = sumandoVariablesFloat(4.2f, 5.4f)
    println("Este es el resultado de la funcion suma con Float $resultadoFloat")

    // se llama a la función sumandoVariablesDouble() con los valores 45.66666666 y 677676767.67, se le asigna su resultado a la variable resultadoDouble y se imprime
    println("+++++++++++++++++++++++Suma de Doubbles ++++++")
    resultadoDouble = sumandoVariablesDouble(45.66666666, 677676767.67)
    println("Este es el resultado de la funcion suma con Double $resultadoFloat")

}

// Definición de la función principal
fun aprendiendoVariablesEnKotlin() {

    // Imprime mensajes de bienvenida y solicita el nombre del usuario
    println("¡Bienvenid@ a la primera clase de programacion en Kotlin y Android!")
    println("Por favor, introduce tu nombre o tu nick:")
    val nombre = readLine() ?: "Nick"
    println("¡Hola, $nombre!")

    // Describe la importancia de las variables y sus tipos
    println("Las variables son lo más importante cuando programamos, ya que en ellas se almacenan o capturan los datos y toda aplicación funciona con datos.")
    println("Podemos utilizar variables numéricas y alfanuméricas, así como variables booleanas.")
    println("Las variables tipo val son inmutables, es decir, no cambian en el tiempo, mientras que las variables tipo var son mutables, lo que significa que pueden cambiar de valor mientras se ejecuta la aplicación.")

    // Introduce el tema de funciones en Kotlin
    println("Funciones en Kotlin\n")

    // Describe las funciones en general
    val descripcion = """
    Las funciones son imprescindibles en Kotlin, ya que sirven como contenedores de código. 
    Si no se utilizaran funciones, el código estaría en un solo archivo con miles de líneas de código 
    de forma secuencial, lo cual no tiene sentido. 

    Dentro de una función se coloca la lógica y los datos de nuestra aplicación. 
    Las funciones pueden tener sus propias variables locales y pueden utilizar las variables globales.

    Hay distintas formas de declarar una función en Kotlin.
     """.trimIndent()

    println(descripcion)
    println("**************************************************************")
    println("Se correran funciones de ejemplos segun la primera clase")
}

/* VARIABLES NUMÉRICAS */

/*
Esta función devuelve un entero, utilizando variables del tipo Int
*/
fun devolviendoUnEnteroEnKotlin(): Int {

    // Se inicializa una variable del tipo Int
    var cantidadAlumnos = 4
    var sumaCantidad: Int = 0

    // Se suma la variable cantidadAlumnos a la variable sumaCantidad
    sumaCantidad = cantidadAlumnos + sumaCantidad
    println("El resultado de la suma de ejemplo es: $sumaCantidad")

    // Se devuelve la variable sumaCantidad
    return sumaCantidad
}

/*
Esta función suma un valor del tipo Long y un valor del tipo Int
*/
fun sumandoLongsYEnteros() {

    // Se inicializan variables del tipo Long e Int
    var edadTotalCurso: Long = 3000000000000000000
    var edadPersona: Int = 20

    // Se realiza la suma y se imprime el resultado
    var totalSuma = edadTotalCurso + edadPersona
    println("La suma de un Long con un entero es: $totalSuma")
}

// La siguiente función recibe dos parámetros enteros y devuelve su suma
fun recibiendoParametrosEnteros(a: Int, b: Int) = a + b

// La siguiente función recibe dos parámetros flotantes y devuelve su suma
fun sumandoVariablesFloat(a: Float, b: Float): Float {
    val floatEjemplo: Float = 4.5f // Se define una variable de tipo Float llamada "floatEjemplo" con valor 4.5f
    return a + b
}

// La siguiente función recibe dos parámetros dobles y devuelve su suma
fun sumandoVariablesDouble(a: Double, b: Double): Double {
    val doubleEjemplo: Double =
        400.333333333333 // Se define una variable de tipo Double llamada "doubleEjemplo" con valor 400.333333333333
    return a + b
}

// La siguiente función concatena dos caracteres y devuelve el resultado como un string
fun concatenarChar(): String {
    var caracterEjemplo = 'c' // Se define una variable de tipo Char llamada "caracterEjemplo" con valor 'c'
    var caracterEjemplo2 = '@' // Se define una variable de tipo Char llamada "caracterEjemplo2" con valor '@'
    return "Esta es la concatenacion de 2 chars: $caracterEjemplo$caracterEjemplo2" // Se devuelve el string resultante de concatenar los dos caracteres
}


// La siguiente función concatena dos strings y devuelve el resultado como un string
fun concatenarString(nombrePersona1: String, nombrePersona2: String): String {
    var concatenacion: String =
        nombrePersona1 + nombrePersona2 // Se define una variable de tipo String llamada "concatenacion" que resulta de concatenar los dos strings recibidos como parámetro
    return concatenacion // Se devuelve el resultado de la concatenación
}

// Nota: Cabe mencionar que en todas las funciones anteriores se utiliza la sintaxis simplificada para retornar un valor, la cual consiste en omitir la palabra clave "return"y colocar la expresión que se desea retornar después del signo igual.
