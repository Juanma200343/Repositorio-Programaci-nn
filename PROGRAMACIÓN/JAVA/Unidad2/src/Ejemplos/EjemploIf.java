package Ejemplos;

import java.util.Scanner;

public class EjemploIf {

	public static void main(String[] args) {
System.out.println("Dame un numero: ");
		Scanner miEscaner = new Scanner(System.in);
		int numero = miEscaner.nextInt();
		if (numero >7) {
			System.out.println("Es mayor que 7");
		}
		else {
			System.out.println("Es menor que 7");
		}

	}

}
