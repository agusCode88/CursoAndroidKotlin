package com.example.aprendiendokotlin.poo

import java.util.Scanner

/*       corregir promedio notas por alumno
corregir asistencia por alumno
corregir porqeue al apretar enter no vuelve
agregar todos los datos al buscar estudiante
eliminar direccion y telefono del menu principal*/
fun main() {
    val registroEstudiante = RegistroEstudiante()
    val menu = Menu(registroEstudiante)
    menu.mostrarMenuPrincipal()
}

class Menu(private val registroEstudiante: RegistroEstudiante) {
    private val scanner = Scanner(System.`in`)
    private val estudiantes: MutableMap<String, Estudiante> = registroEstudiante.estudiantes

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
                when (opcionMenuPrincipal) {
                    1 -> registroEstudiante.agregarEstudiante()
                    2 -> mostrarSubMenuMostrar()
                    3 -> mostrarSubMenuBusqueda()
                    4 -> mostrarSubMenuOrdenar()
                    5 -> mostrarSubMenuActualizar()
                    6 -> return
                    else -> println("Opción inválida. Inténtalo de nuevo.")
                }
            } while (opcionMenuPrincipal !in 1..6)
        }
    }

    fun mostrarSubMenuMostrar() {
        while (true) {
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
            val opcionSubMenuMostrar = scanner.nextInt()
            when (opcionSubMenuMostrar) {
                1 -> registroEstudiante.listarEstudiantes()
                2 -> registroEstudiante.mostrarPromedioNotasYAsistencia()
                3 -> return mostrarMenuPrincipal()
                else -> println("Opción inválida. Inténtalo de nuevo.")
            }
        }
    }

    fun mostrarSubMenuBusqueda() {
        while (true) {
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

            val opcionSubMenuBusqueda = scanner.nextInt()

            when (opcionSubMenuBusqueda) {
                1 -> registroEstudiante.buscarEstudiantePorNombre()
                2 -> registroEstudiante.buscarEstudiantePorEdad()
                3 -> registroEstudiante.buscarEstudiantePorRut()
                4 -> return mostrarMenuPrincipal()
                else -> println("Opción inválida. Inténtalo de nuevo.")
            }
        }
    }

    fun mostrarSubMenuOrdenar() {
        while (true) {
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

            val opcionSubMenuOrdenar = scanner.nextInt()

            when (opcionSubMenuOrdenar) {
                1 -> registroEstudiante.ordenarPorNombre()
                2 -> registroEstudiante.ordenarPorEdad()
                3 -> registroEstudiante.mostrarJovenViejaEstudiante()
                4 -> return mostrarMenuPrincipal()
                else -> println("Opción inválida. Inténtalo de nuevo.")
            }
        }
    }

    fun mostrarSubMenuActualizar() {
        print("Ingresa el nombre o RUT del estudiante: ")
        val input = readLine()
        val estudiante = registroEstudiante.buscarEstudiante(input)
        if (estudiante != null) {
            println("Estudiante encontrado: ${estudiante.nombre}\n")

            while (true) {
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

                val opcionSubMenuActualizar = readLine()?.toIntOrNull()

                when (opcionSubMenuActualizar) {
                    1 -> registroEstudiante.actualizarEdadEstudiante(estudiante)
                    2 -> registroEstudiante.agregarDireccionEstudiante(estudiante)
                    3 -> registroEstudiante.agregarTelefonoEstudiante(estudiante)
                    4 -> registroEstudiante.eliminarEstudiante(estudiante)
                    5 -> {
                        mostrarMenuPrincipal()
                        return
                    }

                    else -> println("Opción inválida. Inténtalo de nuevo.")
                }
            }
        } else {
            println("Estudiante no encontrado.")
        }
    }
}

