package model.mascota;

import java.time.LocalDate;

public class Mascota {
    private int idMascota;
    private String nombre;
    private char sexo;
    private double peso;
    private LocalDate fechaNacimiento;
    private String especie;
    private String raza;


    public Mascota(int idMascota, String nombre, char sexo, double peso, LocalDate fechaNacimiento, String especie, String raza) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.sexo = sexo;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
        this.especie = especie;
        this.raza = raza;
    }

    // Getters y Setters
    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "idMascota=" + idMascota +
                ", nombre='" + nombre + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", fechaNacimiento=" + fechaNacimiento +
                ", especie='" + especie + '\'' +
                ", raza='" + raza + '\'' +
                '}';
    }
}
