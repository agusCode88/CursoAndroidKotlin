package com.example.aprendiendokotlin.TareaPOO

import poo.Estudiante


fun main(){

        var curso =  mutableListOf<Alumno>()
    var alumno1:Alumno = Alumno("Beatriz", "Urzua", "19247574-0",28, intArrayOf())
    var alumno2:Alumno = Alumno("Felipe", "Termini", "19247574-0",28, intArrayOf())

    curso.add(alumno1)
    curso.add(alumno2)

        var opcion: Int = -1
        while (opcion != 0) {
            mostrarMenu()
            opcion = readLine()?.toInt() ?: continue

            when (opcion) {
                1 -> {
                    // agregar Estudiante
                    println("Ingrese el nombre del estudiante:")
                    val nombre = readLine() ?: continue

                    println("Ingrese el apellido del estudiante:")
                    val apellido = readLine() ?: continue

                    println("Ingrese el Rut del estudiante:")
                    val rut = readLine() ?: continue

                    println("Ingrese la edad del estudiante:")
                    val edad = readLine()?.toInt() ?: continue

                    println("Ingrese la cantidad de notas del estudiante:")
                    val cantidadNotas = readLine()?.toInt() ?: continue
                    val listaDeNotas = IntArray(cantidadNotas)

                    for (nota in 0 until cantidadNotas) {
                        println("Ingrese la nota ${nota + 1}:")
                        listaDeNotas[nota] = readLine()?.toInt() ?: continue
                    }
                    var estudiante = Alumno(nombre,apellido,rut, edad, listaDeNotas)
                    curso.add(estudiante)
                    continue

                }
                2 -> {
                    // mostrar estudiantes
                    mostrarEstudiantesCurso(curso)

                }
                3 -> {
                    //buscar estudiante por Rut
                    println("Ingrese el Rut del estudiante a buscar:")
                    val rut = readLine() ?: continue
                   // val estudianteEncontrado=curso.buscarEstudiantePorRut(rut)
//                    if(estudianteEncontrado!= null){
//                        estudianteEncontrado.mostrarDatosEstudiante()
//                    } else {
//                        println("Estudiante no se encuentra en la lista")
//                    }
                }
                4 -> {
                    // actualizar estudiante por nombre o rut
                    println("Ingrese el Rut o el nombre del estudiante a buscar:")
                    val rutoNombre = readLine() ?: continue
                    //curso.actualizarEstudiantePorNombreORut(rutoNombre)

                }
                5-> {
                    // Ver promedio de notas y de asitencia estudiante
                }
                0 -> {
                    println("Adiós!")
                }
                else -> {
                    println("Opción inválida. Intente de nuevo.")
                }
            }
        }
    }


    fun mostrarMenu() {
        println("Seleccione una opción:")
        println("1. Agregar estudiante")
        println("2. Mostrar lista de estudiantes")
        println("3. Buscar estudiante por rut")
        println("4. Actualizar estudiante por nombre o rut")
        println("5. Ver promedio de notas y asistencia de estudiante")
        println("0. Salir")
    }

fun mostrarEstudiantesCurso(curso:MutableList<Alumno>){

    println("Listado de estudiantes")

    curso.forEach {
        println("${it.nombre} ${it.apellido}")
    }
}

fun buscarEstudiantePorRut(rut: String){

    

}


class Alumno(val nombre: String, val apellido:String, val rut:String, var edad:Int, var nota:IntArray){

    constructor(): this ("","","",0, intArrayOf() )
}

class Curso(nombreCurso: String){

    constructor(): this("")
}






