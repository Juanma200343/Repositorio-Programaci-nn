package Simulacro19FebreroNoEvaluable;

import java.time.LocalDate;
import java.util.Objects;

public class Incidente {

	private String direccionMac;
	private String sistemaOperativo;
	private LocalDate fecha;
	private int numIncidencias;
	private Equipo equipo;
	private Criticidad criticidad;
	private Estado estado;
	private String nombre;
	
	
	/**
	 * @param direccionMac
	 * @param sistemaOperativo
	 * @param fecha
	 * @param numIncidencias
	 * @param equipo
	 * @param criticidad
	 * @param estado
	 */
	protected Incidente(String direccionMac, String sistemaOperativo, LocalDate fecha, int numIncidencias,
			Equipo equipo, Criticidad criticidad, Estado estado, String nombre) {
		super();
		this.direccionMac = direccionMac;
		this.sistemaOperativo = sistemaOperativo;
		this.fecha = fecha;
		this.numIncidencias = numIncidencias;
		this.equipo = equipo;
		this.criticidad = criticidad;
		this.estado = estado;
		this.nombre = nombre;
	}
	protected String getDireccionMac() {
		return direccionMac;
	}
	
	protected void setDireccionMac(String direccionMac) {
		this.direccionMac = direccionMac;
	}
	
	protected String getSistemaOperativo() {
		return sistemaOperativo;
	}
	
	protected void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	
	protected LocalDate getFecha() {
		return fecha;
	}
	
	protected void setFecha(LocalDate fecha) {
		this.fecha = fecha;
		
		if(estado == Estado.CERRADA) {
			fecha = null;
		}
			
		
	}
	
	protected int getNumIncidencias() {
		return numIncidencias;
	}
	
	protected void setNumIncidencias(int numIncidencias) {
		this.numIncidencias = numIncidencias;
	}
	protected Equipo getEquipo() {
		return equipo;
	}
	
	protected void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	
	protected Criticidad getCriticidad() {
		return criticidad;
	}
	protected void setCriticidad(Criticidad criticidad) {
		this.criticidad = criticidad;
	}
	
	protected Estado getEstado() {
		return estado;
	}
	
	protected void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(criticidad, direccionMac, equipo, estado, fecha, numIncidencias, sistemaOperativo, nombre);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Incidente other = (Incidente) obj;
		return criticidad == other.criticidad && Objects.equals(direccionMac, other.direccionMac);
				
	}
	@Override
	public String toString() {
		return "Incidente [direccionMac=" + direccionMac + ", sistemaOperativo=" + sistemaOperativo + ", fecha=" + fecha
				+ ", numIncidencias=" + numIncidencias + ", equipo=" + equipo + ", criticidad=" + criticidad
				+ ", estado=" + estado + ", nombre=" + nombre + "]";
	}


	

	
	}




