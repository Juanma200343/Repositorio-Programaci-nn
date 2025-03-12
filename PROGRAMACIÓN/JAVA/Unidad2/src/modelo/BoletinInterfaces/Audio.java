package modelo.BoletinInterfaces;

public class Audio extends ElementosMultimedia {

	public Audio(String id, String ubicacion, int diasPrestados,String nombre,String genero,int duracion) {
		super(id, ubicacion, nombre, genero, diasPrestados,duracion);
		// TODO Auto-generated constructor stub
		this.diasPrestados = 10; 
	}

	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
	
}
