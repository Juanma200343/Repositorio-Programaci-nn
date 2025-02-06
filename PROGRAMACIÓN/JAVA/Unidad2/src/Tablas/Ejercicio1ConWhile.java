package Tablas;

public class Ejercicio1ConWhile {

	public static void main(String[] args) {

		String diasSemana [] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		
		int pos = 0;


		 while (pos < diasSemana.length) {


		 if (pos < 5) {


		 System.out.println("Laborables" + diasSemana [pos]);


		 }


		 else {


		 System.out.println("Festivales" + diasSemana [pos]);


		 }


		 pos = pos +1;


		 }
	}

}
