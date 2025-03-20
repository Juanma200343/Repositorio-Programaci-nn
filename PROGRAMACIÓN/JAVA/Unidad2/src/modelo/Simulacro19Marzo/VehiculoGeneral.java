package modelo.Simulacro19Marzo;

public abstract class VehiculoGeneral implements IAlquilable {

	String id; 
	String [] alquiler;
	String marca;
	String modelo;
	/**
	 * @param id
	 * @param alquiler
	 * @param marca
	 * @param modelo
	 */
	public VehiculoGeneral(String id, String[] alquiler, String marca, String modelo) {
		super();
		this.id = id;
		this.alquiler = alquiler;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String[] getAlquiler() {
		return alquiler;
	}
	public void setAlquiler(String[] alquiler) {
		this.alquiler = alquiler;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	abstract boolean siEstaDisponible();
	
	
	public float getImporteTotalGenerado() {

		float importeTotal = 0;
		
		
		return importeTotal;
	}
	
	
	
	
}
