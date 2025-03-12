package modelo.Refactorizar;

public class Cliente implements IAccion {

	@Override
	public String ejecutaAccion() {
		// TODO Auto-generated method stub
		return "El cliente compra";
	}

	public String toString() {
		return  ejecutaAccion();
	}

}
