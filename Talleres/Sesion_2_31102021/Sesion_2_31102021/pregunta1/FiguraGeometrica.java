package pregunta1;

public abstract class FiguraGeometrica {

    private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();
}
