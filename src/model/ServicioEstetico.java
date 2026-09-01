package model;

import model.enums.TipoServicioEstetico;

public class ServicioEstetico extends Servicio {
    private TipoServicioEstetico tipo;
    private int duracionEstimada;

    public ServicioEstetico() {
    }

    public ServicioEstetico(int idProducto, String nombre, double precioBase, String descripcion, boolean estado,
                            int duracionEstimado, boolean requiereCita,
                            TipoServicioEstetico tipo, int duracionEstimada) {
        super(idProducto, nombre, precioBase, descripcion, estado, duracionEstimado, requiereCita);
        this.tipo = tipo;
        this.duracionEstimada = duracionEstimada;
    }

    // Getters y Setters
    public TipoServicioEstetico getTipo() {
        return tipo;
    }

    public void setTipo(TipoServicioEstetico tipo) {
        this.tipo = tipo;
    }

    public int getDuracionEstimada() {
        return duracionEstimada;
    }

    public void setDuracionEstimada(int duracionEstimada) {
        this.duracionEstimada = duracionEstimada;
    }

    @Override
    public String toString() {
        return "ServicioEstetico{" +
                "idProducto=" + getIdProducto() +
                ", nombre='" + getNombre() + '\'' +
                ", tipo=" + tipo +
                ", duracionEstimada=" + duracionEstimada +
                '}';
    }
}
