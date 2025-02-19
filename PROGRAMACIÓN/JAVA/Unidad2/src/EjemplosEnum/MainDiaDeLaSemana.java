package EjemplosEnum;

public class MainDiaDeLaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DiaDeLaSemana dia = DiaDeLaSemana.LUNES;
		
		System.out.println(dia);
		
		for (DiaDeLaSemana dia1 : DiaDeLaSemana.values()){
		if(dia1 == DiaDeLaSemana.MARTES) {
			
			System.out.println("Hoy es martes.");
		}	
		}
		
	}

}
