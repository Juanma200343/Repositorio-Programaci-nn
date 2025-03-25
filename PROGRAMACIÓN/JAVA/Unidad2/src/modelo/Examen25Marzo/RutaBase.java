package modelo.Examen25Marzo;

import java.util.Objects;

public class RutaBase  extends Ciudad implements IRuta  {

	private int id;
	private String ciudadOrigen;
	private String ciudadDestino;
	protected double distancia;

	

	/**
	 * @param nombre
	 * @param numHabitantes
	 * @param id
	 * @param ciudadOrigen
	 * @param ciudadDestino
	 * @param distancia
	 */
	protected RutaBase(String nombre, int numHabitantes, int id, String ciudadOrigen, String ciudadDestino,
			double distancia) {
		super(nombre, numHabitantes);
		this.id = id;
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.distancia = distancia;
	}
	
	
	
	@Override
	public double getCoste() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String getTipoRuta() {
		// TODO Auto-generated method stub
		
		
		return "Es terrestre o aerea";
	}



	@Override
	public int hashCode() {
		return Objects.hash(ciudadDestino, ciudadOrigen, distancia, id);
	}




	
	
}
