package modelo.Examen25Marzo;

public class RutaTerrestre extends RutaBase {

	protected RutaTerrestre(String nombre, int numHabitantes, int id, String ciudadOrigen, String ciudadDestino,
			double distancia) {
		super(nombre, numHabitantes, id, ciudadOrigen, ciudadDestino, distancia);
		// TODO Auto-generated constructor stub
		this.costeCienKms = distancia * costeCienKms;
	
	}

	private boolean siEscarretera;
	static double costeCienKms = 0.65;
	

	
	@Override
	public String getTipoRuta() {
		// TODO Auto-generated method stub
		return super.getTipoRuta();
	}
	
	
	
	
}
