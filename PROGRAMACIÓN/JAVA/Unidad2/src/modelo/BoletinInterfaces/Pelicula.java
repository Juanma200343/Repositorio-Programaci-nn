package modelo.BoletinInterfaces;

public class Pelicula extends ElementosMultimedia {

	public Pelicula(String id, String ubicacion, int diasPrestados,String nombre, String genero,int duracion) {
		super(id, ubicacion,genero,nombre,diasPrestados,duracion);
		// TODO Auto-generated constructor stub
		this.diasPrestados = 10;
	}

	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getDevuelveDiasPrestados() {
		// TODO Auto-generated method stub
		return this.diasPrestados;
	}



	
	
}
