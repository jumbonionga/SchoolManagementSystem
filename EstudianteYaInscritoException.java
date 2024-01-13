public class EstudianteYaInscritoException extends Exception {
    public EstudianteYaInscritoException(int idEstudiante, int idCurso) {
        super("El estudiante " + idEstudiante + " ya se encuentra inscrito en el curso " + idCurso);
    }
}
