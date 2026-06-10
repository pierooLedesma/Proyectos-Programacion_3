package pe.edu.pucp.softprogreniec.dao;

import java.util.List;

public interface Persistible<M, I> {
    /** Persiste {@code modelo} y devuelve su identificador. */
    I crear(M modelo);

    /** Devuelve la entidad identificada por {@code id}, o {@code null} si no existe. */
    M leer(I dni);

    /** Devuelve todas las instancias del modelo. */
    List<M> leerTodos();
}
