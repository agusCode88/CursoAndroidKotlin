package com.example.aprendiendokotlin


fun main () {

          ifbasicoSinparametros()
          ifBasicoConParametros("Stiven")

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
    if(nombrePersona.equals("Stiven")) {
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
