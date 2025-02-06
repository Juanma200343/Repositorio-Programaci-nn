package Ejemplos;

import java.util.Scanner;

public class EjercicioEjemploDescuento {

	public static void main(String[] args) {
		Scanner miEscaner = new Scanner(System.in);
		System.out.println("Dime tu edad: ");
		double descuento;
		int edad = miEscaner.nextInt();
		/*if (edad >60)
		{
			
		 descuento = 0.3;
			
		}
		
		else 
		{
			 descuento = 0.1;
		
		}*/
		
		descuento = (edad > 60) ? 0.3 : 0.1;
		
		
		System.out.println("Precio del producto: "); 
		
		int precio = miEscaner.nextInt();
		
		double total = precio -(precio * descuento);
		
		System.out.println("El precio final es: " + total);
		
		
		
		miEscaner.close();
		
		
		
		
	}

}
