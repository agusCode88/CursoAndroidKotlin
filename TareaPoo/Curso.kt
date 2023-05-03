package TareaPoo

class Curso {

    var nombreCurso: String


    var curso = mutableListOf<Alumno>()

    constructor(nombreCurso: String) {
        this.nombreCurso = nombreCurso

    }

    constructor() : this (""){
    }




}




