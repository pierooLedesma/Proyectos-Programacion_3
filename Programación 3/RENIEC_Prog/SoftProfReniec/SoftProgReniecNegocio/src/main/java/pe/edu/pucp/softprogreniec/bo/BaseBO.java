package pe.edu.pucp.softprogreniec.bo;

import java.util.Objects;

public abstract class BaseBO {
    protected void validarTextoObligatorio(String valor, String nombreCampo) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("El " + nombreCampo + " es obligatorio");
        }
    }
}
