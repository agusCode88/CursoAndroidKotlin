package poo.herencia



fun main(){

//    var notas = intArrayOf(45,55,60)
//    var persona = Humano("Jorge","Arancibia",35)
//    var alumno =  Alumno("David","Toro",54,notas,65)
//    var relator = Profesor("Agustin","Romero",34,2000000)
//
//    persona.saludar()
//    alumno.saludar()
//    relator.saludar()

    var view = View()
    var boton = Button("Login","Center")
    var bordes = DisenioBoton("Login","Center",40)

    bordes.inflar()
    boton.inflar()
    view.inflar()

}

   open class Humano(var nombre:String, var apellido:String, var edad:Int ){

        private var id:Int= 0

        open fun saludar(){
            println(" Persona Saluda $nombre")
        }

    }

        class Alumno(nombre: String,apellido: String,
                     edad:Int ,protected var notas:IntArray,
                     private var porcentajeAsistencia:Int) : Humano(nombre, apellido,edad){


        init {
            probarAccesos()
        }

         override fun saludar(){
            println("Alumn@ Saluda $nombre")
            super.saludar()
        }

        fun probarAccesos(){
            this.apellido
            this.nombre
            this.edad
        }

        fun promedioNotas(){

            var promedioNotas:Double = this.notas.average()
        }

    }

    class Profesor(nombre: String,apellido: String,edad:Int, protected var sueldo:Int): Humano(nombre, apellido,edad) {

        override fun saludar(){
            println("Relator Saluda $nombre")
            super.saludar()
        }

        fun mostrarSueldo(){
            println("Sueldo Relator(a) : ${sueldo} ")
        }
    }

open class View(){
    open fun inflar(){
        println("Hola estoy listo para ser inflado")
    }

}

open class Button( open var texto:String , open var posicion:String):View(){
    override fun inflar(){
        println("Hola soy el boton y me estoy pintando, mi texto es:" +
                " $texto y mi posicion en la vista es: $posicion")

        super.inflar()
    }
}

class DisenioBoton(override var texto:String,
                   override var posicion:String,
                   valoresquinas:Int):Button(texto, posicion){

    var valoresquinas:Int = valoresquinas

     override fun inflar(){
         println("Le estoy dando bordes al boton $texto con la posicion $posicion" +
                 " y con este tamanio de esquinas $this.$valoresquinas")

         super.inflar()
     }

}

