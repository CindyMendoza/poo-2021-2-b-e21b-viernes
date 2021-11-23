package ejercicio1;

public class Alumno {

    private String codigo;
    private String nombres;
    private double notaT1;
    private double notaT2;

    public Alumno(String codigo, String nombres, double notaT1, double notaT2) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.notaT1 = notaT1;
        this.notaT2 = notaT2;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public double getNotaT1() {
        return notaT1;
    }

    public double getNotaT2() {
        return notaT2;
    }

    public String obtenerEstado() {
        if (notaT1 >= 85 && notaT2 >= 85) {
            return "aprobado";
        } else if (notaT1 >= 85 || notaT2 >= 85) {
            return "observado";
        } else {
            return "reprobado";
        }
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "codigo='" + codigo + '\'' +
                ", nombres='" + nombres + '\'' +
                ", notaT1=" + notaT1 +
                ", notaT2=" + notaT2 +
                '}';
    }
}
