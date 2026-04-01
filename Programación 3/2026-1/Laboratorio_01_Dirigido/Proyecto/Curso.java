import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalTime;

class Curso extends ProgramaAcademico {
	private int cantHorasPorSemana;
	private int cantCreditos;
	private Date fechaInicio;
	private Date fechaFin;
	private DiaSemana diaSemana;
	private LocalTime horaInicioCurso;
	private LocalTime horaFinCurso;
	
	public Curso(String nombre, String clave, char modalidad, double precio, int cantHorasPorSemana, int cantCreditos,
				 Date fechaInicio, Date fechaFin, DiaSemana diaSemana, LocalTime horaInicioCurso, LocalTime horaFinCurso) {
		super(nombre, clave, modalidad, precio);
		this.cantHorasPorSemana = cantHorasPorSemana;
		this.cantCreditos = cantCreditos;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.diaSemana = diaSemana;
		this.horaInicioCurso = horaInicioCurso;
		this.horaFinCurso = horaFinCurso;
	}
	
	public int getCantHorasPorSemana() {
		return this.cantHorasPorSemana;
	}
	
	public void setCantHorasPorSemana(int cantHorasPorSemana) {
		this.cantHorasPorSemana = cantHorasPorSemana;
	}
	
	public int getCantCreditos() {
		return this.cantCreditos;
	}
	
	public void setCantCreditos(int cantCreditos) {
		this.cantCreditos = cantCreditos;
	}
	
	public Date getFechaInicio() {
		return this.fechaInicio;
	}
	
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	
	public Date getFechaFin() {
		return this.fechaFin;
	}
	
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	public DiaSemana getDiaSemana() {
		return this.diaSemana;
	}
	
	public void setDiaSemana(DiaSemana diaSemana) {
		this.diaSemana = diaSemana;
	}
	
	public LocalTime getHoraInicioCurso() {
		return this.horaInicioCurso;
	}
	
	public void setHoraInicioCurso(LocalTime horaInicioCurso) {
		this.horaInicioCurso = horaInicioCurso;
	}
	
	public LocalTime getHoraFinCurso() {
		return this.horaFinCurso;
	}
	
	public void setHoraFinCurso(LocalTime horaFinCurso) {
		this.horaFinCurso = horaFinCurso;
	}
	
	@Override
	public String consultarDatos() {
		return "CURSO: " + getClave() + " - " + getNombre() + " - S/." + String.format("%.2f", getPrecio()) + " - CRED:" + cantCreditos + "\n";
	}
}