package model;

public class Servicio extends Producto {
    private int duracionEstimado;
    private boolean requiereCita;

    public Servicio() {
    }

    public Servicio(int idProducto, String nombre, double precioBase, String descripcion, boolean estado,
                    int duracionEstimado, boolean requiereCita) {
        super(idProducto, nombre, precioBase, descripcion, estado);
        this.duracionEstimado = duracionEstimado;
        this.requiereCita = requiereCita;
    }

    // Getters y Setters
    public int getDuracionEstimado() {
        return duracionEstimado;
    }

    public void setDuracionEstimado(int duracionEstimado) {
        this.duracionEstimado = duracionEstimado;
    }

    public boolean isRequiereCita() {
        return requiereCita;
    }

    public void setRequiereCita(boolean requiereCita) {
        this.requiereCita = requiereCita;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "idProducto=" + getIdProducto() +
                ", nombre='" + getNombre() + '\'' +
                ", duracionEstimado=" + duracionEstimado +
                ", requiereCita=" + requiereCita +
                '}';
    }
}
