package EjercicioCochesInteligente;

import java.util.Objects;

public class sensor {

	private double distancia;
	private double velocidad;
	
	boolean  avisarObstaculo() {
		return false;
	}
	
	boolean  avisarVelocidad() {
		return false;
	}

	/**
	 * @param distancia
	 * @param velocidad
	 */
	protected sensor(double distancia, double velocidad) {
		super();
		//this.distancia = distancia;
		this.velocidad = velocidad;
		setDistancia(distancia);
	}

	protected double getDistancia() {
		return distancia;
	}

	protected void setDistancia(double distancia) {
		if(distancia > 0)
			this.distancia = distancia;
			
			else {
				
				this.distancia = 0;
			}
			
	}

	protected double getVelocidad() {
		return velocidad;
	}

	protected void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(distancia, velocidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		sensor other = (sensor) obj;
		return Double.doubleToLongBits(distancia) == Double.doubleToLongBits(other.distancia)
				&& Double.doubleToLongBits(velocidad) == Double.doubleToLongBits(other.velocidad);
	}

	@Override
	public String toString() {
		return "sensor [distancia=" + distancia + ", velocidad=" + velocidad + "]";
	}
	
	
	
}
