package com.example.aprendiendokotlin.Clase_2

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("$numberOfMessages notificaciones.")
    } else {
        println("99+ notificaciones.")
    }
}