package modelo.Boletin1Abril;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ReservaAnimal implements Comparable <Animal>  {

	private String nombre;
	private String lugar;
	private double presupuesto_anual;
	private List <Animal> ListaAnimales;
	
	


	public ReservaAnimal(String nombre, String lugar, double presupuesto_anual, List<Animal> listaAnimales) {
		super();
		this.nombre = nombre;
		this.lugar = lugar;
		this.presupuesto_anual = presupuesto_anual;
		ListaAnimales = new LinkedList<Animal>();
	}

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}




	public double getPresupuesto_anual() {
		return presupuesto_anual;
	}







	public void setPresupuesto_anual(double presupuesto_anual) {
		this.presupuesto_anual = presupuesto_anual;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ListaAnimales, lugar, nombre, presupuesto_anual);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReservaAnimal other = (ReservaAnimal) obj;
		return Objects.equals(ListaAnimales, other.ListaAnimales) && Objects.equals(lugar, other.lugar)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(presupuesto_anual) == Double.doubleToLongBits(other.presupuesto_anual);
	}

	
	@Override
	public int compareTo(Animal o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.getNombre());
	}

	
	
	
	
}
