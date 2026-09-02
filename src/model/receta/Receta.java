package model.receta;

import java.time.LocalDate;

public class Receta {
    private int idReceta;
    private LocalDate fechaEmision;
    private String indicacionesGenerales;
    private boolean estado;


    public Receta(int idReceta, LocalDate fechaEmision, String indicacionesGenerales, boolean estado) {
        this.idReceta = idReceta;
        this.fechaEmision = fechaEmision;
        this.indicacionesGenerales = indicacionesGenerales;
        this.estado = estado;
    }

    // Getters y Setters
    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getIndicacionesGenerales() {
        return indicacionesGenerales;
    }

    public void setIndicacionesGenerales(String indicacionesGenerales) {
        this.indicacionesGenerales = indicacionesGenerales;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Receta{" +
                "idReceta=" + idReceta +
                ", fechaEmision=" + fechaEmision +
                ", indicacionesGenerales='" + indicacionesGenerales + '\'' +
                ", estado=" + estado +
                '}';
    }
}
