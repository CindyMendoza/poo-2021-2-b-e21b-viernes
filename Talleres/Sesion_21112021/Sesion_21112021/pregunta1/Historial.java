package pregunta1;

import java.util.ArrayList;
import java.util.List;

public class Historial {

    private String codigo;
    private List<Visita> visitas;

    public Historial(String codigo) {
        this.codigo = codigo;
        this.visitas = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Visita> getVisitas() {
        return visitas;
    }

    public void registrarVisita(String fecha, String motivo, double monto) throws Exception {
        Visita visita = new Visita(fecha, motivo, monto);
        visitas.add(visita);
    }

    public double obtenerMontoTotal() {
        double montoTotal = 0;
        for (Visita visita: visitas) {
            montoTotal = montoTotal + visita.getMonto();
        }
        return montoTotal;
    }

    @Override
    public String toString() {
        return "Historial{" +
                "codigo='" + codigo + '\'' +
                ", visitas=" + visitas +
                '}';
    }
}
