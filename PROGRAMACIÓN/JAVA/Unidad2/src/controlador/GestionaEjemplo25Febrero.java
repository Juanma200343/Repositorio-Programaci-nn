package controlador;

import java.util.Scanner;

import modelo.Ejemplo25Febrero;

public class GestionaEjemplo25Febrero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*int contador = 0;
	Ejemplo25Febrero p1 = new Ejemplo25Febrero("Pepe",20,0);
	System.out.println(p1);
	

	Ejemplo25Febrero p2 = new Ejemplo25Febrero("Pepa",18,0);
	System.out.println(p1);*/

	/*Scanner sc = new Scanner(System.in);
	String dni;
	System.out.println("Introduce una cadena");
	
	while(!dni.equals("fin")) {
		if (Ejemplo25Febrero.validaSiDniValido(dni)) {
			System.out.println("DNI valido");
		}
		
		else {
			System.out.println("DNI no valido"); 
		}
	
		System.out.println("Introduce una cadena para poner fin: ");
		String dni = sc.nextLine();
	}	*/
	
		GestionaEjemplo25Febrero g = new GestionaEjemplo25Febrero();
		g.imprimeNoEstatico();
		GestionaEjemplo25Febrero.imprimeEstatico();
		
	}
	
	void imprimeNoEstatico() {
		System.out.println("No estatico");
		
	}
	
	static void  imprimeEstatico() {
		System.out.println("Es estatico");
		
	}

}
