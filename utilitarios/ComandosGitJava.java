package utilitarios;

public class ComandosGitJava {

    public static void main(String[] args) {
        // Ver la ruta donde estoy parado
        System.out.println("pwd");

        // Ver el contenido de una carpeta
        System.out.println("ls");

        // Ingresar a una carpeta
        System.out.println("cd <nombre_carpeta>");

        // Regresar a la carpeta anterior
        System.out.println("cd ..");

        // Crear una carpeta
        System.out.println("mkdir <nombre_carpeta>");

        // Abrir la interfaz del SO
        System.out.println("explorer . --> windows");
        System.out.println("open . --> Mac");
        System.out.println("nautilus . --> Linux");

        // Crear un documento de texto
        System.out.println("touch <nombre_archivo>");

        // Inicializar un repositorio Git
        System.out.println("git init");

        // Ver archivos ocultos
        System.out.println("ls -a");

        // Ver el estado del Git
        System.out.println("git status");

        // Agregar archivos, carpetas, imágenes, documentos, etc
        System.out.println("git add <nombre_archivo>");

        // Commitear cambios
        System.out.println("git commit -m \"Título o Descripción del cambio\"");

        // Ver commits realizados
        System.out.println("git log");

        // Entrar a un commit o una rama
        System.out.println("git checkout <identificadorRamaOCommit>");

        // Crear una rama. Se crea con la última información de la rama anterior
        System.out.println("git branch <nombreRama>");

        // Ver ramas
        System.out.println("git branch");

        // Entrar a una rama
        System.out.println("git checkout <nombreRama>");

        // Mezclar las ramas
        System.out.println("git merge <nombreRama>");

        // Comandos de GitHub

        // Al repositorio se accede con la URL del GitHub
        System.out.println("git remote add origin URL");

        // Enviar cambios al repositorio
        System.out.println("git push origin <nombreRama>");

        // Clonar un proyecto de la nube
        System.out.println("git clone URL");

        // Traerse los cambios de la nube
        System.out.println("git pull origin <nombreRama>");

        // Consejos adicionales
        System.out.println("*Antes de cambiar de rama siempre hacer un commit antes");
        System.out.println("*Siempre antes de hacer un push, hay que hacer un pull");
    }

}