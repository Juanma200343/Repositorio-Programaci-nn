package Boletin3OrientacionAObjeto;

import java.util.Arrays;

public class Partida {

	/**
	 * @param nombre_Juego
	 * @param participantes
	 * @param ganador
	 */
	public Partida(String nombre_Juego, Participante[] participantes, Participante ganador) {
		super();
		this.nombre_Juego = nombre_Juego;
		this.participantes = participantes;
		this.ganador = ganador;
	}
	
	String nombre_Juego;
	Participante[] participantes;
	Participante ganador;
	
	
	@Override
	public String toString() {
		return "Partida [nombre_Juego=" + nombre_Juego + ", participantes=" + Arrays.toString(participantes)
				+ ", ganador=" + ganador + "]";
	}
	
	private calculaJugadorMayorPuntuacion()
	{
		
		
	}
	
	
	
}
