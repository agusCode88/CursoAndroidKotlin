package poo_herencia

class Herencia {

    open class Persona(){
        var nombre = ""
        var apellido = ""
        var edad = 0

        open fun saludar(){
            println("Persona saluda")
        }
    }

    class Alumno: Persona(){
        var notas:IntArray = intArrayOf(0)
        var asistencia: Int = 0

        override fun saludar(){
            println("Alumno saluda")
        }

    }



}

