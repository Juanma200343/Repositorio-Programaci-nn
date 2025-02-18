package Practica1;

import java.util.Scanner;

import java.util.Random;

public class PracticaDepuracionEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random ramdom = new Random();
		boolean ganador = false;

		while (!ganador) {
			System.out.println("El humano elige piedra(1), papel(2) o tijera(3) [Salir = 0]:");
			int humano = sc.nextInt();
			int maquina = ramdom.nextInt(0, 2);
			String elec_maquina = "";
			
			if (maquina == 0) {
				elec_maquina = "PIEDRA";
			
			}
			
			else if (maquina == 1){
				elec_maquina = "PAPEL";
			}
			
			else if (maquina == 2) {
				elec_maquina = "TIJERA";
			
				
			}
			
			else 
				System.out.println("Error");
			
			switch (maquina) {
			case 0:
				String elec_maquina1 = "PIEDRA";
				break;

			case 1:
				elec_maquina1 = "PAPEL";
				break;

			case 2:
				elec_maquina1 = "TIJERA";
				break;

			default:
				System.out.println("Opcion no valido");
				break;
			

			switch (humano) {
			case 0:
				System.out.println("Salir del programa");
				break;

			case 1:
				System.out.println("PIEDRA");
				if (elec_maquina1 == "PIEDRA") {

					System.out.println("Has empatado");

					break;

				}

			case 2:
				System.out.println("PAPEL");
				if (elec_maquina1 == "PIEDRA")
					System.out.println("Has ganado");
				
				else if(elec_maquina1 == "PAPEL")
				System.out.println("Has empatado");
				
				
				else {
					System.out.println("Has perdido. La maquina ha sacado tijera");
					
					break;
				}
			case 3:
				System.out.println("TIJERA");
				if (elec_maquina1 == "PAPEL")
					System.out.println("Has ganado");
				
				else if (elec_maquina1 == "TIJERA")
					System.out.println("Has empatado");
			
				else 
					System.out.println("Has perdido. La maquina ha sacado Piedra.");
			
					break;
			
			
			}

		}

	 }
	
	}
	

