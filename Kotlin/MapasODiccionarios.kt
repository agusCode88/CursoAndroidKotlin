package Kotlin

/*
Los arreglos...
 */
fun main(){
    mapaDeDatos()
}
fun mapaDeDatos(){
    var mapaDeDatos1: MutableMap<String,Int> = mutableMapOf()
    var mapaDeDatos2 = mapOf("id1" to 1, "Id2" to 45, "Id3" to 545)
    var mapaDeDatos3: MutableMap<String, Int> = mutableMapOf() // para agregarle datos

    println("Este es el mapa de Datos 1: " + mapaDeDatos1)
    println("Este es el mapa de Datos 2: $mapaDeDatos2" )

    //Rescatar un elemento del mapa
    var valorRescatado = mapaDeDatos2["Id5"]

    //agregar elemento al mapa
    mapaDeDatos3["Id5"]= 32
    mapaDeDatos3["Id6"]= 1232
    mapaDeDatos3.put("Id7", 333) //mapaDeDatos3.put(identificador, valor)
    mapaDeDatos3.put("Id8", 459)
    mapaDeDatos3["Id9"]= 64

    // mostrar todas las llaves y valores
    println("Key del elemento ${mapaDeDatos3.keys}")
    println("el valor del elemento es: ${mapaDeDatos3.values}")
    println("El valor rescatado es: $valorRescatado")

    for (elemento in mapaDeDatos3){
        println(elemento)
    }
    println(mapaDeDatos3)

    mapaDeDatos3.forEach{
        (id, valor)-> println("$id: $valor") }

    for(texto in mapaDeDatos3){

       // var valor1 = texto.value
        println("Este es el valor ${texto.value}")
        println("Este es la llave ${texto.key}")
    }

    println("El valor del elemento con Id7 es : " + mapaDeDatos3["Id7"]) //tradicional estilo java
    println("El valor del elemento con Id7 es : " + mapaDeDatos3.get("Id7"))

    //Eliminar un registro del diccionario de Datos, usar .key para esto
    mapaDeDatos3.remove("Id7")
    println("Este es el nuevo mapa luego de borrar" + mapaDeDatos3)


    //recorre la lista buscando el valor 32, sino no existe...
    if(32 in mapaDeDatos3.values){
        println("Valor encontrado es 32")
    } else {
        println("No existe en el mapa de Registro")
    }

    if("Id8" in mapaDeDatos3.keys){
        println("muestrame el valor: ${mapaDeDatos3.getValue("Id5")}")
    } else {
        println("No existe en el mapa de Registro")
    }

    if(mapaDeDatos3.containsValue(64)){
        println("El valor 64 existe")
    }

    if (mapaDeDatos3.containsKey("Id9")){
        println("Valor encontrado es ${mapaDeDatos3.getValue("Id9")}")
    } else{
        println("No existe en el mapa el registro")
    }





}

