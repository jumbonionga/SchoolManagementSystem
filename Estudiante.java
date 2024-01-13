public class Estudiante extends Persona{
    private String estado;
    private int id;

    public Estudiante(int id, String nombre, String apellido, String fechaDeNacimiento, String estado) {
        super(nombre,apellido,fechaDeNacimiento);
        this.id = id;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return super.getNombre();
    }

    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public String getApellido() {
        return super.getApellido();
    }

    public void setApellido(String apellido) {
        super.setApellido(apellido);
    }

    public String getFechaDeNacimiento() {
        return super.getFechaDeNacimiento();
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        super.setFechaDeNacimiento(fechaDeNacimiento);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
