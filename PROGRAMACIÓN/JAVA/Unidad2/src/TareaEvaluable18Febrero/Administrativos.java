package TareaEvaluable18Febrero;

import java.util.Objects;

public class Administrativos extends Empresa {

	int productividad;
	
	/**
	 * @param nombre
	 * @param dni
	 * @param salario
	 * @param productividad
	 */
	protected Administrativos(String nombre, String dni, int salario, int productividad) {
		super(nombre, dni, salario);
		this.productividad = productividad;
	}


	protected int getProductividad() {
		return productividad;
	}

	protected void setProductividad(int productividad) {
		this.productividad = productividad;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(productividad);
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
		Administrativos other = (Administrativos) obj;
		return productividad == other.productividad;
	}

	@Override
	public String toString() {
		return "Administrativos [productividad=" + productividad + ", getNombre()=" + getNombre() + ", getDni()="
				+ getDni() + ", getSalario()=" + getSalario() + "]";
	}


	public int salarioTotal() {
		int salarioTotal =  salario + productividad;
		return salarioTotal;
	}
	
	
}
