package com.example.aprendiendokotlin

fun main () {

    ifBasicoSinParametros()
    var esVerdad = ifBasicoConParametros("alberto")
    if(esVerdad){
        println("Es cierto lo que dices, los dos se llaman igual")
    } else {
        println("No es verdad lo que dices, no se llaman igual")
    }
    var esVerdad2 = ifAnidados("Claudio","15")
    if (esVerdad2 ){
        println("La persona está habilitada para poder sufragar");
    }else {
        println("La persona esta inhabilitada para poder sufragar")
    }

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

fun ifBasicoConParametros(nombreParametro : String) : Boolean {

        var nombre : String = "Alberto"
        var nombrePrueba: String = "alberto"
        var esVerdad = true

        if (nombre == nombreParametro){

            esVerdad = true

        } else {

            esVerdad = false
        }
        if(nombre.equals(nombreParametro)){

            esVerdad = true
            return esVerdad

        }else {
            esVerdad = false
            return esVerdad
        }
}

fun ifAnidados(nombreParametro: String, edadParametro: String ): Boolean{

    var nombrePersona = "Claudio"
    val mayoriaEdad:Int = 18
    var habilitadoMayorEdad = true

   if(nombrePersona.equals(nombreParametro)){

       if (edadParametro.toInt() < mayoriaEdad ){
           habilitadoMayorEdad = false;
       }
       if(edadParametro.toInt()>= mayoriaEdad){
           habilitadoMayorEdad = true
       }
   } else {
           habilitadoMayorEdad = false
   }

    return  habilitadoMayorEdad
}