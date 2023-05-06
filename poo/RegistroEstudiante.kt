package com.example.aprendiendokotlin.poo

import java.util.*

//prueba
class RegistroEstudiante {
    val estudiantes: MutableMap<String, Estudiante> = mutableMapOf()

    fun leerLinea(prompt: String, validator: ((String) -> Boolean)? = null): String {
        var input: String?
        do {
            print(prompt)
            input = readLine()
        } while (input == null || validator != null && !validator(input))
        return input
    }

    fun leerEnteroPositivo(prompt: String = "Ingresa un número: "): Int {
        while (true) {
            val input = leerLinea(prompt)
            val numero = input.toIntOrNull()
            if (numero != null && numero >= 0) {
                return numero
            }
            println("Ingresa un número entero positivo válido.")
        }
    }

    fun leerNumero(mensaje: String, rango: ClosedRange<Double>): Double {
        var input: Double? = null
        while (input == null || input!! !in rango) {
            print(mensaje)
            input = readLine()?.toDoubleOrNull()
            if (input != null && input!! !in rango) {
                println("El número debe estar en el rango ${rango.start}..${rango.endInclusive}")
            }
        }
        return input!!
    }

    fun leerLista(prompt: String, condicion: (Double) -> Boolean): List<Double> {
        println(prompt)
        val lista = mutableListOf<Double>()
        while (true) {
            val input = leerLinea("")
            if (input == "0") {
                break
            }
            val numero = input.toDoubleOrNull()
            if (numero == null) {
                println("Ingresa un número válido.")
            } else if (condicion(numero)) {
                lista.add(numero)
            } else {
                println("El número ingresado no cumple la condición requerida.")
            }
        }
        return lista
    }

    //Submenu Agregar
    fun agregarEstudiante() {
        val nombre = leerLinea("Ingresa el nombre de la persona: ")
        if (estudiantes.containsKey(nombre)) {
            println("Ya existe un estudiante con el nombre $nombre.")
            return
        }

        val rut = leerLinea("Ingresa el RUT del alumno (formato XXXXXXXX-X): ") {
            it.matches(Regex("[0-9]{8}-[0-9kK]{1}"))
        }


        val edad = leerEnteroPositivo("Ingresa la edad de la persona: ")

        val asistencia = leerNumero("Ingresa la asistencia del alumno (en porcentaje): ", 0.0..100.0)

        val notas = leerLista("Ingresa las notas del alumno (ingresa 0 para terminar): ") {
            it in 0.0..7.0
        }
        val direccion = leerLinea("Ingresa la dirección del alumno: ")
        val telefono = leerLinea("Ingresa el telefono del alumno: ")

        val estudiante = Estudiante(nombre, rut, edad, notas, asistencia, direccion, telefono)
        estudiantes[nombre] = estudiante

        println("El estudiante $nombre ha sido agregado correctamente.")
    }

    //Submenu Buscar
    fun listarEstudiantes() {
        if (estudiantes.isEmpty()) {
            println("No hay estudiantes en la lista.")
        } else {
            println("Lista de estudiantes (${estudiantes.size} estudiantes en total):")
            estudiantes.values.forEach { estudiante ->
                println("- Nombre: ${estudiante.nombre}, Edad: ${estudiante.edad} años, RUT: ${estudiante.rut}}")
            }
        }
    }

    fun mostrarPromedioNotasYAsistencia(nombre: String) {
        val estudiante = estudiantes[nombre]
        if (estudiante == null) {
            println("No se encontró al estudiante con nombre $nombre.")
        } else {
            val promedioNotas = estudiante.notas.average()
            val promedioAsistencia = estudiante.asistencia
            println("Promedio de notas de $nombre: $promedioNotas")
            println("Promedio de asistencia de $nombre: $promedioAsistencia")
        }
    }

    fun buscarEstudiantePorNombre() {
        val nombreABuscar = leerLinea("Ingresa el nombre del estudiante que deseas buscar: ")
        val estudiante = estudiantes[nombreABuscar]
        if (estudiante != null) {
            println("El estudiante $nombreABuscar tiene ${estudiante.edad} años, RUT: ${estudiante.rut}, dirección: ${estudiante.direccion}, telefono: ${estudiante.telefono}.")
        } else {
            println("No se encontró ningún estudiante con el nombre $nombreABuscar.")
        }
    }

