import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GestorAcademico implements IServiciosAcademicos{
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();
    private HashMap<Integer,Estudiante> inscripciones = new HashMap<>();

    public void mostrarCursos() {
        System.out.println("---- CURSOS ----");
        for(Curso curso : cursos) {
            System.out.println(curso.getId() + " - " + curso.getNombre());
        }
    }

    public void mostrarEstudiantes() {
        System.out.println("---- ESTUDIANTES ----");
        for(Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getId() + " - " + estudiante.getNombre() + " " + estudiante.getApellido());
        }
    }

    public void mostrarInscripciones() {
        System.out.println("---- CURSOS ----");
        for(Map.Entry<Integer,Estudiante> entry : inscripciones.entrySet()) {
            System.out.println(entry.getKey() +" - " + entry.getValue().getNombre() + " " + entry.getValue().getApellido());
        }
    }

    @Override
    public void matricularEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    @Override
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException {
        ArrayList<Integer> cursosInscritos = new ArrayList<>();
        for(Map.Entry<Integer,Estudiante> inscripcion : inscripciones.entrySet()) {
            if(inscripcion.getValue().equals(estudiante)) {
                cursosInscritos.add(inscripcion.getKey());
            }
        }
        if(cursosInscritos.contains(idCurso)) {
            throw new EstudianteYaInscritoException(estudiante.getId(), idCurso);
        } else {
            inscripciones.put(idCurso, estudiante);
        }
    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoInscritoEnCursoException {
        Estudiante estudiante = null;
        for(Estudiante entry:estudiantes) {
            if(entry.getId() == idEstudiante) {
                estudiante = entry;
            }
        }
        boolean result = inscripciones.remove(idCurso, estudiante);

        if(!result) {
            throw new EstudianteNoInscritoEnCursoException(idEstudiante, idCurso);
        }
    }
}
