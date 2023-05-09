package poo.herencia


// class <Nombre de la clase> constructor primario ()
class EstrucuturaDeUnaClase {

    /*

     Propiedades de la clase
     ( Encapsulamiento )

     */

    var nombre:String = ""

        /*
        Opcional
         */
        get() = field.capitalize()
        set(value) {
            value.capitalize()
        }

    /*
    Opcional
     */
    init {
        // Aca puede ir codigo
    }

    /*
     Constructor Secundario
     ( Polimorfismo )
      OPCIONAL

     */

    constructor()
    

    /*

    Metodos de una clase
    ( Comportamiento )

     */
    fun saludar(){

        println("Saludo")
    }

}