package modelo;

public abstract class Figura {

private String color;

/**
 * @param color
 */
public Figura(String color) {
	super();
	this.color = color;
}

public abstract double calculaArea();

public String getColor() {
	
	return color;
	
}


}
