package model.atencion;

import java.time.LocalDateTime;
import java.util.List;

public class AtencionMedica {
    private int idAtencion;
    private LocalDateTime fechaHora;
    private String motivoConsulta;
    private double pesoFisico;
    private String observaciones;
    private List<AtencionTratamiento> tratamientos;
    private List<AtencionDiagnostico> diagnosticos;

    public AtencionMedica(int idAtencion, LocalDateTime fechaHora, String motivoConsulta, double pesoFisico, String observaciones, List<AtencionTratamiento> tratamientos, List<AtencionDiagnostico> diagnosticos) {
        this.idAtencion = idAtencion;
        this.fechaHora = fechaHora;
        this.motivoConsulta = motivoConsulta;
        this.pesoFisico = pesoFisico;
        this.observaciones = observaciones;
        this.tratamientos = tratamientos;
        this.diagnosticos = diagnosticos;
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

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public double getPesoFisico() {
        return pesoFisico;
    }

    public void setPesoFisico(double pesoFisico) {
        this.pesoFisico = pesoFisico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public List<AtencionTratamiento> getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(List<AtencionTratamiento> tratamientos) {
        this.tratamientos = tratamientos;
    }

    public List<AtencionDiagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(List<AtencionDiagnostico> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }

    @Override
    public String toString() {
        return "AtencionMedica{" +
                "idAtencion=" + idAtencion +
                ", fechaHora=" + fechaHora +
                ", motivoConsulta='" + motivoConsulta + '\'' +
                ", pesoFisico=" + pesoFisico +
                ", observaciones='" + observaciones + '\'' +
                ", tratamientos=" + tratamientos +
                ", diagnosticos=" + diagnosticos +
                '}';
    }
}
