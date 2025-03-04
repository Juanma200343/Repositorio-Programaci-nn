package controlador;

import modelo.*;
 

public class GestionaFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Figura t = new Triangulo("Rojo",5.6,10.1);
	Figura c = new ciirculo("Azul");

	
	System.out.println(t.calculaArea());
	
	System.out.println(c.calculaArea());
	
	}

}
