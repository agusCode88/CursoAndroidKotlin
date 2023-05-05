package com.example.aprendiendokotlin.poo

import java.util.*

fun main() {
    val registroEstudiante = RegistroEstudiante()
    val menu = Menu(registroEstudiante)
    menu.mostrarMenuPrincipal()

}

class Menu(private val registroEstudiante: RegistroEstudiante) {
    private val scanner = Scanner(System.`in`)
    private val estudiantes: MutableMap<String, Estudiante> = registroEstudiante.estudiantes
    var continuar = true

    fun mostrarMenuPrincipal() {
        while (true) {
            println(
                """
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
            """.trimIndent()
            )
            print("Ingresa tu opción: ")

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
                        6 -> return
                    }
                    println("\nPresiona enter para volver al menú principal")
                    readLine()
                    mostrarMenuPrincipal()
                }
            } while (opcionMenuPrincipal != 6)
        }
    }

    fun mostrarSubMenuMostrar() {

        do {
            println(
                """
            ╔══════════════════════════════════════════════╗
            ║        MENÚ MOSTRAR ESTUDIANTES ANDROID      ║
            ╠══════════════════════════════════════════════╣
            ║ 1. Mostrar lista de estudiantes              ║
            ║ 2. Mostrar promedio de notas y asistencia    ║
            ║ 3. Volver al menú principal                  ║
            ╚══════════════════════════════════════════════╝
        """.trimIndent()
            )
            print("Ingresa tu opción: ")

            var opcionSubMenuMostrar: Int? = null
            do {
                opcionSubMenuMostrar = scanner.nextInt()
                if (opcionSubMenuMostrar !in 1..3) {
                    println("Opción inválida. Inténtalo de nuevo.")
                } else {

                    when (opcionSubMenuMostrar) {
                        1 -> registroEstudiante.listarEstudiantes()
                        2 -> registroEstudiante.mostrarPromedioNotasYAsistencia()
                        3 -> return // retornar inmediatamente
                    }
                    println("\nPresiona enter para volver al SubMenú Mostrar Estudiantes")
                    readLine()
                    if (opcionSubMenuMostrar != 3) {
                        mostrarSubMenuMostrar()
                    }
                }
            } while (opcionSubMenuMostrar != 3 && continuar)
        } while (continuar)
    }

    fun mostrarSubMenuBusqueda() {
        println(
            """
            ╔══════════════════════════════════════════════╗
            ║       MENÚ BUSCAR ESTUDIANTES ANDROID        ║
            ╠══════════════════════════════════════════════╣
            ║ 1. Buscar un estudiante por nombre           ║
            ║ 2. Buscar un estudiante por edad             ║
            ║ 3. Buscar un estudiante por rut              ║
            ║ 4. Volver al menú principal                  ║
            ╚══════════════════════════════════════════════╝
        """.trimIndent()
        )
        print("Ingresa tu opción: ")

        var opcionSubMenuBusqueda: Int? = null
        do {
            opcionSubMenuBusqueda = scanner.nextInt()
            if (opcionSubMenuBusqueda !in 1..3) {
                println("Opción inválida. Inténtalo de nuevo.")
            } else {

                when (opcionSubMenuBusqueda) {
                    1 -> registroEstudiante.buscarEstudiantePorNombre()
                    2 -> registroEstudiante.buscarEstudiantePorEdad()
                    3 -> registroEstudiante.buscarEstudiantePorRut()
                    4 -> return // retornar inmediatamente
                }
                println("\nPresiona enter para volver al SubMenú Buscar Estudiantes")
                readLine()
                if (opcionSubMenuBusqueda != 4) {
                    mostrarSubMenuBusqueda()
                }
            }
        } while (opcionSubMenuBusqueda != 4 && continuar)
    }

    fun mostrarSubMenuOrdenar() {
        println(
            """
            ╔══════════════════════════════════════════════╗
            ║      MENÚ ORDENAR ESTUDIANTES ANDROID        ║
            ╠══════════════════════════════════════════════╣
            ║ 1. Ordenar la lista de personas por nombre   ║
            ║ 2. Ordenar la lista de personas por edad     ║
            ║ 3. Mostrar la más joven y la más vieja       ║
            ║ 4. Volver al menú principal                  ║
            ╚══════════════════════════════════════════════╝
            """.trimIndent()
        )
        print("Ingresa tu opción: ")

        var opcionSubMenuOrdenar: Int? = null
        do {
            opcionSubMenuOrdenar = scanner.nextInt()
            if (opcionSubMenuOrdenar !in 1..3) {
                println("Opción inválida. Inténtalo de nuevo.")
            } else {

                when (opcionSubMenuOrdenar) {
                    1 -> registroEstudiante.ordenarPorNombre()
                    2 -> registroEstudiante.ordenarPorEdad()
                    3 -> registroEstudiante.mostrarJovenViejaEstudiante()
                    4 -> {
                        continuar = false
                        return
                    }
                }
                println("\nPresiona enter para volver al SubMenú Ordenar Estudiantes")
                readLine()
                if (opcionSubMenuOrdenar != 4) {
                    mostrarSubMenuOrdenar()
                }
            }
        } while (opcionSubMenuOrdenar != 4)
    }

    fun mostrarSubMenuActualizar() {
        print("Ingresa el nombre o RUT del estudiante: ")
        val input = scanner.nextLine()
        val estudiante = registroEstudiante.buscarEstudiante(input)
        if (estudiante != null) {
            println("Estudiante encontrado: ${estudiante.nombre}\n")

            println(
                """
            ╔════════════════════════════════════════════════╗
            ║     MENÚ DE ACTUALIZACIÓN LISTA ESTUDIANTES    ║
            ╠════════════════════════════════════════════════╣
            ║ 1. Actualizar la edad del estudiante           ║
            ║ 2. Agregar dirección del estudiante            ║
            ║ 3. Agregar teléfono del estudiante             ║
            ║ 4. Eliminar estudiante                         ║
            ║ 5. Volver al menú principal                    ║
            ╚════════════════════════════════════════════════╝
        """.trimIndent()
            )
            print("Ingresa tu opción: ")

            var opcionSubMenuActualizar: Int? = null
            do {
                opcionSubMenuActualizar = scanner.nextInt()
                if (opcionSubMenuActualizar !in 1..3) {
                    println("Opción inválida. Inténtalo de nuevo.")
                } else {

                    when (opcionSubMenuActualizar) {
                        1 -> registroEstudiante.actualizarEdadEstudiante(estudiante)
                        2 -> registroEstudiante.agregarDireccionEstudiante(estudiante)
                        3 -> registroEstudiante.agregarTelefonoEstudiante(estudiante)
                        4 -> registroEstudiante.eliminarEstudiante(estudiante)
                        5 -> {
                            continuar = false
                            return
                        }
                    }
                    println("\nPresiona enter para volver al SubMenú Ordenar Estudiantes")
                    readLine()
                    if (opcionSubMenuActualizar != 5) {
                        mostrarSubMenuActualizar()
                    }
                }
            } while (opcionSubMenuActualizar != 5)
        }
    }
}
