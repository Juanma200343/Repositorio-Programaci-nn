package orientacionAObjeto;

import java.util.Arrays;

public class Equipo {
	/**
	 * @param nombreEquipo
	 * @param puntuaciones
	 * @param personas
	 */
	public Equipo(String nombreEquipo, int[] puntuaciones, String personas) {
		super();
		this.nombreEquipo = nombreEquipo;
		this.puntuaciones = puntuaciones;
		this.personas = personas;
	}
	String nombreEquipo;
	int[] puntuaciones;
	String personas;
	
	
	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", puntuaciones=" + Arrays.toString(puntuaciones)
				+ ", personas=" + personas + "]";
	}
	
	float calculaMediaEdad()
	{
		float mediaEdad = 0f;
		Persona [] tablaPersona = this.personas;
		for(Persona p: tablaPersona)
		{
			System.out.println(p.edad);
		}
		
		
		return mediaEdad;
	}
	
	
}
