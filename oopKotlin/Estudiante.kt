package com.example.aprendiendokotlin.oopKotlin



class Estudiante(var nombre:String="", var rut:String = "", var edad:Int = 0, var fechaNacimiento: String = "" ) {



fun mostrarDatos(){
    println(nombre)
    println(rut)
    println(edad)
}

}
