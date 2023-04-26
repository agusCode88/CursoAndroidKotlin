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
    arreglo=llenarArreglo(arreglo)

    for (valor in arreglo){
        println(valor)
    }
    //mostrarArregloInverso(arreglo)
    //mostrarArregloNormal(arreglo)
    //mostrarSumaArreglo(arreglo)
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
        var numero: Int? = null
        while (numero == null) {
            println("Ingrese el número para la posición $i:")
            try {
                numero = readLine()?.toInt()
                if (numero == null) throw Exception()
            } catch (e: Exception) {
                println("Ingrese un número válido.")
            }
        }
        arreglo[i] = numero
    }

    return arreglo
}
