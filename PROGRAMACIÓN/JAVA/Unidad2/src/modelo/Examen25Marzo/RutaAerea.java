package modelo.Examen25Marzo;

public class RutaAerea extends RutaBase{

	protected RutaAerea(String nombre, int numHabitantes, int id, String ciudadOrigen, String ciudadDestino,
			double distancia) {
		super(nombre, numHabitantes, id, ciudadOrigen, ciudadDestino, distancia);
		// TODO Auto-generated constructor stub
	}

	TipoDeVuelo tipoDeVuelo;

double costeVuelo(double coste) {
	if(this.tipoDeVuelo.LOW_COST != null )
	return this.distancia* 0.75;
	
	if(this.tipoDeVuelo.NORMAL != null )
	return this.distancia* 1.1;

	if(this.tipoDeVuelo.EXPRESS != null )
	return this.distancia* 1.5;
	return coste  ;
}
	
	
	
}
