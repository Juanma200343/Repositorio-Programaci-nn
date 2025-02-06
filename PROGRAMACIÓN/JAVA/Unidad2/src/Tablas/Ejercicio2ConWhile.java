package Tablas;

public class Ejercicio2ConWhile {

	public static void main(String[] args) {
	String diasSemana [] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};

		int pos = 0;
		
		while(!diasSemana[pos].equals("Miercoles"))
		{
			System.out.println(diasSemana[pos]);
			
			pos++;
		}
		
		
		
		
		
	}

}
