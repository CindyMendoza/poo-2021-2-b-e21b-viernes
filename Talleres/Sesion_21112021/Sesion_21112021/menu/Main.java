package menu;

import pregunta1.Clinica;
import pregunta1.Paciente;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Clinica clinicaJP = new Clinica();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        // Precarga
        clinicaJP.registrarPaciente("46531717", "Jose Torres", 28);
        clinicaJP.registrarPaciente("48381812", "Carlos Soto", 21);
        clinicaJP.registrarPaciente("51828733", "Carla Flores", 24);

        int opcion = 0;
        while(opcion != 9) {
            boolean esperar = true;
            opcion = Menu.mostrarMenu();
            switch (opcion) {
                case 1:
                    int subopcion = Menu.mostrarSubmenu();
                    if (subopcion == 1) {
                        realizarProcesoRegistroPaciente();
                    } else if (subopcion == 2) {
                        System.out.println("Registrando un doctor");
                        System.out.println("...");
                    } else if (subopcion == 9) {
                        esperar = false;
                    }
                    break;

                case 2:
                    System.out.println("Pacientes Registrados");
                    System.out.println("=====================");
                    List<Paciente> pacientesRegistrados = clinicaJP.getPacientes();
                    for (Paciente paciente: pacientesRegistrados) {
                        System.out.println(paciente);
                    }
                    break;

                case 3:
                    ClinicaTest.ejecutarA();
                    break;

                case 9:
                    esperar = false;
                    break;
            }

            if (esperar) {
                System.out.println("Presione Enter para continuar");
                System.in.read();
            }
            for (int i=0; i<15; i++) {
                System.out.println();
            }
        }
        System.out.println("Terminando ...");
    }

    public static void realizarProcesoRegistroPaciente() {
        System.out.println("Registrando un Paciente:");
        System.out.println("Ingrese un numero de documento:");
        String documento = scanner.next();
        System.out.println("Ingrese un nombre:");
        String nombre = scanner.next();
        System.out.println("Ingrese una edad:");
        int edad = scanner.nextInt();
        clinicaJP.registrarPaciente(documento, nombre, edad);
    }
}
