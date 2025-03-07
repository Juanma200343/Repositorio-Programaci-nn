package EjercicioMultiplesHerencias;

import java.time.LocalDate;

public class ProfesorTitular extends Profesor {

	public ProfesorTitular(String nombre, int dni, String nombreDepartamento) {
		super(nombre, dni);
		// TODO Auto-generated constructor stub
	}


	

	private LocalDate fechaAdjudicacionPlaza;

	protected LocalDate getFechaAdjudicacionPlaza() {
		return fechaAdjudicacionPlaza;
	}

	protected void setFechaAdjudicacionPlaza(LocalDate fechaAdjudicacionPlaza) {
		this.fechaAdjudicacionPlaza = fechaAdjudicacionPlaza;
	}

	@Override
	public String toString() {
		return "ProfesorTitular [fechaAdjudicacionPlaza=" + fechaAdjudicacionPlaza + ", getNombreDepartamento()="
				+ getNombreDepartamento() + ", toString()=" + super.toString() + ", getNombre()=" + getNombre();
	}
	
	
}
