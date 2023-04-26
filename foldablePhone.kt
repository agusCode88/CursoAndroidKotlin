package com.example.aprendiendokotlin


open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFolded: Boolean = false, isScreenLightOn: Boolean = false) : Phone(isScreenLightOn) {

    override fun switchOn() {
        if (!isFolded) {
            isScreenLightOn = true
        }
    }

    fun fold() {
        isFolded = true
        if (isScreenLightOn) {
            isScreenLightOn = false
            println("The phone screen's light is off because the phone is folded.")
        }
    }

    fun unfold() {
        isFolded = false
    }

    fun checkPhoneFolded() {
        val phoneFolded = if (isFolded) "folded" else "unfolded"
        println("The phone is currently $phoneFolded.")
    }
}
fun main() {
    val phone = FoldablePhone(isScreenLightOn = false)
    phone.switchOn() // Screen doesn't turn on since phone is not unfolded
    phone.checkPhoneScreenLight() // The phone screen's light is off.

    phone.fold() // Fold the phone, which turns off the screen light
    phone.checkPhoneFolded() // The phone is currently folded.

    phone.switchOn() // Screen doesn't turn on since phone is folded
    phone.checkPhoneScreenLight() // The phone screen's light is off because the phone is folded.

    phone.unfold() // Unfold the phone
    phone.checkPhoneFolded() // The phone is currently unfolded.

    phone.switchOn() // Screen turns on since phone is unfolded
    phone.checkPhoneScreenLight() // The phone screen's light is on.

    phone.fold() // Fold the phone again
    phone.checkPhoneFolded() // The phone is currently folded.
}

