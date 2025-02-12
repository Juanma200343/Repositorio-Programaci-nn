package EjemplosHerencias;

public class GestionaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p = new Persona("Pepe", "pepe23@gmail.com","apellido",23,20000);
		System.out.println(p.toString());
		
		Persona p2 = new Persona("Antonio", "antonio@gmail.com", "rodriguez", 14, 10000);
		System.out.println(p.equals(p2));	
		
	
	}

	
	
}
