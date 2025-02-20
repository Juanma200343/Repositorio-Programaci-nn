package ExamenDia20;

public class Telefono extends Dispositivo{

	private boolean tieneTecladoFisico;

	/**
	 * @param marca
	 * @param modelo
	 * @param precio
	 * @param tieneTecladoFisico
	 */
	public Telefono(String marca, String modelo, double precio, boolean tieneTecladoFisico) {
		super(marca, modelo, precio);
		this.tieneTecladoFisico = tieneTecladoFisico;
	}

	protected boolean getTieneTecladoFisico() {
		return tieneTecladoFisico;
	}

	protected void setTieneTecladoFisico(boolean tieneTecladoFisico) {
		if (tieneTecladoFisico = true)
			System.out.println("Tiene teclado fisico");
		else {
			System.out.println("No tiene teclado fisico");
		}
		this.tieneTecladoFisico = tieneTecladoFisico;
	}
	
	
	
}
