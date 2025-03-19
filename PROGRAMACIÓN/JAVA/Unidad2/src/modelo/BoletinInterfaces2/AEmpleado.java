package modelo.BoletinInterfaces2;

public abstract class AEmpleado implements INomina {

	private String nombre;
	private String id; 
	private String apellido;
	private float salario;
	
	
	
	
	
	/**
	 * @param nombre
	 * @param id
	 * @param apellido
	 * @param salario
	 */
	public AEmpleado(String nombre, String id, String apellido, float salario) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.apellido = apellido;
		this.salario = salario;
	}





	boolean tieneReduccionHoraria() {
		
		return false;
	}
	
	
	

	
	
	
	
	
	
	
	
}
