package BoletinHerencia;

public class Automovil extends Vehiculo {

	/**
	 * @param dueno
	 * @param numPuertas
	 * @param numRuedas
	 * @param clasificacionEcologica
	 */
	public Automovil(String dueno, int numPuertas, int numRuedas, ClasificacionEcologica clasificacionEcologica) {
		super(dueno, numPuertas, numRuedas);
		this.clasificacionEcologica = clasificacionEcologica;
		setClasificacionEcologica(clasificacionEcologica);
	}


	private ClasificacionEcologica clasificacionEcologica ;
	
	
	public enum ClasificacionEcologica{
		ECO,B,C,O;
	
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Automovil [dueno=" + dueno + ", numPuertas=" + numPuertas + ", numRuedas=" + numRuedas + "]";
	}


	public ClasificacionEcologica getClasificacionEcologica() {
		return clasificacionEcologica;
	}


	


	public void setClasificacionEcologica(ClasificacionEcologica clasificacionEcologica ) {
		this.clasificacionEcologica = clasificacionEcologica;


		this.clasificacionEcologica = clasificacionEcologica;
	}

	


	
	
}
