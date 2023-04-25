package com.example.aprendiendokotlin


fun main (){
    //recorrerListaDeStrings()
    //practicaFor()
    pedirUnaListaDeObjetosPorPantalla()
}

fun cicloForBasicoEnKotlin(){
    for (i in 0..5) {
        println(i)
    }

}

fun practicaFor(){

    var arregloDeStrings = arrayOf("Nombre 1","Nombre 2","Nombre 3","Nombre 4","Nombre 5")

    for (nombre in arregloDeStrings) {
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

fun adivinarUnNumero (){
    val numeroAleatorio = (1..100).random()
    var adivinado = false

    while (!adivinado) {
        print("Adivina el número entre 1 y 100: ")
        val respuesta = readLine()?.toIntOrNull()
        if (respuesta == null) {
            println("No ingresaste un número válido")
        } else if (respuesta < numeroAleatorio) {
            println("El número es mayor")
        } else if (respuesta > numeroAleatorio) {
            println("El número es menor")
        } else {
            println("¡Adivinaste!")
            adivinado = true
        }
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



/*
Cree un programa en Kotlin que pregunte por pantalla la cantidad de elementos que tendrá el arreglo.
Capture el dato de entrada y setee un arreglo de enteros del tamaño ingresado por el usuario.
Una vez que haya creado el arreglo e indicado la cantidad de elementos , proceda a llenar
el arreglo con numeros por pantalla agragando cada elemento segun la cantidad que ingresó .

Una vez que ya tenga con contenido el arreglo, crear 3 funcionalidades de este programa:

1)Mostrar el contenido del arreglo en orden inverso
2)Imprimir el contenido del arreglo en orden normal
3) Sumar los elemntos del arreglo y mostrar el resultado por pantalla


Ayudas:

    //Pedir por pantalla
    var tamanioArray= readLine()!!.toInt()

   // Pedir por pantalla n veces
    for(i in array.indices){
        println("Ingrese el elemento ${i+1}")
        array[i]= readLine()!!.toInt()
    }


 */
fun pedirUnaListaDeObjetosPorPantalla(){

    var tamanioArray: Int? = null
    println("Ingresa el tamanio de tu arreglo:")
    try {
        tamanioArray = readLine()?.toInt()

    }catch (e: NumberFormatException){
        println("El valor ingresado no es un número válido")
        println(tamanioArray?:"Vuelve a ingresar un número")
        tamanioArray = readLine()?.toInt()
    }

    // Declarar un array de tamanio 5 en kotlin
    //var arregloNumeros = arrayOf(1,2,3,4,5)

    // Crea y asigna un tamanio al array declarado
    var array= IntArray(tamanioArray!!)

    // Funcion especial de kotlin , va directamente a ver los indices y el elemento que está contenido
    for(i in array.indices){
        println("Ingrese el elemento ${i+1}")
        array[i]= readLine()!!.toInt()
    }

    // iMPRIMIR LOS ELEMENTOS EN ORDEN NORMAL

    for (i in array.indices){
        print("El elemento es : ${array[i]}")
    }

    //Imprimir los elementos en orden inverso
    for (i in array.size -1 downTo 0){
        print("El elemento es : ${array[i]}")
    }

    // Calcular la suma de los elementos
    var suma=0
    for (elemento in array){
         suma = suma + elemento
    }

     println("El valor de la suma de los elementos de la lista es $suma")

}


