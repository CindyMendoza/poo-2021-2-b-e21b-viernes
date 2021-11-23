package pregunta1;

public class Paciente {

    private String documento;
    private String nombres;
    private int edad;
    private Historial historial;

    public Paciente(String documento, String nombres, int edad) {
        this.documento = documento;
        this.nombres = nombres;
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombres() {
        return nombres;
    }

    public int getEdad() {
        return edad;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void asignarHistorial(Historial historial) {
        this.historial = historial;
    }

    public String obtenerPrioridad() {
        double montoTotal = 0;
        if (historial != null) {
            montoTotal = historial.obtenerMontoTotal();
        }
        if (montoTotal > 5000) {
            return "Alta";
        } else if (montoTotal >= 2000 && montoTotal <= 5000) {
            return "Media";
        } else {
            return "Baja";
        }
    }

    public boolean tieneMayorCantidadDeVisitas(int cantidad) {
        if (historial != null && historial.getVisitas().size() > cantidad) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "documento='" + documento + '\'' +
                ", nombres='" + nombres + '\'' +
                ", edad=" + edad +
                ", prioridad= " + obtenerPrioridad() +
                ", historial=" + historial +
                '}';
    }
}
