package com.example.aprendiendokotlin.ClaseKotlin2

/*Imagina que necesitas crear una app de reproducción de música.

Crea una clase que pueda representar la estructura de una canción. La clase Song debe
incluir estos elementos de código:
Propiedades para el título, el artista, el año de publicación y el recuento de reproducciones
Propiedad que indica si la canción es popular (si el recuento de reproducciones es inferior a 1,000,
considera que es poco popular)Un método para imprimir la descripción de una canción en este formato:
"[Título], interpretada por [artista], se lanzó en [año de lanzamiento]".*/


fun main(){

    imprimirDatosCancion("Incosolable","Backstreet boys", "2010")

}

fun imprimirDatosCancion(titulo:String, artista:String, anoDePublicacion:String){

    println("$titulo, interpretada por $artista, se lanzo en el año $anoDePublicacion")


}