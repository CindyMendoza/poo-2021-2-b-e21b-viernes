package pregunta1;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Trabajador> trabajadores;

    public Empresa() {
        this.trabajadores = new ArrayList<Trabajador>();
    }

    public List<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void registrarTrabajador(Trabajador trabajador) {
        if (buscarTrabajadorXDocumento(trabajador.getDocumento()) == null) {
            trabajadores.add(trabajador);
        }
    }

    public double obtenerMontoTotalPagarTemporales() {
        double sumaTotal = 0;
        for (Trabajador trabajador: trabajadores) {
            if (trabajador instanceof Temporal) {
                sumaTotal = sumaTotal + trabajador.calcularSueldo();
            }
//            // En caso nos pidan solo sumar sueldos de los trabajadores que sean temporales y que tengan menos de 21 horas registradas
//            if ((trabajador instanceof Temporal) && ((Temporal)trabajador).getHorasTrabajo() < 21) {
//                sumaTotal = sumaTotal + trabajador.calcularSueldo();
//            }
        }
        return sumaTotal;
    }

    public List<Trabajador> obtenerSoloTrabajadoresTemporales() {
        List<Trabajador> listaResultado = new ArrayList<>();
        for (Trabajador trabajador: trabajadores) {
            if (trabajador instanceof Temporal) {
                listaResultado.add(trabajador);
            }
        }
        return listaResultado;
    }

    public Trabajador buscarTrabajadorXDocumento(String documento) {
        for (Trabajador trabajador: trabajadores) {
            if (trabajador.getDocumento().equals(documento)) {
                return trabajador;
            }
        }
        return null;
    }
}
