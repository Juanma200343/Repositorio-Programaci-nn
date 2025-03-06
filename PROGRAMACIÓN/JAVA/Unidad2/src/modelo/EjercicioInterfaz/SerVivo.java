package modelo.EjercicioInterfaz;

import java.util.Objects;

public abstract class SerVivo {

	int edad;
	
/**
 * @param edad
 */
public SerVivo(int edad) {
	super();
	this.edad = edad;
}








protected int getEdad() {
	return edad;
}




protected void setEdad(int edad) {
	this.edad = edad;
}


@Override
public String toString() {
	return "SerVivo [edad=" + edad + "]";
}


@Override
public int hashCode() {
	return Objects.hash(edad);
}




@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	SerVivo other = (SerVivo) obj;
	return edad == other.edad;
}



abstract boolean estaVivo();
abstract boolean seDesplaza();

}
