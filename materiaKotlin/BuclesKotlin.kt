package materiaKotlin

fun main() {
    //forMasBasico()
    forMagico()
}

//Función que muestra una secuencia de números del 1 al 200 utilizando el bucle "for"
fun forMasBasico() {
    for (i in 1..200) {
        println("Este es el valor de i: $i")
    }
}

//Función que muestra los nombres de una familia bíblica y resalta el último nombre con el bucle "for"
fun forMagico() {
    //Declaración de variables que contienen los nombres de la familia bíblica
    var nombrePersona1: String? = "Maria Magdalena"
    var nombrePersona2: String? = "Pedro"
    var nombrePersona3: String? = "Maria"
    var nombrePersona4: String? = null
    var nombrePersona5: String? = "Jesus"

    //Creación de un arreglo que contiene los nombres de la familia bíblica
    var familiaBiblia = arrayOf(nombrePersona1, nombrePersona2, nombrePersona3, nombrePersona4, nombrePersona5)

    //Utilización del bucle "for" para recorrer el arreglo de nombres y resaltar el último nombre
    for (i in familiaBiblia) {
        println(nombrePersona5)
    }
}

