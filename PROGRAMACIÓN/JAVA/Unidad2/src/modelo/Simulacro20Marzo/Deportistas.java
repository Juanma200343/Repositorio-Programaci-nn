package modelo.Simulacro20Marzo;

import java.time.LocalDate;
import java.util.Arrays;

import modelo.Simulacro19Marzo.ICompeticion;

public class Deportistas implements ICompeticion {

	String nombre;
	String pais;
	int edad;
	double peso;
	double altura;
	Pruebas [] pruebas;
	/**
	 * @param nombre
	 * @param pais
	 * @param edad
	 * @param peso
	 * @param altura
	 * @param pruebas
	 */
	public Deportistas(String nombre, String pais, int edad, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.pruebas = new Pruebas[50];
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public Pruebas[] getPruebas() {
		return pruebas;
	}
	public void setPruebas(Pruebas[] pruebas) {
		this.pruebas = pruebas;
	}

	@Override
	public String competir() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getTiempoPrueba() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public Pruebas getPruebaMasCercana() {
		Pruebas p = null;
		for(int i = 0; i< pruebas.length; i++ ) {
			if(p != null && pruebas[i].equals(Estado.PLANIFICADA))
			
				
		}
		return p;
		
	}
	
	
	
	
	public int getHorasEntrenamiento(LocalDate fecha) {
		int numDias = 0;
		
		
		return numDias;
		
	}

	@Override
	public String toString() {
		return "Deportistas [nombre=" + nombre + ", pais=" + pais + ", edad=" + edad + ", peso=" + peso + ", altura="
				+ altura + ", pruebas=" + Arrays.toString(pruebas) + "]";
	}
	

	
	
}
