package modelo;

public class conversor {

	 final static float DOLARES = 1;
	 final static float EUROS = 0,95 ;
	
	public static float conversionDolar() {
		
	float conversionDolar = EUROS / DOLARES;

		return conversionDolar;
		
	}

	public static float conversionEuros(float dolar) {
		
		float conversionEuros= dolar * DOLARES;

			return conversionEuros;
			
		}


}
