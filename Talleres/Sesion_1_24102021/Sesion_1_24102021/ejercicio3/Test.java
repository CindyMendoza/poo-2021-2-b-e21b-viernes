package ejercicio3;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        Empleado empleadoA = new Empleado("46531717", "Jose Torres", "AAD", 500, "AFP");
        Empleado empleadoB = new Empleado("12312422", "Sofia Cardenas", "Abogada", 2400, "ONP");
        Empleado empleadoC = new Empleado("54334222", "Rodolfo Matos", "Administrador", 1800, "AFP");

        empleadoA.setHorasExtras(40);

        System.out.println("Empleado");
        System.out.println(empleadoA.getDni() + " - " + empleadoA.getNombre() + " " + empleadoA.getCargo() + " " + empleadoA.getTipoSeguro());
        System.out.println("Remuneracion final: S/" + empleadoA.calcularRemuneracionFinal());

        // Extension

        Empresa upc = new Empresa("UPC");

        upc.registrarEmpleado(empleadoA);
        upc.registrarEmpleado(empleadoB);
        upc.registrarEmpleado(empleadoC);

        System.out.println("-");
        System.out.println("Listado de empleados registrados:");
        // Listar empleados de la empresa
        List<Empleado> empleadosRegistrados = upc.getEmpleados();
//        for (int i=0; i<empleadosRegistrados.size(); i++) {
//            Empleado empleado = empleadosRegistrados.get(i);
        for (Empleado empleado: empleadosRegistrados) {
            System.out.println("Empleado");
            System.out.println(empleado.getDni() + " - " + empleado.getNombre() + " " + empleado.getCargo() + " " + empleado.getTipoSeguro());
            System.out.println("Remuneracion final: S/" + empleado.calcularRemuneracionFinal());
        }

        System.out.println("-");
        System.out.println("El empleado con el mayor sueldo:");
        Empleado empleadoMayorSueldo = upc.obtenerEmpleadoMayorSueldo();
        System.out.println("Es " + empleadoMayorSueldo.getNombre());

    }
}
