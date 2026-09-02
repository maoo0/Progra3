package model.boleta;

import java.time.LocalDate;
import java.util.List;

public class Boleta {
    private int idVenta;
    private LocalDate fecha;
    private double total;
    private MetodoPago metodoPago;
    private List<DetalleBoleta> detalles;

    public Boleta(int idVenta, LocalDate fecha, double total, MetodoPago metodoPago, List<DetalleBoleta> detalles) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.total = total;
        this.metodoPago = metodoPago;
        this.detalles = detalles;
    }

    // Getters y Setters
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public List<DetalleBoleta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleBoleta> detalles) {
        this.detalles = detalles;
    }

    @Override
    public String toString() {
        return "Boleta{" +
                "idVenta=" + idVenta +
                ", fecha=" + fecha +
                ", total=" + total +
                ", metodoPago=" + metodoPago +
                ", detalles=" + detalles +
                '}';
    }
}
