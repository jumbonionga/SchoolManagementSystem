public class EstudianteNoInscritoEnCursoException extends Exception{
    public EstudianteNoInscritoEnCursoException(int idEstudiante, int idCurso) {
        super("El estudiante " + idEstudiante + " no está inscrito o el id " + idCurso + " no es valido");
    }
}
