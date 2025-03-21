package modelo.Simulacro21Marzo;

import java.time.LocalDate;

public class Vuelo {

	String id;
	String aerolinea;
	String destino;
	LocalDate fecha_vuelo;
	Estado estado;
	/**
	 * @param id
	 * @param aerolinea
	 * @param destino
	 * @param fecha_vuelo
	 * @param estado
	 */
	public Vuelo(String id, String aerolinea, String destino, LocalDate fecha_vuelo, Estado estado) {
		super();
		this.id = id;
		this.aerolinea = aerolinea;
		this.destino = destino;
		this.fecha_vuelo = fecha_vuelo;
		this.estado = estado;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public LocalDate getFecha_vuelo() {
		return fecha_vuelo;
	}
	public void setFecha_vuelo(LocalDate fecha_vuelo) {
		this.fecha_vuelo = fecha_vuelo;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	@Override
	public String toString() {
		return "Vuelo [id=" + id + ", aerolinea=" + aerolinea + ", destino=" + destino + ", fecha_vuelo=" + fecha_vuelo
				+ ", estado=" + estado + "]";
	}
	
	
	
	
	
	
	
}
