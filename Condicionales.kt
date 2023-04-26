package com.example.aprendiendokotlin


fun main() {

    ifbasicoSinparametros()
    ifBasicoConParametros("Stiven")
    ifAnidadosConparametros("Stiven", 30)
    obtenerMesAno(1)



}

fun obtenerTrimestreDelAno() {

}



/* las condicionales son impresindibles en la programacion ya que nos permiten tomar decisiones en el codigo debido a que todos los caminios
que puede tomar un programa se pueden representar como una condicion, por ejemplo, si el usuario ingresa un numero mayor a 10, entonces
esto es lo que da logica a nuestra aplicacion y nos hace mas inteligentes a la hora de programar
 */

fun ifbasicoSinparametros() {


    var nombrePersona: String = "Stiven"
    if (nombrePersona == "Stiven") {
        println("El nombre de la persona es Stiven")
    }
    if (nombrePersona.equals("Stiven")) {
        println("Este es el nombre de la persona: $nombrePersona")
    } else {
        println("El nombre de la persona no es Stiven : $nombrePersona")
    }
}

fun ifBasicoConParametros(nombrePersonaParametro: String) {

    var nombrepersona: String = "Stiven"
    if (nombrepersona == nombrePersonaParametro) {
        println("El nombre de la persona es Stiven")
    } else {
        println("El nombre de la persona no es Stiven : $nombrepersona")
    }
}

fun ifAnidadosConparametros(nombrePersonaParametro: String, edadPersonaParametro: Int) {

    var nombrepersona: String = "Stiven"
    var edadPersona: Int = 30
    if (nombrepersona == nombrePersonaParametro) {
        println("El nombre de la persona es Stiven")
        if (edadPersona == edadPersonaParametro) {
            println("La edad de la persona es 30")
        } else {
            println("La edad de la persona no es 30")
        }
    } else {
        println("El nombre de la persona no es Stiven : $nombrepersona")
    }

    if (edadPersona >= 18) {
        if (nombrepersona.equals(nombrePersonaParametro)) {
            println("La persona es mayor de edad y se llama $nombrepersona")
        } else {
            println("La persona es mayor de edad pero no se llama $nombrepersona")
        }
        println("La persona es mayor de edad")
    } else {
        println("La persona es menor de edad")
    }

    if (edadPersona >= 18 && nombrepersona.equals(nombrePersonaParametro)) {
        println("La persona es mayor de edad y se llama $nombrepersona")
    } else {
        println("La persona es menor de edad o no se llama $nombrepersona")
    }


}

fun obtenerMesAno(mesAno: Int) {

    val mesAnio = 13
    if (mesAnio == 1) {
        println("El mes es Enero")
    } else if (mesAnio == 2) {
        println("El mes es Febrero")
    } else if (mesAnio == 3) {
        println("El mes es Marzo")
    } else if (mesAnio == 4) {
        println("El mes es Abril")
    } else if (mesAnio == 5) {
        println("El mes es Mayo")
    } else if (mesAnio == 6) {
        println("El mes es Junio")
    } else if (mesAnio == 7) {
        println("El mes es Julio")
    } else if (mesAnio == 8) {
        println("El mes es Agosto")
    } else if (mesAnio == 9) {
        println("El mes es Septiembre")
    } else if (mesAnio == 10) {
        println("El mes es Octubre")
    } else if (mesAnio == 11) {
        println("El mes es Noviembre")
    } else if (mesAnio == 12) {
        println("El mes es Diciembre")
    } else {
        println("El mes no existe")
    }

    when (mesAnio) {
        1 -> println("El mes es Enero")
        2 -> println("El mes es Febrero")
        3 -> println("El mes es Marzo")
        4 -> println("El mes es Abril")
        5 -> println("El mes es Mayo")
        6 -> println("El mes es Junio")
        7 -> println("El mes es Julio")
        8 -> println("El mes es Agosto")
        9 -> println("El mes es Septiembre")
        10 -> println("El mes es Octubre")
        11 -> println("El mes es Noviembre")
        12 -> println("El mes es Diciembre")
        else -> println("El mes no existe")
    }
    fun obtenerMesAnoConWhen(mesAno: Int) {

        when (mesAno) {
            1 -> println("El mes es Enero")
            2 -> println("El mes es Febrero")
            3 -> println("El mes es Marzo")
            4 -> println("El mes es Abril")
            5 -> println("El mes es Mayo")
            6 -> println("El mes es Junio")
            7 -> println("El mes es Julio")
            8 -> println("El mes es Agosto")
            9 -> println("El mes es Septiembre")
            10 -> println("El mes es Octubre")
            11 -> println("El mes es Noviembre")
            12 -> println("El mes es Diciembre")
            13 -> {

                if (mesAno == 13) {
                    println("no existe el mes 13")
                } else {
                    println("El mes no existe")
                }
            }

            else -> println("El mes no existe")
        }
    }

    fun obtenerTrimestreDelAno(mesAno: Int) {

        when (mesAno) {
            1, 2, 3 -> println("El mes es del primer trimestre")
            4, 5, 6 -> println("El mes es del segundo trimestre")
            7, 8, 9 -> println("El mes es del tercer trimestre")
            10, 11, 12 -> println("El mes es del cuarto trimestre")
            else -> println("El mes no existe")
        }

    }

    fun obtenerSemestreDelAno(mesAno: Int) {

        when (mesAno) {
            1, 2, 3, 4, 5, 6 -> println("El mes es del primer semestre")
            7, 8, 9, 10, 11, 12 -> println("El mes es del segundo semestre")
            else -> println("El mes no existe")
        }
    }

    fun obtenerSemestreDelAnoConIf(mesAno: Int) {

        if (mesAno == 1 || mesAno == 2 || mesAno == 3 || mesAno == 4 || mesAno == 5 || mesAno == 6) {
            println("El mes es del primer semestre")
        } else if (mesAno == 7 || mesAno == 8 || mesAno == 9 || mesAno == 10 || mesAno == 11 || mesAno == 12) {
            println("El mes es del segundo semestre")
        } else {
            println("El mes no existe")
        }
    }

    fun obtenerSemestreDelAnoSegunMes(mesAno: Int) {

        when (mesAno) {
            in 1..6 -> println("El mes es del primer semestre")
            in 7..12 -> println("El mes es del segundo semestre")
            else -> println("El mes no existe")
        }
    }

    fun elWhenPuedeEvaluarAny (valor : Any) {

    when (valor) {
        1 -> println("El valor es 1")
        "Stiven" -> println("El valor es Stiven")
        true -> println("El valor es true")
        else -> println("El valor no es 1, ni Stiven, ni true")
    }

        fun elWhenPuedeEvaluarAnyConIs (valor : Any) {
            when (valor) {
                is Int -> println("El valor es un entero" )
                is String -> println("El valor es un String")
                is Boolean -> println("El valor es un booleano")
                else -> println("El valor no es 1, ni Stiven, ni true")
            }
        }

    }

    fun elWhenPuedeEvaluarAnyConIs (valor : Any) {

    when (valor) {
        is Int -> println("El valor es un entero")
        is String -> println("El valor es un String")
        is Boolean -> println("El valor es un booleano")
        else -> println("El valor no es 1, ni Stiven, ni true")
    }

    }




}

