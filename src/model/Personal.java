package model;

public class Personal {
    private Persona persona;
    private boolean activo;

    public Personal() {
    }

    public Personal(Persona persona, boolean activo) {
        this.persona = persona;
        this.activo = activo;
    }

    // Getters y Setters
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "persona=" + persona +
                ", activo=" + activo +
                '}';
    }
}
