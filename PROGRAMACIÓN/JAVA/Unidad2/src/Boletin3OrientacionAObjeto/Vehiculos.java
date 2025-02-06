package Boletin3OrientacionAObjeto;

public class Vehiculos {
	
	String marca;
	String modelo;
	int anyoFabricacion;
	String tipoCombustible;
	int capacidadTanque;
	int capacidadTotal;
	int capacidadCombustible;
	
	public Vehiculos(String marca, String modelo, int anyoFabricacion, String tipoCombustible, int capacidadTanque,
			int capacidadTotal, int capacidadCombustible) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anyoFabricacion = anyoFabricacion;
		this.tipoCombustible = tipoCombustible;
		this.capacidadTanque = capacidadTanque;
		this.capacidadTotal = capacidadTotal;
		this.capacidadCombustible = capacidadCombustible;
	}
	
	@Override
	public String toString() {
		return "Vehiculos [marca=" + marca + ", modelo=" + modelo + ", anyoFabricacion=" + anyoFabricacion
				+ ", tipoCombustible=" + tipoCombustible + ", capacidadTanque=" + capacidadTanque + ", capacidadTotal="
				+ capacidadTotal + ", capacidadCombustible=" + capacidadCombustible + "]";
	}
	
	boolean calculaConsumo()
	{
		
		
		
		
	return ;
	}
	boolean hayQueRepostar()
	{
		
		
		return false;
	}
	
	
	
}
