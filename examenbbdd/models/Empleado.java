package examenbbdd.models;

public class Empleado {
    private long id;
    private String nombre;
    private String apellido;
    private String email;
    private Double sueldo;
    private Departamento departamento;

    public Empleado(long id, String nombre, String apellido, String email, Double sueldo, Departamento departamento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.sueldo = sueldo;
        this.departamento = departamento;
    }

    // Getters

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    // Setters


    public void setId(long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", sueldo=" + sueldo +
                ", departamento=" + departamento +
                '}';
    }
}
