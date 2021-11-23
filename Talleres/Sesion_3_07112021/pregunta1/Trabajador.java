package pregunta1;

public abstract class Trabajador {

    private String documento;
    private String nombres;
    private String direccion;
    private String area;

    public Trabajador(String documento, String nombres, String direccion, String area) {
        this.documento = documento;
        this.nombres = nombres;
        this.direccion = direccion;
        this.area = area;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getArea() {
        return area;
    }

    public abstract double calcularSueldo();

    public String obtenerDatos() {
        return "Doc: " + documento + " Nom: " + nombres + " Direc: " + direccion + " Area: " + area;
    }

    public boolean validarDocumento() {
        return false;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "documento='" + documento + '\'' +
                ", nombres='" + nombres + '\'' +
                ", direccion='" + direccion + '\'' +
                ", area='" + area + '\'' +
                ", sueldoFinal= " + calcularSueldo() +
                '}';
    }
}
