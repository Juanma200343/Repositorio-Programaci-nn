package modelo.Refactorizar;

public class Empleado implements IAccion {

	@Override
	public String ejecutaAccion() {
		// TODO Auto-generated method stub
		return "Trabajor que trabaja";
	}

	@Override
	public String toString() {
		return  ejecutaAccion();
	}




}
