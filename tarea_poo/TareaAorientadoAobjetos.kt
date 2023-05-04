package tarea_poo

class TareaAorientadoAobjetos {
    // Lista de estudiantes
    var curso = mutableListOf<Estudiante>()

    // Clase menú
    class Menu {
        fun mostrarMenu() {
            println("\nMENU")
            println("--------------------------------")
            println("1. Agregar estudiante")
            println("2. Mostrar lista de estudiantes")
            println("3. Buscar estudiante por rut")
            println("4. Actualizar estudiante por nombre o rut")
            println("5. Agregar notas a estudiante")
            println("6. Ver promedio de notas y asistencia de estudiante")
            println("0. Salir")
            print("Seleccione una opción --> ")
        }
    }
    // Menu principal
    fun menuPrincipal() {
        val menu = Menu()
        var opcion: Int = -1 // inicialización por mientras
        while (opcion != 0) {
            menu.mostrarMenu()
            opcion = readLine()?.toIntOrNull() ?: -1
            when (opcion) {
                1 -> agregarEstudiante()
                2 -> verListaEstudiantes()
                3 -> buscarPorRut()
                4 -> modificarEstudiante()
                5 -> agregarNotas()
                6 -> promedioNotasYasistencia()
                0 -> println("Salir")
                else -> println("Opción inválida")
            }
        }
    }

    class Estudiante(nombre: String,apellido: String,rut: String,edad: Int, cantNotas: Int,notas: MutableList<Int> = mutableListOf())  {

        // Atributos o caracteristicas de un estudiante
        var nombre = nombre
        var apellido = apellido
        var rut = rut
        var edad = edad
        var cantNotas = cantNotas
        var listaNotasEstudiante = mutableListOf<Int>()

    }

    //Funcionalidades con sus validaciones

    //Funcionalidad para agregar un nuevo estudiante al curso
    fun agregarEstudiante() {
        var nombre: String
        var apellido: String
        var rut: String
        var edad: Int = 0
        var cantNotas: Int = 0

        println("\nDATOS ESTUDIANTES")
        println("--------------------------------")
        // Ingresar y validar el nombre
        while (true) {
            print("Nombre --> ")
            nombre = readLine().toString().uppercase()
            if (nombre.matches(Regex("[a-zA-z\\s][a-zA-Z]*"))) {
                break
            } else {
                println("Nombre ingresado no válido.")
            }
        }

        // Ingresar y validar el apellido
        while (true) {
            print("Apellido --> ")
            apellido = readLine().toString().uppercase()
            if (apellido.matches(Regex("[a-zA-z\\s][a-zA-Z]*"))) {
                break
            } else {
                println("Apellido ingresado no válido. ")
            }
        }

        // Ingresar y validar el RUT
        while (true) {
            print("RUT (11.111.111-3) --> ")
            rut = readLine()!!
            if (rut.matches(Regex("\\d{2}\\.\\d{3}\\.\\d{3}-\\d{1}$"))) {
                break
            } else {
                println("RUT ingresado no válido. ")
            }
        }
        // Ingresar y validar la edad
        while (true) {
            print("Edad --> ")
            val input = readLine()!!
            val edadFinal = input.toIntOrNull()
            if (edadFinal != null && edadFinal >= 0) {
                edad = edadFinal
                break
            } else {
                println("Edad ingresada no válida. ")
            }
        }

        // Ingresar y validar la cantidad de notas
        while (true) {
            print("Cantidad de notas --> ")
            val input = readLine()!!
            val notasFinal = input.toIntOrNull()
            if (notasFinal != null && notasFinal >= 0) {
                cantNotas = notasFinal
                break
            } else {
                println("Cantidad de notas ingresada no válida. ")
            }
        }

        // Crear objeto Estudiante con los datos ingresados
        val nuevoEstudiante = Estudiante(nombre, apellido, rut, edad, cantNotas)

        // Agregar el objeto a la lista de estudiantes
        curso.add(nuevoEstudiante)

        println("Nuevo estudiante agregado correctamente.")
    }

    //Funcionalidad para ver la lista de estudiantes
    fun verListaEstudiantes() {
        for (estudiante in curso) {
            println("\nLISTA DE ESTUDIANTES")
            println("------------------------")
            println("Nombre: ${estudiante.nombre}")
            println("Apellido: ${estudiante.apellido}")
            println("Edad: ${estudiante.edad}")
            println("RUT: ${estudiante.rut}")
            println("Acá se veran las notas")
            println("------------------------")
        }
    }

