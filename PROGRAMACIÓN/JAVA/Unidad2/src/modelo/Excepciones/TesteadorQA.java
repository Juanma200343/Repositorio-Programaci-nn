package modelo.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteadorQA {

		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingresa un número entero: ");
	        try {
	        	int numero = scanner.nextInt();
	        	System.out.println("Detras del input");
	        }
	        
	        catch (InputMismatchException e)
	        {
	        System.out.println("Entra en el catch");	
	        }
	       finally {
	    	   System.out.println("Pase lo que pase, salgo");
	       }
	        scanner.close();
	
	
	}

}
