package pregunta2;

public class Egresado extends Postulante {

    private String tipoColegio;

    public Egresado(String dni, String nombre, String carrera, double calificacionPE, double calificacionEC, double calificacionEP, String tipoColegio) {
        super(dni, nombre, carrera, calificacionPE, calificacionEC, calificacionEP);
        this.tipoColegio = tipoColegio;
    }

    public String getTipoColegio() {
        return tipoColegio;
    }

    @Override
    public String obtenerDatos() {
        return super.obtenerDatos() + "\n  Colegio: " + tipoColegio;
    }
}
