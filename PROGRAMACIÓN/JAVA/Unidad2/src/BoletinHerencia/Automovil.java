package BoletinHerencia;

public class Automovil extends Vehiculo {

	/**
	 * @param dueno
	 * @param numPuertas
	 * @param numRuedas
	 * @param clasificacionEcologica
	 */
	public Automovil(String dueno, int numPuertas, int numRuedas, String clasificacionEcologica) {
		super(dueno, numPuertas, numRuedas);
		this.clasificacionEcologica = clasificacionEcologica;
	}


	private String clasificacionEcologica ;
	
	
	@Override
	public String toString() {
		return "Automovil [dueno=" + dueno + ", numPuertas=" + numPuertas + ", numRuedas=" + numRuedas + "]";
	}


	public String getClasificacionEcologica() {
		return clasificacionEcologica;
	}


	public void setClasificacionEcologica(String clasificacionEcologica) {
		this.clasificacionEcologica = clasificacionEcologica;
	}

	


	
	
}
