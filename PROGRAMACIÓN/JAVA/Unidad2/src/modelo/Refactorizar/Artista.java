package modelo.Refactorizar;

public class Artista implements IAccion {

	@Override
	public String  ejecutaAccion() {
		// TODO Auto-generated method stub
		return "El artista pinta";
	}

	public String toString() {
		return  ejecutaAccion();
	}
	
	
}
