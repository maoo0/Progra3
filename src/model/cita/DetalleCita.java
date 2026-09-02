package model.cita;

public class DetalleCita {
    private int idDetalleCita;
    private String observaciones;


    public DetalleCita(int idDetalleCita, String observaciones) {
        this.idDetalleCita = idDetalleCita;
        this.observaciones = observaciones;
    }

    // Getters y Setters
    public int getIdDetalleCita() {
        return idDetalleCita;
    }

    public void setIdDetalleCita(int idDetalleCita) {
        this.idDetalleCita = idDetalleCita;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "DetalleCita{" +
                "idDetalleCita=" + idDetalleCita +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}
