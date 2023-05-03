package com.example.aprendiendokotlin.ClasePoo0205

class MainPoo {

  fun usoConstructorPrimario() {

      class Persona

      var persona = Persona()


      class Persona2 constructor (nombre:String)

      var persona2 = Persona2("maria")

  }
}

fun main (){

    var main2 = MainPoo()


}

fun usoDeConstructorSecudario(){

    class Persona7(val nombre:String, val apellido:String, var edad:Int) {

        init {

        }

        constructor(): this ("","", 0){}
    }

    var persona7 = Persona7()
    var persona7_2= Persona7("bea","Urzua",28)

}