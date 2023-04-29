package com.example.aprendiendokotlin

/*
- Ordenar la lista de personas por nombre o por edad.
- Permitir que el usuario busque una persona por nombre o por edad.
- Guardar la lista de personas en un archivo y cargarla al iniciar el programa.
- Agregar validación de entrada de usuario para evitar errores
  (por ejemplo, asegurarse de que la edad ingresada sea un número entero válido).
- Agregar una función para mostrar la persona más joven y la persona más vieja en la lista.
- Permitir al usuario actualizar la edad de una persona existente.
- Agregar una función para mostrar la cantidad total de personas en la lista.
- Agregar la posibilidad de agregar más información sobre la persona, como su dirección o su número de teléfono.

*/

val estudiante = mutableMapOf<String, MutableMap<String, Any>>()

fun main() {
    menu()
}

fun menu(){
    do {
        println("╔══════════════════════════════════╗")
        println("║       MENÚ ESTUDIANTES ANDROID   ║")
        println("╠══════════════════════════════════╣")
        println("║ 1. Agregar estudiante            ║")
        println("║ 2. Mostrar lista de estudiantes  ║")
        println("║ 3. Eliminar estudiante           ║")
        println("║ 4. Ordenar por nombre            ║")
        println("║ 5. Ordenar por edad              ║")
        println("║ 6. Buscar por nombre o edad      ║")
        println("║ 7. Mostrar cantidad estudiantes  ║")
        println("║ 8. Mostrar más joven y viejo     ║")
        println("║ 9. Actualizar edad de estudiante ║")
        println("║ 10. Agregar mas informacion      ║")
        println("║ 11. Salir                        ║")
        println("╚══════════════════════════════════╝")

        print("Ingresa tu opción: ")
        val opcion : String = readLine().toString()
        if(opcion.matches(Regex("\\d+"))){

            when (opcion) {
                "1" -> {
                    ingresarEstudiante()
                }
                "2" -> {
                    mostrarLista()
                }
                "3" -> {
                    eliminarEstudiante()
                }
                "4" ->{
                    ordenarNombre()
                }
                "5" ->{
                    ordenarEdad()
                }
                "6" -> {
                    buscar()
                }
                "7" ->{
                    mostrarAlumnos()
                }
                "8" -> {
                    mostrarJovenViejo()
                }
                "9" ->{
                    actualizarEdad()
                }
                "10" ->{
                    agregarMasInfo()
                }
                "11" -> {
                    println("Saliendo del programa...")
                }
                else -> {
                    println("Opción inválida. Inténtalo de nuevo.")
                }
            }
        }else{
            println("Dato ingresado no valido")
        }
    } while (opcion != "11")
}


// Funciones

fun ingresarEstudiante() {
    var x = 1 // contador para el número de estudiantes ingresados
    var exit = "y" // variable para controlar la salida del bucle while
    while (exit == "y") { // bucle while para continuar ingresando estudiantes
        print("\nIngresa el nombre del estudiante ${x} --> ")
        val nombre = readLine().toString().uppercase() // ingreso del nombre del estudiante, se convierte a mayúsculas
        if (!nombre.matches(Regex("[a-zA-Z\\s]+"))) { // si el nombre no cumple con la expresión regular, se muestra un mensaje de error y se continúa con el siguiente estudiante
            println("Nombre ingresado no válido, inténtelo de nuevo")
            continue
        }
        var edadFinal: Int? = null // variable para almacenar la edad del estudiante
        while (edadFinal == null) { // bucle while para asegurarse de que se ingrese una edad válida
            print("Ingresa la edad de $nombre --> ")
            val edad: String = readLine().toString() // ingreso de la edad del estudiante
            if (edad.matches(Regex("\\d+"))) { // si la edad cumple con la expresión regular, se convierte a Int y se almacena en la variable edadFinal
                edadFinal = edad.toInt()
            } else {
                println("Edad ingresada no válida, inténtelo de nuevo") // si la edad no cumple con la expresión regular, se muestra un mensaje de error y se vuelve a pedir la edad
            }
        }
        val nuevoEstudiante = mutableMapOf<String, Any>() // se crea un nuevo mapa para el estudiante ingresado
        nuevoEstudiante["edad"] = edadFinal // se agrega la edad del estudiante al mapa
        estudiante[nombre] = nuevoEstudiante // se agrega el mapa del estudiante al mapa principal
        println("$nombre ha sido agregado correctamente.")
        x++ // se aumenta el contador de estudiantes ingresados
        do {
            print("¿Desea seguir? --> y/n ")
            exit = readLine().toString().toLowerCase() // se pregunta al usuario si desea ingresar otro estudiante o salir del programa
        } while (exit != "y" && exit != "n") // si la respuesta no es "y" o "n", se vuelve a preguntar
    }
    println("Operación finalizada.") // se muestra un mensaje de finalización del programa
}


