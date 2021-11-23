package pregunta1;

public class Temporal extends Trabajador {

    private double tarifaXHora;
    private double horasTrabajo;

    public Temporal(String documento, String nombres, String direccion, String area, double tarifaXHora, double horasTrabajo) {
        super(documento, nombres, direccion, area);
        this.tarifaXHora = tarifaXHora;
        this.horasTrabajo = horasTrabajo;
    }

    public double getTarifaXHora() {
        return tarifaXHora;
    }

    public double getHorasTrabajo() {
        return horasTrabajo;
    }

    @Override
    public double calcularSueldo() {
        return tarifaXHora * horasTrabajo;
    }

    @Override
    public String obtenerDatos() {
        return "=======\nTemporal\n=======\n" + super.obtenerDatos() + " Tarif: S/" + tarifaXHora + " Cant: " + horasTrabajo
                + "\n Sueldo Final Calculado: S/" + calcularSueldo();
    }

    @Override
    public String toString() {
        return "Temporal{" +
                super.toString() +
                "tarifaXHora=" + tarifaXHora +
                ", horasTrabajo=" + horasTrabajo +
                '}';
    }
}
