package modelo;

public class CorreoElectronico {
	
	private String nombre;
	private String dominio;


	/**
	 * @param nombre
	 */
	public CorreoElectronico(String nombreCorreoElectronico) {
		super();
		this.nombre = nombre;
	}


	public static boolean validaCorreo(String correo) {
		boolean valida = true;
		correo = "aaaaa@aaaa.com";
		valida = correo.matches("\\[A-Za-z]+@[A-Za-z].[A-Za-z]");
		System.out.println(valida);
		return valida;
	}
	
	
	
	
	
}
