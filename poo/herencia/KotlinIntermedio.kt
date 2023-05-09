package poo.herencia

fun main(){

//    var continente:Continente = Continente()
//    continente.mostrarNombreContinente()
//
//    var circulo = areaCirculo()
//    circulo.calcularAreaCirculo()
//
//    var paisChile= Pais("Chile",20)
//    var paisArgentina = Pais("Argentina",20)
//
//    if(paisChile.equals(paisArgentina)){
//        println("Ambos paises son iguales")
//    } else {
//        println("Paises Distintos")
//    }
//
//    var colombia = paisChile.copy(nombre = "Colombia")
//    println(colombia.toString())
//    println(paisArgentina.toString())
//    println(paisChile.toString())
//
//    val (nombre,poblacion) = paisChile
//    println("El nombre del pais es $nombre, la poblacion del pais es $poblacion")

//    Usuario.nombre
//    println("Nombre de la persona : ${Usuario.nombre}")
//    Usuario.getNameUser()
//
//    ManagerDB.getInstance()

    var planeta:Planeta = Planeta.JUPITER
    var nombreJupiter = planeta.nombre
    println("Nombre de Jupiter es $nombreJupiter")
    var planetas:Array<Planeta>  = Planeta.values()
    planetas.forEach { println(it) }
    println("Posicion de Marte : ${Planeta.MARTE.ordinal}")
    println("Nombre de Marte : ${Planeta.MARTE.name}")

    when(planeta){

        Planeta.MERCURIO -> println("Nombre Planeta de Mercurio :${planeta.name}")
        Planeta.VENUS -> println("Nombre Planeta Venus :${planeta.name}")
        Planeta.TIERRA -> println("Nombre Planeta Tierra:${planeta.name}")
        Planeta.MARTE -> println("Nombre Planeta Marte:${planeta.name}")
        Planeta.JUPITER -> println("Nombre Planeta Jupiter:${planeta.name}")
        Planeta.SATURNO -> println("Nombre Planeta Saturno:${planeta.name}")
        Planeta.URANO -> println("Nombre Planeta Urano:${planeta.name}")
        Planeta.NEPTUNO -> println("Nombre Planeta Neptuno:${planeta.name}")
        Planeta.PLUTON -> println("Nombre Planeta Pluton:${planeta.name}")
    }

    Planeta.getSizePlanet()

    var mensajeExito = MensajeriaApp.MensajeExito("Fue un Exito")
    var mensajeFallo = MensajeriaApp.MensajeError("Esto es un error")

    mensajeFallo.mostrarClass()
    mensajeExito.mostrarClass()




}



/*

Keyword: lateinit

Mediante lateinit lo que conseguimos es una inicialización tardía,
indicando al compilador que dicha inicialización se realizará más adelante en el código.

El modificador lateinit solo puede ser utilizado en variables mutables (var) declaradas
en el cuerpo de una clase (no el en constructor primario),
y solo cuando dicha variable no tiene un getter o setter personalizado.

Solo puede ser utilizada para variables que sea de ipo var y no nulas
 */

class Continente(){

    lateinit var nombre: String

    fun mostrarNombreContinente(){
        nombre = "America"
        println("El nombre del continente es $nombre")

    }

}

/*
KEYWORD : lazy

Mediante lazy lo que conseguimos es una inicialización perezosa, con lo que una variable no será inicializada a no ser que
sea utilizada en nuestro código. Será inicializada una única vez tras lo cual mantendrá el valor.

Variable que no se ocupa pero igual ocupa memoria. Desperdicio de memoria


Se inicializa cuando se ocupa

 */

class areaCirculo(){

    val pi: Float by lazy {
        3.14f
    }

    var radio = 5

    fun calcularAreaCirculo(){

        var area = pi*radio*radio
        println("El area del circulo es : $area")

    }
}

class Computador:Any(){

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }

    override fun toString(): String {
        return super.toString()
    }

}

data class Pais(var nombre:String,var poblacion:Int)

/*
SINGLETION y COMPANION OBJECT

Para definir una propiedad o método estático en lenguaje Java se antepone el modificador static a su nombre.
Las propiedades estáticas de una Clase son compartidas por todos los Objetos que heredan de ella,
con lo que si su valor es modificado en cualquier de ellos afectará a todas las demás instancias.

El mencionado modificador static es utilizado también para declarar constantes o propiedades cuyo
valor no puede ser modificado una vez definido.
Por otro lado, para acceder a los métodos estáticos de una clase no es necesario
crear un objeto, pudiendo acceder a ellos a través del propio nombre de clase.


Singleton -> Crear una sola instancia en el programa
Variables , funciones , bloques de codigo , clases anidadas

Se almacenan en direcciones de memorias dinamicas ,que es un tipo de
memoria permanente

CO: Declarar objetos que se compotan como una clase, que puede contener
variables y metodos estaticos sin usar la palabra clave static
 */

object Usuario{

