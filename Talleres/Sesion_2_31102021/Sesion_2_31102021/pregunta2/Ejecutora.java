package pregunta2;

import java.util.List;

public class Ejecutora {

    public static void main(String[] args) {

        Egresado egresadoA = new Egresado("46531717", "Jose Torres", "Ingenieria de Software", 15, 84, 75, "Nacional");
        Egresado egresadoB = new Egresado("12324231", "Carlos Matos", "Administracion", 18, 72, 58, "Particular");
        Traslado trasladoA = new Traslado("43845787", "Sofia Roble", "Derecho", 18.5, 92, 87, "UPC", false);
        Traslado trasladoB = new Traslado("58738422", "Carla Soto", "Marketing", 19, 87, 89, "UPC", true);

        System.out.println(egresadoA.obtenerDatos());
        System.out.println(egresadoB.obtenerDatos());
        System.out.println(trasladoA.obtenerDatos());
        System.out.println(trasladoB.obtenerDatos());

//        // Solo como ejemplo
//        Postulante[] postulantes = { egresadoA, egresadoB, trasladoA, trasladoB };
//        for (Postulante postulante: postulantes) {
//            System.out.println(postulante.getNombre() + " obtuvo " + postulante.obtenerCalificacionFinal());
//        }

        // Extension

        Universidad upc = new Universidad();

        upc.registrarPostulante(egresadoA);
        upc.registrarPostulante(egresadoB);
        upc.registrarPostulante(trasladoA);
        upc.registrarPostulante(trasladoB);

        List<Postulante> postulantesRegistrados = upc.getPostulantes();
        for (Postulante postulante: postulantesRegistrados) {
            System.out.println(postulante.getNombre() + " obtuvo " + postulante.obtenerCalificacionFinal());
        }

        Postulante postulanteMayorPuntaje = upc.obtenerMayorPostulante();
        System.out.println(postulanteMayorPuntaje.obtenerDatos());


    }
}
