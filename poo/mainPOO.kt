package poo

fun main(){
    var cursoAndroid= cursoAndroid()
    cursoAndroid.nombreCurso= "Android"


    var consuelo:Estudiante = Estudiante()
    var martin:Estudiante = Estudiante()
    var lali: Estudiante = Estudiante("16-8", "Lali", 32, "26/11/90")



    consuelo.rutEstudiante= "17.355.848-1"
    consuelo.nombreEstudiante= "Consuelo"
    consuelo.edad= 32
    consuelo.fechaNacimiento= "27/04/90"

    consuelo.estudianteSePresenta()
    consuelo.estudianteEstudia()
    consuelo.estudianteCome()
    consuelo.estudianteHabla()
    consuelo.estudianteSeDespide()

    martin.rutEstudiante= "17-4"
    martin.nombreEstudiante= "Martin"
    martin.edad= 34
    martin.fechaNacimiento= "15/10/88"

    martin.estudianteSePresenta()
    martin.estudianteHabla()
    martin.estudianteAsiste()
    martin.estudianteEstudia()
    martin.estudianteSeDespide()

    lali.estudianteSePresenta()
    lali.estudianteNoEstudia()
    lali.estudianteCome()
    lali.estudianteSeDespide()

    cursoAndroid.agregarEstudiante(consuelo)
    //cursoAndroid.listarEstudiantesCurso()
    //cursoAndroid.eliminarEstudianteDelCurso(martin)
    //cursoAndroid.listarEstudianteCurso()

}