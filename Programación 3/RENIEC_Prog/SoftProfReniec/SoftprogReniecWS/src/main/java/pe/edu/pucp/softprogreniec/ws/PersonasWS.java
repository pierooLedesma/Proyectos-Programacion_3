package pe.edu.pucp.softprogreniec.ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import pe.edu.pucp.softprogreniec.bo.persona.PersonaBO;
import pe.edu.pucp.softprogreniec.bo.persona.PersonaBOImpl;
import pe.edu.pucp.softprogreniec.personaDto.PersonaDTO;

import java.util.List;

@WebService(
        serviceName = "PersonasWS",
        targetNamespace = "http://services.softprogreniec.pucp.edu.pe/")
public class PersonasWS {
    private final PersonaBO personaBo;

    public PersonasWS() {
        this.personaBo = new PersonaBOImpl();
    }

    @WebMethod(operationName = "listarPersonas")
    public List<PersonaDTO> listarPersonas() {
        return this.personaBo.listar();
    }

    @WebMethod(operationName = "obtenerPersona")
    public PersonaDTO obtenerPersona(@WebParam(name = "dni") String dni) {
        return this.personaBo.obtener(dni);
    }
}
