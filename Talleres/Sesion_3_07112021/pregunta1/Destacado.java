package pregunta1;

public class Destacado extends Trabajador {

    private double sueldo;
    private double porcentajeParticipacion;

    public Destacado(String documento, String nombres, String direccion, String area, double sueldo, double porcentajeParticipacion) {
        super(documento, nombres, direccion, area);
        this.sueldo = sueldo;
        this.porcentajeParticipacion = porcentajeParticipacion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getPorcentajeParticipacion() {
        return porcentajeParticipacion;
    }

    @Override
    public double calcularSueldo() {
        double utilidades = 750000;
        return sueldo + porcentajeParticipacion * utilidades;
    }

    @Override
    public String obtenerDatos() {
        return "=======\nDestacado\n=======\n" + super.obtenerDatos() + " Sueldo: S/" + sueldo + " Porc: " + porcentajeParticipacion * 100 + "%"
                + "\n Sueldo Final Calculado: S/" + calcularSueldo();
    }

    @Override
    public String toString() {
        return "Destacado{" +
                super.toString() +
                "sueldo=" + sueldo +
                ", porcentajeParticipacion=" + porcentajeParticipacion +
                '}';
    }
}
