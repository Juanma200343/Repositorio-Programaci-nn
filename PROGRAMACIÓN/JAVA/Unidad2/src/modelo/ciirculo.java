package modelo;

public class ciirculo extends Figura {


public ciirculo(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}


static final double PI = 3.1416;
double radio;


@Override
public double calculaArea() {
	// TODO Auto-generated method stub
	return PI*radio*radio;
}





}
