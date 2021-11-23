package pregunta2;

public class Traslado extends Postulante {

    private String nombreUniversidad;
    private boolean pertenecioQuintoSuperior;

    public Traslado(String dni, String nombre, String carrera, double calificacionPE, double calificacionEC, double calificacionEP, String nombreUniversidad, boolean pertenecioQuintoSuperior) {
        super(dni, nombre, carrera, calificacionPE, calificacionEC, calificacionEP);
        this.nombreUniversidad = nombreUniversidad;
        this.pertenecioQuintoSuperior = pertenecioQuintoSuperior;
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public boolean isPertenecioQuintoSuperior() {
        return pertenecioQuintoSuperior;
    }

    @Override
    public double obtenerCalificacionFinal() {
        double bonificacion = 0;
        if (pertenecioQuintoSuperior == true) {
            bonificacion = 5;
        }
        return super.obtenerCalificacionFinal() + bonificacion;
    }

    @Override
    public String obtenerDatos() {
        return super.obtenerDatos() + "\n  Nombre Uni.: " + nombreUniversidad;
    }
}
