package poo.herencia


fun main(){

    var notas = intArrayOf(45,55,60)

    var alumno = MainHerencia.Alumno()
    alumno.notas = notas

}

class MainHerencia {

    class Persona(){

        var nombre:String =""
        var apellido:String = ""
        var edad:Int = 0

        fun saludar(){
            println(" Persona Saluda")
        }

    }

    class Alumno {

        var nombre:String =""
        var apellido:String = ""
        var edad:Int = 0
        var notas:IntArray = intArrayOf(0)
        var porcentajeAsistencia: Int = 0

        fun saludar(){

            println("Alumn@ Saluda")
        }

        fun promedioNotas(){
            var promedioNotas:Double = notas.average()
        }

    }

    class Relator {

        var nombre:String =""
        var apellido:String = ""
        var edad:Int = 0
        var sueldo:Int = 0

        fun saludar(){
            println("Relator Saluda")
        }

        fun mostrarSueldo(){
            println("Sueldo Relator(a) : ${sueldo} ")
        }
    }

}