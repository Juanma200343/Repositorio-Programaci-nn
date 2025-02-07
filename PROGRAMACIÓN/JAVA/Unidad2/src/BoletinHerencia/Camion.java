package BoletinHerencia;

public class Camion extends Vehiculo {

	/**
	 * @param dueno
	 * @param numPuertas
	 * @param numRuedas
	 * @param tonelajeKilos
	 * @param numPasajeros
	 * @param numEjes
	 */
	
	public Camion(String dueno, int numPuertas, int numRuedas, int tonelajeKilos, int numPasajeros, int numEjes) {
		
		super();
		this.dueno = dueno;
		this.numPuertas = numPuertas;
		this.numRuedas = numRuedas;
		this.tonelajeKilos = tonelajeKilos;
		this.numPasajeros = numPasajeros;
		this.numEjes = numEjes;
	}
	String dueno;
	int numPuertas;
	int numRuedas;
	int tonelajeKilos;
	int numPasajeros;
	int numEjes;
	
	
	@Override
	public String toString() {
		return "Camion [dueno=" + dueno + ", numPuertas=" + numPuertas + ", numRuedas=" + numRuedas + ", tonelajeKilos="
				+ tonelajeKilos + ", numPasajeros=" + numPasajeros + ", numEjes=" + numEjes + "]";
	}


	public String getDueno() {
		return dueno;
	}


	public void setDueno(String dueno) {
		this.dueno = dueno;
	}


	public int getNumPuertas() {
		return numPuertas;
	}


	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}


	public int getNumRuedas() {
		return numRuedas;
	}


	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}


	public int getTonelajeKilos() {
		return tonelajeKilos;
	}


	public void setTonelajeKilos(int tonelajeKilos) {
		this.tonelajeKilos = tonelajeKilos;
	}


	public int getNumPasajeros() {
		return numPasajeros;
	}


	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}


	public int getNumEjes() {
		return numEjes;
	}


	public void setNumEjes(int numEjes) {
		this.numEjes = numEjes;
	}
	
	
	
	
	
	
	
}
