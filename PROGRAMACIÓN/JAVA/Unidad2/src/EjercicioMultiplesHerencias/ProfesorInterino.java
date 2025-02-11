package EjercicioMultiplesHerencias;

import java.time.LocalDate;

public class ProfesorInterino extends Profesor {

	


	/**
	 * @param nombre
	 * @param dni
	 * @param fechaFinContrato
	 */
	public ProfesorInterino(String nombre, int dni, LocalDate fechaFinContrato) {
		super(nombre, dni);
		this.fechaFinContrato = fechaFinContrato;
	}


	private LocalDate fechaFinContrato;

	protected LocalDate getFechaFinContrato() {
		return fechaFinContrato;
	}

	protected void setFechaFinContrato(LocalDate fechaFinContrato) {
		this.fechaFinContrato = fechaFinContrato;
	}

	@Override
	public String toString() {
		return "ProfesorInterino [fechaFinContrato=" + fechaFinContrato + ", getNombreDepartamento()="
				+ getNombreDepartamento() + ", getNombre()=" + getNombre() ;
	}
	
}
