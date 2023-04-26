package com.example.aprendiendokotlin.materiaKotlin

fun main() {

    //    ifBasicosSinParametros()
    //    ifBasicosConParametros("Roberto")
    //    ifAnidadosConParametros("Roberto", 18, false)
    //    obtenerMesAnio(10)
    //    obtenerMesDelAnioConWhen(13)
    //    obtenerTrimestreDelAnio(5)
    //    obtenerSemestreDelAnioSegunMes(25)
    elWhenPuedeEvaluarAny("Roberto ")
}

fun ifBasicosSinParametros() {

    var nombrePersona: String = "Claudio"
    if (nombrePersona == "Claudio") {
        println("El nombre de la persona es: $nombrePersona")
    }
    if (nombrePersona.equals("Claudio")) {
        println("Este es el nombre de la persona: $nombrePersona")
    } else {
        println("Esta persona no es Claudio, se llama:  $nombrePersona")
    }
}

fun ifBasicosConParametros(nombrePersonaParametro: String) {
    var nombrePersona: String = "Claudio"
    if (nombrePersona.equals(nombrePersonaParametro)) {
        println("La persona se llama igual a la que ingresaste")
    } else {
        println("La persona no es igual a la que ingresaste")
    }
}

fun ifAnidadosConParametros(nombrePersonaParametro: String, edadPersona: Int, esFelizParametro: Boolean) {

    var nombrePersona = "Roberto"

//    if (nombrePersona.equals(nombrePersonaParametro) && edadPersona >= 18 && esFelizParametro) {
//        println("La persona es feliz, es mayor de edad y se llama igual a como lo enviaste")
//    } else {
//        println("La persona no es feliz, no podemos saber su nombre")
//    }
//
    if ((esFelizParametro && (edadPersona >= 18)) || (nombrePersona.equals(nombrePersonaParametro))) {
        println("Felicidades cumples con 2 condiciones")
    } else {
        println("Lamentablemente no cumples con alguna de las condiciones")
    }
}

fun obtenerMesAnio(mesAnio: Int) {
    if (mesAnio == 1) {
        println("Este es el mes de Enero")
    } else if (mesAnio == 2) {
        println("Este es el mes de Febrero")
    } else if (mesAnio == 3) {
        println("Este es el mes de Marzo")
    } else if (mesAnio == 4) {
        println("Este es el mes de Abril")
    } else if (mesAnio == 5) {
        println("Este es el mes de Mayo")
    } else if (mesAnio == 6) {
        println("Este es el mes de Junio")
    } else if (mesAnio == 7) {
        println("Este es el mes de Julio")
    } else if (mesAnio == 8) {
        println("Este es el mes de Agosto")
    } else if (mesAnio == 9) {
        println("Este es el mes de Septiembre")
    } else if (mesAnio == 10) {
        println("Este es el mes de Octubre")
    } else if (mesAnio == 11) {
        println("Este es el mes de Noviembre")
    } else if (mesAnio == 12) {
        println("Este es el mes de Diciembre")
    } else {
        println("Este no es un mes del año")
    }
}
fun obtenerMesDelAnioConWhen(mesDelAnio: Int) {
    when (mesDelAnio) {
        1 -> {
            println("Este es el mes de Enero")
        }
        2 -> {
            println("Este es el mes de Febrero")
        }
        3 -> {
            println("Este es el mes de Marzo")
        }
        4 -> {
            println("Este es el mes de Abril")
        }
        5 -> {
            println("Este es el mes de Mayo")
        }
        6 -> {
            println("Este es el mes de Junio")
        }
        7 -> {
            println("Este es el mes de Julio")
        }
        8 -> {
            println("Este es el mes de Agosto")
        }
        9 -> {
            println("Este es el mes de Septiembre")
        }
        10 -> {
            println("Este es el mes de Octubre")
        }
        11 -> {
            println("Este es el mes de Noviembre")
        }
        12 -> {
            println("Este es el mes de Diciembre")
        }
        13 -> {
            if (mesDelAnio == 13) {
                println("Este no es un mes del año")
            }
        } else -> println("Sobre 13, no es un mes del año")
    }
}

fun obtenerTrimestreDelAnio(mesDelAnio: Int) {
    when (mesDelAnio) {
        1, 2, 3 -> println("Este es el primer trimestre del año")
        4, 5, 6 -> println("Este es el segundo trimestre del año")
        7, 8, 9 -> println("Este es el tercer trimestre del año")
        10, 11, 12 -> println("Este es el cuarto trimestre del año")
        else -> println("Este no es un trimestre del año")
    }
}

fun obtenerSemestreDelAnioSegunMes(mesDelAnio: Int) {
    when (mesDelAnio) {
        in 1..6 -> println("Este es el primer semestre del año")
        in 7..12 -> println("Este es el segundo semestre del año")
        !in 1..12 -> println("Este no es un semestre del año")
    }
}
fun elWhenPuedeEvaluarAny (valor: Any){
    when(valor){

        is Int -> println (valor + valor)
        is String -> println  (valor + valor)
        is Boolean -> if(valor) println("Es verdad")

    }
}

