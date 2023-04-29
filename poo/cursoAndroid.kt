package poo

class cursoAndroid(nombreCurso:String, relator: Relator= Relator()) {

    var nombreCurso= nombreCurso
    var listaEstudiante = mutableListOf<Estudiante>()

   constructor() : this("", Relator())

    fun agregarEstudiante(estudiante: Estudiante) {
        if (estudiante != null) {
            listaEstudiante.add(estudiante)
            val mensajeria: Mensajeria = Mensajeria()
            mensajeria.mostrarMensajeAgregado()
        }else {
            val mensajeria: Mensajeria = Mensajeria()
            mensajeria.mostrarMensajeNoAgregado()
        }
            /*
            println("Estudiante ${estudiante.nombreEstudiante} ha sido agregado")
        }else{
            println("Estudiante no encontrado")
        }*/


    fun listarEstudiantesCurso(){
        if(listaEstudiante.isEmpty()){
            println("No hay estudiantes a mostrar")
        }else{
            listaEstudiante.forEach{estudiante -> estudiante.estudianteSePresenta() }
        }
    }
    fun eliminarEstudianteDelCurso (estudiante: Estudiante){
        if( estudiante !=null){
            listaEstudiante.remove(estudiante)
            println("Estudiante ha sido eliminado")
        }else{
            println("No ha sido eliminado")
        }
    }
        }
    }
