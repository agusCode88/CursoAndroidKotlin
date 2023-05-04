package TareaPoo

class Curso(var nombreCurso: String) {

    var curso = mutableListOf<Alumno>()


    var alumno1: Alumno = Alumno("Beatriz", "Urzua", "19247574-0", 28, intArrayOf(3, 4, 5))
    var alumno2: Alumno = Alumno("Felipe", "Termini", "1-1", 28, intArrayOf(4, 2, 4))

    init {
        curso.add(alumno1)
        curso.add(alumno2)
    }


    fun agregarEstudiante(){

        println("Ingrese el nombre del estudiante:")
        val nombre:String? = readLine()

        println("Ingrese el apellido del estudiante:")
        val apellido:String? = readLine()

        println("Ingrese el Rut del estudiante:")
        val rut:String? = readLine()

        println("Ingrese la edad del estudiante:")
        val edad:Int = readln().toInt()

        println("Ingrese la cantidad de notas del estudiante:")
        val cantidadNotas = readln().toInt()
        var listaDeNotas = IntArray(cantidadNotas)

        for (nota in 0 until cantidadNotas) {
            println("Ingrese la nota ${nota + 1}:")
            listaDeNotas[nota] = readLine()?.toInt() ?: continue
        }
        var estudiante = Alumno(nombre, apellido, rut, edad, listaDeNotas)
        curso.add(estudiante)
    }

    fun mostrarEstudiantesCurso() {

        println("Listado de estudiantes")

        curso.forEach {
            println("${it.nombre} ${it.apellido}")
        }
    }

    fun buscarEstudiantePorRut(rutIngresado: String) {

        var alumnoEncontrado = curso.find { it.rut.equals(rutIngresado) }

        if (alumnoEncontrado != null) {

            println("Nombre: ${alumnoEncontrado.nombre}")
            println("Apellido: ${alumnoEncontrado.apellido}")
            println("Rut: ${alumnoEncontrado.rut}")
            println("Edad: ${alumnoEncontrado.edad}")
            println("Notas: [${alumnoEncontrado.nota?.toList()}]")

        } else {
            println("Alumno no encontrado")
        }
    }


    fun actualizarEstudiantePorNombreORut(rutoNombre:String){

        var alumnoEncontrado = curso.find { it.rut.equals(rutoNombre) || it.nombre.equals(rutoNombre) }

        if (alumnoEncontrado != null) {

            println("Nombre: ${alumnoEncontrado.nombre}")
            println("Apellido: ${alumnoEncontrado.apellido}")
            println("Rut: ${alumnoEncontrado.rut}")
            println("Edad: ${alumnoEncontrado.edad}")
            println("Notas: [${alumnoEncontrado.nota?.toList()}]")

            println("Seleccione atributo a editar")
            println("1.-Nombre , 2.-Apellido, 3.-Edad")
            var opcion = readLine()?.toIntOrNull()?: 0

            when(opcion){

                1-> {
                    println("Ingrese el nombre del estudiante:")
                    val nombreNuevo = readLine()!!
                    alumnoEncontrado.nombre = nombreNuevo

                    println("Modificacion exitosa")
                }

                2-> {
                    println("Ingrese el nuevo apellido del estudiante:")
                    val apellidoNuevo = readLine()!!
                    alumnoEncontrado.apellido = apellidoNuevo

                    println("Modificacion exitosa")
                }

                3-> { println("Ingrese la nueva edad del estudiante:")
                    val edadNueva = readln().toInt()
                    alumnoEncontrado.edad = edadNueva

                    println("Modificacion exitosa")
                }
            }

        } else {
            println("Alumno no encontrado")
        }
    }

    fun PromedioPorRut(rutIngresado: String) {

        var alumnoEncontrado = curso.find { it.rut.equals(rutIngresado) }

        if (alumnoEncontrado != null) {

            val notas = alumnoEncontrado.nota
            val promedio = notas?.average()

            println("El promedio es: $promedio")


        } else {
            println("Alumno no encontrado")
        }
    }

    fun agregarNotas(rutIngresado: String){

        var alumnoEncontrado = curso.find { it.rut.equals(rutIngresado) }

        if (alumnoEncontrado != null) {

            println("Ingrese la nueva nota")
            var nuevaNota = readln().toInt()

           alumnoEncontrado.nota?.plus(nuevaNota)

        } else {
            println("Alumno no encontrado")
        }

        println("Listado de notas actualizado: ${alumnoEncontrado?.nota?.toList()}")

    }

}



