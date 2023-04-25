package com.example.aprendiendokotlin



fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        val referrerDetails = referrer?.let {
            ", who likes to ${it.hobby ?: "do various activities"}."
        } ?: "."
        println(" ")
        println("Name: $name\nAge: $age\nLikes to ${hobby ?: "do various activities"}." +
                "${if (referrer != null) " Has a referrer named ${referrer.name}$referrerDetails" else " Doesn't have a referrer."}")
    }
}
