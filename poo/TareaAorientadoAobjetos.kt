package poo

class TareaAorientadoAobjetos {
    // Lista de estudiantes
    var curso = mutableListOf<Estudiante>()


    class Menu {
        fun mostrarMenu() {
            println("Seleccione una opción:")
            println("1. Agregar estudiante")
            println("2. Mostrar lista de estudiantes")
            println("3. Buscar estudiante por rut")
            println("4. Actualizar estudiante por nombre o rut")
            println("5. Ver promedio de notas y asistencia de estudiante")
            println("0. Salir")
        }



    }

    fun menuPrincipal() {
        val menu = Menu()
        var opcion: Int = -1 // inicialización por mientras
        while (opcion != 0) {
            menu.mostrarMenu()
            opcion = readLine()?.toIntOrNull() ?: -1
            when (opcion) {
                1 -> agregarEstudiante()
                2 -> verListaEstudiantes()
                3 -> println("Buscar estudiante por rut")
                4 -> println("Actualizar estudiante por nombre o rut")
                5 -> println("Ver promedio de notas y asistencia de estudiante")
                0 -> println("Salir")
                else -> println("Opción inválida")
            }
        }
    }

    class Estudiante(nombre: String, apellido: String, rut: String, edad: Int, cantNotas: Int) {


        // Atributos o caracteristicas de un estudiante
        var nombre = nombre
        var apellido = apellido
        var rut = rut
        var edad = edad
        var cantNotas = cantNotas

        //Constructor implicito
        constructor() : this("", "", "", 0, 0)
    }

    //Clase para agregar un nuevo estudiante al curso
    fun agregarEstudiante() {
        println("Ingrese los datos del nuevo estudiante:")
        print("Nombre: ")
        var nombre = readLine()!!
        print("Apellido: ")
        var apellido = readLine()!!
        print("RUT: ")
        var rut = readLine()!!
        print("Edad: ")
        var edad = readLine()?.toIntOrNull() ?: 0
        print("Cantidad de notas: ")
        var cantNotas = readLine()?.toIntOrNull() ?: 0

        // Crear objeto Estudiante con los datos ingresados
        var nuevoEstudiante = Estudiante(nombre, apellido, rut, edad, cantNotas)

        // Agregar el objeto a la lista de estudiantes
        curso.add(nuevoEstudiante)

        println("Nuevo estudiante agregado correctamente.")
    }

    //Funcionalidad para ver la lista de estudiantes
    fun verListaEstudiantes() {
        for (estudiante in curso) {
            println("Nombre: ${estudiante.nombre}")
            println("Apellido: ${estudiante.apellido}")
            println("Edad: ${estudiante.edad}")
            println("RUT: ${estudiante.rut}")
            println("Acá se veran las notas")
            println("------------------------")
        }
    }
}


fun main() {
    var inicializador = TareaAorientadoAobjetos()
    inicializador.menuPrincipal()
}




