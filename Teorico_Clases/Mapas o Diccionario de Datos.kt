package Teorico_Clases

fun main() {
    //Notar la diferencia de mutable e inmutable
    var mapaDeDatos1: Map<String, Int> = mapOf()
    var mapaDeDatos2 = mapOf("Id1" to 1, "Id2" to 45, "Id3" to 545)
    var mapaDeDatos3 = mutableMapOf("Id4" to 69, "Id5" to 11, "Id6" to 666)
    var mapaDeDatos4: MutableMap<String, Int> = mutableMapOf()

    //print de los distintos mapas
    println("Este es el mapa de datos 1: " + mapaDeDatos1)
    println("Este es el mapa de datos 2: $mapaDeDatos2")
    println("Este es el mapa de datos 3: $mapaDeDatos3")

    //agregar elemento mapaDeDatos
    mapaDeDatos3["Id4"]
    mapaDeDatos4.put("Id4", 9)//identificador, valor

    //Buscar un elemento con el Id
    var valorRescatado1 = mapaDeDatos3["Id6"]
    var valorRescatado2 = mapaDeDatos4["Id4"]
    println("El valor rescatado 1 es: $valorRescatado1")
    println("El valor rescatado 2 es: $valorRescatado2")

    println("Key del elemento ")

    println(mapaDeDatos2)

    //Usando el forEach te permite usar funciones lambda
    mapaDeDatos3.forEach{(id,valor)->println("$id:$valor")}

    //for
    for(texto in mapaDeDatos3){
        print("este es el valor ${texto.value}")
        print("esta es la lleva ${texto.key}")
    }

    //get
    println("el valor del elemento Id4 es: " + mapaDeDatos3.get("Id4"))

    //borrar
    mapaDeDatos3.remove("Id4")

    println("Este es el nuevo mapa lueg de borrar"+ mapaDeDatos3)

    //Comprobacion con if y else (tambien funciona con los keys "Id"
    if(31 in mapaDeDatos3.values){
        println("Valor 31 encontrado en el mapa")
    }else{
        println("Valor 31 no encontrado en el mapa")
    }

    //Comprobacion con Contain (con keys o values)
    if(mapaDeDatos3.containsValue(1232)){
        println("Valor 1232 fue encontrado en el mapa")
    }else{
        println("Valor 1232 no encontrado en el mapa")
    }

}