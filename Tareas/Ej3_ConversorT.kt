package com.example.aprendiendokotlin.Clase2

/*
En el mundo, se usan tres escalas de temperatura principales: Celsius, Fahrenheit y Kelvin.

En el código inicial que se proporciona en el siguiente fragmento de código, escribe un programa que
convierta una temperatura de una escala a otra con estas fórmulas:

De grados Celsius a Fahrenheit: °F = 9/5 (°C) + 32
Kelvin a Celsius: °C = K - 273.15
De Fahrenheit a Kelvin: K = 5/9 (°F - 32) + 273.15
Ten en cuenta que el método String.format("%.2f", /* measurement */ ) se usa para convertir un número en un tipo String con 2 decimales.
 */

fun main() {
    // Fill in the code.
    //  conversionFormula: (Double) -> Double) metodo para convertir sumar la formula de arriba de las temp.

    val celsiusToFahrenheit: (Double) -> Double = { celsius -> celsius * 9 / 5 + 32 }
    val kelvinToCelsius: (Double) -> Double = { kelvin -> kelvin - 273.15 }
    val fahrenheitToKelvin: (Double) -> Double = { fahrenheit -> (fahrenheit + 459.67) * 5 / 9 }

    printFinalTemperature(27.0, "Celsius", "Fahrenheit", celsiusToFahrenheit)
    printFinalTemperature(350.0, "Kelvin", "Celsius", kelvinToCelsius)
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin", fahrenheitToKelvin)



}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double) // ocupar esta formula para convertir en el main
 {

    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

/*
Completa la función main() para que llame a la función printFinalTemperature() e imprima las siguientes líneas.
Debes pasar argumentos para la fórmula de conversión y temperatura. Sugerencia: Te recomendamos usar valores Double para evitar el
truncamiento de Integer durante las operaciones de división.


27.0 degrees Celsius is 80.60 degrees Fahrenheit.
350.0 degrees Kelvin is 76.85 degrees Celsius.
10.0 degrees Fahrenheit is 260.93 degrees Kelvin.
 */

