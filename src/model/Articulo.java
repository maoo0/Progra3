package model;

import model.enums.CategoriaArticulo;

public class Articulo extends Producto {
    private int stock;
    private int stockMinimo;
    private String marca;
    private CategoriaArticulo categoria;

    public Articulo() {
    }

    public Articulo(int idProducto, String nombre, double precioBase, String descripcion, boolean estado,
                    int stock, int stockMinimo, String marca, CategoriaArticulo categoria) {
        super(idProducto, nombre, precioBase, descripcion, estado);
        this.stock = stock;
        this.stockMinimo = stockMinimo;
        this.marca = marca;
        this.categoria = categoria;
    }

    // Getters y Setters
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public CategoriaArticulo getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaArticulo categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "idProducto=" + getIdProducto() +
                ", nombre='" + getNombre() + '\'' +
                ", stock=" + stock +
                ", stockMinimo=" + stockMinimo +
                ", marca='" + marca + '\'' +
                ", categoria=" + categoria +
                '}';
    }
}
