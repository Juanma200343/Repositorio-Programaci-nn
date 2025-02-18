package TareaEvaluable18Febrero;

import java.util.Objects;

public class Empresa {
	String nombre;
	String dni;
	int salario;
	/**
	 * @param nombre
	 * @param dni
	 * @param salario
	 * @param productividad 
	 */
	protected Empresa(String nombre, String dni, int salario) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
	}
	
	
	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", dni=" + dni + ", salario=" + salario + "]";
	}


	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getDni() {
		return dni;
	}
	protected void setDni(String dni) {
		this.dni = dni;
	}
	protected int getSalario() {
		return salario;
	}
	protected void setSalario(int salario) {
		this.salario = salario;
	}


	@Override
	public int hashCode() {
		return Objects.hash(dni, nombre, salario);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre) && salario == other.salario;
	}
	
	
	
	
	
	
}
