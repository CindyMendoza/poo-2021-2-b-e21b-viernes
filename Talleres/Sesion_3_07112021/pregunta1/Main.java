package pregunta1;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        System.out.println("A)");

        Empresa upc = new Empresa();

        Nombrado trabajadorA = new Nombrado("14465437", "Jose Torres", "Condesa Lemos 100", "Administracion", 950, "B");
        Nombrado trabajadorB = new Nombrado("43884831", "Carla Soto", "Av Faucett 100", "Legal", 2450, "D");
        Destacado trabajadorC = new Destacado("49598838", "Rodolfo Mejia", "Av Marina 1200", "Producto", 2840, 0.007);
        Destacado trabajadorD = new Destacado("12492919", "Sofia Matos", "Av Pardo 1200", "Riesgos", 1890, 0.0075);
        Temporal trabajadorE = new Temporal("19292941", "Maria Matos", "Jose Pardo", "Procesos", 150, 20);
        Temporal trabajadorF = new Temporal("12989349", "Jesus Pacheco", "Encalada SN", "Riesgos", 60, 40);
        Temporal trabajadorG = new Temporal("12989349", "Lorenzo Soto", "Av Polo", "Riesgos", 20, 10);

        upc.registrarTrabajador(trabajadorA);
        upc.registrarTrabajador(trabajadorB);
        upc.registrarTrabajador(trabajadorC);
        upc.registrarTrabajador(trabajadorD);
        upc.registrarTrabajador(trabajadorE);
        upc.registrarTrabajador(trabajadorF);

        System.out.println("B)");

        List<Trabajador> trabajadoresRegistrados = upc.getTrabajadores();
        for (Trabajador trabajador: trabajadoresRegistrados) {
            System.out.println(trabajador.obtenerDatos());
//            System.out.println(trabajador);
        }


        System.out.println("C)");
        double montoTotal = upc.obtenerMontoTotalPagarTemporales();
        System.out.println("Monto total de sueldos de Temporales es: S/" + montoTotal);


        System.out.println("D)");
        upc.registrarTrabajador(trabajadorF);
        upc.registrarTrabajador(trabajadorG);

        trabajadoresRegistrados = upc.getTrabajadores();
        for (Trabajador trabajador: trabajadoresRegistrados) {
            System.out.println(trabajador.obtenerDatos());
//            System.out.println(trabajador);
        }

        // Adicional, no incluido para el nivel de la PC

        System.out.println("SOLO TRABAJADORES TEMPORALES");
        List<Trabajador> trabajadoresQueSeanTemporales = upc.obtenerSoloTrabajadoresTemporales();
        for (Trabajador trabajador: trabajadoresQueSeanTemporales) {
            System.out.println(trabajador);
        }

    }
}
