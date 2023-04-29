package poo

class Estudiante (rutPersona:String, nombreEstudiante: String, edad: Int, fechaNacimiento: String){
/*
Estructura de una clase
 */

//Atributos o caracteristicas de un estudiante
    var rutEstudiante: String = ""
    var nombreEstudiante: String = ""
    var edad: Int = 0
    var fechaNacimiento = ""

    //Constructor implicito
    constructor(): this ("","",0,"")

    //comportamientos, dentro de una clase esto es un metodo.
    fun estudianteHabla(){
        println("Estudiante ${nombreEstudiante} esta hablando")

    }
    fun estudianteAsiste(): Boolean{
        var asiste = true
        return asiste
    }
    fun estudianteCome(){
        println("Estudiante ${nombreEstudiante} está comiendo")
    }
    fun estudianteNoCome(){
        println("Estudiante ${nombreEstudiante} esta no está comiendo")

    }
    fun estudianteEstudia(){
        println("Estudiante ${nombreEstudiante} está estudiando")

    }
    fun estudianteNoEstudia(){
        println("Estudiante ${nombreEstudiante} está estudiando")

    }
    fun estudianteSeDespide(){
        println("Estudiante ${nombreEstudiante} se despide, bye bye")

    }
    fun estudianteSePresenta(){
        println("Rut: ${rutEstudiante}")
        println("Nombre: ${nombreEstudiante}")
        println("Edad: ${edad}")
        println("Fecha de nacimiento: ${fechaNacimiento}")

    }



}