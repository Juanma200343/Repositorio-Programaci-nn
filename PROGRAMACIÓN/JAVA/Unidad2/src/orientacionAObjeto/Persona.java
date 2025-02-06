package orientacionAObjeto;

public class Persona {

	/**
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param edad
	 */
	public Persona(String nombre, String apellido, String dni, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.edad = edad;
	}

	String nombre;
	String apellido;
	String dni;
	float edad;
	


	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}
	
	
}
