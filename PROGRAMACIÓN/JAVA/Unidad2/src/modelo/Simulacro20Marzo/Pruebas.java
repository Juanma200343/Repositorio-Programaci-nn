package modelo.Simulacro20Marzo;

import java.time.LocalDate;

public class Pruebas {

	String id; 
	String lugar;
	LocalDate fecha;
	Estado estado;
	/**
	 * @param id
	 * @param lugar
	 * @param fecha
	 * @param estado
	 */
	public Pruebas(String id, String lugar, LocalDate fecha, Estado estado) {
		super();
		this.id = id;
		this.lugar = lugar;
		this.fecha = fecha;
		this.estado = estado;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Pruebas [id=" + id + ", lugar=" + lugar + ", fecha=" + fecha + ", estado=" + estado + "]";
	}

	
	
	
	
	
}
