package poo

class Estudiante (rutEstudiante:String , nombreEstudiante:String,edad:Int,fechaNacimiento:String){
    /*
    Estructura de una clase
     */

    // Atributos o caracteristicas de un estudiante
    var rutEstudiante: String = rutEstudiante
    var nombreEstudiante: String = nombreEstudiante
    var edad: Int = edad
    var fechaNacimiento = fechaNacimiento

    //Constructor implicito
    constructor() : this ("","",0,"")

    //Comportamientos
    fun estudianteHabla() {
        println("Estudiante ${nombreEstudiante} esta hablanbdo")
    }
    fun estudianteAsiste():Boolean {
        var asiste = true

        return asiste
    }
    fun estudianteCome(){
        println("Estudiante ${nombreEstudiante} esta comiendo")
    }
    fun estudianteNoCome(){
        println("Estudiante ${nombreEstudiante} No esta comiendo")
    }
    fun estudianteEstudia(){
        println("Estudiante ${nombreEstudiante} esta estudiando")
    }
    fun estudianteNoestudia(){
        println("Estudiante ${nombreEstudiante} No esta estudiando")
    }
    fun estudianteSePresenta(){
        println("Rut: ${rutEstudiante}")
        println("Nombre: ${nombreEstudiante}")
        println("Edad: ${edad}")
        println("Fecha de nacimiento: ${fechaNacimiento}")
    }
    fun estudianteSedespide(){
        println("${nombreEstudiante} se despide")
    }



}