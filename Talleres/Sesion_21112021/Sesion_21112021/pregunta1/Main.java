package pregunta1;

import java.awt.*;
import java.rmi.server.ExportException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        System.out.println("C)");

        Clinica clinicaJP = new Clinica();

        clinicaJP.registrarPaciente("46531717", "Jose Torres", 28);
        clinicaJP.registrarPaciente("48381812", "Carlos Soto", 21);
        clinicaJP.registrarPaciente("51828733", "Carla Flores", 24);

        Historial historialA = new Historial("HIS001");
        try {
            historialA.registrarVisita("13/11/2021", "Chequeo Preventivo", 150);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            historialA.registrarVisita("14/11/2021", "Test covid", 290);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

//        Historial historialB = new Historial("HIS002");
        try {
            historialA.registrarVisita("01/05/1990", "Cirujia", 7150);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            historialA.registrarVisita("04/11/2010", "Internamiento preventivo", -500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Historial historialC = new Historial("HIS003");
        try {
            historialC.registrarVisita("05/03/2019", "Analisis sangre", 950);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            historialC.registrarVisita("27/08/2020", "Radiografia", -50);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        clinicaJP.asignarHistorial("46531717", historialA);
        clinicaJP.asignarHistorial("48381812", historialC);
//        clinicaJP.asignarHistorial("51828733", historialB);

        System.out.println("Pacientes Registrados");
        System.out.println("=====================");
        List<Paciente> pacientesRegistrados = clinicaJP.getPacientes();
        for (Paciente paciente: pacientesRegistrados) {
            System.out.println(paciente);
        }

        System.out.println("D)");
        System.out.println("Pacientes de Prioridad:");
        System.out.println("=====================");
        List<Paciente> pacientesDePrioridad = new ArrayList<>();
        try {
            pacientesDePrioridad = clinicaJP.obtenerPacientes("Baja");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        for (Paciente paciente: pacientesDePrioridad) {
            System.out.println(paciente);
        }


        System.out.println("D.2)");
        System.out.println("Pacientes con una cantidad de visitas mayor a:");
        System.out.println("=====================");
        List<Paciente> pacientesMayorVisitas = new ArrayList<>();
        try {
            pacientesMayorVisitas = clinicaJP.obtenerPacientesConMayorCantidadVisitas(2);
        } catch (NumeroInvalidoException e) {
            System.out.println(e.getMessage());
            System.out.println("Es necesario que ingrese de nuevo una cantidad valida");
        } catch (NoExistenDatosException e) {
            System.out.println(e.getMessage());
        }
        for (Paciente paciente: pacientesMayorVisitas) {
            System.out.println(paciente);
        }

        System.out.println("E.2)");
        System.out.println("Pacientes de Prioridad:");
        System.out.println("=====================");

        try {
            pacientesMayorVisitas = clinicaJP.obtenerPacientesConMayorCantidadVisitas(-5);
        } catch (NumeroInvalidoException e) {
            System.out.println(e.getMessage());
            System.out.println("Es necesario que ingrese de nuevo una cantidad valida");
        } catch (NoExistenDatosException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("E)");
        System.out.println("Pacientes de Prioridad:");
        System.out.println("=====================");
        try {
            pacientesDePrioridad = clinicaJP.obtenerPacientes("VIP");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
