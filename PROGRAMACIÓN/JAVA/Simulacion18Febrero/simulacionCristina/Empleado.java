package simulacion1;

import java.util.Objects;

public class Empleado {
	protected String nombre;
	protected String DNI;
	private double salarioBase;
	
	
	public Empleado(String nombre, String dNI, double salarioBase) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		setSalarioBase(salarioBase);
	}


	protected String getNombre() {
		return nombre;
	}


	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}


	protected String getDNI() {
		return DNI;
	}


	protected void setDNI(String dNI) {
		DNI = dNI;
	}


	protected double getSalarioBase() {
		return salarioBase;
	}


	protected void setSalarioBase(double salarioBase) {
		if (salarioBase > 0) {
			this.salarioBase = salarioBase;
		}else {
			System.out.println("Error, se asigna SMI");
			this.salarioBase = 1134;
		}
	}
		
	@Override
	public int hashCode() {
		return Objects.hash(DNI, nombre, salarioBase);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(DNI, other.DNI) && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(salarioBase) == Double.doubleToLongBits(other.salarioBase);
	}


	@Override
	public String toString() {
		return "empleado [nombre=" + nombre + ", DNI=" + DNI + ", salarioBase=" + salarioBase + "]";
	}
	
	

}
