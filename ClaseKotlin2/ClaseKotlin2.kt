package com.example.aprendiendokotlin

//Condicionales!

fun main() {

    //ifBasicoSinParametros()
    //ifBasicoConParametros("Felipe")
    //ifAnidadoConParametros("Roberto", 18, false)
    // ifAnidadoConParametrosEjemplo2("Roberto",19,false)
    // obtenerMesDelAno(13)
    //obtenerMesDelAñoConWhen(15)
    obtenerTrimestresDelAnoSegunMes(15)

}

fun ifBasicoSinParametros() {

    var nombrePersona: String = "Claudio";

//    if (nombrePersona == "Claudio") {
//        println("Este es el nombre de la persona: $nombrePersona");
//    }
    if (nombrePersona.equals("Claudio")) {
        println("Este loco es el $nombrePersona");
    } else {
        println("Este loco no es na el Claudio, es el $nombrePersona")
    }
}

fun ifBasicoConParametros(nombrePersonaParametro: String) {
    var nombrePersona: String = "Roberto"

    if (nombrePersona.equals(nombrePersonaParametro)) {
        println("La persona se llama igual que la ingresada")
    } else {
        println("La persona no es la misma")
    }
}

fun ifAnidadoConParametros(
    nombrePersonaParametro: String,
    edadPersona: Int,
    esFelizParametro: Boolean
) {

    var nombrePersona: String = "Roberto"

    if (esFelizParametro) {
        if (edadPersona >= 18) {
            if (nombrePersona.equals(nombrePersonaParametro)) {
                println("La persona es feliz, mayor de edad y su nombre coincide")
            } else {
                println("La persona es mayor de edad, pero el nombre no coincide")
            }
        } else {
            println("La persona es menor de edad, tiene solo $edadPersona años")
        }
    } else {
        println("La persona no es feliz :c")
    }
}

fun ifAnidadoConParametrosEjemplo2(
    nombrePersonaParametro: String,
    edadPersona: Int,
    esFelizParametro: Boolean
) {

    var nombrePersona: String = "Roberto"

    if (esFelizParametro && edadPersona >= 18 && nombrePersona.equals(nombrePersonaParametro)) {
        println("La persona es feliz, mayor de edad y el nombre coincide")
    } else {
        println("no cumple todos los requisitos")
    }
}

fun obtenerMesDelAno(mesAno: Int) {

    if (mesAno == 1) {
        println("Es Enero")
    } else if (mesAno == 2) {
        println("Es Febrero")
    } else if (mesAno == 3) {
        println("Es Marzo")
    } else if (mesAno == 4) {
        println("Es Abril")
    } else if (mesAno == 5) {
        println("Es Mayo")
    } else if (mesAno == 6) {
        println("Es Junio")
    } else if (mesAno == 7) {
        println("Es Julio")
    } else if (mesAno == 8) {
        println("Es Agosto")
    } else if (mesAno == 9) {
        println("Es Septiembre")
    } else if (mesAno == 10) {
        println("Es Octubre")
    } else if (mesAno == 11) {
        println("Es Noviembre")
    } else if (mesAno == 12) {
        println("Es Dieciembre")
    } else {
        println("No es un mes del año")
    }

}

fun obtenerMesDelAñoConWhen(mesAno: Int) {

    when (mesAno) {

        1 -> println("Este es el mes de Enero")
        2 -> println("Este es el mes de Febrero")
        3 -> println("Este es el mes de Marzo")
        4 -> println("Este es el mes de Abril")
        5 -> println("Este es el mes de Mayo")
        6 -> println("Este es el mes de Junio")
        7 -> println("Este es el mes de Julio")
        8 -> println("Este es el mes de Agosto")
        9 -> println("Este es el mes de Septiembre")
        10 -> println("Este es el mes de Octubre")
        11 -> println("Este es el mes de Noviembre")
        12 -> println("Este es el mes de Octubre")
        else -> println("No es un mes del año")
    }
}

fun obtenerTrimestresDelAnoSegunMes(mesAno: Int){

    when(mesAno){

        1,2,3-> println("Este es el primer trimestre")
        4,5,6-> println("Este es el segundo trimestre")
        7,8,9-> println("Este es el tercer trimestre")
        10,11,12-> println("Este es el cuarto trimestre")
        else-> println("No es un mes del año")
    }

}
