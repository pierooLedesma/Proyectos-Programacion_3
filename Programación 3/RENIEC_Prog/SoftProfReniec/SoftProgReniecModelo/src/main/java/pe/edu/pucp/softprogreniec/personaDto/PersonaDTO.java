package pe.edu.pucp.softprogreniec.personaDto;

public class PersonaDTO {
    private String dni;
    private String paterno;
    private String materno;
    private String nombres;

    public String getNombres() {
        return nombres;
    }

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public String getDni() {
        return dni;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
