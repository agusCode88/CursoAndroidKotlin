package com.example.aprendiendokotlin.poo
class Estudiante(
    val nombre: String,
    val rut: String,
    var edad: Int,
    var notas: List<Double>,
    var asistencia: Double = 0.0,
    var direccion: String?,
    var telefono: String?
) {
     
    companion object {
        val RANGO_ASISTENCIA = 0.0..100.0
    }

    init {
        require(nombre.isNotBlank()) { "El nombre no puede ser vacío" }
        require(rut.matches(Regex("[0-9]{8}-[0-9kK]{1}"))) { "El RUT debe tener formato XXXXXXXX-X" }
        require(edad > 0) { "La edad debe ser mayor que cero" }
        require(asistencia in RANGO_ASISTENCIA) { "La asistencia debe estar entre $RANGO_ASISTENCIA" }
        require(notas.all { it in RANGO_ASISTENCIA }) { "Las notas deben estar entre $RANGO_ASISTENCIA" }
    }
}
