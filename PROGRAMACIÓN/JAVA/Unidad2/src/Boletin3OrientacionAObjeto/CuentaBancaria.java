package Boletin3OrientacionAObjeto;

public class CuentaBancaria {

	/**
	 * @param saldo
	 * @param numCuenta
	 * @param titular
	 */
	public CuentaBancaria(double saldo, String numCuenta, Persona titular) {
		super();
		this.saldo = saldo;
		this.numCuenta = numCuenta;
		this.titular = titular;
	}

	/**
	 * @param saldo
	 * @param numCuenta
	 * @param titular
	 */


	private double saldo;
	private String numCuenta;
	private Persona titular;
	private Persona autorizado;
	
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public Persona getTitular() {
		return titular;
	}
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	public Persona getAutorizado() {
		return autorizado;
	}
	public void setAutorizado(Persona autorizado) {
		this.autorizado = autorizado;
	}
	
	private boolean validacionImportePositivo(double importe) {
	
		return importe > 0 ;
	
	}
	
	private boolean validarAutorizado(String dni) {
	
	return dni != null && dni.equals(autorizado.getDni());
	}
	
	public void ingresarDinero(Persona personaGestion, double ingreso) {
	if (validarAutorizado(personaGestion.getDni()) && validacionImportePositivo(ingreso) {
	
	setSaldo(getSaldo() + ingreso);
	
	
	} else {
		
		System.out.println("Error el saldo no es valido");
		
		
	}
	
	
	public void retiradaDinero(Persona personaGestion, double reintegro) {
		if (validarAutorizado(personaGestion.getDni()) && validacionImportePositivo(reintegro)


				 && getSaldo() >= reintegro) {


				 } else {


				 System.out.println("ERROR: No es autorizado o ingreso incorrecto.");


				 }
	
	
	}
	
	
	
	public void eliminarAutorizado(String dni) {
		
		if (validarAutorizado(dni)) {
			
		autorizado = null;
		
		}else {
		
		System.out.println("Error la persona no esta autorizada");
		
		
	}

	 
	 
	 
	 
	 
	 
	 
	 
	 }
	
	
	
	
	
