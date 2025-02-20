package ExamenDia20;

public class Smartphone extends Telefono {

	private int cantidadCamaras;

	/**
	 * @param marca
	 * @param modelo
	 * @param precio
	 * @param tieneTecladoFisico
	 * @param cantidadCamaras
	 */
	public Smartphone(String marca, String modelo, double precio, boolean tieneTecladoFisico, int cantidadCamaras) {
		super(marca, modelo, precio, tieneTecladoFisico);
		this.cantidadCamaras = cantidadCamaras;
	}

	protected int getCantidadCamaras() {
		return cantidadCamaras;
	}

	protected void setCantidadCamaras(int cantidadCamaras) {
		this.cantidadCamaras = cantidadCamaras;
	}
	
	
	
	
}
