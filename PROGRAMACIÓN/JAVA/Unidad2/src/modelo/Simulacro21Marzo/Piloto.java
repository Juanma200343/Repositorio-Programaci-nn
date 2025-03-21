package modelo.Simulacro21Marzo;

public class Piloto implements IVuelo {

	String nombre;
	String nacionalidad;
	int edad;
	String numLicencias;
	Vuelo [] totalVuelos; 
	int toralHoras;
	
	
	
	/**
	 * @param nombre
	 * @param nacionalidad
	 * @param edad
	 * @param numLicencias
	 * @param totalVuelos
	 */
	public Piloto(String nombre, String nacionalidad, int edad, String numLicencias) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.numLicencias = numLicencias;
		this.totalVuelos = new Vuelo[30];
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getNumLicencias() {
		return numLicencias;
	}


	public void setNumLicencias(String numLicencias) {
		this.numLicencias = numLicencias;
	}


	public Vuelo[] getTotalVuelos() {
		return totalVuelos;
	}


	public void setTotalVuelos(Vuelo[] totalVuelos) {
		this.totalVuelos = totalVuelos;
	}

	
	
	
	
	

	public int getToralHoras() {
		return toralHoras;
	}


	public void setToralHoras(int toralHoras) {
		this.toralHoras = toralHoras;
	}


	@Override
	public String operaVuelo() {
		// TODO Auto-generated method stub
		
		
		return "";
	}


	@Override
	public double getDuracionVuelo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

	
}