    //Funcionalidad para buscar estudiante por rut
    fun buscarPorRut() {
        var rutIngresado = ""
        while (true) {
            print("\nIngrese el rut del estudiante que desea buscar --> ")
            rutIngresado = readLine()!!
            if (rutIngresado.matches(Regex("\\d{2}\\.\\d{3}\\.\\d{3}-\\d{1}$"))) {
                break
            } else {
                println("RUT ingresado no válido. ")
            }
        }
        for (estudiante in curso) {
            if (estudiante.rut == rutIngresado) {
                println("\nEstudiante encontrado:")
                println("------------------------")
                println("Nombre: ${estudiante.nombre}")
                println("Apellido: ${estudiante.apellido}")
                println("Edad: ${estudiante.edad}")
                println("RUT: ${estudiante.rut}")
                println("Acá se veran las notas")
                println("------------------------")

                // return // Salir de la función después de encontrar el estudiante
            } else {
                println("Estudiante no encontrado.")
            }
        }
    }
    //Funcionalidad para modificar por rut o nombre
    fun modificarEstudiante() {
        println("\nMODIFICAR DATOS")
        println("------------------------")
        println("(1) MODIFICAR POR RUT")
        println("(2) MODIFICAR POR NOMBRE")
        var opcion: Int? = null
        while (opcion == null) {
            print("\nElige tu opcion --> ")
            val input = readLine()
            opcion = input?.toIntOrNull()
            if (opcion == null) {
                println("Opción inválida, ingrese un número")
            }
        }
        if (opcion == 1) {
            print("Ingrese el rut --> ")
            var rutIngresado = readLine()!!
            for (estudiante in curso) {
                if (estudiante.rut == rutIngresado) {
                    println("Estudiante ${estudiante.nombre} encontrado con exito, a continuación edite su información:")
                    print("Nombre: ")
                    var nombre = readLine()!!
                    estudiante.nombre = nombre
                    print("Apellido: ")
                    var apellido = readLine()!!
                    estudiante.apellido = apellido
                    print("RUT: ")
                    var rut = readLine()!!
                    estudiante.rut = rut
                    print("Edad: ")
                    var edad = readLine()?.toIntOrNull() ?: 0
                    estudiante.edad = edad
                    print("Cantidad de notas: ")
                    var cantNotas = readLine()?.toIntOrNull() ?: 0
                    estudiante.cantNotas = cantNotas
                    println("Datos actualizados correctamente")
                } else {
                    println("El rut ingresado no se encuentra en nuestros sistemas")
                }

            }
        }else if (opcion == 2){
            println("Editando al estudiante por nombre")
            println("Ingrese el nombre")
            var nombreEstudiante = readLine()!!
            for(estudiante in curso){
                if (estudiante.nombre == nombreEstudiante){
                    println("Estudiante ${estudiante.nombre} encontrado con exito, a continuación edite su información:")

                    print("Nombre: ")
                    var nombre = readLine()!!
                    estudiante.nombre = nombre
                    print("Apellido: ")
                    var apellido = readLine()!!
                    estudiante.apellido = apellido
                    print("RUT: ")
                    var rut = readLine()!!
                    estudiante.rut = rut
                    print("Edad: ")
                    var edad = readLine()?.toIntOrNull() ?: 0
                    estudiante.edad = edad
                    print("Cantidad de notas: ")
                    var cantNotas = readLine()?.toIntOrNull() ?: 0
                    estudiante.cantNotas = cantNotas
                    println("Datos actualizados correctamente")
                } else {
                    println("El nombre ingresado no se encuentra en nuestros sistemas")
                }
            }
        }
    }

    //Funcionalidad para agregar notas
    fun agregarNotas(){
        println("Ingrese el rut del estudiante que desea agregar sus notas")
        var rutIngresado = readLine()!!
        for (estudiante in curso){
            if (rutIngresado == estudiante.rut){
                println("Ingresar las notas de ${estudiante.nombre}")
                var listaNotas = mutableListOf<Int>()
                var contador = 1
                while (contador <= estudiante.cantNotas){
                    println("Ingrese la nota n°$contador: ")
                    var nota = readLine()?.toIntOrNull() ?: 0
                    listaNotas.add(nota)
                    contador = contador + 1
                }
                estudiante.listaNotasEstudiante = listaNotas // asignar la lista de notas al estudiante correspondiente
                println("Notas agregadas al estudiante ${estudiante.nombre}")
                for (x in listaNotas){
                    print("$x   ")
                }
            }
        }
    }

    //Funcionalidad para promedio de notas
    fun promedioNotasYasistencia(){
        println("Ingrese el rut del estudiante que desea saber su promedio de notas")
        var rutIngresado = readLine()!!
        for (estudiante in curso){
            if (estudiante.rut == rutIngresado){
                var promedio = estudiante.listaNotasEstudiante.average()
                println("Promedio de notas del estudiante ${estudiante.nombre} es: $promedio")
            }else if (estudiante.rut != rutIngresado){
                println("Estudiante no encontrado en nuestro sistema")
            }
        }
        println("Ingrese el rut del estudiante que desea saber su asistenacia")
        var rutIngresado2 = readLine()!!
        for (estudiante in curso){
            if (rutIngresado2 == estudiante.rut){
                println("El estudiante ${estudiante.nombre} ha venido ${estudiante.cantNotas} días")
            }else if (estudiante.rut != rutIngresado)
                println("Estudiante no encontrado en nuestro sistema")
            }
        }
    }
fun main() {
    var inicializador = TareaAorientadoAobjetos()
    inicializador.menuPrincipal()
}




