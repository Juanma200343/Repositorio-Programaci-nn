package EjemplosHerencias;

public class Entrenador {

	/**
	 * @param idFederacion
	 */
	protected Entrenador(String idFederacion) {
		super();
		this.idFederacion = idFederacion;
	}
	
	protected Entrenador() {
		super();
		
	}
	
	String idFederacion;

	protected String getIdFederacion() {
		return idFederacion;
	}

	protected void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	
	
	
	
}