fun mostrarLista(){
    if (estudiante.isEmpty()) { // Verifica si la lista de estudiantes está vacía
        println("No hay personas en la lista.")
    } else {
        println("Lista de personas:")
        estudiante.forEach { (name, age) -> // Itera sobre cada estudiante en la lista
            println("- $name ($age años)") // Imprime el nombre y la edad de cada estudiante
        }
    }
}

// Función que elimina un estudiante de la lista
fun eliminarEstudiante() {
    // Se pide el nombre del estudiante que se desea eliminar
    print("Ingresa el nombre de la persona que deseas eliminar --> ")
    val nombre = readLine().toString().uppercase()

    // Si el nombre está en la lista de estudiantes, se elimina
    if (estudiante.containsKey(nombre)) {
        estudiante.remove(nombre)
        println("\nLa persona $nombre ha sido eliminada correctamente.")
    } else {
        // Si el nombre no está en la lista, se muestra un mensaje de error
        println("La persona $nombre no se encontró en la lista.")
    }
}

/**
 * Función que muestra la cantidad total de estudiantes en la lista.
 */
fun mostrarAlumnos() {
    var total : Int = 0
    // Recorre la lista de estudiantes y cuenta el número de elementos
    for (i in estudiante){
        total++
    }
    // Imprime el resultado
    println("La cantidad total de estudiantes --> $total")
}

fun ordenarNombre() {
    // Se crea una nueva lista a partir de la lista original de estudiantes, ordenada alfabéticamente por nombre
    val listaOrdenadaPorNombre = estudiante.toList().sortedBy { it.first }
    // Se imprime un mensaje de encabezado
    println("Lista ordenada por nombre:")
    // Se itera por cada elemento de la lista ordenada, y se imprime el nombre y la edad de cada estudiante
    listaOrdenadaPorNombre.forEach { (name, age) ->
        println("- $name ($age años)")
    }
}


fun ordenarEdad() {
    // Convertimos el mapa a una lista para poder ordenarla
    val listaOrdenadaPorEdad = estudiante.toList().sortedBy { it.second["edad"] as Int? }
    // Imprimimos la lista ordenada
    println("Lista ordenada por edad:")
    listaOrdenadaPorEdad.forEach { (name, map) ->
        // Obtenemos la edad de cada persona del mapa y la imprimimos junto con su nombre
        val edad = map["edad"]
        println("- $name (${edad} años)")
    }
}

