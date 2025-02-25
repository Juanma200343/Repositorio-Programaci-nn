package modelo;

import java.util.Objects;

public class Ejemplo25Febrero {
	private static final double PI = 3.1416;
	String nombre;
	int edad;
	private static int contador;
	int indentificador;

	/**
	 * @param nombre
	 * @param edad
	 * @param contador
	 * @param indentificador
	 */
	public Ejemplo25Febrero(String nombre, int edad, int indentificador) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		contador = contador+1;
		this.indentificador = this.contador+1;
	
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(contador, edad, indentificador, nombre);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ejemplo25Febrero other = (Ejemplo25Febrero) obj;
		return contador == other.contador && edad == other.edad && indentificador == other.indentificador
				&& Objects.equals(nombre, other.nombre);
	}




	protected String getNombre() {
		return nombre;
	}




	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}




	protected int getEdad() {
		return edad;
	}




	protected void setEdad(int edad) {
		this.edad = edad;
	}




	protected int getContador() {
		return contador;
	}




	protected void setContador(int contador) {
		this.contador = contador;
	}




	protected int getIndentificador() {
		return indentificador;
	}




	protected void setIndentificador(int indentificador) {
		this.indentificador = indentificador;
	}




	@Override
	public String toString() {
		return "Ejemplo25Febrero [nombre=" + nombre + ", edad=" + edad + ", contador=" + contador + ", indentificador="
				+ indentificador + "]";
	}

	
	public static boolean validaSiDniValido(String dni) {
		boolean valido = false;
		if (dni.matches("\\d{8}[A-Za-z]{1}")) {
			valido = true;
		} else {
			System.out.println("Error, dni no válido");
			valido = false;
		}
		return valido;
	}

	
}
