package TareaEvaluable18Febrero;

import java.util.Objects;

final public class Directivos extends Empresa {
	
	int porcentajesalario;
	
	protected Directivos(String nombre, String dni, int salario) {
		super(nombre, dni, salario);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param dni
	 * @param salario
	 * @param porcentajesalario
	 */
	protected Directivos(String nombre, String dni, int salario, int porcentajesalario) {
		super(nombre, dni, salario);
		this.porcentajesalario = porcentajesalario;
	}

	protected int getPorcentajesalario() {
		return porcentajesalario;
	}

	protected void setPorcentajesalario(int porcentajesalario) {
		this.porcentajesalario = porcentajesalario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(porcentajesalario);
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Directivos other = (Directivos) obj;
		return Objects.equals(porcentajesalario, other.porcentajesalario);
	}

	@Override
	public String toString() {
		return "Directivos [porcentajesalario=" + porcentajesalario + ", getNombre()=" + getNombre() + ", getDni()="
				+ getDni() + ", getSalario()=" + getSalario() + "]";
	}

	int salarioTotalDirectivo() {
		int salarioTotalDirectivo = salario + porcentajesalario;
		return salarioTotalDirectivo;
	}
	
}
