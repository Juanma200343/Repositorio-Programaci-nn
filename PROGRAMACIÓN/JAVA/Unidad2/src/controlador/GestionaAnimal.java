package controlador;

import modelo.*;


public class GestionaAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Animal p = new Perro();
	Animal g = new Gato();
	Animal pez = new Pez();
	
	
	
	
	System.out.println(p.getSonidoQueEmite());
	System.out.println(p.getAlimento());
	
	System.out.println(g.getSonidoQueEmite());
	System.out.println(g.getAlimento());
	
	System.out.println(pez.getSonidoQueEmite());
	System.out.println(pez.getAlimento());
	
	}

}
