package model.atencion;

public class AtencionDiagnostico {
    private String nivelGravedad;
    private String detalleDiagnostico;


    public AtencionDiagnostico(String nivelGravedad, String detalleDiagnostico) {
        this.nivelGravedad = nivelGravedad;
        this.detalleDiagnostico = detalleDiagnostico;
    }

    // Getters y Setters
    public String getNivelGravedad() {
        return nivelGravedad;
    }

    public void setNivelGravedad(String nivelGravedad) {
        this.nivelGravedad = nivelGravedad;
    }

    public String getDetalleDiagnostico() {
        return detalleDiagnostico;
    }

    public void setDetalleDiagnostico(String detalleDiagnostico) {
        this.detalleDiagnostico = detalleDiagnostico;
    }

    @Override
    public String toString() {
        return "AtencionDiagnostico{" +
                "nivelGravedad='" + nivelGravedad + '\'' +
                ", detalleDiagnostico='" + detalleDiagnostico + '\'' +
                '}';
    }
}
