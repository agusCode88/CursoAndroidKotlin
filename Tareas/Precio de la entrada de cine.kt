package com.example.aprendiendokotlin.Clase_2

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("el valor de la entrada para la edad de $child años es \$${ticketPrice(child, isMonday)}.")
    println("el valor de la entrada para la edad de $adult años es \$${ticketPrice(adult, isMonday)}.")
    println("el valor de la entrada para la edad de $senior años es \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when {
        age < 0 || age > 100 -> -1
        age <= 12 -> 15
        age in 13..60 -> if (isMonday) 25 else 30
        else -> 20
    }
}
