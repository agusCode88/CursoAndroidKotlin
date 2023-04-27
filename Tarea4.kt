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
    elementos()
    menu()

}

fun elementos() {

    var cantidad: Int? = null

    do {

        println("Ingrese la cantidad de elementos de la lista --> ")

        try {
            cantidad = readln().toInt()
            if (cantidad == null) throw Exception()

            var arreglo : IntArray = IntArray(cantidad)
            var tamaño = arreglo

            for(i in arreglo.indices){

                print("Ingrese un numero para la lista --> ")
                var numero : Int = readln().toInt()
                arreglo[i] = numero
            }

        } catch (e: Exception) {
            println("Ingrese un número válido.")
        }

    }while (cantidad == null)
}

fun menu(){

    println("\nMENU PRINCIPAL")
    println("-------------------------")
    println("\n1.-Mostrar lista orden normal")
    println("2.-Mostrar lista orden inverso")
    println("3.-Mostrar primer y ultimo elemento")
    println("4.-Sumar los elementos de la lista y mostrar")
    println("5.-Actualizar o agregar un elemento a la lista y mostrar la nueva suma")
    println("6.-Salir")
    println("\nELIGE TU OPCION [1-2-3-4-5-6] --> ")
    var opc : Int = readln().toInt()
    
}

fun mostrarNormal(arreglo : IntArray){

   println(arreglo.contentToString()) //Muestra los elementos

}

fun mostrarInverso(arreglo : IntArray){

    arreglo.reverse() //Invierte el orden
    println(arreglo.contentToString())
}

fun mostrarPrimerElemento(arreglo : IntArray){

    println(arreglo.first()) //Muestra el primer elemento
    println(arreglo.last())  //Muestra el último elemento
}

fun mostrarUltimoElemento(arreglo : IntArray){

    println(arreglo.last())  //Muestra el último elemento
}

fun sumaElementos(arreglo: IntArray){

    println(arreglo.sum())  //Suma todos los elementos
}

fun modificarElemento(arreglo : IntArray){

    arreglo[3] = 5  //Modifica el ele
    println(arreglo.sum())
}




