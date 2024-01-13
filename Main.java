public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(1, "Fernando", "Pérez", "10/01/1999", "inactivo");
        Estudiante estudiante2 = new Estudiante(2, "Luis", "Pérez", "09/03/2002", "matriculado");
        Curso curso1 = new Curso(1,"Modelos matematicos","Curso inicial de matemáticas","primer semestre",3);
        Curso curso2 = new Curso(2,"Estadística 1","Curso inicial de estadística","primer semestre",2);

        GestorAcademico gestor = new GestorAcademico();
        gestor.matricularEstudiante(estudiante1);
        gestor.matricularEstudiante(estudiante2);
        gestor.agregarCurso(curso1);
        gestor.agregarCurso(curso2);

        gestor.mostrarCursos();
        gestor.mostrarEstudiantes();

        try {
            gestor.inscribirEstudianteCurso(estudiante2, 1);
            gestor.inscribirEstudianteCurso(estudiante1,2);
            gestor.inscribirEstudianteCurso(estudiante2,1);
        } catch (EstudianteYaInscritoException e) {
            System.out.println(e.getMessage());
        }

        gestor.mostrarInscripciones();

        try {
            gestor.desinscribirEstudianteCurso(2,1);
            gestor.desinscribirEstudianteCurso(1,2);
            gestor.desinscribirEstudianteCurso(2,1);
        } catch (EstudianteNoInscritoEnCursoException e) {
            System.out.println(e.getMessage());
        }

        gestor.mostrarInscripciones();
    }
}
