package pregunta1;

public class Test {

    public static void main(String[] args) {

        Triangulo trianguloA = new Triangulo("Triangulo", 15, 23);
        Circulo circuloA = new Circulo("Circulo", 18.5);
        Cuadrado cuadradoA = new Cuadrado("Cuadrado", 12);

        System.out.println(trianguloA.getAltura());
        System.out.println(trianguloA.calcularArea());
        System.out.printf("%.2f \n", circuloA.calcularArea());
        System.out.println(cuadradoA.calcularArea());

        // solo ejemplo
        FiguraGeometrica[] figuras = { trianguloA, circuloA, cuadradoA };

//        for (int i=0; i< figuras.length; i++) {
//            System.out.println(figuras[i].getClass() + " : " + figuras[i].calcularArea());
//        }
        for (FiguraGeometrica figura: figuras) {
            System.out.println(figura.getClass() + " : " + figura.calcularArea());
        }


    }
}
