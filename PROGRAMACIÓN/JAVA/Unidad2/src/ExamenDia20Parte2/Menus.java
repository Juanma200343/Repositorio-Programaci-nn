package ExamenDia20Parte2;

import java.util.Objects;

public class Menus {

	private String identificador;
	private String nombre;
	private int consumoCalorico;
	private double precioVentaMenu;
	private double precioCoste;
	private int unidadesRepartidas;
	private TipoDeDieta vegetariano;
	private TipoDeDieta vegano;
	private TipoDeDieta sin_Gluten;
	private TipoDeDieta sin_Lactosa;
	/**
	 * @param identificador
	 * @param nombre
	 * @param consumoCalorico
	 * @param precioVentaMenu
	 * @param precioCoste
	 * @param unidadesRepartidas
	 * @param vegetariano
	 * @param vegano
	 * @param sin_Gluten
	 * @param sin_Lactosa
	 */
	protected Menus(String identificador, String nombre, int consumoCalorico, double precioVentaMenu,
			double precioCoste, int unidadesRepartidas, TipoDeDieta vegetariano, TipoDeDieta vegano,
			TipoDeDieta sin_Gluten, TipoDeDieta sin_Lactosa) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.consumoCalorico = consumoCalorico;
		this.precioVentaMenu = precioVentaMenu;
		this.precioCoste = precioCoste;
		this.unidadesRepartidas = unidadesRepartidas;
		this.vegetariano = vegetariano;
		this.vegano = vegano;
		this.sin_Gluten = sin_Gluten;
		this.sin_Lactosa = sin_Lactosa;
		this.setPrecioVentaMenu(precioVentaMenu);
		this.setPrecioCoste(precioCoste);
		this.setConsumoCalorico(consumoCalorico);
	
	}
	
	

	protected String getIdentificador() {
		return identificador;
	}
	protected void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected int getConsumoCalorico() {
		return consumoCalorico;
	}
	protected void setConsumoCalorico(int consumoCalorico) {
		if (consumoCalorico < 1000)
			System.out.println("Estas en deficit calorico");
		else {
			System.out.println("No estas en deficit calorico");
		}
		
		
		this.consumoCalorico = consumoCalorico;
	}
	
	
	protected double getPrecioVentaMenu() {
		return precioVentaMenu;
	}
	
	protected  void setPrecioVentaMenu(double precioVentaMenu) {
		if (precioVentaMenu < 0 )
			System.out.println("Error el precio no puede ser negativo");
		else {
			precioVentaMenu = precioVentaMenu *30/100 ;
		}
		this.precioVentaMenu = precioVentaMenu;
	}
	
	
	protected double getPrecioCoste() {
		return precioCoste;
	}
	
	
	protected void setPrecioCoste(double precioCoste) {
		if (precioCoste < 0 )
			System.out.println("Error el precio coste no puede ser negativo");
		else {
			precioCoste = precioCoste *30/100 ;
		}
		
		this.precioCoste = precioCoste;
	}
	protected int getUnidadesRepartidas() {
		return unidadesRepartidas;
	}
	protected void setUnidadesRepartidas(int unidadesRepartidas) {
		this.unidadesRepartidas = unidadesRepartidas;
	}
	protected TipoDeDieta getVegetariano() {
		return vegetariano;
	}
	protected void setVegetariano(TipoDeDieta vegetariano) {
		this.vegetariano = vegetariano;
	}
	protected TipoDeDieta getVegano() {
		return vegano;
	}
	protected void setVegano(TipoDeDieta vegano) {
		this.vegano = vegano;
	}
	protected TipoDeDieta getSin_Gluten() {
		return sin_Gluten;
	}
	protected void setSin_Gluten(TipoDeDieta sin_Gluten) {
		this.sin_Gluten = sin_Gluten;
	}
	protected TipoDeDieta getSin_Lactosa() {
		return sin_Lactosa;
	}
	protected void setSin_Lactosa(TipoDeDieta sin_Lactosa) {
		this.sin_Lactosa = sin_Lactosa;
	}



	@Override
	public int hashCode() {
		return Objects.hash(consumoCalorico, identificador, nombre, precioCoste, precioVentaMenu, sin_Gluten,
				sin_Lactosa, unidadesRepartidas, vegano, vegetariano);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menus other = (Menus) obj;
		return consumoCalorico == other.consumoCalorico && Objects.equals(identificador, other.identificador)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precioCoste) == Double.doubleToLongBits(other.precioCoste)
				&& Double.doubleToLongBits(precioVentaMenu) == Double.doubleToLongBits(other.precioVentaMenu)
				&& sin_Gluten == other.sin_Gluten && sin_Lactosa == other.sin_Lactosa
				&& unidadesRepartidas == other.unidadesRepartidas && vegano == other.vegano
				&& vegetariano == other.vegetariano;
	}



	@Override
	public String toString() {
		return "Menus [identificador=" + identificador + ", nombre=" + nombre + ", consumoCalorico=" + consumoCalorico
				+ ", precioVentaMenu=" + precioVentaMenu + ", precioCoste=" + precioCoste + ", unidadesRepartidas="
				+ unidadesRepartidas + ", vegetariano=" + vegetariano + ", vegano=" + vegano + ", sin_Gluten="
				+ sin_Gluten + ", sin_Lactosa=" + sin_Lactosa + "]";
	}
	
	
}
