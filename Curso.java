public class Curso {
    private String  nombre, descripcion, version;
    private int id,numeroCreditos;

    public Curso(int id, String nombre, String descripcion, String version, int numeroCreditos) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.version = version;
        this.numeroCreditos = numeroCreditos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }
}
