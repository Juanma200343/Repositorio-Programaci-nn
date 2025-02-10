package BoletinHerencias;

public class Camion extends Vehiculos {
	public Camion(String dueno, int numPuertas, int numRuedas, int tonelajeKilos, int numPasajeros, int numEjes) {
		super(dueno, numEjes, numRuedas);
		this.dueno = dueno;
		this.numPuertas = numPuertas;
		this.numRuedas = numRuedas;
		this.tonelajeKilos = tonelajeKilos;
		this.numPasajeros = numPasajeros;
		this.numEjes = numEjes;
	}



	String dueno;
	int numPuertas ; 
	int numRuedas;
	int tonelajeKilos;
	int numPasajeros;
	int numEjes;
	
	
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



	@Override
	public String toString() {
		return "Camion [dueno=" + dueno + ", numPuertas=" + numPuertas + ", numRuedas=" + numRuedas + ", tonelajeKilos="
				+ tonelajeKilos + ", numPasajeros=" + numPasajeros + ", numEjes=" + numEjes + ", getDueno()="
				+ getDueno() + ", getNumPuertas()=" + getNumPuertas() + ", getNumRuedas()=" + getNumRuedas()
				+ ", getTonelajeKilos()=" + getTonelajeKilos() + ", getNumPasajeros()=" + getNumPasajeros()
				+ ", getNumEjes()=" + getNumEjes() + "]";
	}
	
	
	
	
	
	
	
}