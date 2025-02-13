package BoletinHerencia2;

public class Caballero extends Personaje {

	protected Caballero(String nombre, int nivel, int hp) {
		super(nombre, nivel, hp,"Espada");
		// TODO Auto-generated constructor stub
	}
	public boolean esAtacado(Personaje p) {
		boolean atacado;
		if (p instanceof Mago)
		 	atacado = true;
		
		else if(p instanceof Arquero) {
			
			atacado = true;
		} 
		
		
		else {
			atacado=false;
		}
		return atacado;
		
		
	}
}