    var nombre:String = "Maria"

    fun getNameUser(){
        println("El nombre de la persona es : $nombre")

    }
}

/*
Companion Object : Se crea dentro de la instancia de una clase.
Sirve para englobar metodos o variables estaticos que utilizaremos en la app
 */
class ManagerDB private constructor(){

    companion object Cliente {
        // Actua como una variable estatica
        private var instance:ManagerDB? = null
        var id:Int = -1
        // 2 subprocesos pueden acceder al mismo tiempo y crear una instamncia repetida
        fun getInstance()= synchronized(this){
            if(instance == null){
                instance= ManagerDB()
                instance
            }
        }

    }

}


/*
ENUM CLASS

Una enumeración es un conjunto de valores que usan como identificador un nombre. Dicho nombre se comporta como una constante en nuestro lenguaje.

Tiene 2 metodos por defecto
values() -> Retorna todos los valores del arreglo de clases enumeradas
valuesof()
 */

interface Asteroide{

    fun esAsteroide():Boolean
}

interface AgujeroNegro{
    fun loAbsorbe():Boolean
}

enum class Planeta(var nombre:String,var atmosfera:Int):Asteroide,AgujeroNegro{

    MERCURIO("Mercurio",22200) {
        override fun esAsteroide(): Boolean {
            TODO("Not yet implemented")
        }

        override fun loAbsorbe(): Boolean {
            TODO("Not yet implemented")
        }
    },
    VENUS("Venus",3000) {
        override fun esAsteroide(): Boolean {
            TODO("Not yet implemented")
        }

        override fun loAbsorbe(): Boolean {
            TODO("Not yet implemented")
        }
    },
    TIERRA("Tierra",3000) {
        override fun esAsteroide(): Boolean {
            TODO("Not yet implemented")
        }

        override fun loAbsorbe(): Boolean {
            TODO("Not yet implemented")
        }
    },
    MARTE("Marte",3000) {
        override fun esAsteroide(): Boolean {
            TODO("Not yet implemented")
        }

        override fun loAbsorbe(): Boolean {
            TODO("Not yet implemented")
        }
    },
    JUPITER("Jupiter",3000) {
        override fun esAsteroide(): Boolean {
            TODO("Not yet implemented")
        }

        override fun loAbsorbe(): Boolean {
            TODO("Not yet implemented")
        }
    },
    SATURNO("Saturno",3000) {
        override fun esAsteroide(): Boolean {
            TODO("Not yet implemented")
        }

        override fun loAbsorbe(): Boolean {
            TODO("Not yet implemented")
        }
    },
    URANO("Urano",22332) {
        override fun esAsteroide(): Boolean {
            TODO("Not yet implemented")
        }

        override fun loAbsorbe(): Boolean {
            TODO("Not yet implemented")
        }
    },
    NEPTUNO("Neptuno",-33433) {
        override fun esAsteroide(): Boolean {
            TODO("Not yet implemented")
        }

        override fun loAbsorbe(): Boolean {
            TODO("Not yet implemented")
        }
    },
    PLUTON("Pluton", 3444) {
        override fun esAsteroide(): Boolean {
            TODO("Not yet implemented")
        }

        override fun loAbsorbe(): Boolean {
            TODO("Not yet implemented")
        }
    };

    companion object{

        fun getSizePlanet(){
            println("La cantidad de planetas que hay en el sistema solar es de : ${values().size}")
        }

    }

}

/*
Una clase sellada (o sealed class) permite representar jerarquías restringidas en
las que un objeto sólo puede ser de un tipo de las dadas.

Es decir, tenemos un clase con un número específico de subclases. Lo que obtenemos al final
es un concepto muy similar al de un enumerado.
La diferencia radica en que en los enumerados sólo tenemos un único objeto por tipo,
 mientras que en las sealed classes podemos tener varios objetos de la misma clase.

3.3. Ventajas de las clases selladas
Las ventajas frente a los enumerados vienen dadas por lo que ya hemos comentado,
que es el hecho de que los elementos sean clases (class, data class, object e incluso sealed class):

La más importante es que cada subclase puede tener sus propios valores y sus propios métodos,
a diferencia de los enumerados, cuyos elementos siguen todos la misma estructura.
Además, los enumerados solamente pueden tener una instancia, mientras que las subclases de clases selladas
 pueden tener varias instancias, cada una con su estado, o una si la definimos como object.

 */

sealed class MensajeriaApp(val mensaje:String){

    class MensajeExito(mensaje:String): MensajeriaApp(mensaje)
    class MensajeError(mensaje:String): MensajeriaApp(mensaje)

    fun mostrarClass(){
        println("Este es el mensaje que envie $mensaje")
    }

}

fun getMensajeria(mensaje:MensajeriaApp){

    when(mensaje){
        is MensajeriaApp.MensajeError -> mensaje.mostrarClass()
        is MensajeriaApp.MensajeExito -> mensaje.mostrarClass()
    }

}