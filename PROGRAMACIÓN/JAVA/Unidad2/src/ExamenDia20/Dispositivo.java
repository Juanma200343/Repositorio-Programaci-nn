package ExamenDia20;

import java.util.Objects;

public class Dispositivo {

	private String marca;
	private String modelo;
	private double precio;
	/**
	 * @param marca
	 * @param modelo
	 * @param precio
	 */
	
	protected Dispositivo(String marca, String modelo, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.setPrecio(precio);
		this.getPrecio();
	}
	
	
	protected String getMarca() {
		return marca;
	}
	protected void setMarca(String marca) {
		this.marca = marca;
	}
	protected String getModelo() {
		return modelo;
	}
	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}
	protected double getPrecio() {
		precio = precio*10/100;
		return precio;
	}
	protected void setPrecio(double precio) {
		if (precio < 0 )
			System.out.println("Error no puedes tener precio negativo");
		else {
			precio = precio ++;
		}
		this.precio = precio;
	}


	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo, precio);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dispositivo other = (Dispositivo) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}


	@Override
	public String toString() {
		return "Dispositivo [marca=" + marca + ", modelo=" + modelo + ", precio=" + "getPrecio()"+ getPrecio() + "]";
	}

	double calcularPrecioDescuento() {
		precio = getPrecio(); 
		
		return precio;
	}	
}
