package modelo.Simulacro19Marzo;

public class Furgoneta extends VehiculoCombustible{

	int numPlazas;
	float pma;
	
	
	
	/**
	 * @param id
	 * @param alquiler
	 * @param marca
	 * @param modelo
	 * @param numPlazas
	 * @param pma
	 */
	public Furgoneta(String id, String[] alquiler, String marca, String modelo, int numPlazas, float pma) {
		super(id, alquiler, marca, modelo);
		this.numPlazas = numPlazas;
		this.pma = pma;
	}

	public Furgoneta(String id, String[] alquiler, String marca, String modelo) {
		super(id, alquiler, marca, modelo);
		// TODO Auto-generated constructor stub
	}

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public float getPma() {
		return pma;
	}

	public void setPma(float pma) {
		this.pma = pma;
	}
	
	

	@Override
	boolean siEstaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public boolean estaAlquilado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public float getPrecioDia() {
		// TODO Auto-generated method stub
		return 0;
	}

}
