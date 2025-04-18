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
	
	private String nombre_Juego;
	private Participante[] participantes;
	private Participante ganador;
	
	
	@Override
	public String toString() {
		return "Partida [nombre_Juego=" + nombre_Juego + ", participantes=" + Arrays.toString(participantes)
				+ ", ganador=" + ganador + "]";
	}
	
	private calculaJugadorMayorPuntuacion()
	{
		
		//Añadido para ver cambios en github
	}

	public String getNombre_Juego() {
		return nombre_Juego;
	}

	public void setNombre_Juego(String nombre_Juego) {
		this.nombre_Juego = nombre_Juego;
	}

	public Participante[] getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Participante[] participantes) {
		this.participantes = participantes;
	}

	public Participante getGanador() {
		return ganador;
	}

	public void setGanador(Participante ganador) {
		this.ganador = ganador;
	}
	
	
	
}
