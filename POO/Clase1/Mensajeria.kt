package POO.Clase1

class Mensajeria (estudiante: Estudiante) {

    var estudianteAgregado ="Estudiante ${estudiante.nombreEstudiante} ha sido agregado"
    var estudianteNoAgregado ="Estudiantes no ha sido agregado"
    var noHayEstudiantes = "No hay estudiantes a mostrar"

    constructor() : this (Estudiante())

    fun mostrarMensajeAgregado(){
        println(estudianteAgregado)
    }

    fun mostrarMensajeNoAgregado(){
        println(estudianteNoAgregado)
    }

    fun mostrarSinEstudiantes(){
        println(noHayEstudiantes)
    }

}