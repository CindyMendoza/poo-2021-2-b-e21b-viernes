package pregunta2;

public abstract class Postulante {

    private String dni;
    private String nombre;
    private String carrera;
    private double calificacionPE;
    private double calificacionEC;
    private double calificacionEP;

    public Postulante(String dni, String nombre, String carrera, double calificacionPE, double calificacionEC, double calificacionEP) {
        this.dni = dni;
        this.nombre = nombre;
        this.carrera = carrera;
        this.calificacionPE = calificacionPE;
        this.calificacionEC = calificacionEC;
        this.calificacionEP = calificacionEP;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getCalificacionPE() {
        return calificacionPE;
    }

    public double getCalificacionEC() {
        return calificacionEC;
    }

    public double getCalificacionEP() {
        return calificacionEP;
    }

    public double obtenerCalificacionFinal() {
        return (calificacionPE * 5 * 0.20) + (calificacionEC * 0.60) + (calificacionEP * 0.20);
    }

    public String obtenerDatos() {
        return "===========\nPostulante \n===========\n" + "DNI: " + dni + " - Nombre: " + nombre + " - Carrera: " + carrera + "\n" +
                "  Calificaciones: " + calificacionEP + " " + calificacionEC + " " + calificacionPE + "\n" +
                "  Calificacion Final: " + obtenerCalificacionFinal();
    }
}
