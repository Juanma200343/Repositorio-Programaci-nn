package SimulacrosExamen;

import java.util.Random;
import java.util.Scanner;

//Función 1

/*Esta funcion se llama Imprimemenu donde en esta tendremos un menu donde tendra las siguientes opciones. Apostar, Mostrar Historial y Retirarse*/

public class SimulacroExamenT1yT2 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	System.out.println("Tira los dados");
	Random numAleatorio = new Random();
	int dado1 = numAleatorio.nextInt(6)+1;	
	int dado2 = numAleatorio.nextInt(6)+1;	

	
	
	int opcion= imprimeMenu(sc);
	switch (opcion)
		{
			case 1:
				
				break;
				
			case 2:
			
				
		}
	}
	
	int imprimeMenu(Scanner sc)
	{
		
		//syso
		//leer opcion
		return opcion;
	}

}
