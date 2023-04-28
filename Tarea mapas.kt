package com.example.aprendiendokotlin

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
    val estudiantes = mutableMapOf<String, Int>() // Diccionario de Estudiantes (nombre y edad)
    var edadMaxima = 0
    var edadMinima = Int.MAX_VALUE
    var nombrePersonaMasJoven: String? = null
    var nombrePersonaMasVieja: String? = null


    do {
        println("╔════════════════════════════════════╗")
        println("║ MENÚ PRINCIPAL ESTUDIANTES ANDROID ║")
        println("╠════════════════════════════════════╣")
        println("║ 1. Agregar estudiante              ║")
        println("║ 2. Mostrar lista de estudiantes    ║") //*Agregar una función para mostrar la cantidad total de personas en la lista.
        println("║ 3. Buscar estudiante               ║") //Permitir que el usuario busque una persona por nombre o por edad.
        println("║ 4. Ordenar lista de estudiantes    ║") //*Ordenar la lista de personas por nombre o por edad.
        println("║ 5. Actualizar estudiantes          ║") // *Agregar la posibilidad de agregar más información sobre la persona, como su dirección o su número de teléfono.
        println("║ 6. Ver archivo de estudiantes      ║") //*Guardar la lista de personas en un archivo y cargarla al iniciar el programa.
        println("║ 7. Salir                           ║")
        println("╚════════════════════════════════════╝")

        print("Ingresa tu opción: ")
        var opcionMenuPrincipal: Int? = null
        do {
            opcionMenuPrincipal = readLine()?.toIntOrNull()
            if (opcionMenuPrincipal == null || opcionMenuPrincipal !in 1..7) {
                println("Opción inválida. Inténtalo de nuevo.")
            }
        } while (opcionMenuPrincipal == null || opcionMenuPrincipal !in 1..7)


        when (opcionMenuPrincipal) {
            1 -> {
                print("Ingresa el nombre del estudiante: ")
                val nombre = readLine()?.toString() ?: ""
                print("Ingresa la edad del estudiante: ")
                val edad = readLine()?.toInt() ?: 0
                estudiantes[nombre] = edad
                println("El estudiante $nombre ha sido agregado correctamente.")
            }

            2 -> {
                if (estudiantes.isEmpty()) {
                    println("No hay personas en la lista.")
                } else {
                    println("Lista de personas (${estudiantes.size} personas en total):")
                    estudiantes.forEach { (nombre, edad) ->
                        println("- $nombre ($edad años)")
                    }
                }
            }

            3 -> do {
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
                    if (opcionMenuBuscar == null || opcionMenuBuscar !in 1..4) {
                        println("Opción inválida. Inténtalo de nuevo.")
                    }
                } while (opcionMenuBuscar == null || opcionMenuBuscar !in 1..4)

                when (opcionMenuBuscar) {
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

                    2 -> {
                        print("Ingresa la edad del estudiante que deseas buscar: ")
                        val edadABuscar = readLine()?.toInt() ?: 0
                        val estudiantesConEdad = estudiantes.filterValues { it == edadABuscar }
                        if (estudiantesConEdad.isNotEmpty()) {
                            println("Los estudiantes con $edadABuscar años son:")
                            estudiantesConEdad.keys.forEach { println("- $it") }
                        } else {
                            println("No se encontró ningún estudiante con $edadABuscar años.")
                        }
                    }

                    3 -> break

                    4 -> return

                    else -> {
                        println("Opción inválida.")
                    }
                }
                println("Presiona ENTER para volver al menú buscar.")
                readLine()
            } while (true)

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

                print("Ingresa tu opción: ")
                var opcionMenuOrdenar: Int? = null
                do {
                    opcionMenuOrdenar = readLine()?.toIntOrNull()
                    if (opcionMenuOrdenar == null || opcionMenuOrdenar !in 1..5) {
                        println("Opción inválida. Inténtalo de nuevo.")
                    }
                } while (opcionMenuOrdenar == null || opcionMenuOrdenar !in 1..5)


                when (opcionMenuOrdenar) {
                    1 -> {
                        println("Aqui va la funcion de ordenar por nombre")

                    }

                    2 -> {
                        println("Aqui va la funcion de ordenar por edad")

                    }

                    3 -> {
                        if (estudiantes.isEmpty()) {
                            println("No hay personas en la lista.")
                        } else {
                            println("Lista de personas:")
                            estudiantes.forEach { (name, age) ->
                                println("- $name ($age años)")
                                if (age < edadMinima) {
                                    edadMinima = age
                                    nombrePersonaMasJoven = name
                                }
                                if (age > edadMaxima) {
                                    edadMaxima = age
                                    nombrePersonaMasVieja = name
                                }
                            }
                            println("La persona más joven es $nombrePersonaMasJoven, con $edadMinima años.")
                            println("La persona más vieja es $nombrePersonaMasVieja, con $edadMaxima años.")
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

                when (opcionMenuActualizar) {
                    1 -> {
                        print("Ingresa el nombre de la persona que deseas actualizar la edad: ")
                        val nombre = readLine()?.toString() ?: ""
                        if (estudiantes.containsKey(nombre)) {
                            print("Ingresa la nueva edad de la persona: ")
                            val edad = readLine()?.toInt() ?: 0
                            estudiantes[nombre] = edad
                            println("La edad de $nombre ha sido actualizada correctamente.")
                        } else {
                            println("La persona $nombre no se encontró en la lista.")
                        }

                    }

                    2 -> {
                        println("Aquí va la funcion agregar dirección")

                    }

                    3 -> {
                        println("Aquí va la funcion agregar teléfono")

                    }

                    4 -> {
                        println("Aquí va la funcion agregar información adicional")
                    }

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

                    6 -> break

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