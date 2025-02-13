package BoletinHerencia2;

import java.util.Objects;

public class Personaje {

	String nombre;
	int nivel;
	int hp;
	String arma;
	/**
	 * @param nombre
	 * @param nivel
	 * @param hp
	 * @param arma
	 */
	protected Personaje(String nombre, int nivel, int hp, String arma) {
		super();
		this.nombre = nombre;
		this.nivel = nivel;
		this.hp = hp;
		this.arma = arma;
	}
	
	
	protected String getNombre() {
		return nombre;
	}
	
	
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	protected int getNivel() {
		return nivel;
	}
	
	protected void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	protected int getHp() {
		return hp;
	}
	
	protected void setHp(int hp) {
		this.hp = hp;
	}
	

	protected String getArma() {
		return arma;
	}
	
	protected void setArma(String arma) {
		this.arma = arma;
	}
	
	
	@Override
	public String toString() {
		return "Personaje [nombre=" + nombre + ", nivel=" + nivel + ", hp=" + hp + ", arma=" + arma + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(arma, hp, nivel, nombre);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(arma, other.arma) && hp == other.hp && nivel == other.nivel
				&& Objects.equals(nombre, other.nombre);
	}
	
	public boolean esAtacado(Personaje p) {
		
		 return true;
		
	}
	public boolean esAtacado(Personaje p,int distancia) {
		
		 return true;
		
	}
	
	
}
