package ejercicio3;

public class Empleado {

    private String dni;
    private String nombre;
    private String cargo;
    private double sueldoBruto;
    private double horasExtras;
    private String tipoSeguro;

    public Empleado(String dni, String nombre, String cargo, double sueldoBruto, String tipoSeguro) {
        this.dni = dni;
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldoBruto = sueldoBruto;
        this.tipoSeguro = tipoSeguro;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public void setTipoSeguro(String tipoSeguro) {
        this.tipoSeguro = tipoSeguro;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public String getTipoSeguro() {
        return tipoSeguro;
    }

    public double calcularMontoSeguro() {
        double porcentajeDscto = 0;
        if (tipoSeguro.equals("ONP")) {
            porcentajeDscto = 13/100;
        } else if (tipoSeguro.equals("AFP")) {
            porcentajeDscto = 12/100;
        }
        double montoSeguro = sueldoBruto * porcentajeDscto;
        return montoSeguro;
    }

    public double calcularMontoImpuestos() {
        double porcentajeImpuestos = 0.10;
        double montoImpuestos = sueldoBruto * porcentajeImpuestos;
        return montoImpuestos;
    }

    public double calcularMontoHorasExtras() {
        double tarifaXHora = 50;
        double montoHorasExtras = horasExtras * tarifaXHora;
        return montoHorasExtras;
    }

    public double calcularRemuneracionFinal() {
        double montoSeguro = calcularMontoSeguro();
        double montoImpuestos = calcularMontoImpuestos();
        double montoHorasExtras = calcularMontoHorasExtras();
        double remuneracionFinal = sueldoBruto - montoSeguro - montoImpuestos + montoHorasExtras;
        return remuneracionFinal;
    }

}
