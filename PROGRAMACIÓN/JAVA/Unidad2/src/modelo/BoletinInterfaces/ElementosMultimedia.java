package modelo.BoletinInterfaces;

public class ElementosMultimedia extends Recursos{


	/**
	 * @param id
	 * @param ubicacion
	 * @param diasPrestados
	 */
	public ElementosMultimedia(String id, String ubicacion, int diasPrestados) {
		super(id, ubicacion, diasPrestados);
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
