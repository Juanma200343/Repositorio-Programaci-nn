package modelo.Refactorizar;

public class Estudiante implements IAccion{
	
	@Override
	public String ejecutaAccion() {
		// TODO Auto-generated method stub
	return "Estudiante estudia";
	}

	@Override
	public String toString() {
		return ejecutaAccion();
	}




}
