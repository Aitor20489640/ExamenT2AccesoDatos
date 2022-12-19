package examenbbdd.models;

public class Departamento {
    private long id;
    private String nombre;

    public Departamento(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