fun buscar(){
    // Pide al usuario que ingrese el criterio de búsqueda
    var criterio = ""
    while (criterio != "nombre" && criterio != "edad") {
        print("Ingresa el criterio de búsqueda (nombre o edad): ")
        criterio = readLine()?.toString()?.lowercase() ?: ""
        if (criterio != "nombre" && criterio != "edad") {
            println("Criterio de búsqueda inválido.")
        }
    }

    // Realiza la búsqueda en función del criterio ingresado
    when (criterio) {
        // Si el criterio de búsqueda es por nombre
        "nombre" -> {
            var nombre = ""
            // Pide al usuario que ingrese el nombre de la persona que desea buscar
            while (nombre !in estudiante.keys) {
                print("Ingresa el nombre de la persona que deseas buscar --> ")
                nombre = readLine()?.toString() ?: ""
                // Valida que el nombre ingresado sea válido (que contenga solo letras y espacios)
                if (!nombre.matches(Regex("[a-zA-Z][a-zA-Z\\s]*"))) {
                    println("Nombre ingresado no valido, intentelo")
                    continue
                } else {
                    // Si el nombre ingresado no está en la lista, muestra un mensaje indicándolo
                    if (nombre !in estudiante.keys) {
                        println("La persona $nombre no se encontró en la lista.")
                    }
                }
            }
            // Muestra la edad de la persona encontrada
            println("La persona $nombre tiene ${estudiante[nombre]?.get("edad")} años.")
        }
        // Si el criterio de búsqueda es por edad
        "edad" -> {
            var nombres = emptySet<String>()
            var edad: Int? = null
            // Pide al usuario que ingrese la edad de la persona que desea buscar
            do {
                print("Ingresa la edad de la persona que deseas buscar: ")
                val input = readLine()
                // Valida que la edad ingresada sea un número entero positivo
                if (input != null && input.matches(Regex("\\d+"))) {
                    edad = input.toInt()
                    if (edad <= 0) {
                        println("Edad ingresada no válida.")
                        edad = null
                    }
                } else {
                    println("Edad ingresada no válida.")
                }
            } while (edad == null)
            // Busca en la lista las personas que tengan la edad ingresada y guarda sus nombres en un conjunto
            nombres = estudiante.filterValues { it["edad"] == edad }.keys
            // Si no hay personas en la lista con la edad ingresada, muestra un mensaje indicándolo
            if (nombres.isEmpty()) {
                println("No hay personas en la lista con $edad años.")
            } else {
                // Si hay personas en la lista con la edad ingresada, muestra sus nombres
                println("Las personas con $edad años son:")
                nombres.forEach { nombre ->
                    println("- $nombre")
                }
            }
        }
    }
}
fun mostrarJovenViejo() {
    // Verifica si la lista de estudiantes está vacía
    if (estudiante.isEmpty()) {
        // Si está vacía, muestra un mensaje indicando que no hay personas en la lista
        println("No hay personas en la lista.")
    } else {
        // Si la lista no está vacía, encuentra la persona con la edad más baja (más joven) en el mapa de estudiantes
        val masJoven = estudiante.minByOrNull { it.value["edad"] as Int }
        // Encuentra la persona con la edad más alta (más vieja) en el mapa de estudiantes
        val masViejo = estudiante.maxByOrNull { it.value["edad"] as Int }

        // Muestra la información de la persona más joven encontrada en el mapa de estudiantes
        println("La persona más joven es ${masJoven?.key} con ${masJoven?.value?.get("edad")} años.")
        // Muestra la información de la persona más vieja encontrada en el mapa de estudiantes
        println("La persona con más experiencia de vida es ${masViejo?.key} con ${masViejo?.value?.get("edad")} años.")
    }
}

fun actualizarEdad() {
    // Solicita al usuario que ingrese el nombre de la persona cuya edad desea actualizar
    print("Ingresa el nombre de la persona cuya edad deseas actualizar --> ")
    val nombre = readLine()?.toString() ?: ""

    // Verifica si el nombre ingresado existe en el mapa de estudiantes
    if (estudiante.containsKey(nombre)) {
        // Si el nombre existe, solicita al usuario que ingrese la nueva edad
        print("Ingresa la nueva edad de la persona --> ")
        val nuevaEdad: Any? = readLine()

        // Verifica si la edad ingresada es un número entero válido (no nulo)
        if (nuevaEdad != null && nuevaEdad is Int) {
            // Si la nueva edad es válida, actualiza la edad en el mapa de estudiantes
            estudiante.get(nombre)?.put("edad", nuevaEdad)
            // Muestra un mensaje confirmando que la edad se ha actualizado correctamente
            println("La edad de la persona $nombre ha sido actualizada a $nuevaEdad años.")
        } else {
            // Si la nueva edad no es válida, muestra un mensaje de error
            println("La edad ingresada no es válida.")
        }
    } else {
        // Si el nombre ingresado no existe en el mapa de estudiantes, muestra un mensaje de error
        println("La persona $nombre no se encontró en la lista.")
    }
}

fun agregarMasInfo() {
    // Mostramos la lista de estudiantes
    println("Lista de estudiantes:")
    estudiante.keys.forEach { nombre ->
        println("- $nombre")
    }
    // Pedimos el nombre del estudiante al que se le quiere agregar más información
    print("¿A qué estudiante le quieres agregar más datos? ")
    val nombre = readLine()?.toString() ?: ""
    if (estudiante.containsKey(nombre)) {
        // Si el estudiante está en la lista, pedimos la clave y el valor que se quieren agregar
        print("Ingresa el nombre del dato que quieres agregar, por ejemplo 'Correo', 'Carrera', etc.: ")
        val clave = readLine()?.toString() ?: ""
        print("Ingresa el valor que quieres agregar para $clave: ")
        val valor = readLine()?.toString() ?: ""
        // Si el estudiante no tenía ningún dato adicional, creamos un mapa mutable
        if (estudiante[nombre] == null) {
            estudiante[nombre] = mutableMapOf<String, Any>()
        }
        // Agregamos la clave y el valor al mapa de datos adicionales del estudiante
        estudiante[nombre]?.put(clave, valor)
        println("El valor $valor para la clave $clave ha sido agregado a $nombre.")
    } else {
        // Si el estudiante no está en la lista, mostramos un mensaje de error
        println("El estudiante $nombre no se encontró en la lista.")
    }
}
