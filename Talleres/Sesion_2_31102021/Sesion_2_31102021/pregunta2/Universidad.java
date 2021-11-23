package pregunta2;

import java.util.ArrayList;
import java.util.List;

public class Universidad {

    private List<Postulante> postulantes;

    public Universidad() {
        this.postulantes = new ArrayList<>();
    }

    public List<Postulante> getPostulantes() {
        return postulantes;
    }

    public void registrarPostulante(Postulante postulante) {
        postulantes.add(postulante);
    }

    public Postulante obtenerMayorPostulante() {
        // Esto es solo ejemplo, deben complementar logica para encontyrar el mayor aqui.
        return postulantes.get(0);
    }
}
