package modelo.Examen25Marzo;

import java.util.Objects;

public abstract class MiembroBase {

	private int id;
	private String email;
	private String nombre;
	protected String [] amigos;
	private int contadorAmigos;
	static int contadorIdentificador;
	/**
	 * @param id
	 * @param email
	 * @param nombre
	 * @param amigos
	 * @param contadorAmigos
	 */
	
	protected MiembroBase(int id, String email, String nombre, String [] amigos, int contadorAmigos) {
		super();
		this.id = id;
		this.email = email;
		this.nombre = nombre;
		this.amigos = new String [4] ;
		this.contadorAmigos = contadorAmigos;
		this.contadorIdentificador = contadorIdentificador +1;
	}
	
	protected String [] getAmigos() {
		return amigos;
	}
	protected void setAmigos(String [] amigos) {
		this.amigos = amigos;
	}

	protected int getContadorAmigos() {
		return contadorAmigos;
	}

	protected void setContadorAmigos(int contadorAmigos) {
		this.contadorAmigos = contadorAmigos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amigos, contadorAmigos, email, id, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MiembroBase other = (MiembroBase) obj;
		return Objects.equals(amigos, other.amigos) && contadorAmigos == other.contadorAmigos
				&& Objects.equals(email, other.email) && id == other.id && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "MiembroBase [id=" + id + ", email=" + email + ", nombre=" + nombre + ", amigos=" + amigos
				+ ", contadorAmigos=" + contadorAmigos + "]";
	}
	

 boolean isAmigo(String[] esamigo) {

	 
	 
	 return true;
 }
 
 
 
 
 
 
abstract String addAmigo(String [] tablaAmigo);
abstract String getTipoUsuario();




}
