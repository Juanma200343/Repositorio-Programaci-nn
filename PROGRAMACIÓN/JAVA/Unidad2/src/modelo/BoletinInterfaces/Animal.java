package modelo.BoletinInterfaces;

import java.util.Arrays;

public abstract class Animal {

	String nombreEspecie;
	TipoDeFamilia familia;
	String lugarHabita;
	Animal [] animalesComidos;
	
	
	/**
	 * @param nombreEspecie
	 * @param familia
	 * @param lugarHabita
	 * @param animalesComidos
	 */
	public Animal(String nombreEspecie, TipoDeFamilia familia, String lugarHabita, Animal[] animalesComidos) {
		super();
		this.nombreEspecie = nombreEspecie;
		this.familia = familia;
		this.lugarHabita = lugarHabita;
		this.animalesComidos = animalesComidos;
	}
	
	
	
	
	
	protected String getNombreEspecie() {
		return nombreEspecie;
	}





	protected void setNombreEspecie(String nombreEspecie) {
		this.nombreEspecie = nombreEspecie;
	}





	protected TipoDeFamilia getFamilia() {
		return familia;
	}





	protected void setFamilia(TipoDeFamilia familia) {
		this.familia = familia;
	}





	protected String getLugarHabita() {
		return lugarHabita;
	}





	protected void setLugarHabita(String lugarHabita) {
		this.lugarHabita = lugarHabita;
	}





	protected Animal[] getAnimalesComidos() {
		return animalesComidos;
	}





	protected void setAnimalesComidos(Animal[] animalesComidos) {
		this.animalesComidos = animalesComidos;
	}





	abstract boolean ataca();
	abstract boolean huir();





	@Override
	public String toString() {
		return "Animal [nombreEspecie=" + nombreEspecie + ", familia=" + familia + ", lugarHabita=" + lugarHabita
				+ ", animalesComidos=" + Arrays.toString(animalesComidos) + "]";
	}
	
	
	
	
	

}
