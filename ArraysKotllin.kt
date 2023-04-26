package com.example.aprendiendokotlin

fun main(){
    trabajandoConArrays()
}

fun trabajandoConArrays(){
    var nombrePersona1: String? = "Mokita"
    var nombrePersona2: String? = "Barbara"
    var nombrePersona3: String? = "Camilin"
    var nombrePersona4: String? = "Romina"
    var nombrePersona5: String? = "Rocio"
    var nombrePersona6: String? = null


    var family = arrayOf(nombrePersona1,nombrePersona2,nombrePersona3,nombrePersona4,nombrePersona5,nombrePersona6)
    var laRegalona: String? = family[0]
    var laMamaDeLaRegalona: String? = family[1]
    var elPapaDeLaRegalona: String? = family[2]
    var nulo: String? = family[5]


    println("La regalona de la casa es: $laRegalona 🐱❤️")
    println("La mamá de la regalona de la casa es: $laMamaDeLaRegalona 🐱❤️")
    println("El papá de la regalona de la casa es: $elPapaDeLaRegalona 🐱❤️")
    println("El nulo de la familia es: $nulo")


    var numeroEdades: IntArray = IntArray(5) {2}
    //println(numeroEdades[3])

    numeroEdades[0] = 1
    numeroEdades[1] = 2
    numeroEdades[2] = 3
    numeroEdades[3] = 4
    numeroEdades[4] = 5

    println("El inidice del arregle es: ${numeroEdades[2]}")


    var numeroEdades2: IntArray = IntArray(5) {x-> x*2}
    //println(numeroEdades[3])
    println(numeroEdades2[0])
    println(numeroEdades2[1])
    println(numeroEdades2[2])
    println(numeroEdades2[3])
    println(numeroEdades2[4])

    println("q es esto ${numeroEdades2[3]}")

    numeroEdades2[0]=15

    println(numeroEdades2[0])

}






