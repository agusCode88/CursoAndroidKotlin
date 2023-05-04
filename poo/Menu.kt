package com.example.aprendiendokotlin.poo

class Menu{
    private val estudiantes = mutableListOf<Pair<String, MutableList<Int>>>()

    fun mostrarMenuPrincipal() {

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

        var opcionMenuPrincipal: Int? = null
        do {
            opcionMenuPrincipal = readLine()?.toIntOrNull() ?: 0
            if (opcionMenuPrincipal !in 1..6) {
                println("Opción inválida. Inténtalo de nuevo.")
            }
        } while (opcionMenuPrincipal !in 1..6)

        //JAVI - SUB MENU MOSTRAR AGREGADO
        fun mostrarSubMenuMostrar() {
            println("╔══════════════════════════════════════════════╗")
            println("║      MENÚ MOSTRAR ESTUDIANTES ANDROID        ║")
            println("╠══════════════════════════════════════════════╣")
            println("║ 1. Mostrar lista de estudiantes              ║")
            println("║ 2. Mostrar promedio de notas y asistencia    ║")
            println("║ 3. Volver al menú principal                  ║")
            println("║ 4. Salir                                     ║")
            println("╚══════════════════════════════════════════════╝")
            print("Ingresa tu opción: ")

            var opcionSubMenuMostrar: Int? = null
            do {
                opcionSubMenuMostrar = readLine()?.toIntOrNull() ?: 0
                if (opcionSubMenuMostrar == null || opcionSubMenuMostrar !in 1..4) {
                    println("Opción inválida. Inténtalo de nuevo.")
                }
            } while (opcionSubMenuMostrar == null || opcionSubMenuMostrar !in 1..4)
        }

        fun mostrarSubMenuBusqueda() {
            println("╔══════════════════════════════════════════════╗")
            println("║ MENÚ BUSCAR ESTUDIANTES ANDROID              ║")
            println("╠══════════════════════════════════════════════╣")
            println("║ 1. Buscar un estudiante por nombre           ║")
            println("║ 2. Buscar un estudiante por edad             ║")
            println("║ 3. Buscar un estudiante por rut              ║")
            println("║ 3. Volver al menú principal                  ║")
            println("║ 4. Salir                                     ║")
            println("╚══════════════════════════════════════════════╝")

            print("Ingresa tu opción: ")
            var opcionSubMenuBuscar: Int? = null
            do {
                opcionSubMenuBuscar = readLine()?.toIntOrNull() ?: 0
                // Si la opción ingresada es nula o no se encuentra entre 1 y 4, se muestra un mensaje de error.
                if (opcionSubMenuBuscar == null || opcionSubMenuBuscar !in 1..4) {
                    println("Opción inválida. Inténtalo de nuevo.")
                }

            } while (opcionSubMenuBuscar == null || opcionSubMenuBuscar !in 1..4)
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
            var opcionSubMenuOrdenar: Int? = null
            do {
                opcionSubMenuOrdenar = readLine()?.toIntOrNull() ?: 0
                if (opcionSubMenuOrdenar == null || opcionSubMenuOrdenar !in 1..5) {
                    println("Opción inválida. Inténtalo de nuevo.")
                }
            } while (opcionSubMenuOrdenar == null || opcionSubMenuOrdenar !in 1..5)
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
                var opcionSubMenuActualizar: Int? = null
                do {
                    opcionSubMenuActualizar = readLine()?.toIntOrNull() ?: 0
                    if (opcionSubMenuActualizar == null || opcionSubMenuActualizar !in 1..7) {
                        println("Opción inválida. Inténtalo de nuevo.")
                    }
                } while (opcionSubMenuActualizar == null || opcionSubMenuActualizar !in 1..7)
            }
        }
    }
}


