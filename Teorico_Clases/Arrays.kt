package clase_3

fun main(){
    trabajandoConArrays()
}

fun trabajandoConArrays(){

    var nombrePersona1 : String? = "Maria Magdalena"
    var nombrePersona2 : String? = "Pedro"
    var nombrePersona3 : String? = "Maria"
    var nombrePersona4 : String? = "Jose"
    var nombrePersona5 : String? = "Jesus"

    var familiaBiblia = arrayOf(nombrePersona1,nombrePersona2,nombrePersona3,nombrePersona4,nombrePersona5)
    var elHijoDeDios: String? = familiaBiblia[4]
    var elHijoDeJose: String? = null

    println("El hijo de Dios es : $elHijoDeDios")
    println("El hijo de Jose es: $elHijoDeJose")
}


