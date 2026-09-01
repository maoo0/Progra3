package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Persona persona;
    private List<Mascota> mascotas;

    public Cliente() {
        this.mascotas = new ArrayList<>();
    }

    public Cliente(Persona persona) {
        this.persona = persona;
        this.mascotas = new ArrayList<>();
    }

    public Cliente(Persona persona, List<Mascota> mascotas) {
        this.persona = persona;
        this.mascotas = mascotas;
    }

    // Getters y Setters
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void agregarMascota(Mascota mascota) {
        this.mascotas.add(mascota);
    }

    public void eliminarMascota(Mascota mascota) {
        this.mascotas.remove(mascota);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "persona=" + persona +
                ", mascotas=" + mascotas +
                '}';
    }
}
