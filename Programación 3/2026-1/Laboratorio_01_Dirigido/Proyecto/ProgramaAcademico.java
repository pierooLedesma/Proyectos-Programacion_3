import java.time.LocalTime;

abstract class ProgramaAcademico implements Consultable {
	private static int indice = 0;
	private int idProgramaAcademico;
	private String nombre;
	private String clave;
	private char modalidad;
	private double precio;
	
	public ProgramaAcademico(String nombre, String clave, char modalidad, double precio) {
		this.idProgramaAcademico = indice;
		this.nombre = nombre;
		this.clave = clave;
		this.modalidad = modalidad;
		this.precio = precio;
		indice++;
	}
	
	public int getIdProgramaAcademico() {
		return this.idProgramaAcademico;
	}
	
	public void setIdProgramaAcademico(int idProgramaAcademico) {
		this.idProgramaAcademico = idProgramaAcademico;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getClave() {
		return this.clave;
	}
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public int getModalidad() {
		return this.modalidad;
	}
	
	public void setModalidad(char modalidad) {
		this.modalidad = modalidad;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	abstract public String consultarDatos();
}