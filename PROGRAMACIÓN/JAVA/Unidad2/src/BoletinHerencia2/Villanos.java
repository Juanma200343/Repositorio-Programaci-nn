package BoletinHerencia2;

public class Villanos extends Personaje {

	protected Villanos(String nombre, int nivel, int hp) {
		super(nombre, nivel, hp,"");
		// TODO Auto-generated constructor stub
	}
	
	public boolean esAtacado(Personaje p,int distancia) {
		
		 return true;
		
	}
	

}
