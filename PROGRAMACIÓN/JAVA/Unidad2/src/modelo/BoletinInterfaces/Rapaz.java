package modelo.BoletinInterfaces;

public class Rapaz extends Animal {

	public Rapaz(String nombreEspecie, TipoDeFamilia familia, String lugarHabita, Animal[] animalesComidos) {
		super(nombreEspecie, familia, lugarHabita, animalesComidos);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean ataca() {
		boolean ataca = true ;
		
			
		return ataca;
	}

	@Override
	boolean huir() {
		// TODO Auto-generated method stub
		return false;
	}







}
