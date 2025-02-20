package ExamenDia20;

public class Laptop extends Computadora{

	private double peso;

	/**
	 * @param marca
	 * @param modelo
	 * @param precio
	 * @param capacidadRAM
	 * @param peso
	 */
	
	public Laptop(String marca, String modelo, double precio, int capacidadRAM, double peso) {
		super(marca, modelo, precio, capacidadRAM);
		this.peso = peso;
	}

	protected double getPeso() {
		return peso;
	}

	protected void setPeso(double peso) {
		if (peso > 2 )
			calcularPrecioDescuento()
			setPrecio((getPrecio()*20/100));
		this.peso = peso;
	}
	
	double calcularPrecioDescuento() {
		setPrecio((getPrecio()*12/100));
		
		return getPrecio();
	}
}