    fun buscarEstudiantePorEdad() {
        val edadABuscar =
            leerLinea("Ingresa la edad del estudiante que deseas buscar: ") { s -> s.toIntOrNull() in 0..120 }
        val estudiantesEncontrados = estudiantes.values.filter { it.edad == edadABuscar.toInt() }
        if (estudiantesEncontrados.isNotEmpty()) {
            estudiantesEncontrados.forEach { estudiante ->
                println("El estudiante ${estudiante.nombre} tiene ${estudiante.edad} años, RUT: ${estudiante.rut}, dirección: ${estudiante.direccion}, telefono: ${estudiante.telefono}.")
            }
        } else {
            println("No se encontró ningún estudiante con la edad $edadABuscar.")
        }
    }


    fun buscarEstudiantePorRut() {
        val rutABuscar = leerLinea("Ingresa el RUT del estudiante que deseas buscar (formato XXXXXXXX-X): ") { s ->
            Regex("[0-9]{8}-[0-9kK]").matches(s)
        }
        val estudiante = estudiantes.values.find { it.rut == rutABuscar }
        if (estudiante != null) {
            println("El estudiante ${estudiante.nombre} tiene ${estudiante.edad} años, RUT: ${estudiante.rut}, dirección: ${estudiante.direccion}, telefono: ${estudiante.telefono}.")
        } else {
            println("No se encontró ningún estudiante con el RUT $rutABuscar.")
        }
    }

    fun <T : Comparable<T>> ordenarPor(selector: (Estudiante) -> T): List<Estudiante> {
        return estudiantes.values.sortedBy(selector)
    }


    fun ordenarPorNombre(): List<Estudiante> {
        val listaOrdenada = ordenarPor { it.nombre }
        println("Lista de estudiantes ordenada por nombre:")
        listaOrdenada.forEach { println("${it.nombre}: ${it.edad}") }
        return listaOrdenada
    }

    fun ordenarPorEdad(): List<Estudiante> {
        val listaOrdenada = ordenarPor { it.edad }
        println("Lista de estudiantes ordenada por edad:")
        listaOrdenada.forEach { println("${it.nombre} (${it.edad} años)") }
        return listaOrdenada
    }


    fun mostrarJovenViejaEstudiante() {
        val estudianteMasJoven = estudiantes.values.minByOrNull { it.edad }
        val estudianteMasViejo = estudiantes.values.maxByOrNull { it.edad }
        if (estudianteMasJoven != null && estudianteMasViejo != null) {
            val estudiantesMasJovenes =
                estudiantes.filterValues { it.edad == estudianteMasJoven.edad } as Map<Int, Estudiante>
            val estudiantesMasViejos =
                estudiantes.filterValues { it.edad == estudianteMasViejo.edad } as Map<Int, Estudiante>
            println(
                "La(s) persona(s) más joven(es) es(son) ${
                    estudiantesMasJovenes.keys.joinToString(", ")
                } (${estudianteMasJoven.edad} años)."
            )
            println(
                "La(s) persona(s) más vieja(s) es(son) ${
                    estudiantesMasViejos.keys.joinToString(", ")
                } con ${estudianteMasViejo.edad} años."
            )
        } else {
            println("No hay personas en la lista.")
        }


    }

    fun buscarEstudiante(input: String?): Estudiante? {
        return estudiantes[input ?: ""] ?: estudiantes.values.find { it.rut == input }
    }


    fun actualizarEdadEstudiante(estudiante: Estudiante) {
        val nuevaEdad = leerEnteroPositivo("Ingresa la nueva edad de ${estudiante.nombre}: ")
        estudiante.edad = nuevaEdad
        println("Edad de ${estudiante.nombre} actualizada correctamente.")
    }

    fun agregarDireccionEstudiante(estudiante: Estudiante) {
        val nuevaDireccion = leerLinea("Ingresa la dirección de ${estudiante.nombre}: ")
        estudiante.direccion = nuevaDireccion
        println("Dirección agregada correctamente.")
    }

    fun agregarTelefonoEstudiante(estudiante: Estudiante) {
        val nuevoTelefono = leerLinea("Ingresa el teléfono de ${estudiante.nombre}: ")
        estudiante.telefono = nuevoTelefono
        println("Teléfono agregado correctamente.")
    }


    fun eliminarEstudiante(estudiante: Estudiante) {
        estudiantes.remove(estudiante.rut)?.run {
            println("El estudiante ${estudiante.nombre} ha sido eliminado del registro.")
        } ?: println("El estudiante no se encuentra registrado.")
    }
}



