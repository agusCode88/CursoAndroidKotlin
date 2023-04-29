package com.example.aprendiendokotlin

/*

Necesario: Llenar la lista de estudiantes

Ideas:

//Ordenar la lista de personas por nombre o por edad.
//Permitir que el usuario busque una persona por nombre o por edad.
*Guardar la lista de personas en un archivo y cargarla al iniciar el programa.
//Agregar validación de entrada de usuario para evitar errores (por ejemplo, asegurarse de que la edad ingresada sea un número entero válido).
//Agregar una función para mostrar la persona más joven y la persona más vieja en la lista.
//Permitir al usuario actualizar la edad de una persona existente.
//Agregar una función para mostrar la cantidad total de personas en la lista.
*Agregar la posibilidad de agregar más información sobre la persona, como su dirección o su número de teléfono.
 */

val estudiante = mutableMapOf<String, MutableMap<String, Any>>()


fun main() {

    menu()
}


fun ingresarEstudiante() {
    var x = 1
    var exit = "y"
    while (exit == "y") {
        print("\nIngresa el nombre del estudiante ${x} --> ")
        val nombre = readLine().toString().uppercase()
        if (!nombre.matches(Regex("[a-zA-Z\\s]+"))) {
            println("Nombre ingresado no válido, inténtelo de nuevo")
            continue
        }
        var edadFinal: Int? = null
        while (edadFinal == null) {
            print("Ingresa la edad de $nombre --> ")
            val edad: String = readLine().toString()
            if (edad.matches(Regex("\\d+"))) {
                edadFinal = edad.toInt()
            } else {
                println("Edad ingresada no válida, inténtelo de nuevo")
            }
        }
        val nuevoEstudiante = mutableMapOf<String, Any>()
        nuevoEstudiante["edad"] = edadFinal
        estudiante[nombre] = nuevoEstudiante
        println("$nombre ha sido agregado correctamente.")
        x++
        do {
            print("¿Desea seguir? --> y/n ")
            exit = readLine().toString().toLowerCase()
        } while (exit != "y" && exit != "n")
    }
    println("Operación finalizada.")
}

fun mostrarLista(){
    if (estudiante.isEmpty()) {
        println("No hay personas en la lista.")
    } else {
        println("Lista de personas:")
        estudiante.forEach { (name, age) ->
            println("- $name ($age años)")
        }
    }
}

fun eliminarEstudiante(){

    print("Ingresa el nombre de la persona que deseas eliminar --> ")
    val nombre = readLine().toString().uppercase()
    if (estudiante.containsKey(nombre)) {
        estudiante.remove(nombre)
        println("\nLa persona $nombre ha sido eliminada correctamente.")
    } else {
        println("La persona $nombre no se encontró en la lista.")
    }
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


fun mostrarAlumnos() {

    var total : Int = 0

    for (i in estudiante){

        total++
    }
    println("La cantidad total de estudiantes --> $total")
}
fun ordenarNombre() {
    val listaOrdenadaPorNombre = estudiante.toList().sortedBy { it.first }
    println("Lista ordenada por nombre:")
    listaOrdenadaPorNombre.forEach { (name, age) ->
        println("- $name ($age años)")
    }
}

fun ordenarEdad() {
    val listaOrdenadaPorEdad = estudiante.toList().sortedBy { it.second["edad"] as Int? }
    println("Lista ordenada por edad:")
    listaOrdenadaPorEdad.forEach { (name, map) ->
        val edad = map["edad"]
        println("- $name (${edad} años)")
    }
}

fun buscar(){
    var criterio = ""
    while (criterio != "nombre" && criterio != "edad") {
        print("Ingresa el criterio de búsqueda (nombre o edad): ")
        criterio = readLine()?.toString()?.lowercase() ?: ""
        if (criterio != "nombre" && criterio != "edad") {
            println("Criterio de búsqueda inválido.")
        }
    }
    when (criterio) {
        "nombre" -> {
            var nombre = ""
            while (nombre !in estudiante.keys) {
                print("Ingresa el nombre de la persona que deseas buscar --> ")
                nombre = readLine()?.toString() ?: ""
                if (!nombre.matches(Regex("[a-zA-Z][a-zA-Z\\s]*"))) {
                    println("Nombre ingresado no valido, intentelo")
                    continue
                }else{
                    if (nombre !in estudiante.keys) {
                        println("La persona $nombre no se encontró en la lista.")
                    }
                }
            }
            println("La persona $nombre tiene ${estudiante[nombre]?.get("edad")} años.")
        }
        "edad" -> {
            var nombres = emptySet<String>()
            var edad: Int? = null
            do {
                print("Ingresa la edad de la persona que deseas buscar: ")
                val input = readLine()
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
            nombres = estudiante.filterValues { it["edad"] == edad }.keys
            if (nombres.isEmpty()) {
                println("No hay personas en la lista con $edad años.")
            } else {
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
    println("Lista de estudiantes:")
    estudiante.keys.forEach { nombre ->
        println("- $nombre")
    }

    print("¿A qué estudiante le quieres agregar más datos? ")
    val nombre = readLine()?.toString() ?: ""
    if (estudiante.containsKey(nombre)) {
        print("Ingresa el nombre del dato que quieres agregar, por ejemplo 'Correo', 'Carrera', etc.: ")
        val clave = readLine()?.toString() ?: ""
        print("Ingresa el valor que quieres agregar para $clave: ")
        val valor = readLine()?.toString() ?: ""

        if (estudiante[nombre] == null) {
            estudiante[nombre] = mutableMapOf<String, Any>()
        }

        estudiante[nombre]?.put(clave, valor)
        println("El valor $valor para la clave $clave ha sido agregado a $nombre.")
    } else {
        println("El estudiante $nombre no se encontró en la lista.")
    }
}