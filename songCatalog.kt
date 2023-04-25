package com.example.aprendiendokotlin

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}


    fun main() {
        val spaceOddity = Song("Space Oddity", "David Bowie", 1969, 1523)
        val smellsLikeTeenSpirit = Song("Smells Like Teen Spirit", "Nirvana", 1991, 9805)
        val bohemianRhapsody = Song("Bohemian Rhapsody", "Queen", 1975, 12476)

        spaceOddity.printDescription()
        smellsLikeTeenSpirit.printDescription()
        bohemianRhapsody.printDescription()

        println("Is ${spaceOddity.title} popular? ${spaceOddity.isPopular}")
        println("Is ${smellsLikeTeenSpirit.title} popular? ${smellsLikeTeenSpirit.isPopular}")
        println("Is ${bohemianRhapsody.title} popular? ${bohemianRhapsody.isPopular}")
    }


