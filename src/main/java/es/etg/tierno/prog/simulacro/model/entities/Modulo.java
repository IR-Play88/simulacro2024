package es.etg.tierno.prog.simulacro.model.entities;

public class Modulo {
    private int id;
    private String nombre;
    private String descripcion;
    private int edad;

    public Modulo(int id, String nombre, String descripcion, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        final String MENSAJE = "Mi nombre es %s y mi descripcion %s";
        return String.format(MENSAJE, getNombre(), getDescripcion());
    }

}
