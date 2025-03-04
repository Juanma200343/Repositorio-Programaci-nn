package modelo;

public class Triangulo extends Figura{









/**
	 * @param color
	 * @param base
	 * @param altura
	 */
	public Triangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}


double base ;
double altura;


@Override
public double calculaArea() {
	// TODO Auto-generated method stub
	return base*altura/2;
}




}
