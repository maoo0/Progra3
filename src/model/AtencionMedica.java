package model;

import java.time.LocalDateTime;

public class AtencionMedica {
    private int idAtencion;
    private LocalDateTime fechaHora;
    private String diagnostico;

    public AtencionMedica() {
    }

    public AtencionMedica(int idAtencion, LocalDateTime fechaHora, String diagnostico) {
        this.idAtencion = idAtencion;
        this.fechaHora = fechaHora;
        this.diagnostico = diagnostico;
    }

    // Getters y Setters
    public int getIdAtencion() {
        return idAtencion;
    }

    public void setIdAtencion(int idAtencion) {
        this.idAtencion = idAtencion;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    @Override
    public String toString() {
        return "AtencionMedica{" +
                "idAtencion=" + idAtencion +
                ", fechaHora=" + fechaHora +
                ", diagnostico='" + diagnostico + '\'' +
                '}';
    }
}
