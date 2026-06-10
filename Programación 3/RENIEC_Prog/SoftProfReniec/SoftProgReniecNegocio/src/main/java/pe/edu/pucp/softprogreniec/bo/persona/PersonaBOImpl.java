package pe.edu.pucp.softprogreniec.bo.persona;

import pe.edu.pucp.softprogreniec.bo.BaseBO;
import pe.edu.pucp.softprogreniec.dao.personaDao.PersonaDAO;
import pe.edu.pucp.softprogreniec.dao.personaDao.PersonaDAOImpl;
import pe.edu.pucp.softprogreniec.personaDto.PersonaDTO;

import java.util.List;
import java.util.Objects;

public class PersonaBOImpl extends BaseBO implements PersonaBO{
    private final PersonaDAO personaDao;

    public PersonaBOImpl() {
        this.personaDao = new PersonaDAOImpl();
    }

    @Override
    public List<PersonaDTO> listar() {
        return this.personaDao.leerTodos();
    }

    @Override
    public PersonaDTO obtener(String dni) {
        String dniLimpio = "";

        // CAMBIO: Si dni NO es null, entonces recién usamos trim().
        // trim() : quita los espacios al inicio y al final del "string".
        // Ejemplo: "  12345678  " se convierte en "12345678".
        if (dni != null) {
            dniLimpio = dni.trim();
        }

        if (dniLimpio.isEmpty()) return null;

        return this.personaDao.leerPorDni(dniLimpio);
    }
}
