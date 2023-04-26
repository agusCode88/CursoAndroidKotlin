package com.example.aprendiendokotlin

/*
Arrays en Kotlin
En Kotlin, los arreglos (o arrays) son una estructura de datos que permite almacenar varios valores del mismo tipo en una única variable.
Los arreglos son muy útiles para trabajar con grandes cantidades de datos de manera organizada y eficiente.

Para crear un arreglo en Kotlin, se utiliza la función arrayOf() y se especifican los valores del arreglo entre paréntesis.
Por ejemplo:

val numeros = arrayOf(1, 2, 3, 4, 5)c

 Los valores del arreglo pueden ser de cualquier tipo, como números, cadenas de texto, objetos, etc.

 Para acceder a un valor específico del arreglo, se utiliza el índice del valor entre corchetes.
 En Kotlin, los índices comienzan en cero, es decir, el primer elemento del arreglo tiene índice cero,
 el segundo tiene índice uno, y así sucesivamente

 indice de un array : 0 .. n
 tamaño de un array : 1 .. n

 Además de la función arrayOf(), existen otras formas de crear arreglos en Kotlin, como por ejemplo:

Array(size) -> Crea un arreglo vacío con la longitud especificada.
Array(size, init) -> Crea un arreglo con la longitud especificada y los valores inicializados con la función "init".
Array(size) { lambda } -> Crea un arreglo con la longitud especificada y los valores generados por la función "lambda".

 */

fun main(){
    trabajandoConArrays()
}

fun trabajandoConArrays(){

    var nombrePersona1 : String? = "Maria Magdalena"
    var nombrePersona2 : String? = "Pedro"
    var nombrePersona3 : String? = "Maria"
    var nombrePersona4 : String? = "Jose"
    var nombrePersona5 : String? = "Jesus"

    /*
    Declaracion de array 1
     */
    var familiaBiblia = arrayOf(nombrePersona1,nombrePersona2,nombrePersona3,nombrePersona4,nombrePersona5)
    var elHijoDeDios: String? = familiaBiblia[4]
    println("El hijo de Dios es : $elHijoDeDios")

    /*
    Segunda forma de setear un array
     */
     var numeroEdades: IntArray = IntArray(5)
      numeroEdades[0] = 1
      numeroEdades[1] = 2
      numeroEdades[2] = 3
      numeroEdades[3] = 4
      numeroEdades[4] = 5

    println(numeroEdades[4])

    var numeroEdades2: IntArray = IntArray(5) {i-> i* 3}
    println(numeroEdades2[0])
    numeroEdades2[0]=15

}