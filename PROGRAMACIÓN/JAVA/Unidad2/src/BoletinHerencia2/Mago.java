package BoletinHerencia2;

public class Mago extends Personaje {

	protected Mago(String nombre, int nivel, int hp) {
		super(nombre, nivel, hp, "Hechizo");
		// TODO Auto-generated constructor stub
	}
	public boolean esAtacado(Personaje p) {
		
		 return false;
		
	}
	public boolean esAtacado(Personaje p,int distancia) {
		
		 return false;
		
	}
	
}
