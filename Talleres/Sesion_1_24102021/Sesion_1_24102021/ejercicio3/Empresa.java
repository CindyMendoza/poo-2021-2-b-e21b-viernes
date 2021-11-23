package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private List<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void registrarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public Empleado obtenerEmpleadoMayorSueldo() {
        double mayorSueldo = 0;
        Empleado empleadoMayorSueldo = null;
        for (Empleado empleado: empleados) {
            if (empleado.calcularRemuneracionFinal() > mayorSueldo) {
                mayorSueldo = empleado.calcularRemuneracionFinal();
                empleadoMayorSueldo = empleado;
            }
        }
        return empleadoMayorSueldo;
    }


}
