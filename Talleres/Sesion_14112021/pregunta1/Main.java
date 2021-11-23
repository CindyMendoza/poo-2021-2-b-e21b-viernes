package pregunta1;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        System.out.println("C)");

        Clinica clinicaJP = new Clinica();

        clinicaJP.registrarPaciente("46531717", "Jose Torres", 28);
        clinicaJP.registrarPaciente("48381812", "Carlos Soto", 21);
        clinicaJP.registrarPaciente("51828733", "Carla Flores", 24);

        Historial historialA = new Historial("HIS001");
        historialA.registrarVisita("13/11/2021", "Chequeo Preventivo", 150);
        historialA.registrarVisita("14/11/2021", "Test covid", 290);

        Historial historialB = new Historial("HIS002");
        historialB.registrarVisita("01/05/1990", "Cirujia", 7150);
        historialB.registrarVisita("04/11/2010", "Internamiento preventivo", 1290);

        Historial historialC = new Historial("HIS003");
        historialC.registrarVisita("05/03/2019", "Analisis sangre", 950);
        historialC.registrarVisita("27/08/2020", "Radiografia", 2290);

        clinicaJP.asignarHistorial("46531717", historialA);
        clinicaJP.asignarHistorial("48381812", historialC);
        clinicaJP.asignarHistorial("51828733", historialB);

        System.out.println("Pacientes Registrados");
        System.out.println("=====================");
        List<Paciente> pacientesRegistrados = clinicaJP.getPacientes();
        for (Paciente paciente: pacientesRegistrados) {
            System.out.println(paciente);
        }

        System.out.println("D)");
        System.out.println("Pacientes de Prioridad:");
        System.out.println("=====================");
        List<Paciente> pacientesDePrioridad = clinicaJP.obtenerPacientes("Baja");
        for (Paciente paciente: pacientesDePrioridad) {
            System.out.println(paciente);
        }

    }
}
