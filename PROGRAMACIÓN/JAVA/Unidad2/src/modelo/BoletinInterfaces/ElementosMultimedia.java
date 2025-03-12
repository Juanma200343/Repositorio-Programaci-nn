package modelo.BoletinInterfaces;

public  class ElementosMultimedia extends Recursos{

	String nombre;
	String genero;
	int diasPrestamo;
	int duracion;

	/**
	 * @param id
	 * @param ubicacion
	 * @param diasPrestados
	 */
	public ElementosMultimedia(String id, String ubicacion,String nombre,String genero, int diasPrestamo,int duracion) {
		super(id, ubicacion);
		this.nombre = nombre;
		this.genero = genero;
		this.diasPrestamo = 10;
		this.duracion = duracion;
	}

	
	@Override
	public int getDevuelveDiasPrestados() {
		// TODO Auto-generated method stub
		return this.diasPrestamo;
	}


	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
