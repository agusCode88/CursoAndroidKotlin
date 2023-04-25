package com.example.aprendiendokotlin

/*
Conversor de temperatura
En el mundo, se usan tres escalas de temperatura principales: Celsius, Fahrenheit y Kelvin.

En el código inicial que se proporciona en el siguiente fragmento de código,
escribe un programa que convierta una temperatura de una escala a otra con estas fórmulas:

De grados Celsius a Fahrenheit: °F = 9/5 (°C) + 32
Kelvin a Celsius: °C = K - 273.15
De Fahrenheit a Kelvin: K = 5/9 (°F - 32) + 273.15
Ten en cuenta que el método String.format("%.2f", /* measurement */ ) se usa para convertir un número en un tipo String con 2 decimales.
* */fun main() {
    // Ejemplos de uso
    imprimirTemperaturaFinal(25.0, "Celsius", "Fahrenheit", ::celsiusAFahrenheit)
    imprimirTemperaturaFinal(300.0, "Kelvin", "Celsius", ::kelvinACelsius)
    imprimirTemperaturaFinal(98.6, "Fahrenheit", "Kelvin", ::fahrenheitAKelvin)
}


fun celsiusAFahrenheit(celsius: Double): Double {
    return 9/5 * celsius + 32
}

fun kelvinACelsius(kelvin: Double): Double {
    return kelvin - 273.15
}

fun fahrenheitAKelvin(fahrenheit: Double): Double {
    return 5/9 * (fahrenheit - 32) + 273.15
}

fun imprimirTemperaturaFinal(
    medidaInicial: Double,
    unidadInicial: String,
    unidadFinal: String,
    formulaConversion: (Double) -> Double
) {
    val medidaFinal = String.format("%.2f", formulaConversion(medidaInicial)) // dos decimales
    println("$medidaInicial grados $unidadInicial es $medidaFinal grados $unidadFinal.")
}
