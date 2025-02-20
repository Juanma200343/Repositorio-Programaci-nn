package ExamenDia20;

public class PCSobremesa extends Computadora {

	private boolean tieneGPUdedicada;

	/**
	 * @param marca
	 * @param modelo
	 * @param precio
	 * @param capacidadRAM
	 * @param tieneGPUdedicada
	 */
	public PCSobremesa(String marca, String modelo, double precio, int capacidadRAM, boolean tieneGPUdedicada) {
		super(marca, modelo, precio, capacidadRAM);
		this.tieneGPUdedicada = tieneGPUdedicada;
	}

	protected boolean isTieneGPUdedicada() {
		return tieneGPUdedicada;
	}

	protected void setTieneGPUdedicada(boolean tieneGPUdedicada) {
		if (tieneGPUdedicada = true)
			System.out.println("Tiene ");
		this.tieneGPUdedicada = tieneGPUdedicada;
	}
	
	
	
	
	
}
