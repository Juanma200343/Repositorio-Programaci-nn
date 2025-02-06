/**
 * 
 */
package orientacionAObjeto;

/**
 * 
 */
public class GestionaAlumno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Alumnos pepe = new Alumnos();
		pepe.nombre = "Pepe";
		pepe.dni = "54888361Q";
		pepe.nota = (float) 5;
	
		Alumnos susana = new Alumnos();
		susana.nombre = "Susana";
		susana.dni = "54693361Q";
		susana.nota = (float) 4;
		
		String cadenapepe = pepe.pasoACadena();
		System.out.println(cadenapepe);
		
		String cadenasusana = susana.pasoACadena();
		System.out.println(cadenasusana);
	
	boolean apruebaPepe = pepe.estaAprobado();
		System.out.println(apruebaPepe);
	
	}
	
	
	
}
