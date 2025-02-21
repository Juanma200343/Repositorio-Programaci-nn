package Boletin3OrientacionAObjeto;

import java.time.LocalDate;

public class Persona {

	/**
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param fecha_Nacimiento
	 */
	public Persona(String dni, String nombre, String apellidos, LocalDate fecha_Nacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.Fecha_Nacimiento = fecha_Nacimiento;
		this.setDni(dni);
	}
	
	
	private String dni;
	private String nombre , apellidos;
	private LocalDate Fecha_Nacimiento;

	
	
	
	public String getDni() {
		return dni;
	}
	
	
	
	public void setDni(String dni) {
		String numero = "10107896x";
		System.out.println(numero.matches("\\d{8}[A-Za-z]{1}"));
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public LocalDate getFecha_Nacimiento() {
		return Fecha_Nacimiento;
	}
	public void setFecha_Nacimiento(LocalDate fecha_Nacimiento) {
		Fecha_Nacimiento = fecha_Nacimiento;
	}

	
	
}
