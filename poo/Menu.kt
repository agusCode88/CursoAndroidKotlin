package com.example.aprendiendokotlin.poo

class VerOpciones() {
    fun mostrarMenuPrincipal() {

        println("╔════════════════════════════════════╗")
        println("║ MENÚ PRINCIPAL ESTUDIANTES ANDROID ║")
        println("╠════════════════════════════════════╣")
        println("║ 1. Agregar estudiante              ║")
        println("║ 2. Mostrar lista de estudiantes    ║")
        println("║ 3. Buscar estudiante               ║")
        println("║ 4. Ordenar lista de estudiantes    ║")
        println("║ 5. Actualizar estudiantes          ║")
        println("║ 6. Salir                           ║")
        println("╚════════════════════════════════════╝")
    }

    fun mostrarSubMenuBusqueda() {
        println("╔══════════════════════════════════════════════╗")
        println("║ MENÚ BUSCAR ESTUDIANTES ANDROID              ║")
        println("╠══════════════════════════════════════════════╣")
        println("║ 1. Buscar un estudiante por nombre           ║")
        println("║ 2. Buscar un estudiante por edad             ║")
        println("║ 3. Volver al menú principal                  ║")
        println("║ 4. Salir                                     ║")
        println("╚══════════════════════════════════════════════╝")
    }

    fun mostrarSubMenuOrdenar() {
        println("╔══════════════════════════════════════════════╗")
        println("║      MENÚ ORDENAR ESTUDIANTES ANDROID        ║")
        println("╠══════════════════════════════════════════════╣")
        println("║ 1. Ordenar la lista de personas por nombre   ║") //*Ordenar la lista de personas por nombre o por edad.
        println("║ 2. Ordenar la lista de personas por edad     ║") //*Ordenar la lista de personas por nombre o por edad.
        println("║ 3. Mostrar la mas joven y la mas vieja       ║") //*Agregar una función para mostrar la persona más joven y la persona más vieja en la lista.
        println("║ 4. Volver al menú principal                  ║") //Volver al menú
        println("║ 5. Salir                                     ║") //Salir
        println("╚══════════════════════════════════════════════╝")
    }

    fun mostrarSubMenuActualizar() {
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
    }
}


