package modelo.BoletinInterfaces;

public class Leon extends Animal {

	public Leon(String nombreEspecie, TipoDeFamilia familia, String lugarHabita, Animal[] animalesComidos) {
		super(nombreEspecie, familia, lugarHabita, animalesComidos);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean ataca() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean huir() {
		// TODO Auto-generated method stub
		return false;
	}

}
