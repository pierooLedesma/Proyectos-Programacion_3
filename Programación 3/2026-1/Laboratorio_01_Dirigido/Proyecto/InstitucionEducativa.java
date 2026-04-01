import java.util.List;
import java.util.ArrayList;

class InstitucionEducativa{
	private int idInstitucionEducativa;
	private String RUC;
	private String nombre;
	private List<Sede> sedes;
	
	public InstitucionEducativa(int idInstitucionEducativa, String RUC, String nombre){
		this.idInstitucionEducativa = idInstitucionEducativa;
		this.RUC = RUC;
		this.nombre = nombre;
		sedes = new ArrayList<Sede>();
	}
	
	public int getIdInstitucionEducativa(){
		return this.idInstitucionEducativa;
	}
	
	public void setIdInstitucionEducativa(int idInstitucionEducativa){
		this.idInstitucionEducativa = idInstitucionEducativa;
	}
	
	public String getRUC(){
		return this.RUC;
	}
	
	public void setRUC(String RUC){
		this.RUC = RUC;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void agregarSede(Sede una_sede){
		sedes.add(una_sede);
	}
	
	public String consultarProgramasDeSede(int indice){
		String consulta = "";
		if(indice < 0 && indice < sedes.size()) {
			consulta += "No hay sedes disponibles"; 
		} else {
			consulta += sedes.get(indice).consultarSede();
		}
		return consulta;
	}
}