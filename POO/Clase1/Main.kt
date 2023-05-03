package POO.Clase1

fun main (){

    var cursoAndroid = CursoAndroid("Android")

    var martin:Estudiante = Estudiante()
    var consuelo:Estudiante = Estudiante()
    var sergio:Estudiante = Estudiante("1-1","Sergio",36,"21/03/1987")
    var florencia:Estudiante = Estudiante("1-1","Florencia",30,"21/03/1987")

    var listaEstudiante = mutableListOf<Estudiante>()

    martin.rutEstudiante= "16.990.510-k"
    martin.nombreEstudiante="Martin"
    martin.edad= 30
    martin.fechaNacimiento="25/05/1993"

    martin.estudianteSePresenta()
    martin.estudianteNoestudia()
    martin.estudianteHabla()
    martin.estudianteNoCome()

    consuelo.rutEstudiante="1-1"
    consuelo.nombreEstudiante="Consuelo Bootcamp"
    consuelo.edad=35
    consuelo.fechaNacimiento= "27/04/1990"

    consuelo.estudianteSePresenta()
    consuelo.estudianteEstudia()
    consuelo.estudianteHabla()
    consuelo.estudianteSedespide()

    sergio.estudianteSePresenta()
    sergio.estudianteAsiste()

    listaEstudiante.add(martin)
    listaEstudiante.add(florencia)

    cursoAndroid.agregarEstudiante(florencia)
    cursoAndroid.agregarEstudiante(martin)
    cursoAndroid.agregarEstudiante(sergio)

    cursoAndroid.listarEstudiantesCurso()
    cursoAndroid.eliminarEstudianteDelCurso(martin)
    cursoAndroid.listarEstudiantesCurso()
    cursoAndroid.modificarEstudiante(consuelo)
    cursoAndroid.listarEstudiantesCurso()


}