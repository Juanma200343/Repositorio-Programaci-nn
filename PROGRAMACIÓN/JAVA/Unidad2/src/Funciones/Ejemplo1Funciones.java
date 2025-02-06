package Funciones;

import java.util.Scanner;

public class Ejemplo1Funciones {

	public static void main(String[] args) {

		Ejemplo1Funciones f = new Ejemplo1Funciones();
		// int resultado = f.SumaNum(4,7);
		// System.out.println(resultado);
		String[] tablaNombres = f.generaLista();
		System.out.println(tablaNombres);
		System.out.println(nombres[i]);
		for (String x : listaNombre) {
			System.out.println(x);
		}
	}

	public static int SumaNum(int num1, int num2) {

		return num1 + num2;

	}

	String[] generaLista() {
		String[] nombres = new String[5];
		Scanner sc = new Scanner(System.in);

		System.out.println("Dame un nombre: ");

		for (int i = 0; i < nombres.length; i++) {
	String nombre = sc.next();
	nombres[i]= nombre;

		}
		return nombres;
	}
}
