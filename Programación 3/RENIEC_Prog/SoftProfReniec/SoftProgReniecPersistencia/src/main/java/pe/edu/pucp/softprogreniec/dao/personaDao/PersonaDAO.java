package pe.edu.pucp.softprogreniec.dao.personaDao;

import pe.edu.pucp.softprogreniec.dao.Persistible;
import pe.edu.pucp.softprogreniec.personaDto.PersonaDTO;

public interface PersonaDAO extends Persistible<PersonaDTO, Integer> {
    PersonaDTO leerPorDni(String dni);
}
