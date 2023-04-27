package materiaKotlin

fun main() {
//    forMasBasico()
//    forMagico()
//    practicaDeBuclesFor()
//    recorriendoArraysConFor(4)
//    nuestroPrimerWhile(4)
//    nuestroPrimerDoWhile(5)
    trabajandoConListasEnKotlin()
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

    //Utilización del bucle "for" para recorrer el arreglo de nombres y resaltar el último nombre.
    for (i in familiaBiblia) {
        println(nombrePersona5)
    }
}

fun practicaDeBuclesFor() {
    //Recorre todo el rango de forma normal
    for (indice in 0..10) {
        println("For normal ${indice}")
    }
    //Recorre todo el rango dejando afuera el último valor
    for (indice in 0 until 10) {
        println("For until ${indice}")
    }
    //Recorre todo el rango saltandose cada 3 valores
    for (i in 1..10 step 3) {
        println("For step ${i}")
    }
    //Recorre todo el rango en cuenta regresiva saltandose cada 2 valores
    for (i in 10 downTo 1 step 2) {
        println("For downTo ${i}")
    }
}

//La siguiente función recorre tres tipos diferentes de arreglos utilizando un for loop.
fun recorriendoArraysConFor(i: Int) {
// Creamos un arreglo de 10 elementos, inicializados en 0.
    var arregloDeNumeros: IntArray = IntArray(10)
// Creamos un rango de números del 1 al 20.
    var arregloDeNumerosRango: IntRange = (1..20)

    // Iteramos sobre el rango de números y mostramos el valor de cada elemento.
    for (numero in arregloDeNumerosRango) {
        println("Rango $numero")
    }
    // Iteramos sobre el arreglo de números, pero como no hemos asignado valores todavía, no se mostrará nada.
    for (numero in arregloDeNumeros) {
        println("Tamaño $numero")
    }
    // Iteramos sobre el arreglo de números, pero esta vez asignamos un valor a cada elemento.
    for (valor in arregloDeNumeros.indices) {      // recorre el índice
        arregloDeNumeros[valor] = valor + 1      // con el +1 la lista empieza desde 1, sin este empezar de 0
    }
    // Iteramos sobre el arreglo de números, esta vez con valores asignados, y mostramos cada elemento.
    for (valor in arregloDeNumeros) {
        println("Valor $valor")
    }
    // Iteramos sobre el arreglo de números, y además de mostrar cada elemento, mostramos su índice correspondiente.
    for ((indice, valor) in arregloDeNumeros.withIndex()) {      //quiero saber su indice y su valor
        println("Este es el $indice y este es el valor $valor")
    }

}

// La siguiente función utiliza un while loop para imprimir valores desde 0 hasta el valor proporcionado como argumento.
fun nuestroPrimerWhile(valor: Int) {
// Inicializamos una variable i en 0.
    var i = 0
// Mientras i sea menor o igual que el valor proporcionado, mostramos el valor actual de i y lo incrementamos en 1.
    while (i <= valor) {
        println("Este es el valor dentro del ciclo $i")
        i++
    }
// Cuando se termina el loop, mostramos un mensaje de que se ha salido del ciclo.
    println("Se salió del ciclo")
}


// La siguiente función utiliza un do-while loop para imprimir valores desde 1 hasta el valor proporcionado como argumento.
fun nuestroPrimerDoWhile(valor: Int) {
// Inicializamos una variable i en 1.
    var i = 1
// Hacemos lo siguiente al menos una vez, y después mientras i sea menor o igual que el valor proporcionado.
    do {
        println("Este es el valor en el Do While $i")
        i++
    } while (i <= valor)
// Cuando se termina el loop, mostramos un mensaje de que se ha salido del ciclo.
    println("Estoy afuera del ciclo")
}
fun trabajandoConListasEnKotlin() {
    // Creamos una lista vacía de nombres.
    var listaDeNombres = arrayListOf<String>()

// Definimos variables con los nombres de personas.
    var nombrePersona1: String = "Alaska"
    var nombrePersona2: String = "Katya"
    var nombrePersona3: String = "Trixie"
    var nombrePersona4: String = "Sharonne"
    var nombrePersona5: String = "Anetra"
    var nombrePersona6: String = "Sasha"

// Agregamos los nombres a la lista.
    listaDeNombres.add(nombrePersona1)
    listaDeNombres.add(nombrePersona2)
    listaDeNombres.add(nombrePersona3)
    listaDeNombres.add(nombrePersona4)
    listaDeNombres.add(nombrePersona5)
    listaDeNombres.add(nombrePersona6)

// Imprimimos la lista de nombres en la consola.
    println(listaDeNombres)

// Agregamos más nombres a la lista.
    listaDeNombres.addAll(listOf("Monet", "Kimchi"))

// Recorremos la lista y mostramos cada elemento en la consola.
    for (i in listaDeNombres) {
        println(i)
    }

// Obtenemos un nombre de la lista usando un índice específico.
    var nombreObtenido: String = listaDeNombres[2]
    println(nombreObtenido)

// Cambiamos el valor de un elemento de la lista.
    listaDeNombres[2] = "Bebe Zahara"
    println(listaDeNombres)

// Recorremos la lista y mostramos cada elemento con su índice correspondiente.
    for ((indice, valor) in listaDeNombres.withIndex()) {
        println("Este es el $indice y este es el valor $valor")
    }

// Obtenemos el tamaño de la lista usando dos métodos diferentes.
    var tamañoLista1: Int = listaDeNombres.size
    var tamañoLista2: Int = listaDeNombres.count()
    println(tamañoLista1)
    println(tamañoLista2)

// Recorremos la lista usando una función lambda y mostramos cada elemento en la consola.
    listaDeNombres.forEach{
        println(it)
    }

// Recorremos la lista usando una función lambda y mostramos cada elemento con su índice correspondiente.
    listaDeNombres.forEachIndexed{indice, valor ->
        println("Este es el $indice y este es el nombre es $valor")
    }

// Obtenemos el primer y último elemento de la lista y los mostramos en la consola.
    var saberElPrimerNombre: String = listaDeNombres.first()
    var saberElUltimoNombre: String = listaDeNombres.last()
    println("Este es el primero de la lista $saberElPrimerNombre")
    println("Este es el último de la lista $saberElUltimoNombre")

// Eliminamos un elemento de la lista usando un índice específico y mostramos la lista actualizada en la consola.
    listaDeNombres.removeAt(2)
    println(listaDeNombres)

// Borramos todos los elementos de la lista y mostramos la lista vacía en la consola.
    listaDeNombres.clear()
    println(listaDeNombres)

}
