package materiaKotlin

fun main() {
    trabajandoConArrays()
}

// Se crean variables que contienen los nombres de cinco personas diferentes.
// El signo "?" después de "String" indica que la variable puede ser nula.
fun trabajandoConArrays() {
    var nombrePersona1: String? = "Maria Magdalena"
    var nombrePersona2: String? = "Pedro"
    var nombrePersona3: String? = "Maria"
    var nombrePersona4: String? = null
    var nombrePersona5: String? = "Jesus"

    // Se crea un arreglo que contiene los nombres de las personas anteriores.

// Se crea un array llamado "familiaBiblia" con las variables de nombres de personas
    var familiaBiblia = arrayOf(nombrePersona1, nombrePersona2, nombrePersona3, nombrePersona4, nombrePersona5)

// Se definen variables nullable que representan los roles de algunas personas dentro de la familiaBiblia
    var elHijoDeDios: String? = familiaBiblia[4]
    var esposadeJesus: String? = familiaBiblia[0]
    var discipuloJesus: String? = familiaBiblia[1]
    var papaDeJesus: String? = familiaBiblia[3]
    var mamaDeJesus: String? = familiaBiblia[2]

// Se imprimen los valores de las variables creadas anteriormente
    println("El hijo de Dios es: $elHijoDeDios")
    println("Esposa de $elHijoDeDios es: $esposadeJesus")
    println("El discipulo de $elHijoDeDios es: $discipuloJesus")
    println("El esposo de $mamaDeJesus es: $papaDeJesus")
    println("El mama de $elHijoDeDios es: $mamaDeJesus")

// Se crea un array de enteros llamado "numeroEdades" con un tamaño predefinido de 5
    var numeroEdades: IntArray = IntArray(5)

// Se asignan valores a cada posición del array "numeroEdades"
    numeroEdades[0] = 1
    numeroEdades[1] = 2
    numeroEdades[2] = 3
    numeroEdades[3] = 4
    numeroEdades[4] = 5

// Se imprime el valor de la última posición del array "numeroEdades"
    println(numeroEdades[4])

// Se crea un segundo array de enteros llamado "numeroEdades2" con un tamaño predefinido de 5 y se asigna un valor a
// cada posición utilizando una lambda
// Se imprime el valor de la última posición del array "numeroEdades2"
    var numeroEdades2: IntArray = IntArray(5) { i -> i * 2 }
    println(numeroEdades2[4])

// Se crea un tercer array de enteros llamado "numeroEdades3" con valores predefinidos
// Se imprime el valor de la primera posición del array "numeroEdades3"
    var numeroEdades3: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println(numeroEdades3[0])
}