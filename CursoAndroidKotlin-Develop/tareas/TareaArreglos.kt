package com.example.aprendiendokotlin


/*

Cree un programa en Kotlin que pregunte por pantalla la cantidad de elementos que tendrá el arreglo.
Capture el dato de entrada y setee un arreglo de enteros del tamaño ingresado por el usuario.
Una vez que haya creado el arreglo e indicado la cantidad de elementos ,proceda a llenar el arreglo
con numeros por pantalla agregando cada elemento segun la cantidad que ingresó el usuario.
 Luego que haya llenado el arreglo ,muestre por pantalla un menu que indique las siguinetes opciones
 a realizar como usuario:

1)Mostrar el contenido del arreglo en orden inverso.
2)Imprimir el contenido y su indice del arreglo en orden normal.
3)Mostrar el primer y el ultimo elemento del arreglo.
4)Sumar los elementos del arreglo y mostrar el resultado por pantalla
5) Actualizar o agregar un nuevo valor al arreglo y mostrar la nueva suma

Considere hacer las validaciones correspondientes para que el programa no se caiga
y acepte solo enteros como entrada por teclado.
 */

fun main() {

    val tamanioArreglo = solicitarTamanioArreglo()
    var arreglo = crearArreglo(tamanioArreglo)
    var opcion: Int? = null

    arreglo=llenarArreglo(arreglo)

    while (opcion != 7) {

        println("╔══════════════════════════════════╗")
        println("║           MENÚ PRINCIPAL         ║")
        println("╠══════════════════════════════════╣")
        println("║ 1. Orden Inverso                 ║")
        println("║ 2. Orden Normal                  ║")
        println("║ 3. Primero y ultimo              ║")
        println("║ 4. Sumar Todos                   ║")
        println("║ 5. Actualizar Suma               ║")
        println("║ 6. Eliminar elemento             ║")
        println("║ 7. Elimina todo                  ║")
        println("║ 8. Salir                         ║")
        println("╚══════════════════════════════════╝")

        print("Ingresa tu opción: ")

        try {
            opcion = readLine()?.toInt()
            when (opcion) {
                1 -> mostrarArregloInverso(arreglo)
                2 -> mostrarArregloNormal(arreglo)
                3 -> mostrarPrimerYUltimo(arreglo)
                4 -> mostrarSumaArreglo(arreglo)
                5 -> actualizarValor(arreglo)
                6-> eliminarUnElemento(arreglo)
                7-> borrarTodosLosDatos(arreglo)
                8 -> println("Hasta luego. Dale que puedes!")
                else -> println("Ingrese una opción válida.")
            }
        } catch (e: Exception) {
            println("Ingrese una opción válida.")
        }
    }
}
fun solicitarTamanioArreglo(): Int {
    var tamanio: Int? = null
    do {
        println("Ingrese la cantidad de elementos del arreglo:")
        try {
            tamanio = readLine()?.toInt()
            if (tamanio == null) throw Exception()
        } catch (e: Exception) {
            println("Ingrese un número válido.")
        }
    } while (tamanio == null)

    return tamanio

}
fun crearArreglo(tamanio: Int): IntArray {
    return IntArray(tamanio)
}
fun llenarArreglo(arreglo : IntArray):IntArray {

    for (i in arreglo.indices) {
        var numeroTeclado: Int? = null
        while (numeroTeclado == null) {
            println("Ingrese el número para la posición $i:")
            try {
                numeroTeclado = readLine()?.toInt()
                if (numeroTeclado == null) throw Exception()
            } catch (e: Exception) {
                println("Ingrese un número válido.")
            }
        }
        // Sale del ciclo while pero no del for, llena con el indice
        arreglo[i] = numeroTeclado
    }

    return arreglo
}
fun mostrarArregloInverso(arreglo:IntArray){

    println("Estos son los datos invertidos:")
    /*
    Es igual a esto int i= arreglo.size() - 1
    hasta cero
     */
    for (i in arreglo.size - 1 downTo 0) {

        print("[ ${arreglo[i]} ] ")
        println("")

    }
}
fun mostrarArregloNormal(arreglo: IntArray){

    println("Estos son los datos ingresados")
    for (numero in arreglo){
        print("[ ${numero} ] ")
        println("")
    }
}
fun mostrarPrimerYUltimo(arreglo: IntArray){

    var primerNUmero: Int =0
    var ultimoNumero: Int = 0

    primerNUmero= arreglo.first()
    ultimoNumero= arreglo.last()

    println("El primer registro es: $primerNUmero")
    println("El ultimo registro es: $ultimoNumero")

}
fun mostrarSumaArreglo(arreglo: IntArray){

    var suma:Int = arreglo.sum()
    println("La suma de los numeros es: $suma")

}
fun actualizarValor(arreglo: IntArray){

    var posicionNumero:Int? = 0
    var numeroActualizado:Int? =0
    var sumaActualizada=0

    do {
        println("Ingrese la posicion que deseas actualizar:")
        try {
            posicionNumero = readLine()?.toInt()
            println("Ingrese el numero para actualizar:")
            numeroActualizado = readLine()?.toInt()
            if ( posicionNumero == null || numeroActualizado == null) throw Exception()
        } catch (e: Exception) {
            println("Ingrese un número válido.")
        }
    } while (posicionNumero == null)

    if (posicionNumero < arreglo.size) {
        arreglo[posicionNumero] = numeroActualizado!!
        var sumaActualizada = arreglo.sum()
        println("La nueva suma de los valores es: $sumaActualizada")
        println("Arreglo actualizado: ${arreglo.joinToString()}")
    } else {
        println("La posición que desea actualizar no existe en el arreglo.")
    }

}
fun eliminarUnElemento(arreglo: IntArray){

    println("Ingrese la posicion que deseas actualizar:")
    try {
        val num = readLine()?.toInt() ?: 0
        val copiaArreglo = IntArray(arreglo.size - 1) {
            //Si el indice es menor al numero ingresado , se copia el numero en el mismo indice
            // si no , se copia el elemento en el indice posterior
                i -> if (i < num) arreglo[i] else arreglo[i + 1]
        }
        println("El número ${arreglo[num]} ha sido eliminado. Números actuales: ${copiaArreglo.contentToString()}")
    } catch (e: Exception) {
        println("Ingrese un número válido.")
    }

}
fun borrarTodosLosDatos(arreglo: IntArray){

    for (num in arreglo.indices){
        arreglo[num]=0
    }
    print(arreglo.contentToString())

}