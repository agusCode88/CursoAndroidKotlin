package tareas

/*

Necesario: Llenar la lista de estudiantes

Ideas:

*       Ordenar la lista de personas por nombre o por edad.
*       Permitir que el usuario busque una persona por nombre o por edad.
*       Guardar la lista de personas en un archivo y cargarla al iniciar el programa.
*Morita Agregar validación de entrada de usuario para evitar errores (por ejemplo, asegurarse de que la edad ingresada sea un número entero válido).
*Agregar una función para mostrar la persona más joven y la persona más vieja en la lista.
*Stiven Permitir al usuario actualizar la edad de una persona existente.
*Javiera Agregar una función para mostrar la cantidad total de personas en la lista.
*Agregar la posibilidad de agregar más información sobre la persona, como su dirección o su número de teléfono.

 */


fun main() {
    // Establecemos valores iniciales para las variables de edad máxima y mínima, y las listas de nombres de personas más jóvenes y más viejas.
    val estudiantes = mutableMapOf<String, MutableList<Int>>()// Diccionario de Estudiantes (nombre y edad)
    var edadMaxima = 0
    var edadMinima = Int.MAX_VALUE
    var nombresPersonasMasJovenes = mutableListOf<String>()
    var nombresPersonasMasViejas = mutableListOf<String>()

    do {
        println("╔════════════════════════════════════╗")
        println("║ MENÚ PRINCIPAL ESTUDIANTES ANDROID ║")
        println("╠════════════════════════════════════╣")
        println("║ 1. Agregar estudiante              ║")
        println("║ 2. Mostrar lista de estudiantes    ║") //*Agregar una función para mostrar la cantidad total de personas en la lista.
        println("║ 3. Buscar estudiante               ║") //Permitir que el usuario busque una persona por nombre o por edad.
        println("║ 4. Ordenar lista de estudiantes    ║") //*Ordenar la lista de personas por nombre o por edad.
        println("║ 5. Actualizar estudiantes          ║") // *Agregarr la posibilidad de agregar más información sobre la persona, como su dirección o su número de teléfono.
        println("║ 6. Salir                           ║")
        println("╚════════════════════════════════════╝")

        print("Ingresa tu opción: ")
        // Creamos una variable para almacenar la opción elegida por el usuario y verificamos que sea un valor numérico válido entre 1 y 7.
        var opcionMenuPrincipal: Int? = null
        do {
            opcionMenuPrincipal = readLine()?.toIntOrNull()
            if (opcionMenuPrincipal == null || opcionMenuPrincipal !in 1..7) {
                println("Opción inválida. Inténtalo de nuevo.")
            }
        } while (opcionMenuPrincipal == null || opcionMenuPrincipal !in 1..7)

        when (opcionMenuPrincipal) {
            1 -> {
                // Si el usuario elige la opción 1, le pedimos que ingrese el nombre y la edad de la persona.
                // Le pedimos al usuario que ingrese el nombre de la persona
                print("Ingresa el nombre de la persona: ")
                val nombre = readLine()?.toString() ?: ""

                // Le pedimos al usuario que ingrese la edad de la persona, y utilizamos un bloque try-catch para capturar
                // la excepción si el usuario ingresa una edad no numérica.
                print("Ingresa la edad de la persona: ")
                var edad: Int = 0
                try {
                    edad = readLine()?.toInt() ?: 0
                } catch (e: NumberFormatException) {
                    println("Error: Debes ingresar un número entero.")
                }

                // Si la edad es menor o igual a cero, informamos al usuario que debe ingresar un número mayor que cero.
                if (edad <= 0) {
                    println("Edad no válida. Por favor ingrese un número entero mayor que cero.")
                } else {
                    // Si el nombre de la persona ya está en el mapa de estudiantes, agregamos la edad a la lista de edades para ese nombre.
                    // Si el nombre de la persona no está en el mapa de estudiantes, agregamos una nueva entrada al mapa.
                    if (estudiantes.containsKey(nombre)) {
                        estudiantes[nombre]?.add(edad)
                    } else {
                        estudiantes[nombre] = mutableListOf(edad)
                    }
                    println("La persona $nombre ha sido agregada correctamente.")
                }
            }

            2 -> {
                // Si el usuario elige la opción 2, mostramos la lista de estudiantes
                if (estudiantes.isEmpty()) {
                    println("No hay personas en la lista.")
                } else {
                    println("Lista de personas (${estudiantes.size} personas en total):")
                    // Para cada entrada en el mapa de estudiantes, imprimimos el nombre y la lista de edades.
                    estudiantes.forEach { (nombre, edad) ->
                        println("- $nombre ($edad años)")
                    }
                }
            }

            3 -> {
                // Si el usuario elige la opción 3, mostramos un submenú de búsqueda.
                do {
                    // Mostramos el submenú de búsqueda.
                    println("╔══════════════════════════════════════════════╗")
                    println("║ MENÚ BUSCAR ESTUDIANTES ANDROID              ║")
                    println("╠══════════════════════════════════════════════╣")
                    println("║ 1. Buscar un estudiante por nombre           ║")
                    println("║ 2. Buscar un estudiante por edad             ║")
                    println("║ 3. Volver al menú principal                  ║")
                    println("║ 4. Salir                                     ║")
                    println("╚══════════════════════════════════════════════╝")

                    print("Ingresa tu opción: ")
                    var opcionMenuBuscar: Int? = null
                    do {
                        opcionMenuBuscar = readLine()?.toIntOrNull()
                        // Si la opción ingresada es nula o no se encuentra entre 1 y 4, se muestra un mensaje de error.
                        if (opcionMenuBuscar == null || opcionMenuBuscar !in 1..4) {
                            println("Opción inválida. Inténtalo de nuevo.")
                        }

                    } while (opcionMenuBuscar == null || opcionMenuBuscar !in 1..4)

                    when (opcionMenuBuscar) {
                        // En caso de elegir la opción 1, se busca el nombre del estudiante ingresado por el usuario y se muestra su edad.
                        1 -> {
                            print("Ingresa el nombre del estudiante que deseas buscar: ")
                            val nombreABuscar = readLine()?.toString() ?: ""
                            val edad = estudiantes[nombreABuscar]
                            if (edad != null) {
                                println("El estudiante $nombreABuscar tiene $edad años.")
                            } else {
                                println("No se encontró ningún estudiante con el nombre $nombreABuscar.")
                            }
                        }

                        // En caso de elegir la opción 2, se busca la edad ingresada por el usuario y se muestran los estudiantes que la tienen.
                        2 -> {
                            print("Ingresa la edad del estudiante que deseas buscar: ")
                            val edadABuscar = readLine()?.toInt() ?: 0
                            val estudiantesConEdad = estudiantes.filterValues { it.contains(edadABuscar) }
                            if (estudiantesConEdad.isNotEmpty()) {
                                println("Los estudiantes con $edadABuscar años son:")
                                estudiantesConEdad.keys.forEach { println("- $it") }
                            } else {
                                println("No se encontró ningún estudiante con $edadABuscar años.")
                            }
                        }

                        // En caso de elegir la opción 3, se sale del ciclo do-while que controla el menú buscar.
                        3 -> break

                        // En caso de elegir la opción 4, se retorna del método y se finaliza el programa.
                        4 -> return

                        // En caso de elegir una opción inválida, se muestra un mensaje de error.
                        else -> {
                            println("Opción inválida.")
                        }
                    }
                    println("Presiona ENTER para volver al menú buscar.")
                    readLine()
                } while (true)
            }

            4 -> do {

                println("╔══════════════════════════════════════════════╗")
                println("║      MENÚ ORDENAR ESTUDIANTES ANDROID        ║")
                println("╠══════════════════════════════════════════════╣")
                println("║ 1. Ordenar la lista de personas por nombre   ║") //*Ordenar la lista de personas por nombre o por edad.
                println("║ 2. Ordenar la lista de personas por edad     ║") //*Ordenar la lista de personas por nombre o por edad.
                println("║ 3. Mostrar la mas joven y la mas vieja       ║") //*Agregar una función para mostrar la persona más joven y la persona más vieja en la lista.
                println("║ 4. Volver al menú principal                  ║") //Volver al menú
                println("║ 5. Salir                                     ║") //Salir
                println("╚══════════════════════════════════════════════╝")

                // Aquí se pide al usuario que ingrese una opción y se valida si la opción es válida o no.
                print("Ingresa tu opción: ")
                var opcionMenuOrdenar: Int? = null
                do {
                    opcionMenuOrdenar = readLine()?.toIntOrNull()
                    if (opcionMenuOrdenar == null || opcionMenuOrdenar !in 1..5) {
                        println("Opción inválida. Inténtalo de nuevo.")
                    }
                } while (opcionMenuOrdenar == null || opcionMenuOrdenar !in 1..5)

                // Aquí se ejecuta una acción según la opción elegida por el usuario.
                when (opcionMenuOrdenar) {
                    // Ordenar la lista por nombre.
                    1 -> {
                        val listaOrdenada = estudiantes.toList().sortedBy { it.first }
                        println("Lista de estudiantes ordenada por nombre:")
                        listaOrdenada.forEach { (nombre, edades) ->
                            println("$nombre: ${edades.joinToString(", ")}")
                        }
                    }
                    // Ordenar la lista por edad.
                    2 -> {
                        val listaOrdenada = estudiantes.toList().sortedBy { it.second.maxOrNull() }
                        println("Lista de estudiantes ordenada por edad:")
                        listaOrdenada.forEach { (nombre, edades) ->
                            println("$nombre: ${edades.joinToString(", ")}")
                        }
                    }

                    // Mostrar la persona más joven y la más vieja.
                    3 -> {
                        if (estudiantes.isEmpty()) {
                            println("No hay personas en la lista.")
                        } else {
                            estudiantes.forEach { (nombre, edades) ->
                                edades.forEach { edad ->
                                    if (edad < edadMinima) {
                                        edadMinima = edad
                                        nombresPersonasMasJovenes = mutableListOf(nombre)
                                    } else if (edad == edadMinima) {
                                        nombresPersonasMasJovenes.add(nombre)
                                    }
                                    if (edad > edadMaxima) {
                                        edadMaxima = edad
                                        nombresPersonasMasViejas = mutableListOf(nombre)
                                    } else if (edad == edadMaxima) {
                                        nombresPersonasMasViejas.add(nombre)
                                    }
                                }
                            }
                            println("La(s) persona(s) más joven(es) es(son) ${nombresPersonasMasJovenes.joinToString(", ")} con $edadMinima años.")
                            println("La(s) persona(s) más vieja(s) es(son) ${nombresPersonasMasViejas.joinToString(", ")} con $edadMaxima años.")
                        }
                    }

                    4 -> break

                    5 -> return

                    else -> {
                        println("Opción inválida.")
                    }
                }
                println("Presiona ENTER para volver al menú ordenar.")
                readLine()
            } while (true)

            5 -> do {
                println("╔══════════════════════════════════════════════╗")
                println("║     MENÚ DE ACTUALIZACIÓN LISTA ESTUDIANTES  ║")
                println("╠══════════════════════════════════════════════╣")
                println("║ 1. Actualizar la edad del estudiante         ║") // *Permitir al usuario actualizar la edad de una persona existente.
                println("║ 2. Agregar dirección del estudiante          ║") //*Agregar la posibilidad de agregar más información sobre la persona, como su dirección o su número de teléfono.
                println("║ 3. Agregar teléfono  del estudiante          ║") //*Agregar la posibilidad de agregar más información sobre la persona, como su dirección o su número de teléfono.
                println("║ 4. Agregar información adicional             ║") //*Agregar la posibilidad de agregar más información sobre la persona, como su dirección o su número de teléfono.
                println("║ 5. Eliminar estudiante                       ║") //*Permitir al usuario eliminar una persona existente.
                println("║ 6. Volver al menú principal                  ║") //Volver al menú
                println("║ 7. Salir                                     ║") //Salir
                println("╚══════════════════════════════════════════════╝")

                print("Ingresa tu opción: ")
                var opcionMenuActualizar: Int? = null
                do {
                    opcionMenuActualizar = readLine()?.toIntOrNull()
                    if (opcionMenuActualizar == null || opcionMenuActualizar !in 1..7) {
                        println("Opción inválida. Inténtalo de nuevo.")
                    }
                } while (opcionMenuActualizar == null || opcionMenuActualizar !in 1..7)

                // Se utiliza una estructura de control when para seleccionar la acción correspondiente según la opción seleccionada por el usuario.
                when (opcionMenuActualizar) {
                    // Si la opción seleccionada es 1, se solicita al usuario el nombre de la persona cuya edad se actualizará y se actualiza la edad.
                    1 -> {
                        print("Ingresa el nombre de la persona que deseas actualizar la edad: ")
                        val nombre = readLine()?.toString() ?: ""
                        if (estudiantes.containsKey(nombre)) {
                            print("Ingresa la nueva edad de la persona: ")
                            val edad = readLine()?.toInt() ?: 0
                            estudiantes[nombre] = mutableListOf(edad)
                            println("La edad de $nombre ha sido actualizada correctamente.")
                        } else {
                            println("La persona $nombre no se encontró en la lista.")
                        }
                    }
                    // Si la opción seleccionada es 2, se muestra un mensaje indicando que se agregará una dirección.
                    2 -> {
                        println("Aquí va la funcion agregar dirección")
                    }
                    // Si la opción seleccionada es 3, se muestra un mensaje indicando que se agregará un teléfono.
                    3 -> {
                        println("Aquí va la funcion agregar teléfono")
                    }
                    // Si la opción seleccionada es 4, se muestra un mensaje indicando que se agregará información adicional.
                    4 -> {
                        println("Aquí va la funcion agregar información adicional")
                    }
                    // Si la opción seleccionada es 5, se solicita al usuario el nombre de la persona que se eliminará de la lista y se elimina.
                    5 -> {
                        print("Ingresa el nombre de la persona que deseas eliminar: ")
                        val nombre = readLine()?.toString() ?: ""
                        if (estudiantes.containsKey(nombre)) {
                            estudiantes.remove(nombre)
                            println("La persona $nombre ha sido eliminada correctamente.")
                        } else {
                            println("La persona $nombre no se encontró en la lista.")
                        }
                    }
                    // Si la opción seleccionada es 6, se rompe el ciclo y se vuelve al menú principal.
                    6 -> break
                    // Si la opción seleccionada es 7, se termina el programa.
                    7 -> return

                    else -> {
                        println("Opción inválida.")
                    }
                }
                println("Presiona ENTER para volver al menú actualizar.")
                readLine()
            } while (true)

        }
    } while (opcionMenuPrincipal != 7)
}