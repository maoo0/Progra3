package model.atencion;

public class AtencionTratamiento {
    private String nombreResponsable;


    public AtencionTratamiento(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    // Getters y Setters
    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }

    @Override
    public String toString() {
        return "AtencionTratamiento{" +
                "nombreResponsable='" + nombreResponsable + '\'' +
                '}';
    }
}
