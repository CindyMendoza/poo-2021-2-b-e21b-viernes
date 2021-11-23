package menu;

import java.util.Scanner;

public class Menu {

    public static int mostrarMenu() {
        System.out.println("========");
        System.out.println("  Menu  ");
        System.out.println("========");
        System.out.println("1. Registrar");
        System.out.println("2. Listar pacientes");
        System.out.println("3. Otra opcion");
        System.out.println("9. Salir");
        System.out.println("Ingrese una opcion:");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        return opcion;
    }

    public static int mostrarSubmenu() {
        System.out.println("========");
        System.out.println("  Registrar  ");
        System.out.println("========");
        System.out.println("1. Paciente");
        System.out.println("2. Doctor");
        System.out.println("9. Atras");
        System.out.println("Ingrese una opcion:");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        return opcion;
    }

}
