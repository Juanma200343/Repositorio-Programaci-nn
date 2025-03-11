package modelo.BoletinInterfaces;

public class Peliculas extends ElementosMultimedia {

	public Peliculas(String id, String ubicacion, int diasPrestados) {
		super(id, ubicacion,diasPrestados);
		// TODO Auto-generated constructor stub
		this.diasPrestados = 10;
	}

	@Override
	public boolean estaDisponible() {
		// TODO Auto-generated method stub
		return super.estaDisponible();
	}

	@Override
	public int getDevuelveDiasPrestados() {
		// TODO Auto-generated method stub
		return this.diasPrestados;
	}

	int duracionPeliculaMin(){
		
		
		
		
		return 0;
		
	}
	
}
