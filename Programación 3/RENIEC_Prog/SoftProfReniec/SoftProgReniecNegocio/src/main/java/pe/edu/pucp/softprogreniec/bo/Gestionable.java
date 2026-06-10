package pe.edu.pucp.softprogreniec.bo;

import java.util.List;

public interface Gestionable<M> {
    List<M> listar();
    M obtener(String id);
}
