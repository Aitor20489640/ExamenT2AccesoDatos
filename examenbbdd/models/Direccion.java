package examenbbdd.models;

public class Direccion {
    private long id;
    private Empleado empleado;
    private String calle;
    private String ciudad;
    private String pais;

    public Direccion(long id, Empleado empleado, String calle, String ciudad, String pais) {
        this.id = id;
        this.empleado = empleado;
        this.calle = calle;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    // Getters

    public long getId() {
        return id;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public String getCalle() {
        return calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    // Setters

    public void setId(long id) {
        this.id = id;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "id=" + id +
                ", empleado=" + empleado +
                ", calle='" + calle + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
