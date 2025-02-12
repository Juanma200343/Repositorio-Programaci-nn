package EjemplosHerencias;

import java.util.Objects;

public class Persona {

	/**
	 * @param nombre
	 * @param email
	 */
	protected Persona(String nombre, String email, String apellidos, int edad, float salario) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.apellidos = apellidos;
		this.edad = edad;
		this.salario = salario;
	}
	
	protected Persona(String nombre2, String email2, String apellidos2, int edad2, int salario2) {
		// TODO Auto-generated constructor stub
	}

	private String nombre;
	private String email;
	private String apellidos;
	private int edad;
	private float salario;
	
	protected String getNombre() {
		return nombre;
	}
	
	
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getEmail() {
		return email;
	}
	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getApellidos() {
		return apellidos;
	}


	protected void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	protected int getEdad() {
		return edad;
	}


	protected void setEdad(int edad) {
		this.edad = edad;
	}
	

	protected float getSalario() {
		return salario;
	}


	protected void setSalario(float salario) {
		this.salario = salario;
	}
	

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", email=" + email + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", salario=" + salario + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(apellidos, edad, email, nombre, salario);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellidos, other.apellidos) && edad == other.edad && Objects.equals(email, other.email)
				&& Objects.equals(nombre, other.nombre)
				&& Float.floatToIntBits(salario) == Float.floatToIntBits(other.salario);
	}
	
	
	protected void concentrarse() {
		
	}

	protected void viajar() {
		
	}

	
}
