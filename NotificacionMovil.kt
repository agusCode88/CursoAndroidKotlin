package com.example.aprendiendokotlin

/*Escribe un programa que imprima el mensaje de resumen según la cantidad de notificaciones que recibiste.
El mensaje debe incluir lo siguiente: La cantidad exacta de notificaciones cuando haya menos de 100,
99+ como cantidad de notificaciones cuando haya 100 o más*/

fun notificacion(){

    print("Cantidad de notificaciones recibidas --> ")
    val notificaciones : Int = readln().toInt()

    if (notificaciones < 100){

        print("You have $notificaciones notifications.")
    }
    else{

        print("Your phone is blowing up! You have 99+ notifications.")
    }
}

fun main(){

    notificacion()
}