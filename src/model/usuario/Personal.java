package model.usuario;

import model.horario.Horario;

import java.util.ArrayList;
import java.util.List;

public abstract class Personal extends Persona {
    private boolean activo;
    private List<Horario> horarios;

    public Personal(String nombres, String apellidoPaterno, String apellidoMaterno, String telefono, String dni,
                    Cuenta cuenta, boolean activo, List<Horario> horarios) {
        super(nombres, apellidoPaterno, apellidoMaterno, telefono, dni, cuenta);
        this.activo = activo;
        this.horarios = horarios;
    }

    // Getters y Setters
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    public void agregarHorario(Horario horario) {
        this.horarios.add(horario);
    }

    public void eliminarHorario(Horario horario) {
        this.horarios.remove(horario);
    }

    @Override
    public String toString() {
        return "Personal{" +
                "nombres='" + getNombres() + '\'' +
                ", apellidoPaterno='" + getApellidoPaterno() + '\'' +
                ", activo=" + activo +
                ", horarios=" + horarios +
                '}';
    }
}
