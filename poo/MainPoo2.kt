package poo

class MainPoo2 {


    fun usoConstructorPrimario() {
        class Persona

        var persona = Persona()

        class Persona2 constructor(nombrePersona: String)

        var persona2 = Persona2("Barbara")

        class Persona3 constructor(val nombrePersona: String)
        class Persona4 constructor(var nombrePersona: String)

        class Persona6(
            val nombrePersona: String,
            val apellidoPersona: String,
            val rutPersona: String,
            var edadPersona: Int,
            var descripcionPersona: String
        ) {

            init {
                println("Estoy dentro del inint")
                if (edadPersona >= 18) {
                    println("Es mayor de edad")
                }
            }
        }


        class Persona7(
            val nombrePersona: String,
            val apellidoPersona: String,
            val rutPersona: String,
            var edadPersona: Int,
            var descripcionPersona: String
        ) {
            var persona7 = Persona7("Barbara", "Carvajal", "1-2", 29, "codenado feliz")
            var nombreCopia: String = ""

            init {
                nombreCopia = persona7.nombrePersona
                println("Ejemplo : $nombreCopia")
            }
        }


    }

    fun usoConstructorSecundatio() {
        class Humano(val primerNombre: String, val apellido: String, var edad: Int) {
            init {

            }

            constructor() : this("", "", 0)
        }

        var humano1 = Humano()
        var humano2 = Humano("barb", "carv", 29)


        class humanoNuevo {
            init {

            }

            constructor(nombreHumano: String, apellidoHumano: String, edadHumano: Int)
        }

    }

    fun gettersYsetter(){
        // primera forma
        class Pokemon(var nombrePokemon: String)
        var pikachu = Pokemon("Pikachu")
        pikachu.nombrePokemon // esto es un "get"
        pikachu.nombrePokemon = "pikachu gordito" // esto es un "set"
        println(pikachu.nombrePokemon)

        // segunda forma
        class Caricatura{
            var nombreCaricatura = "un show mas"
                get() = field.capitalize()
                set(value){
                    value.capitalize()
                }
            init {
            }
            constructor(nombre:String){
                nombreCaricatura = nombreCaricatura
            }

        }


    }



    fun main() {

        var lanzador = MainPoo2()
        //lanzador.usoConstructorPrimario()
        lanzador.usoConstructorSecundatio()

    }
}