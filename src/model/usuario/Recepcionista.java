package model.usuario;

import model.horario.Horario;

import java.util.List;

public class Recepcionista extends Personal {

    public Recepcionista(String nombres, String apellidoPaterno, String apellidoMaterno, String telefono, String dni,
                         Cuenta cuenta, boolean activo, List<Horario> horarios) {
        super(nombres, apellidoPaterno, apellidoMaterno, telefono, dni, cuenta, activo, horarios);
    }

    @Override
    public String toString() {
        return "Recepcionista{" +
                "nombres='" + getNombres() + '\'' +
                ", apellidoPaterno='" + getApellidoPaterno() + '\'' +
                ", activo=" + isActivo() +
                '}';
    }
}
