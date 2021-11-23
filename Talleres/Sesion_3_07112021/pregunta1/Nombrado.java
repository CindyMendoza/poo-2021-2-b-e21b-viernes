package pregunta1;

public class Nombrado extends Trabajador {

    private double sueldo;
    private String categorizacion;

    public Nombrado(String documento, String nombres, String direccion, String area, double sueldo, String categorizacion) {
        super(documento, nombres, direccion, area);
        this.sueldo = sueldo;
        this.categorizacion = categorizacion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getCategorizacion() {
        return categorizacion;
    }

    public double obtenerBono() {
        double bono = 0;
        if (categorizacion.equals("A")) {
            bono = 5000;
        } else if (categorizacion.equals("B")) {
            bono = 3500;
        } else if (categorizacion.equals("C")) {
            bono = 2500;
        } else if (categorizacion.equals("D")) {
            bono = 1500;
        }
        return bono;
    }

    @Override
    public double calcularSueldo() {
        return sueldo + obtenerBono();
    }

    @Override
    public String obtenerDatos() {
        return "=======\nNombrado\n=======\n" + super.obtenerDatos() + " Seuldo: S/" + sueldo + " Cat: " + categorizacion
                + "\n Sueldo Final Calculado: S/" + calcularSueldo();
    }

    @Override
    public String toString() {
        return "Nombrado{" +
                super.toString() +
                "sueldo=" + sueldo +
                ", categorizacion='" + categorizacion + '\'' +
                '}';
    }
}
