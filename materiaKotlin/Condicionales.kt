package com.example.aprendiendokotlin.materiaKotlin

fun main() {

//    ifBasicoSinParametros()
//    var esVerdad = ifBasicoConParametros("alberto")
//    if (esVerdad) {
//        println("Es cierto lo que dices, los dos se llaman igual")
//    } else {
//        println("No es verdad lo que dices, no se llaman igual")
//    }
//    var esVerdad2 = ifAnidados("Claudio", "15")
//    if (esVerdad2) {
//        println("La persona está habilitada para poder sufragar");
//    } else {
//        println("La persona esta inhabilitada para poder sufragar")
//    }
//    operacionesConIfElse(4)
//    getMesAnioconWhen(13)

    trabajandoVariableAny(true)

}

/*
  Las condicionales son imprescindeibles en la programación ,
  debido a que tods los caminos de uan aplicación depende de que
  esta app tome decisiones . Esto es lo que le da lógica a nuestra
  aplicación y ña hace más "inteligente"
 */

/*
Un If() es una condición , si pasa esto , haz esto
 */
fun ifBasicoSinParametros() {

    var nombre: String = "Alberto"

    if (nombre == "Alberto") {

        println("La variable nombre es $nombre");
    }
    if (nombre.equals(nombre)) {
        println("La variable nombre es $nombre con la funcion .equals()");
    }
}

fun ifBasicoConParametros(nombreParametro: String): Boolean {

    var nombre: String = "Alberto"
    var nombrePrueba: String = "alberto"
    var esVerdad = true

    if (nombre == nombreParametro) {

        esVerdad = true

    } else {

        esVerdad = false
    }
    if (nombre.equals(nombreParametro)) {

        esVerdad = true
        return esVerdad

    } else {
        esVerdad = false
        return esVerdad
    }
}

fun ifAnidados(nombreParametro: String, edadParametro: String): Boolean {

    var nombrePersona = "Claudio"
    val mayoriaEdad: Int = 18
    var habilitadoMayorEdad = true
    var quiereVotar = true

    if (nombrePersona.equals(nombreParametro)) {

        if (edadParametro.toInt() < mayoriaEdad) {
            habilitadoMayorEdad = false;
            quiereVotar = false
        }
        if (edadParametro.toInt() >= mayoriaEdad && quiereVotar) {
            habilitadoMayorEdad = true
        }

    } else {
        habilitadoMayorEdad = false
    }

    return habilitadoMayorEdad
}

fun operacionesConIfElse(mesAnio: Int) {

    if (mesAnio == 1) {
        println("Es el mes de enero")
    } else if (mesAnio == 2) {
        println("Es el mes de febrero")
    } else if (mesAnio == 3) {
        println("Es el mes de marzo")
    } else if (mesAnio == 4) {
        println("Es el mes de abril")
    } else if (mesAnio == 5) {
        println("Es el mes de mayo")
    } else if (mesAnio == 6) {
        println("Es el mes de junio")
    } else if (mesAnio == 7) {
        println("Es el mes de julio")
    } else if (mesAnio == 8) {
        println("Es el mes de agosto")
    } else if (mesAnio == 9) {
        println("Es el mes de septiembre")
    } else if (mesAnio == 10) {
        println("Es el mes de octubre")
    } else if (mesAnio == 11) {
        println("Es el mes de noviembre")
    } else if (mesAnio == 12) {
        println("Es el mes de diciembre")
    } else {
        println("No es un mes del año")
    }
}

fun getMesAnioconWhen(mesAnio: Int) {

    when (mesAnio) {
        1 -> println("Es enero")
        2 -> println("Es febrero")
        3 -> println("Es marzo")
        4 -> println("Es abril")
        5 -> println("Es mayo")
        6 -> println("Es junio")
        7 -> println("Es julio")
        8 -> println("Es agosto")
        9 -> println("Es septiembre")
        10 -> println("Es octubre")
        11 -> println("Es noviembre")
        12 -> println("Es diembre")
        13 -> {
            if (mesAnio == 13) {
                println("Esta es una funcion secreta ")
            }
        }
        else -> println("No es ningun mes")

    }

}

fun getTrimesteAnio(valorTrimeste: Int) {

    when (valorTrimeste) {

        1, 2, 3 -> println("primer trimestre")
        4, 5, 6 -> println("segundo trimestre")
        7, 8, 9 -> println("tercer trimestre")
        10, 11, 12 -> println("cuarto trimestre")
    }

}

fun getSemestreAnio(valorTrimeste: Int) {

    when (valorTrimeste) {
        in 1..6 -> println("Primer semestre del año")
        in 7..12 -> println("Segundo semestre del año")
        !in 7..12-> println("Semestre no válido")
    }

}

fun trabajandoVariableAny(valor: Any){

    when (valor){
        is Int -> valor + valor
        is String-> valor + "Concatenado conmigo"
        is Boolean-> if (valor) println("La variable es verdadera")
    }

}

/*
 Safe-Navegation Operator
En primer lugar, tenemos el Safe-Navegation Operator, también conocido como operador de navegación segura.
Es una forma que nos provee Kotlin para poder usar variables nulas en nuestra aplicación y, del mismo modo,
poder acceder a las propiedades que estas contienen.
 “?.”

 Se utiliza el operador elvis ?: para verificar si la variable "nombre" es nula. Si es nula,
  imprime el mensaje por pantella, de lo contrario,se imprime el valor de la variable.

 */

fun nulabiliadadEnKotlin () {

    //Posiblemente esta variable puede ser nula
    var nombre:String? = null
    // La variable es nula pero no se cae
    println(nombre?.length)
    println("El tamaño del String es ${nombre?.length ?: "Es nulo pero no se cae"}")
//  println(nombre!![3]) // Estoy seguro que esto no sera nulo
    //  print(nombre!!.get(3)) // pero si es nulo ?

}




