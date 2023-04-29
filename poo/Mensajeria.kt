package poo

class Mensajeria(estudiante: Estudiante) {

    var estudianteAgregado= println("Estdiante ${estudiante.nombreEstudiante} ha sido agregado")
    var estudianteNoAgregado=println("Estudiante no ha sido agregado")
    var noHayEstudiantes = "No hay estudiantes a mostrar"
    constructor():this(Estudiante())

    fun mostrarMensajeAgregado(){
        println(estudianteAgregado)
    }
    fun mostrarMensajeNoAgregado(){
        println(estudianteNoAgregado)
    }
//    fun mostrarSinEstudiantes(){
//        println(noHayEstudiantes)
//    }
}
