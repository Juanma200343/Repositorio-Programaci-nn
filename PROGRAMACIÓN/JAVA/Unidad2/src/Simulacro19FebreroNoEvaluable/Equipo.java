package Simulacro19FebreroNoEvaluable;

import java.util.Objects;

public class Equipo {

	private String direccionMac;
	private String SistemaOperativo;
	private int numIncidencias;
	private Equipo equipo;
	
	/**
	 * @param direccionMac
	 * @param sistemaOperativo
	 * @param numIncidencias
	 */
	protected Equipo(String direccionMac, String sistemaOperativo, int numIncidencias) {
		super();
		this.direccionMac = direccionMac;
		SistemaOperativo = sistemaOperativo;
		this.numIncidencias = numIncidencias;
	}

	
	protected String getDireccionMac() {
		return direccionMac;
	}

	protected void setDireccionMac(String direccionMac) {
		this.direccionMac = direccionMac;
	}

	protected String getSistemaOperativo() {
		return SistemaOperativo;
	}

	protected void setSistemaOperativo(String sistemaOperativo) {
		SistemaOperativo = sistemaOperativo;
	}

	protected int getNumIncidencias() {
		return numIncidencias;
	}

	protected void setNumIncidencias(int numIncidencias) {
		this.numIncidencias = numIncidencias;
	}


	@Override
	public int hashCode() {
		return Objects.hash(SistemaOperativo, direccionMac, numIncidencias);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(SistemaOperativo, other.SistemaOperativo)
				&& Objects.equals(direccionMac, other.direccionMac) && numIncidencias == other.numIncidencias;
	}


	@Override
	public String toString() {
		return "Equipo [direccionMac=" + direccionMac + ", SistemaOperativo=" + SistemaOperativo + ", numIncidencias="
				+ numIncidencias + "]";
	}
	
	
}
