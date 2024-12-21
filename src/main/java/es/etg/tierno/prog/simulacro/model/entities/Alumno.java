package es.etg.tierno.prog.simulacro.model.entities;

public class Alumno {
    private String id;
    private String nombre;
    private String apellidos;

    public Alumno(String id, String nombre, String apellidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        final String MENSAJE = "Mi nombre es %s y mi apellido %s";
        return String.format(MENSAJE, getNombre(), getApellidos());
    }

}
