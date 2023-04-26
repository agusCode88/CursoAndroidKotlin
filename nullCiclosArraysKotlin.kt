package com.example.aprendiendokotlin
/* Nulabilidad del kotlin

Safe-Navegation Operator
En primer lugar, tenemos el SNO, tambien conocido como operadorde navegacion segura.
Es una forma que nos provee Kotlin para poder usar variables nulas en nuestra app y, del mismo modo,
poder acceder a las propiedades que estas contienen
"?".
Se utiliza el operador elvis ?: para verificar si la variable "nombre" es nula.
si es nula, imprime el mensaje por pantalla, de lo contrario, se imprime el valor de la variable.
 */
fun main(){

  //  nulabilidadEnKotlinEjemplo()
    trabajandoConArrays()

}

//Null
fun nulabilidadEnKotlinEjemplo(){
    var nombrePersona : String? = null
    nombrePersona = "Exito"
    println(nombrePersona?.length)

    println("El tamaño del String es ${nombrePersona?.length ?: "NULO, OJITO!!, pero no se cae!!"}") // se le agrega ? antes del punto lenght cuando comento arriba en nombrePersona = String

    println("Very Sure esto no es Nulo ${nombrePersona!!.length}")


    //Esta condicional es lo mismo a la linea de arriba
    if(nombrePersona==null){
        println("Ojo sigue siendo Nulo")
    }else{
        println(nombrePersona.length)
    }
}

//Arrays en Kotlin
/*
En kotlin, los Arrays son una estructura de datos que permite trabajar con una gran cantidad de datos
Para crear un arreglo se utiliza arrayOf() y se especifican los valores entre parentesis
val numeros = arrayOf(1,2,3,4,5)

los valores del array pueden ser de cualquier tipo, como numeros, cadenas de texto, objetos, etc.
para acceder a un valor especifico del array, se utilizan el indice del valor entre []
en kotlin los indices empiezan en el indice  0 el segundo elemento tiene indice 1 y asi sucesivamente
indice de un array : 0....n
tamaño de un array : 1....n

ademas de la funcion arrayOf(), existen otras formas de crear arreglos en kotlin, como:
array(size) -> Crea un arreglo vacio con la longitud especificada
array(size, init)->Crea un arreglo con la longitud especificada y los valores inicializados con la funcion "init"
array(size){lambda}-> Crea un arreglo con la long. especificada y los valores generados por la funcion "lambda"
 */

fun trabajandoConArrays(){

    var nombrePersona1 : String? = "María Magdalena"
    var nombrePersona2 : String? = "Pedro"
    var nombrePersona3 : String? = "María"
    var nombrePersona4 : String? = "José"
    var nombrePersona5 : String? = "Jesús"

    var familiaBiblia = arrayOf(nombrePersona1, nombrePersona2, nombrePersona3, nombrePersona4, nombrePersona5)
    var elHijoDeDios: String? = familiaBiblia[4]
    var elApostolDelHijoDeDios: String? = familiaBiblia[1]
    println("El hijo de Dios es: $elHijoDeDios")
    println("El apostol de Jesús es: $elApostolDelHijoDeDios")

    /*
    Segunda forma de setear un array
     */

  /*  var numeroEdades: IntArray = IntArray(5) //{5}//cinco veces 5, llenar el array con cinco

    numeroEdades[0] = 1
    numeroEdades[1] = 2
    numeroEdades[2] = 3
    numeroEdades[3] = 4
    numeroEdades[4] = 5
   // numeroEdades[5] = 6  // se cae, porque el tamaño del arreglo es 5, faltan indices

    println(numeroEdades[5])
*/
/*
tercera forma de declararlo
 */
   var numeroEdades2: IntArray = IntArray(5) {i->i*2}
   // val numeroEdades2: IntArray = intArrayOf(1, 2, 3, 4, 5)

    println(numeroEdades2[3])

}

