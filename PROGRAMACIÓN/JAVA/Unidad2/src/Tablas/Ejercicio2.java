package Tablas;

public class Ejercicio2 {

	public static void main(String[] args) {
		String diasSemana [] = {"Lunes","Martes","Miercoles0","Jueves","Viernes","Sabado","Domingo"};
		
		for (int laborable = 0; laborable < diasSemana.length; laborable++)
				
			
			if (laborable < 5)
			
				{
					System.out.println("Es laborable: " + diasSemana[laborable]);
				}
		
			else {
				System.out.println("Festivo: " + diasSemana[laborable]);
			}
		
				
				
				
				
				
				
				
	}

}
