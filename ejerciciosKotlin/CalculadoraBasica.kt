package com.example.aprendiendokotlin.ejerciciosKotlin

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
    val calculadora = CalculadoraBasica()
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
}