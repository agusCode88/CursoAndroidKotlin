package com.example.aprendiendokotlin.ClaseKotlin3

fun main (){

    trabajandoConArrays()

}

fun trabajandoConArrays(){

    var nombrePersona1:String? = "Maria Magdalena"
    var nombrePersona2:String? = "Pedro"
    var nombrePersona3:String? = "Maria"
    var nombrePersona4:String? = "Jose"
    var nombrePersona5:String? = "Yisus CRaist"

    var familiaBiblica = arrayOf(nombrePersona1, nombrePersona2, nombrePersona3, nombrePersona4, nombrePersona5)

    var elHijoDeDios:String? = familiaBiblica[4]

   // println("El hijo de dios es: $elHijoDeDios")


    var numeroEdades: IntArray = IntArray(5){5}

    //println(numeroEdades[3])


    var numeroEdades2: IntArray = IntArray(5)

    numeroEdades2[0] = 1
    numeroEdades2[1] = 2
    numeroEdades2[2] = 3
    numeroEdades2[3] = 4
    numeroEdades2[4] = 5

    //println(numeroEdades2[3])

    var numeroEdades3: IntArray = IntArray(5) {i -> i*2}
   // println(numeroEdades3[0])

    var numeroEdades4: IntArray = intArrayOf(1,2,3,4,5,6)
    println(numeroEdades4[3])

}
