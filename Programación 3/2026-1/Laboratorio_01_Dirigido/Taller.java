import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalTime;

class Taller extends ProgramaAcademico {
	private Date fechaRealizacion;
	private LocalTime horaInicioTaller;
	private LocalTime horaFinTaller;
	
	public Taller(String nombre, String clave, char modalidad, double precio, Date fechaRealizacion, LocalTime horaInicioTaller, LocalTime horaFinTaller) {
		super(nombre, clave, modalidad, precio);
		this.fechaRealizacion = fechaRealizacion;
		this.horaInicioTaller = horaInicioTaller;
		this.horaFinTaller = horaFinTaller;
	}
	
	public Date getFechaRealizacion() {
		return this.fechaRealizacion;
	}
	
	public void setFechaRealizacion(Date fechaRealizacion) {
		this.fechaRealizacion = fechaRealizacion;
	}
	
	public LocalTime getHoraInicioTaller() {
		return this.horaInicioTaller;
	}
	
	public void setHoraInicioTaller(LocalTime horaInicioTaller) {
		this.horaInicioTaller = horaInicioTaller;
	}
	
	public LocalTime getHoraFinTaller() {
		return this.horaFinTaller;
	}
	
	public void setHoraFinTaller(LocalTime horaFinTaller) {
		this.horaFinTaller = horaFinTaller;
	}
	
	@Override
	public String consultarDatos() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return "Taller: " + getClave() + " - " + getNombre() + " - S/." + String.format("%.2f", getPrecio()) + " - FECHA: " + sdf.format(fechaRealizacion) + "\n";
	}
}