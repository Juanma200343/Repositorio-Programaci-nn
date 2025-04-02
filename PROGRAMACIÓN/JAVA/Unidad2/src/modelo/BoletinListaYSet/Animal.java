package modelo.Boletin1Abril;

import java.time.LocalDate;
import java.util.Objects;

public class Animal {

	private String id;
	private String nombre;
	private String especie;
	private int edad;
	private LocalDate fecha_nacimiento;
	private double peso;
	private Medio medio;
	private clasificacionComida comida;
	private clasificacionGestacion gestacion;
	


	public Animal(String id, String nombre, String especie, int edad, LocalDate fecha_nacimiento, double peso,
			Medio medio, clasificacionComida comida, clasificacionGestacion gestacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.especie = especie;
		this.edad = edad;
		this.fecha_nacimiento = fecha_nacimiento;
		this.peso = peso;
		this.medio = medio;
		this.comida = comida;
		this.gestacion = gestacion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public clasificacionComida getComida() {
		return comida;
	}

	public void setComida(clasificacionComida comida) {
		this.comida = comida;
	}

	public clasificacionGestacion getGestacion() {
		return gestacion;
	}

	public void setGestacion(clasificacionGestacion gestacion) {
		this.gestacion = gestacion;
	}

	public Medio getMedio() {
		return medio;
	}

	public void setMedio(Medio medio) {
		this.medio = medio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(comida, edad, especie, fecha_nacimiento, gestacion, id, medio, nombre, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return comida == other.comida && edad == other.edad && Objects.equals(especie, other.especie)
				&& Objects.equals(fecha_nacimiento, other.fecha_nacimiento) && gestacion == other.gestacion
				&& Objects.equals(id, other.id) && medio == other.medio && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso);
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nombre=" + nombre + ", especie=" + especie + ", edad=" + edad
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", peso=" + peso + ", medio=" + medio + ", comida="
				+ comida + ", gestacion=" + gestacion + "]";
	}

	
	
	
	
	
	
}
