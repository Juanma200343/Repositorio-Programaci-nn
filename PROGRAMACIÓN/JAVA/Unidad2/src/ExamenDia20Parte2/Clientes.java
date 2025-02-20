package ExamenDia20Parte2;

import java.time.LocalDate;
import java.util.Objects;

public class Clientes {

	String dni;
	String nombre;
	String apellidos;
	int edad;
	LocalDate fechaInscripcion;
	/**
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param fechaInscripcion
	 */
	protected Clientes(String dni, String nombre, String apellidos, int edad, LocalDate fechaInscripcion) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.fechaInscripcion = fechaInscripcion;
	}
	protected String getDni() {
		return dni;
	}
	protected void setDni(String dni) {
		this.dni = dni;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
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
	protected LocalDate getFechaInscripcion() {
		return fechaInscripcion;
	}
	protected void setFechaInscripcion(LocalDate fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellidos, dni, edad, fechaInscripcion, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clientes other = (Clientes) obj;
		return Objects.equals(apellidos, other.apellidos) && Objects.equals(dni, other.dni) && edad == other.edad
				&& Objects.equals(fechaInscripcion, other.fechaInscripcion) && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Clientes [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad
				+ ", fechaInscripcion=" + fechaInscripcion + "]";
	}
	
	
}
