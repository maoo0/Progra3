package model;

import model.enums.TipoMascota;

public class Mascota {
    private int idMascota;
    private TipoMascota tipoMascota;
    private String nombre;
    private String raza;
    private double peso;

    public Mascota() {
    }

    public Mascota(int idMascota, TipoMascota tipoMascota, String nombre, String raza, double peso) {
        this.idMascota = idMascota;
        this.tipoMascota = tipoMascota;
        this.nombre = nombre;
        this.raza = raza;
        this.peso = peso;
    }

    // Getters y Setters
    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public TipoMascota getTipoMascota() {
        return tipoMascota;
    }

    public void setTipoMascota(TipoMascota tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "idMascota=" + idMascota +
                ", tipoMascota=" + tipoMascota +
                ", nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", peso=" + peso +
                '}';
    }
}
