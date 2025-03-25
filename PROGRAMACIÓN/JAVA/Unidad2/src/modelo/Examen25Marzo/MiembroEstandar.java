package modelo.Examen25Marzo;

public  class MiembroEstandar extends MiembroBase {

	protected MiembroEstandar(int id, String email, String nombre, String[] amigos, int contadorAmigos) {
		super(id, email, nombre, amigos, contadorAmigos);
		// TODO Auto-generated constructor stub
	}
	
	
	static int maximoAmigos = 50;

	


	@Override
	String getTipoUsuario() {
		// TODO Auto-generated method stub
		return null;
	}






	@Override
	String addAmigo(String[] tablaAmigo) {
		// TODO Auto-generated method stub
		return null;
	}

}
