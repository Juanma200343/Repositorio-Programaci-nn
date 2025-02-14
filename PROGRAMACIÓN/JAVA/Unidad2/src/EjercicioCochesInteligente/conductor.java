package EjercicioCochesInteligente;

import java.util.Objects;

public class conductor {
	
	private String nombre;
	private int anyo;

	/**
	 * @param nombre
	 * @param anyo
	 */
	public conductor(String nombre, int anyo) {
		super();
		this.nombre = nombre;
		//this.anyo = getAnyo();
		setAnyo(anyo);
	}

	
	protected void conducir(){
		
		
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected int getAnyo() {
		return anyo;
	}

	protected void setAnyo(int anyo) {
		if(anyo > 0)
		this.anyo = anyo;
		
		else {
			
			this.anyo = 0;
		}
		
		
	}


	@Override
	public int hashCode() {
		return Objects.hash(anyo, nombre);
	}

	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		conductor other = (conductor) obj;
		return anyo == other.anyo && Objects.equals(nombre, other.nombre);
	}

	
	@Override
	public String toString() {
		return "conductor [nombre=" + nombre + ", anyo=" + anyo + "]";
	}
	
	
}
