package com.example.aprendiendokotlin.Tareas

class CalculadoraBasica {
    // Función para realizar la suma
    // Otro comentario

    fun sumar(num1: Double, num2: Double): Double {
        return num1 + num2
    }

    // Función para realizar la resta
    fun restar(num1: Double, num2: Double): Double {
        return num1 - num2
    }

    // Función para realizar la multiplicación
    fun multiplicar(num1: Double, num2: Double): Double {
        return num1 * num2
    }

    // Función para realizar la división
    fun dividir(num1: Double, num2: Double): Double {
        return num1 / num2
    }
}

fun main() {
    //nuestroPrimerWhile(100)
    trabajoconListasKotlin()
} /*val calculadora = CalculadoraBasica()
    var num1: Double
    var num2: Double
    var resultado: Double

    println("Calculadora básica en Kotlin")
    println("Ingrese el primer número:")
    num1 = readLine()!!.toDouble()
    println("Ingrese el segundo número:")
    num2 = readLine()!!.toDouble()

    resultado = calculadora.sumar(num1, num2)
    println("El resultado de la suma es: $resultado")

    resultado = calculadora.restar(num1, num2)
    println("El resultado de la resta es: $resultado")

    resultado = calculadora.multiplicar(num1, num2)
    println("El resultado de la multiplicación es: $resultado")

    resultado = calculadora.dividir(num1, num2)
    println("El resultado de la división es: $resultado")
}*/

fun nuestroPrimerWhile(valor:Int) {
    var i = 3
    while (i <= 10) {
        println(i)
        i ++
    }
    println("Se salio del while")
}


fun trabajoconListasKotlin() {

    var ListadeNombres = arrayListOf<String>()

    var nombrePersona : String =  "María"
    var nombrePersona2 : String = "José"
    var nombrePersona3 : String = "Jesús"
    var nombrePersona4 : String = "Pepe"
    var nombrePersona5 : String = "Papo"
    var nombrePersona6 : String = "Pipo"

    ListadeNombres.add(nombrePersona)
    ListadeNombres.add(nombrePersona2)
    ListadeNombres.add(nombrePersona3)
    ListadeNombres.add(nombrePersona4)
    ListadeNombres.add(nombrePersona5)
    ListadeNombres.add(nombrePersona6)
println(ListadeNombres)

    for (i in ListadeNombres) {
        println(i)
    }

ListadeNombres.addAll(listOf("Nombre 7", "Nombre 8"))
for (i in ListadeNombres) {
    println(i)
}
 var nombreObtenido:String = ListadeNombres[2]
    println(nombreObtenido)
}


