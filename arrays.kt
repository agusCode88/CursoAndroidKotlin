package com.example.aprendiendokotlin

//arrays en kotlin son colecciones de datos que pueden ser de diferentes tipos, por ejemplo,
// un array puede contener numeros, cadenas de texto, objetos, etc.
//los arrays en kotlin son inmutables, es decir, que no se pueden modificar una vez se han
// creado, para modificar un array se debe crear uno nuevo.
//los arrays en kotlin se pueden crear de dos formas, la primera es con la palabra
// reservada arrayOf y la segunda es con la palabra reservada arrayofNulls
// arrayOf: se utiliza para crear un array de datos que no sean nulos, es decir, que
// no se puedan modificar una vez se han creado
// arrayOfNulls: se utiliza para crear un array de datos que sean nulos, es decir, que
// se puedan modificar una vez se han creado
// para crear un array se debe especificar el tipo de dato que va a contener el array
// y luego se debe especificar el numero de elementos que va a tener el array
// ejemplo: var arrayNumeros: Array<Int> = arrayOf(1, 2, 3, 4, 5)
// ejemplo: var arrayNumeros: Array<Int> = arrayOfNulls<Int>(5)

// para acceder a un elemento de un array se debe especificar el indice del elemento
// ejemplo: var arrayNumeros: Array<Int> = arrayOf(1, 2, 3, 4, 5)
// ejemplo: var arrayNumeros: Array<Int> = arrayOfNulls<Int>(5)
// println(arrayNumeros[0])
// println(arrayNumeros[1])
// println(arrayNumeros[2])
// println(arrayNumeros[3])
// println(arrayNumeros[4])


fun main(){


}

fun trabajandoConArrays(){

    var nombrePersona1: String = "Juan"
    var nombrePersona2: String = "Pedro"
    var nombrePersona3: String = "Maria"
    var nombrePersona4: String = "Luis"
    var nombrePersona5: String = "Ana"
    var nombrePersona6: String = "Carlos"
    var nombrePersona7: String = "Sandra"
    var nombrePersona8: String = "Jorge"
    var nombrePersona9: String = "Andres"

    var familiaBiblia: Array<String> = arrayOf(nombrePersona1, nombrePersona2, nombrePersona3, nombrePersona4, nombrePersona5, nombrePersona6, nombrePersona7, nombrePersona8, nombrePersona9)
}