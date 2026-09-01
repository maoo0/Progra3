package model;

public class DetalleBoleta {
    private int cantidad;
    private double subTotal;

    public DetalleBoleta() {
    }

    public DetalleBoleta(int cantidad, double subTotal) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    // Getters y Setters
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "DetalleBoleta{" +
                "cantidad=" + cantidad +
                ", subTotal=" + subTotal +
                '}';
    }
}
