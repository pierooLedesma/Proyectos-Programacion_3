import java.util.List;
import java.util.ArrayList;

class Sede {
	private int idSede;
	private String nombre;
	private String direccion;
	private List<ProgramaAcademico> programas;
	
	public Sede(int idSede, String nombre, String direccion) {
		this.idSede = idSede;
		this.nombre = nombre;
		this.direccion = direccion;
		programas = new ArrayList<ProgramaAcademico>();
	}
	
	public int getIdSede(){
		return this.idSede;
	}
	
	public void setIdSede(int idSede){
		this.idSede = idSede;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getDireccion(){
		return this.direccion;
	}
	
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
	
	public void agregarProgramaAcademico(ProgramaAcademico programa){
		programas.add(programa);
	}
	
	public String consultarSede() {
		String consultaProgramas = "";
		for(ProgramaAcademico un_programa : programas){
			consultaProgramas += un_programa.consultarDatos();
		}
		if(consultaProgramas == "") {
			consultaProgramas += "No hay programas disponibles";
		}
		return consultaProgramas;
	}
}