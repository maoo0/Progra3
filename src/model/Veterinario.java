package model;

import model.enums.EspecialidadMedica;

public class Veterinario extends Personal {
    private String numeroColegiatura;
    private EspecialidadMedica especialidadMedica;

    public Veterinario() {
    }

    public Veterinario(Persona persona, boolean activo, String numeroColegiatura, EspecialidadMedica especialidadMedica) {
        super(persona, activo);
        this.numeroColegiatura = numeroColegiatura;
        this.especialidadMedica = especialidadMedica;
    }

    // Getters y Setters
    public String getNumeroColegiatura() {
        return numeroColegiatura;
    }

    public void setNumeroColegiatura(String numeroColegiatura) {
        this.numeroColegiatura = numeroColegiatura;
    }

    public EspecialidadMedica getEspecialidadMedica() {
        return especialidadMedica;
    }

    public void setEspecialidadMedica(EspecialidadMedica especialidadMedica) {
        this.especialidadMedica = especialidadMedica;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "persona=" + getPersona() +
                ", numeroColegiatura='" + numeroColegiatura + '\'' +
                ", especialidadMedica=" + especialidadMedica +
                '}';
    }
}
