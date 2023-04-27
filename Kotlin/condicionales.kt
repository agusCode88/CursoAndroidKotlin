package com.example.aprendiendokotlin.Clase2

fun main(){
    //ifBasicoSinParametros()
    //ifBasicoConParametros("Lorenzo")
    //ifAnidadosConParametros(nombrePersonaParametro = "Lorenzo", edadPersona = 18, esFelizPArametro = true)
    //ifAnidadosConParametrosEjemplo2(nombrePersonaParametro = "Clara", edadPersona = 18, esFelizPArametro = true)// se le pueden sacar los valores de adelante valor=
    //obtenerMesAnio(2)
    //obtenerMesDelAnioConWhen(14)
    //obtenerTrimestreDelAnioSegunMes(6)
    elWhenPuedeEvaluarAny(true)
}

/*
Los condicionales son imprescindibles en la programacion,
debido a que todos los caminos
de una app depende de que esta app tome decisiones.
Esto es lo que da logica a nuestra app y la hace mas "intelingente".
 */

fun ifBasicoSinParametros(nombrePersonaParametro: String){

    var nombrePersona: String = "Lorenzoo"

    if(nombrePersona == "Claudio"){
        println("Este es el nombre de la persona: $nombrePersona")
    }
    if(nombrePersona.equals(nombrePersonaParametro)){
        println("Este es el nombre de la persona: $nombrePersona")
    }else {
        println("Esta persona no es Claudio, se llama $nombrePersona")
    }

}

fun ifBasicoConParametros(nombrePersonaParametro : String){

    var nombrepersona: String = "Lorenzo"

    if(nombrepersona.equals(nombrePersonaParametro)){
        println("La persona es feliz, se llama igual a la que ingresaste")
    }else{
        println("La perosna es feliz, pero, no es igual a la que ingresaste")
    }
}

fun ifAnidadosConParametros(nombrePersonaParametro: String, edadPersona: Int, esFelizPArametro: Boolean) {

    var nombrePersona = "Lorenzo"

    if (esFelizPArametro){
        if (edadPersona >= 18) {
            if(nombrePersona.equals(nombrePersonaParametro)){
                println("La persona es feliz, es mayor de edad y se llama igual como lo ingresaste")
            }else{
                println("La persona es feliz, es mayor de edad, pero no se llama igual a como lo indicaste.")
            }
        }else{
            println("La persona es feliz, sin embargo, no tiene mayoria de edad, no interesa como se llame.")
        }

    }else{
        println("La persona no es feliz, no podemos saber su nombre.")
    }

}

fun ifAnidadosConParametrosEjemplo2(nombrePersonaParametro: String, edadPersona: Int, esFelizParametro: Boolean) {

    var nombrePersona = "Clara"

    if (esFelizParametro && (edadPersona >= 18 || nombrePersona.equals(nombrePersonaParametro))) {

        println("Felicidades cumplea alguna de las dos condiciones")
    } else {
        println("Lamentablemente no cumples una de las condiciones")
    }
}

fun obtenerMesAnio(mesAnio: Int){
    if(mesAnio == 1){
        println("Es el mes de Enero.")
    }else if(mesAnio == 2){
        println("Es el mes de Febrero.")
    }else if(mesAnio == 3){
        println("Es el mes de Marzo.")
    }else if(mesAnio == 4){
        println("Es el mes de Abril.")
    }else if(mesAnio == 5){
        println("Es el mes de Mayo.")
    }else if(mesAnio == 6){
        println("Es el mes de Junio.")
    }else if(mesAnio == 7){
        println("Es el mes de Julio.")
    }else if(mesAnio == 8){
        println("Es el mes de Agosto.")
    }else if(mesAnio == 9){
        println("Es el mes de Septiembre.")
    }else if(mesAnio == 10){
        println("Es el mes de Octubre.")
    }else if(mesAnio == 11){
        println("Es el mes de Noviembre.")
    }else if(mesAnio == 12){
        println("Es el mes de Diciembre.")
    }else{
        println("No es un mes del año")
    }
}

fun obtenerMesDelAnioConWhen (mesDelAnio : Int){

    when(mesDelAnio) {
        1-> println("Este es el mes de Enero")
        2-> println("Este es el mes de Febrero")
        3-> println("Este es el mes de Marzo")
        4-> println("Este es el mes de Abril")
        5-> println("Este es el mes de Mayo")
        6-> println("Este es el mes de Junio")
        7-> println("Este es el mes de Julio")
        8-> println("Este es el mes de Agosto")
        9-> println("Este es el mes de Septiembre")
        10-> println("Este es el mes de Octubre")
        11-> println("Este es el mes de Noviembre")
        12-> println("Este es el mes de Disiembre")
        13-> {
        if (mesDelAnio == 13) {
            println("No es un mes del año")
        }
    }
        else -> println("Sobre 13")
}
}

fun obtenerTrimestreDelAnioSegunMes(mesAnio : Int){

    when(mesAnio){
        1,2,3 ->println("Este es el primer Trimestre")
        4,5,6 ->println("Este es el segundo Trimestre")
        7,8,9 ->println("Este es el tercero Trimestre")
        10,11,12 ->println("Este es el cuarto Trimestre")

    }
}

fun obtenerSemestreDelAnioSegunMes(mesAnio: Int){

    when(mesAnio){

        in 1 .. 6-> println("este es el primer semestre")
        in 7 .. 12-> println("este es el segundo semestre")
        !in 1 ..12 -> println("no es un semestre") // ! este simbolo es de negación
    }
}

fun elWhenPuedeEvaluarAny(valor : Any){

    when(valor){

        is Int-> println(valor + valor)
        is String-> valor + valor
        is Boolean-> if(valor) println("Es verdad")

    }
}