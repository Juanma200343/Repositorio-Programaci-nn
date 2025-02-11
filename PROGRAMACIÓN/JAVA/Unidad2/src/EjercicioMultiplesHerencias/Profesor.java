package EjercicioMultiplesHerencias;

import java.time.LocalDate;

public class Profesor extends Persona {

	public Profesor(String nombre, int dni) {
		super(nombre, dni);
		// TODO Auto-generated constructor stub
	}



	private String nombreDepartamento;

	protected String getNombreDepartamento() {
		return nombreDepartamento;
	}

	protected void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	@Override
	public String toString() {
		return "Profesor [nombreDepartamento=" + nombreDepartamento + ", getNombre()=" + getNombre() ;
	}
	
	
	
	
}
