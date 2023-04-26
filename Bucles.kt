package com.example.aprendiendokotlin


fun main (){
    //recorrerListaDeStrings()
    //practicaFor()
    cicloForBasicoEnKotlin()

}

fun cicloForBasicoEnKotlin(){
    for (i in 0..5) {
        println(i)
    }

    // Recorre de 1 a n pero no toma en cuenta el ultimo valor
    for(i in 0 until 5){
        println(i)
    }

    for(i in 1..10 step 2){
        println(i)
    }

    for (i in 10 downTo 0 step 2){
        println(i)
    }

    var ranGoValoresArray:IntRange = (0..20)

}

fun practicaFor(){

    var arregloDeStrings = arrayOf("Nombre 1","Nombre 2","Nombre 3","Nombre 4","Nombre 5")

    for (nombre:String in arregloDeStrings) {
        println("El nombre es : $nombre")
        //println("El indice es ${arregloDeStrings.indices}")
    }

    for (i in arregloDeStrings.indices ){

        var valor= arregloDeStrings[i]
        println("Indice $i Valor: $valor")
    }

    for ((indice,nombre) in arregloDeStrings.withIndex()){
        println("$indice: $nombre")

    }
    //Imprimir los elementos en orden inverso
    for (i in arregloDeStrings.size -1 downTo 0){
        print("El elemento es : ${arregloDeStrings[i]}")
    }

}



fun primerWhileDeEjemplo(valor : Int){

    var i = 0
    while (i <= valor){
        println("El valor es : $i")
        i++
    }
    println("Fuera del ciclo ")
}

fun imprimirNumerosPares(){

    var i = 0
    while (i <= 10) {
        if (i % 2 == 0) {
            println(i)
        }
        i++
    }

}
fun doWhileEnKotlin(){
    var i = 1
    do {
        println(i)
        i++
    } while (i <= 5)
    println("Fuera del ciclo Do While")
}

fun numeroEntreUnoYDiez(){
    var numero: Int
    do {
        println("Ingresa un número entre 1 y 10:")
        numero = readLine()!!.toInt()
    } while (numero < 1 || numero > 10)
    println("El número ingresado es: $numero")
}





