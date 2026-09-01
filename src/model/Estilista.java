package model;

import model.enums.TipoMascota;

public class Estilista extends Personal {
    private String certificacionGrooming;
    private TipoMascota especialidadAnimal;

    public Estilista() {
    }

    public Estilista(Persona persona, boolean activo, String certificacionGrooming, TipoMascota especialidadAnimal) {
        super(persona, activo);
        this.certificacionGrooming = certificacionGrooming;
        this.especialidadAnimal = especialidadAnimal;
    }

    // Getters y Setters
    public String getCertificacionGrooming() {
        return certificacionGrooming;
    }

    public void setCertificacionGrooming(String certificacionGrooming) {
        this.certificacionGrooming = certificacionGrooming;
    }

    public TipoMascota getEspecialidadAnimal() {
        return especialidadAnimal;
    }

    public void setEspecialidadAnimal(TipoMascota especialidadAnimal) {
        this.especialidadAnimal = especialidadAnimal;
    }

    @Override
    public String toString() {
        return "Estilista{" +
                "persona=" + getPersona() +
                ", certificacionGrooming='" + certificacionGrooming + '\'' +
                ", especialidadAnimal=" + especialidadAnimal +
                '}';
    }
}
