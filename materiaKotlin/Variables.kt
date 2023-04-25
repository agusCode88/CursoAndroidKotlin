package com.example.aprendiendokotlin.materiaKotlin

var resultado = 0
var resultadoFloat: Float = 0f
var resultadoDouble: Double = 0.0

fun main(argumento: Array<String>) {

    aprendiendoVariablesEnKotlin()
    llamadoAlasFunciones()

    /*
    Variable del tipo boolean. Puede ser solo verdadera o falsa.
     */
    val booleanEjemplo: Boolean = true

}

fun llamadoAlasFunciones(){

    resultado = devolviendoUnEnteroEnKotlin()
    println("Este es el resultado de la funcion suma sin parametros $resultado")
    resultado = recibiendoParametrosEnteros(30, 40)
    println("Este es el resultado de la funcion suma con parametros $resultado")
    println("+++++++++++++++++++++++Suma de Long con Int ++++++")
    sumandoLongsYEnteros()
    println("+++++++++++++++++++++++Suma de Floats ++++++")
    resultadoFloat = sumandoVariablesFloat(4.2f, 5.4f)
    println("Este es el resultado de la funcion suma con Float $resultadoFloat")
    println("+++++++++++++++++++++++Suma de Doubbles ++++++")
    resultadoDouble = sumandoVariablesDouble(45.66666666,677676767.67)
    println("Este es el resultado de la funcion suma con Double $resultadoFloat")

}

fun aprendiendoVariablesEnKotlin() {

    println("¡Bienvenid@ a la primera clase de programacion en Kotlin y Android!")
    println("Por favor, introduce tu nombre o tu nick:")
    val nombre = readLine() ?: "Nick"
    println("¡Hola, $nombre!")

    println("Las variables son lo más importante cuando programamos, ya que en ellas se almacenan o capturan los datos y toda aplicación funciona con datos.")
    println("Podemos utilizar variables numéricas y alfanuméricas, así como variables booleanas.")
    println("Las variables tipo val son inmutables, es decir, no cambian en el tiempo, mientras que las variables tipo var son mutables, lo que significa que pueden cambiar de valor mientras se ejecuta la aplicación.")

    println("Funciones en Kotlin\n")

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

/*
   VARIABLES NUMERICAS
 */
/*
Variable del tipo Int
 */
fun devolviendoUnEnteroEnKotlin(): Int {

    // Kotlin es un lenguaje inteligente
    var cantidadAlumnos = 4
    var sumaCantidad: Int = 0
    sumaCantidad = cantidadAlumnos + sumaCantidad
    println("El resultado de la suma de ejemplo es: $sumaCantidad")
    return sumaCantidad
}

/*
       Variable de tipo Long
       Un long es mas grande que es Int , ocupa mas memoria
       como variable ,utilizarlo para numero grandes
    */

fun sumandoLongsYEnteros() {

    var edadTotalCurso: Long = 3000000000000000000
    var edadPersona: Int = 20
    var totalSuma = edadTotalCurso + edadPersona
    println("La suma de un Long con un entero es: $totalSuma")

}

/* Otra forma de utilizar la funcion

 */
fun recibiendoParametrosEnteros(a: Int, b: Int) = a + b

/*
   Float, son variables que aceptan decimales.
   Acepta hasta 6 decimales como numero
    */

fun sumandoVariablesFloat(a: Float, b: Float): Float {
    val floatEjemplo: Float = 4.5f
    return a + b
}


/* Doubles
Muy similares a los float pero soportan mas cantidad de
decimales , hasta 14 , eso si , ocupara mas memoria
 */
fun sumandoVariablesDouble(a: Double, b: Double): Double {
    val doubleEjemplo: Double = 400.333333333333
    return a + b
}

/*
  VARIABLES ALFANUMERICAS
   */
/*
Variable del tipo Char
Soportan un solo caracter, y este puede ser lo que sea.
Es una variable muy muy pequenia
 */

fun concatenarChar(): String {

    var caracterEjemplo = 'c'
    var caracterEjemplo2 = '@'
    return "Esta es la concatenacion de 2 chars: $caracterEjemplo$caracterEjemplo2"

}

/*
Variable del tipo String
Es la que mas utilizamos cuando programamos,
soporta lo que sea.
*/
fun concatenarString(nombrePersona1: String , nombrePersona2:String) : String{

    var concatenacion: String = nombrePersona1 + nombrePersona2
    return concatenacion

}