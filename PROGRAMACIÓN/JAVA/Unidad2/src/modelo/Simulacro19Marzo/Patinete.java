package modelo.Simulacro19Marzo;

public class Patinete extends VehiculoGeneral {

	int tiempoDeAutonomia;
	
	/**
	 * @param id
	 * @param alquiler
	 * @param marca
	 * @param modelo
	 * @param tiempoDeAutonomia
	 */
	public Patinete(String id, String[] alquiler, String marca, String modelo, int tiempoDeAutonomia) {
		super(id, alquiler, marca, modelo);
		this.tiempoDeAutonomia = tiempoDeAutonomia;
	}

	public Patinete(String id, String[] alquiler, String marca, String modelo) {
		super(id, alquiler, marca, modelo);
		// TODO Auto-generated constructor stub
	}

	
	public int getTiempoDeAutonomia() {
		return tiempoDeAutonomia;
	}

	public void setTiempoDeAutonomia(int tiempoDeAutonomia) {
		this.tiempoDeAutonomia = tiempoDeAutonomia;
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
