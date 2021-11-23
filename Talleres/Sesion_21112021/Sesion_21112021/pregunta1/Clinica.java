package pregunta1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Clinica {

    private List<Paciente> pacientes;

    public Clinica() {
        this.pacientes = new ArrayList<>();
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void registrarPaciente(String documento, String nombres, int edad) {
        Paciente paciente = new Paciente(documento, nombres, edad);
        pacientes.add(paciente);
    }

    public Paciente buscarPaciente(String documento) {
        for (Paciente paciente: pacientes) {
            if (paciente.getDocumento().equals(documento)) {
                return paciente;
            }
        }
        return null;
    }

    public void asignarHistorial(String documento, Historial historial) {
        Paciente paciente = buscarPaciente(documento);
        if (paciente != null) {
            paciente.asignarHistorial(historial);
        }
    }

    public List<Paciente> obtenerPacientes(String prioridad) throws Exception {
        if (!prioridad.equals("Alta") &&
                !prioridad.equals("Baja") &&
                !prioridad.equals("Media")) {
            throw new Exception("Prioridad incorrecta");
        }
        List<Paciente> pacientesAux = new ArrayList<>();
        for (Paciente paciente: pacientes) {
            if (paciente.obtenerPrioridad().equals(prioridad)) {
                pacientesAux.add(paciente);
            }
        }
        return pacientesAux;
    }

    public List<Paciente> obtenerPacientesConMayorCantidadVisitas(int cantidad) throws NumeroInvalidoException, NoExistenDatosException {
        if (cantidad < 0) {
            throw new NumeroInvalidoException();
        }
        List<Paciente> pacientesAux = new ArrayList<>();
        for (Paciente paciente: pacientes) {
            if (paciente.tieneMayorCantidadDeVisitas(cantidad)) {
                pacientesAux.add(paciente);
            }
        }
        if (pacientesAux.size() == 0) {
            throw new NoExistenDatosException();
        }
        return pacientesAux;
    }

}
