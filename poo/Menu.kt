package com.example.aprendiendokotlin.poo

import java.util.*

class Menu {
    private val registroEstudiante = RegistroEstudiante()
    fun mostrarMenuPrincipal() {
        while (true) {
            println("╔════════════════════════════════════════════╗")
            println("║ MENÚ PRINCIPAL ESTUDIANTES ANDROID         ║")
            println("╠════════════════════════════════════════════╣")
            println("║ 1. Agregar estudiante                      ║")
            println("║ 2. Mostrar lista de estudiantes            ║")
            println("║ 3. Buscar estudiante                       ║")
            println("║ 4. Ordenar lista de estudiantes            ║")
            println("║ 5. Actualizar estudiantes por nombre o rut ║")
            println("║ 6. Salir                                   ║")
            println("╚════════════════════════════════════════════╝")
            print("Ingresa tu opción: ")

            val scanner = Scanner(System.`in`)
            var opcionMenuPrincipal: Int? = null
            do {
                opcionMenuPrincipal = scanner.nextInt()
                if (opcionMenuPrincipal !in 1..6) {
                    println("Opción inválida. Inténtalo de nuevo.")
                } else {
                    when (opcionMenuPrincipal) {
                        1 -> registroEstudiante.agregarEstudiante()
                        2 -> mostrarSubMenuMostrar()
                        3 -> mostrarSubMenuBusqueda()
                        4 -> mostrarSubMenuOrdenar()
                        5 -> mostrarSubMenuActualizar()
                    }
                }
            } while (opcionMenuPrincipal != 6)
        }
    }

    private fun mostrarSubMenuMostrar() {
        println("╔══════════════════════════════════════════════╗")
        println("║      MENÚ MOSTRAR ESTUDIANTES ANDROID        ║")
        println("╠══════════════════════════════════════════════╣")
        println("║ 1. Mostrar lista de estudiantes              ║")
        println("║ 2. Mostrar promedio de notas y asistencia    ║")
        println("║ 3. Volver al menú principal                  ║")
        println("║ 4. Salir                                     ║")
        println("╚══════════════════════════════════════════════╝")
        print("Ingresa tu opción: ")

        val scanner = Scanner(System.`in`)
        var opcionSubMenuMostrar: Int? = null
        do {
            opcionSubMenuMostrar = scanner.nextInt()
            if (opcionSubMenuMostrar !in 1..6) {
                println("Opción inválida. Inténtalo de nuevo.")
            } else {
                when (opcionSubMenuMostrar) {
                    1 -> registroEstudiante.listarEstudiante()
                    2 -> registroEstudiante.promedioEstudiante()
                    3 -> break
                }
            }
        } while (opcionSubMenuMostrar != 4)
    }

    fun mostrarSubMenuBusqueda() {
        println("╔══════════════════════════════════════════════╗")
        println("║ MENÚ BUSCAR ESTUDIANTES ANDROID              ║")
        println("╠══════════════════════════════════════════════╣")
        println("║ 1. Buscar un estudiante por nombre           ║")
        println("║ 2. Buscar un estudiante por edad             ║")
        println("║ 3. Buscar un estudiante por rut              ║")
        println("║ 4. Volver al menú principal                  ║")
        println("║ 5. Salir                                     ║")
        println("╚══════════════════════════════════════════════╝")

        val scanner = Scanner(System.`in`)
        var opcionSubMenuBusqueda: Int? = null
        do {
            opcionSubMenuBusqueda = scanner.nextInt()
            if (opcionSubMenuBusqueda !in 1..6) {
                println("Opción inválida. Inténtalo de nuevo.")
            } else {
                when (opcionSubMenuBusqueda) {
                    1 -> registroEstudiante.buscarNombreEstudiante()
                    2 -> registroEstudiante.buscarEdadEstudiante()
                    3 -> registroEstudiante.buscarRutEstudiante()
                    4 -> break
                }
            }
        } while (opcionSubMenuBusqueda != 4)
    }

    fun mostrarSubMenuOrdenar() {
        println("╔══════════════════════════════════════════════╗")
        println("║      MENÚ ORDENAR ESTUDIANTES ANDROID        ║")
        println("╠══════════════════════════════════════════════╣")
        println("║ 1. Ordenar la lista de personas por nombre   ║")
        println("║ 2. Ordenar la lista de personas por edad     ║")
        println("║ 3. Mostrar la mas joven y la mas vieja       ║")
        println("║ 4. Volver al menú principal                  ║")
        println("║ 5. Salir                                     ║")
        println("╚══════════════════════════════════════════════╝")

        print("Ingresa tu opción: ")
        val scanner = Scanner(System.`in`)
        var opcionSubMenuOrdenar: Int? = null
        do {
            opcionSubMenuOrdenar = scanner.nextInt()
            if (opcionSubMenuOrdenar !in 1..6) {
                println("Opción inválida. Inténtalo de nuevo.")
            } else {
                when (opcionSubMenuOrdenar) {
                    1 -> registroEstudiante.ordenarNombreEstudiante()
                    2 -> registroEstudiante.ordenarEdadEstudiante()
                    3 -> registroEstudiante.mostrarJovenViejaEstudiante()
                    4 -> break
                }
            }
        } while (opcionSubMenuOrdenar != 5)

    }

    fun mostrarSubMenuActualizar() {
        print("Ingresa el nombre o RUT del estudiante: ")
        val input = readLine()?.toString() ?: ""
        val estudiante =
            estudiantes.keys.find { it == input || estudiantes[it]?.contains(input.toIntOrNull()) ?: false }
        if (estudiante != null) {
            println("Estudiante encontrado: $estudiante/n")

            println("╔══════════════════════════════════════════════╗")
            println("║     MENÚ DE ACTUALIZACIÓN LISTA ESTUDIANTES  ║")
            println("╠══════════════════════════════════════════════╣")
            println("║ 1. Actualizar la edad del estudiante         ║")
            println("║ 2. Agregar dirección del estudiante          ║")
            println("║ 3. Agregar teléfono  del estudiante          ║")
            println("║ 4. Agregar información adicional             ║")
            println("║ 5. Eliminar estudiante                       ║")
            println("║ 6. Volver al menú principal                  ║")
            println("║ 7. Salir                                     ║")
            println("╚══════════════════════════════════════════════╝")

            print("Ingresa tu opción: ")
            val scanner = Scanner(System.`in`)
            var opcionSubMenuActualizar: Int? = null
            do {
                opcionSubMenuActualizar = scanner.nextInt()
                if (opcionSubMenuActualizar !in 1..6) {
                    println("Opción inválida. Inténtalo de nuevo.")
                } else {
                    when (opcionSubMenuActualizar) {
                        1 -> registroEstudiante.actualizarEdadEstudiante()
                        2 -> registroEstudiante.agregarDireccionEstudiante()
                        3 -> registroEstudiante.agregarTelefonoEstudiante()
                        4 -> registroEstudiante.agregarInfoEstudiante()
                        5 -> registroEstudiante.eliminarEstudiante()
                        6 -> break
                    }
                }
            } while (opcionSubMenuActualizar != 7)

        }

    }
}
