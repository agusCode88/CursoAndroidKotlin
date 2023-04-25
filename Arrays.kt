package com.example.aprendiendokotlin

fun main(){
    loBasicoDeArrays()
}


/*
Arrays en Kotlin
En Kotlin, los arreglos (o arrays) son una estructura de datos que permite almacenar varios valores del mismo tipo en una única variable.
Los arreglos son muy útiles para trabajar con grandes cantidades de datos de manera organizada y eficiente.
Para crear un arreglo en Kotlin, se utiliza la función arrayOf() y se especifican los valores del arreglo entre paréntesis.
Por ejemplo:

val numeros = arrayOf(1, 2, 3, 4, 5)

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

fun loBasicoDeArrays(){

    var nombre1: String? = "Pedro"
    var nombre2: String? = "Claudio"
    var nombre3: String? = "Andrea"

    var arrayNombres = arrayOf(nombre1,nombre2,nombre3)

    var nombreObtenido: String? = arrayNombres[2]
    println(nombreObtenido)


    //se crea un arreglo llamado "numeros" con una longitud de 5 elementos y se inicializa cada elemento con el valor 5
    val numerosEnArray = Array(5) { 5 }
    println("Esta es el elemento 2 del indice 1 ${numerosEnArray[1]}")

    //Con la función Array(size, init)
    val numeros = Array(3){i -> i*2}
    println("Esta es la posisicon 2 de los indices ${numeros[2]}")

    // Con la funcion IntArray
    //se crea un arreglo llamado "numeros" con una longitud de 5 elementos y se inicializa cada elemento
    // con el valor por defecto para el tipo de dato Int (que es 0)
    val numerosEnteros = IntArray(5)

    // Podemos asiganr un valor a la posicion del array
    numerosEnteros[0]= 15

    // Tamaños de un Array
    if(numerosEnteros.size <= 5){
        println(numerosEnteros[0])

    } else {
        println("No hay valores en el Array")
    }


}
