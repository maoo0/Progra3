package model.boleta;

import java.time.LocalDate;

public class Boleta {
    private int idVenta;
    private LocalDate fecha;
    private double total;
    private MetodoPago metodoPago;


    public Boleta(int idVenta, LocalDate fecha, double total, MetodoPago metodoPago) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.total = total;
        this.metodoPago = metodoPago;
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

    @Override
    public String toString() {
        return "Boleta{" +
                "idVenta=" + idVenta +
                ", fecha=" + fecha +
                ", total=" + total +
                ", metodoPago=" + metodoPago +
                '}';
    }
}
