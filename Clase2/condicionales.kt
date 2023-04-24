package com.example.aprendiendokotlin.Clase2

fun main(){
    //ifBasicoSinParametros()
    ifBasicoConParametros("Lorenzo")

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
        println("La persona se llama igual a la que ingresaste")
    }else{
        println("La perosna no es igual a la que ingresaste")
    }
}

