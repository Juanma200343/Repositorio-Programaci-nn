package EjercicioMultiplesHerencias;

public class Persona {

	/**
	 * @param nombre
	 * @param dni
	 */
	public Persona(String nombre, int dni) {
		super();
		this.nombre = nombre;
		
	}
	private String nombre;

	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
