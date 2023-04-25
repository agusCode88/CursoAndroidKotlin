package com.example.aprendiendokotlin

fun main() {
    // Convert 27.0 degrees Celsius to Fahrenheit
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { celsiusToFahrenheit(it) }

    // Convert 350.0 degrees Kelvin to Celsius
    printFinalTemperature(350.0, "Kelvin", "Celsius") { kelvinToCelsius(it) }

    // Convert 10.0 degrees Fahrenheit to Kelvin
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { fahrenheitToKelvin(it) }
}

fun celsiusToFahrenheit(celsius: Double): Double {
    return (9.0 / 5.0 * celsius) + 32
}

fun kelvinToCelsius(kelvin: Double): Double {
    return kelvin - 273.15
}

fun fahrenheitToKelvin(fahrenheit: Double): Double {
    return 5.0 / 9.0 * (fahrenheit - 32) + 273.15
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
