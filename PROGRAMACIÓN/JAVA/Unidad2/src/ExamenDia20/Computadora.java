package ExamenDia20;

public class Computadora extends Dispositivo {

	private int capacidadRAM;

	/**
	 * @param marca
	 * @param modelo
	 * @param precio
	 * @param capacidadRAM
	 */
	public Computadora(String marca, String modelo, double precio, int capacidadRAM) {
		super(marca, modelo, precio);
		this.capacidadRAM = capacidadRAM;
	}

	
	protected int getCapacidadRAM() {
		return capacidadRAM;
	}

	protected void setCapacidadRAM(int capacidadRAM) {
		this.capacidadRAM = capacidadRAM;
	}

	
	
}
