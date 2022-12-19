package examenbbdd.models;

public class Empleado {
    private long id;
    private String nombre;
    private String apellido;
    private String email;
    private Double sueldo;
    private Direccion direccion;

    public Empleado(long id, String nombre, String apellido, String email, Double sueldo, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.sueldo = sueldo;
        this.direccion = direccion;
    }

    public Empleado(String nombre, String apellido, String email, Double sueldo, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.sueldo = sueldo;
        this.direccion = direccion;
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

    public Direccion getDireccion() {
        return direccion;
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

    public void setDireccion (Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", sueldo=" + sueldo +
                ", direccion=" + direccion +
                '}';
    }
}
