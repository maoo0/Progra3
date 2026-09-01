package model;

import model.enums.EstadoCita;
import java.time.LocalDateTime;

public class Cita {
    private int idCita;
    private LocalDateTime fechaHora;
    private EstadoCita estado;

    public Cita() {
    }

    public Cita(int idCita, LocalDateTime fechaHora, EstadoCita estado) {
        this.idCita = idCita;
        this.fechaHora = fechaHora;
        this.estado = estado;
    }

    // Getters y Setters
    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "idCita=" + idCita +
                ", fechaHora=" + fechaHora +
                ", estado=" + estado +
                '}';
    }
}
