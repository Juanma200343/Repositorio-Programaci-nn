package EjemplosHerencias;

public class GestionaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p = new Persona("Pepe", "pepe23@gmail.com","apellido",23,20000);
		System.out.println(p.toString());
		
		Persona p2 = new Persona("Antonio", "antonio@gmail.com", "rodriguez", 14, 10000);
		System.out.println(p.equals(p2));	
		
		Entrenador e = new Entrenador("Pepe", "pepe23@gmail.com","apellido",23,20000,"pepitopalote");
		System.out.println(e.toString());
		
		Entrenador h = new Entrenador("Pepe", "pepe23@gmail.com","apellido",23,20000,"pepitopalote");
		
		//e.viajar();
	//	p2.viajar();
		//p.viajar();
	//	e.dirigirPartido();
		//Entrenador p2toEntrenador = (Entrenador)h;
		//h.dirigirPartido();
	
	/*p.concentrarse();
	p.concentrarse2("Sevilla");
	p.concentrarse3(15);*/
	
	}

	
	
}
