package modelo.Examen25Marzo;

import java.util.Objects;

public class Ciudad {

	String nombre;
	int numHabitantes;
	/**
	 * @param nombre
	 * @param numHabitantes
	 */
	protected Ciudad(String nombre, int numHabitantes) {
		super();
		this.nombre = nombre;
		this.numHabitantes = numHabitantes;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		System.out.println("El nombre es el mismo");
		
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ciudad other = (Ciudad) obj;
		return Objects.equals(nombre, other.nombre);
	}





}
