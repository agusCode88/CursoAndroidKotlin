package com.example.aprendiendokotlin.materiaKotlin

fun main() {
    // Aquí se comenta cada función que se va a probar

    // ifBasicosSinParametros()
    // ifBasicosConParametros("Roberto")
    // ifAnidadosConParametros("Roberto", 18, false)
    // obtenerMesAnio(10)
    // obtenerMesDelAnioConWhen(13)
    // obtenerTrimestreDelAnio(5)
    // obtenerSemestreDelAnioSegunMes(25)
    // elWhenPuedeEvaluarAny("Roberto ")
    // nulabilidaEnKotlinEjemplo()
}


fun ifBasicosSinParametros() {
    // declara una variable de cadena con el nombre "nombrePersona" y la asigna a "Claudio"
    var nombrePersona: String = "Claudio"

    // si el nombrePersona es igual a "Claudio", imprime un mensaje de que el nombre de la persona es "nombrePersona"
    if (nombrePersona == "Claudio") {
        println("El nombre de la persona es: $nombrePersona")
    }

    // si el nombrePersona es igual a "Claudio", imprime un mensaje de que este es el nombre de la persona "nombrePersona"
    // de lo contrario, imprime un mensaje de que esta persona no es Claudio y se llama "nombrePersona"
    if (nombrePersona.equals("Claudio")) {
        println("Este es el nombre de la persona: $nombrePersona")
    } else {
        println("Esta persona no es Claudio, se llama:  $nombrePersona")
    }
}


fun ifBasicosConParametros(nombrePersonaParametro: String) {
    // declara una variable de cadena con el nombre "nombrePersona" y la asigna a "Claudio"
    var nombrePersona: String = "Claudio"

    // si el nombrePersona es igual a "nombrePersonaParametro", imprime un mensaje de que la persona tiene el mismo nombre
    // de lo contrario, imprime un mensaje de que la persona no es igual
    if (nombrePersona.equals(nombrePersonaParametro)) {
        println("La persona se llama igual a la que ingresaste")
    } else {
        println("La persona no es igual a la que ingresaste")
    }
}


fun ifAnidadosConParametros(nombrePersonaParametro: String, edadPersona: Int, esFelizParametro: Boolean) {

    var nombrePersona = "Roberto"

    // Si el nombre que se envía es igual al nombre del parámetro, la edad de la persona es mayor o igual a 18 y es feliz,
    // entonces se imprime "La persona es feliz, es mayor de edad y se llama igual a como lo enviaste".
    // En caso contrario, se imprime "La persona no es feliz, no podemos saber su nombre".
    if (nombrePersona.equals(nombrePersonaParametro) && edadPersona >= 18 && esFelizParametro) {
        println("La persona es feliz, es mayor de edad y se llama igual a como lo enviaste")
    } else {
        println("La persona no es feliz, no podemos saber su nombre")
    }

    // Si la persona es feliz y es mayor o igual a 18, o si el nombre enviado es igual al nombre de la persona,
    // entonces se imprime "Felicidades cumples con 2 condiciones".
    // De lo contrario, se imprime "Lamentablemente no cumples con alguna de las condiciones".
    if ((esFelizParametro && (edadPersona >= 18)) || (nombrePersona.equals(nombrePersonaParametro))) {
        println("Felicidades cumples con 2 condiciones")
    } else {
        println("Lamentablemente no cumples con alguna de las condiciones")
    }
}

fun obtenerMesAnio(mesAnio: Int) {
    // Dependiendo del valor de mesAnio, se imprime el nombre del mes correspondiente. Si no coincide con ninguna opción,
    // se imprime "Este no es un mes del año".
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

// La siguiente función recibe un entero como argumento y utiliza la estructura de control 'when' para imprimir en pantalla el mes correspondiente
// según el número que se le pase. Si el número es 13, indica que no es un mes del año.
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
        }

        else -> println("Sobre 13, no es un mes del año")
    }
}

// La siguiente función utiliza la estructura de control 'when' para imprimir en pantalla el trimestre correspondiente
// según el número de mes que se le pase como argumento. Si el número no es válido (menor a 1 o mayor a 12) indica que no es un trimestre del año.
fun obtenerTrimestreDelAnio(mesDelAnio: Int) {
    when (mesDelAnio) {
// Si el mes está dentro del rango 1 a 3 (inclusivo), se imprime que es el primer trimestre.
        1, 2, 3 -> println("Este es el primer trimestre del año")
// Si el mes está dentro del rango 4 a 6 (inclusivo), se imprime que es el segundo trimestre.
        4, 5, 6 -> println("Este es el segundo trimestre del año")
// Si el mes está dentro del rango 7 a 9 (inclusivo), se imprime que es el tercer trimestre.
        7, 8, 9 -> println("Este es el tercer trimestre del año")
// Si el mes está dentro del rango 10 a 12 (inclusivo), se imprime que es el cuarto trimestre.
        10, 11, 12 -> println("Este es el cuarto trimestre del año")
// Si el mes no está dentro del rango 1 a 12, se imprime que no es un trimestre del año.
        else -> println("Este no es un trimestre del año")
    }
}

// Función que determina el semestre del año según el mes del año
fun obtenerSemestreDelAnioSegunMes(mesDelAnio: Int) {
    when (mesDelAnio) {
        in 1..6 -> println("Este es el primer semestre del año") // Si el mes está entre 1 y 6 (incluyendo ambos), es el primer semestre del año
        in 7..12 -> println("Este es el segundo semestre del año") // Si el mes está entre 7 y 12 (incluyendo ambos), es el segundo semestre del año
        !in 1..12 -> println("Este no es un semestre del año") // Si el mes no está entre 1 y 12, entonces no es un semestre del año
    }
}

// Función que evalúa diferentes tipos de datos en una expresión when
fun elWhenPuedeEvaluarAny(valor: Any) {
    when (valor) {

        is Int -> println(valor + valor) // Si el valor es de tipo Int, se imprime el valor sumado a sí mismo
        is String -> println(valor + valor) // Si el valor es de tipo String, se imprime el valor concatenado consigo mismo
        is Boolean -> if (valor) println("Es verdad") // Si el valor es de tipo Boolean y es verdadero, se imprime "Es verdad"
    }

}

// Función que muestra cómo se maneja la nulabilidad en Kotlin
fun nulabilidaEnKotlinEjemplo() {
    var nombrePersona: String? =
        null // Se declara una variable que puede ser nula, en este caso un String llamado "nombrePersona"
    nombrePersona = "Pedro" // Se le asigna un valor no nulo a "nombrePersona"

    println(nombrePersona?.length) // Si "nombrePersona" no es nulo, se imprime su longitud, de lo contrario no se imprime nada

// Se imprime un mensaje que muestra la longitud del String, o un mensaje de advertencia si es nulo
    println("El tamaño del String es ${nombrePersona?.length ?: "Esta variable es nula, ojo"}")

// Se asegura que "nombrePersona" no sea nulo, y se imprime su longitud
    println("Estoy seguro de que esto no es nulo ${nombrePersona!!.length}")

    if (nombrePersona == null) { // Si "nombrePersona" es nulo, se imprime un mensaje de advertencia
        println("Ojo que el valor es nulo")
    } else { // Si "nombrePersona" no es nulo, se imprime su longitud
        println(nombrePersona.length)
    }
}

