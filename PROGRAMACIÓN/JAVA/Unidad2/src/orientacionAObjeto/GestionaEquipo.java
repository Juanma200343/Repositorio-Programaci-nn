package orientacionAObjeto;

public class GestionaEquipo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1 = new Persona("Andrea" , "Perea","12345678c",18);
		Persona p2 = new Persona("Luis" , "Perea","12345679d",22);
		Persona p3 = new Persona("David" , "Perez","22345678c",23);
		Persona p4 = new Persona("Sebastian" , "Rodriguez","28145678c",19);

		Persona[] personas1 ={p1,p2};
		Persona[] personas2 ={p3,p4};
		int [] puntuaciones1 = {7,14,22};
		int [] puntuaciones2 = {40,12,3};

		Equipo equipo1 = new Equipo("equipo1", puntuaciones1,personas1);
		System.out.println(equipo1);
		for (int i = 0; )
		
		
		
		
	}

}
