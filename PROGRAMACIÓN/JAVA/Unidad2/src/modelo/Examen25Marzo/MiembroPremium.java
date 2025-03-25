package modelo.Examen25Marzo;

public class MiembroPremium extends MiembroBase {

	static int maximoAmigos = 100;
	TipoPremium tipoPremium;

	/**
	 * @param id
	 * @param email
	 * @param nombre
	 * @param amigos
	 * @param contadorAmigos
	 * @param tipoPremium
	 */
	protected MiembroPremium(int id, String email, String nombre, String[] amigos, int contadorAmigos,
			TipoPremium tipoPremium) {
		super(id, email, nombre, amigos, contadorAmigos);
		this.tipoPremium = tipoPremium;
	}


	@Override
	String addAmigo(String[] tablaAmigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String getTipoUsuario() {
		// TODO Auto-generated method stub
	
		
		return null;
	}

	
	
	
	
}
