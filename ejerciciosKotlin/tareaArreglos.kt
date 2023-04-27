package ejerciciosKotlin

/*
- Cree un programa en Kotlin que pregunte por pantalla la cantidad de elementos que tendrá el arreglo.
- Capture el dato de entrada y setee un arreglo de enteros del tamaño ingresado por el usuario.
- Una vez que haya creado el arreglo e indicado la cantidad de elementos ,proceda a llenar el arreglo con numeros por
 pantalla agregando cada elemento segun la cantidad que ingresó el usuario.

Una vez que ya tenga con contenido el arreglo, crear 3 funcionalidades de este programa:

1)Mostrar el contenido del arreglo en orden inverso
2)Imprimir el contenido del arreglo en orden normal
3)Sumar los elementos del arreglo y mostrar el resultado por pant

Considere hacer las validaciones correspondientes para que el programa no se caiga
y acepte solo enteros como entrada por teclado.
 */

fun main() {
    val tamañoArreglo = solicitarTamañoArreglo()
    val arreglo = crearArreglo(tamañoArreglo)

    llenarArreglo(arreglo)
    //mostrarArregloNormal(arreglo)
    //mostrarArregloInverso(arreglo)
    //mostrarSumaArreglo(arreglo)
}

// Esta función se encarga de solicitar al usuario el tamaño del arreglo.
fun solicitarTamañoArreglo(): Int {
    // Se define una variable "tamaño" como null para iniciar el bucle while.
    var tamaño: Int? = null
    while (tamaño == null) {
        println("Ingrese la cantidad de elementos del arreglo:")
        try {
            // Se intenta leer el valor ingresado por el usuario y convertirlo a un número entero.
            tamaño = readLine()?.toInt()
            // Si no se puede convertir a entero, se lanza una excepción para que el bucle continúe pidiendo el tamaño.
            if (tamaño == null) throw Exception()
        } catch (e: Exception) {
            // Si se produce una excepción, se indica que el valor ingresado no es válido y se vuelve a solicitar el tamaño.
            println("Ingrese un número válido.")
        }
    }
    // La función devuelve el tamaño del arreglo obtenido.
    return tamaño
}

// Esta función se encarga de crear un arreglo de enteros con el tamaño indicado por el usuario.
fun crearArreglo(tamaño: Int): IntArray {
    // Se usa la función "IntArray" para crear un arreglo de enteros con el tamaño indicado y se devuelve el arreglo creado.
    return IntArray(tamaño)
}

// Esta función se encarga de solicitar al usuario los valores que se van a almacenar en el arreglo.
fun llenarArreglo(arreglo: IntArray) {
    // Se utiliza un bucle for para iterar sobre los índices del arreglo.
    for (valor in arreglo.indices) {
        // Se define una variable "numero" como null para iniciar el bucle do-while.
        var numero: Int?
        do {
            // Se solicita al usuario que ingrese el valor para la posición actual del arreglo.
            println("Ingrese el valor N°${valor + 1}:")
            // Se lee la entrada del usuario y se intenta convertir a un número entero.
            numero = readLine()?.toIntOrNull()
            // Se utiliza un when para evaluar el valor ingresado por el usuario.
            when (numero) {
                null -> println("El valor ingresado no es un número válido.")
                else -> if (numero < 1) println("El valor debe ser mayor que cero.")
            }
        // El bucle se repite mientras el valor ingresado es null o menor que 1.
        } while (numero == null || numero < 1)
        // Se asigna el valor ingresado en la posición actual del arreglo.
        arreglo[valor] = numero
    }
    // Se imprime un mensaje de agradecimiento una vez que se han ingresado todos los valores del arreglo.
    println("Gracias por ingresar los valores del arreglo.")
}


