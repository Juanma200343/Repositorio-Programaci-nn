package controlador;

import modelo.BoletinInterfaces2.*;
public class GestionaProductos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pescado [] pescados = new Pescado[2];

		
		Pescado pescado1 = new Pescado(1, "acedia","De Isla", 10, "Marruecos", 500, 5, TipoDePescado.BLANCO) ;
		System.out.println(pescado1.getCalorias());
		
	}

}
