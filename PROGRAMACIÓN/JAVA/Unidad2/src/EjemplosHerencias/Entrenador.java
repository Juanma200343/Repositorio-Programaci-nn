package EjemplosHerencias;

public class Entrenador {

	private String nombre;
	private String email;
	private String apellidos;
	private int edad;
	private float salario;
	String idFederacion;
	
	
	/**
	 * @param idFederacion
	 */
	protected Entrenador(String nombre, String email, String apellidos, int edad, float salario, String idFederacion) {
		super();
		this.idFederacion = idFederacion;
		this.nombre = nombre;
		this.email = email;
		this.apellidos = apellidos;
		this.edad = edad;
		this.salario = salario;
	}
	
	
	protected Entrenador(String idFederacion) {
		super();
		this.idFederacion = idFederacion;
	}

	/**
	 * @param nombre
	 * @param email
	 * @param apellidos
	 * @param edad
	 * @param salario
	 */
	protected Entrenador(String nombre, String email, String apellidos, int edad, float salario) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.apellidos = apellidos;
		this.edad = edad;
		this.salario = salario;
	}


	protected String getIdFederacion() {
		return idFederacion;
	}

	protected void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	protected void viajar() {
		System.out.println("Viajar Entrenador");
		
		
	}
	
	protected void concentrarseEntrenador() {
		System.out.println("El entrenador se concentra");
	}

	@Override
	public String toString() {
		return "Entrenador [nombre=" + nombre + ", email=" + email + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", salario=" + salario + ", idFederacion=" + idFederacion + "]";
	}
	
	protected void dirigirPartido() {
		System.out.println("El entrenador es el que dirige el partido");
	}
	
}
