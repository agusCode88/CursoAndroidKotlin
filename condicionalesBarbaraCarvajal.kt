package com.example.aprendiendokotlin

fun main(){
    //ifBasicoSinParametros()
    //ifBasicoConParametros("Camilo")
    //ifAnidadosConParametros("Mokita",25, true)
    //ifAnidadosConParametrosEjemplo2("Roberto", 20, true)
    //obtenerMesAnio(13)
    //obtenerMesConWhen(50)
    //obtenerTrimestreSegunMes(4)
    //obtenerSemestreDelAnioSegunMes(5)
    elWhenPuedeEvaluarAny("Holi")

}

fun ifBasicoSinParametros(){

    var nomprePersona: String = "Bárbara"

    if (nomprePersona.equals("Bárbara")) {
        println("La persona si se llama Bárbara")
    }
    if (nomprePersona == ("Bárbara")) {
        println("La persona si se llama Bárbara")

    }else{
        println("La persona se llama $nomprePersona")
    }

}

fun ifBasicoConParametros(nombrePersonaParametro: String){

    var nombrePersona: String = "Mokita"

    if (nombrePersona.equals(nombrePersonaParametro)){
        println("La persona se llama igual a la que ingresaste")
    }else{
        println("La persona no se llama igual a $nombrePersona, si no, $nombrePersonaParametro")
    }
}

fun ifAnidadosConParametros(nombrePersonaParametro: String, edadPersona: Int, felizOno: Boolean){
    var nombre = "Roberto"

    if (felizOno){
        if(edadPersona >= 18){
            if (nombre.equals(nombrePersonaParametro)){
                println("La persona es mayor de edad y se llama igual a como lo enviaste 😁")
                println("* Datos recibidos *")
                println("Nombre: $nombrePersonaParametro")
                println("Edad: $edadPersona")
                println("Felicidad: $felizOno")
            }else{
                println("La persona es mayor de edad, pero no se llama a como lo indicaste 🤔")
                println("* Datos recibidos * ")
                println("Nombre: $nombrePersonaParametro")
                println("Edad: $edadPersona")
                println("Felicidad: $felizOno")
            }
        }else{
            println("No es mayor de edad, así q no revisaremos su nombre")
            println("* Datos recibidos * ")
            println("Nombre: $nombrePersonaParametro")
            println("Edad: $edadPersona")
        }
    }else{
        println("No es feliz 😪, no podemos saber tus datos")
    }
}

fun ifAnidadosConParametrosEjemplo2(nombrePersonaParametro: String, edadPersona: Int, felizOno: Boolean){
    var nombre = "Roberto"

    if (felizOno){
        if(edadPersona >= 18 && nombre.equals(nombrePersonaParametro) && felizOno){
                println("La persona es mayor de edad y se llama igual a como lo enviaste 😁")
                println("* Datos recibidos *")
                println("Nombre: $nombrePersonaParametro")
                println("Edad: $edadPersona")
                println("Felicidad: $felizOno")
        }
        else if(edadPersona >= 18 ||  nombre.equals(nombrePersonaParametro) || felizOno)
                println("Cumples al menos 1 de las condiciones")
                println("* Datos recibidos * ")
                println("Nombre: $nombrePersonaParametro")
                println("Edad: $edadPersona")
                println("Felicidad: $felizOno")
        }else {
            println("No se cumple ninguna de las condiciones")
        }

    }

fun obtenerMesAnio(mesAnio: Int){
    if(mesAnio == 1){
        println("Mes: Enero")
    }else if(mesAnio == 2){
        println("Mes: Febrero")
    }else if(mesAnio == 3){
        println("Mes: Marzo")
    }else if(mesAnio == 4){
        println("Mes: Abril")
    }else if(mesAnio == 5){
        println("Mes: Mayo")
    }else if(mesAnio == 6){
        println("Mes: Junio")
    }else if(mesAnio == 7){
        println("Mes: Julio")
    }else if(mesAnio == 8){
        println("Mes: Agosto")
    }else if(mesAnio == 9){
        println("Mes: Septiembre")
    }else if(mesAnio == 10){
        println("Mes: Octubre")
    }else if(mesAnio == 11){
        println("Mes: Noviembre")
    }else if(mesAnio == 12){
        println("Mes: Diciembre")
    }else{
        println("Mes del año ingresado incorrecto 😵‍💫")
    }
}

fun obtenerMesConWhen(mesDelAnio: Int){

    when(mesDelAnio){
        1-> println("Enero")
        2-> println("Febrero")
        3-> println("Marzo")
        4-> println("Abril")
        5-> println("Mayo")
        6-> println("Junio")
        7-> println("Julio")
        8-> println("Agosto")
        9-> println("Septiembre")
        10-> println("Octubre")
        11-> println("Noviembre")
        12-> println("Diciembre")
        13-> {
            if (mesDelAnio== 13){
                println("No es un mes del año 😵‍💫")
            }
        }
        else -> println("Error")

    }

}

fun obtenerTrimestreSegunMes(mesAnio: Int){
    when(mesAnio){
        1,2,3 -> println("Primer trimestre")
        4,5,6 -> println("Segundo trimestre")
        7,8,9 -> println("Tercer trimestre")
        10,11,12 -> println("Cuarto trimestre")
    }
}

fun obtenerSemestreDelAnioSegunMes(mesAnio: Int){
    when(mesAnio){

        in 1..6 -> println("Primer Semestre")
        in 7..12 -> println("Segundo Semestre")
        !in 1..12 -> println("Fuera del rango")
    }
}

// Any es lo q sea!
fun elWhenPuedeEvaluarAny(valor: Any){
    when(valor){
        is Int-> println(valor + valor )
        is String -> println(valor + " " + valor )
        is Boolean -> if (valor) println("Es verdad")
    }
}


