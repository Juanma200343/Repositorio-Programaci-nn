package modelo.Simulacro19Marzo;

public class Coche extends VehiculoCombustible {

	public Coche(String id, String[] alquiler, String marca, String modelo) {
		super(id, alquiler, marca, modelo);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean siEstaDisponible() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean estaAlquilado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public float getPrecioDia() {
		// TODO Auto-generated method stub
		return 0;
	}

}
