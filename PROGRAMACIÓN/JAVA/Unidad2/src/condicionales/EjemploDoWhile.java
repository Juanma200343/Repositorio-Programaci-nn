package condicionales;

import java.util.Scanner;

public class EjemploDoWhile {

	public static void main(String[] args) {
		Scanner miEscaner = new Scanner(System.in);
		int opcion = miEscaner.nextInt();
		
		do 
			System.out.println("1.Asignar coche a surtidor y repostar ")
			System.out.println("2.Consultar estado de surtidores " );
			System.out.println("3.Asignar precio al surtidor.");
			System.out.println("4.Recargar surtidor. ");
			System.out.println("5.Cerrar el programa y salir. ");
			
		switch (opcion) {
		
        case "1":
        	System.out.println("Asigna al surtidor:")
        		break;
        case "2": print (f"Consulta de surtidor:",consulsur())
        case "3": print (f"Asigna precio:",asignapre())
        case"4": print (f"Recarga surtidor:",recargasur())
        case"5": print (f"Cerrar menu:",cerrarmen())
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
