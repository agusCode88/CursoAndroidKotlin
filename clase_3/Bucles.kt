package com.example.aprendiendokotlin.clase_3

fun main(){

    //forMasBasico()
    //forMagico()
    //forEnArray()
    //recorriendoArrayConFor()
    //primerWhile(10)
    //primerDoWhile(10)
    listasKotlin()
}

fun forMasBasico(){

    for (i in 1  ..  1000000000) {
        println ("Este es el valor del i : $i")
    }
}
fun forMagico() {
    var nombrePersona1: String? = "Maria Magdalena"
    var nombrePersona2: String? = "Pedro"
    var nombrePersona3: String? = "Maria"
    var nombrePersona4: String? = "Jose"
    var nombrePersona5: String? = "Jesus"

    var familiaBiblia = arrayOf(nombrePersona1,nombrePersona2,nombrePersona3,nombrePersona4,nombrePersona5)

    for (nombre in familiaBiblia) {

        println(nombre)
        }
    }

fun forEnArray() {
    //recorrer un rango
    for (indice in 0 .. 10){
    println("For normal: ${indice}")
    }
    //Recorre un rango pero deja afuera el último
    for (indi in 1 .. 10){
        println("For until ${indi}")
    }
    //Recorre con los saltos que le indicamos
    for (i in 1 .. 10 step 3){
    println("For Step: $i")
    }
    //Recorre en orden Descendente
    for (i in 10 downTo 1){
    println("For con DonwTo: $i")
    }
}

fun recorriendoArrayConFor(){
    var arreglo1: IntArray = IntArray(5) //array declarada normal, si no indico se llena con 0
    var arreglo2: IntRange = (1..20)//size determinado con Rango y sin necesidad de poner dos veces el nombre

    for (numero in arreglo1){
        println(numero)
    }
    for(numero in arreglo2){
        println(numero)
    }
    //usando el indice
    for (valor in arreglo1.indices){
        arreglo1[valor] = valor+1
    }
    for(valor in arreglo1){
        println(valor)
    }

    for ((indice, valor) in arreglo1.withIndex()){
        println("Este es el indice ${indice}, y este es el valor ${valor}")
    }
}

fun primerWhile(valor: Int){

    var i= 0
    while (i<= valor){
        println("Este es el valor dentro del ciclo ${i}")
        i++
    }
    println("Se salió del ciclo")
}
fun primerDoWhile(valor: Int) {
    var i= 1
    do {
        println("Este es el valor en el Do While ${ i }")
        i++
    } while (i <= valor)
    println("Estoy afuera del ciclo")
}

fun listasKotlin() {

    var listaNombres = arrayListOf<String>()

    var nombre1: String = "Lautaro"
    var nombre2: String = "Caro"
    var nombre3: String = "Curie"
    var nombre4: String = "Lyanna"
    var nombre5: String = "Awka"
    var nombre6: String = "Coca"

    listaNombres.add(nombre1)
    listaNombres.add(nombre2)
    listaNombres.add(nombre3)
    listaNombres.add(nombre4)
    listaNombres.add(nombre5)
    listaNombres.add(nombre6)

    println(listaNombres)

    //jugando usando for
    listaNombres.addAll(listOf("Eva", "Celso", "Paty"))
    for (i in listaNombres)
        println(i)

// Ver
    var nombreObtenido: String = listaNombres[2]
    println(listaNombres)
// Actualizar
    listaNombres[2] = "He actualizado Caro"
    println(listaNombres)
//
    var tamañoLista1: Int = listaNombres.size
    var tamañoLista2: Int = listaNombres.count()

    println (tamañoLista1)
    println (tamañoLista2)

}