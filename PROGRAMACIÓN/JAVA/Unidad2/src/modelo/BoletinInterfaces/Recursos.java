package modelo.BoletinInterfaces;

public abstract class Recursos implements IPrestable{

String id;
String ubicacion;
int diasPrestados;

public int getDiasPrestados() {
	return diasPrestados;
}

public void setDiasPrestados(int diasPrestados) {
	this.diasPrestados = diasPrestados;
}

/**
 * @param id
 * @param ubicacion
 * @param diasPrestados 
 */
public Recursos(String id, String ubicacion, int diasPrestados) {
	super();
	this.id = id;
	this.ubicacion = ubicacion;
	this.diasPrestados = diasPrestados;
}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getUbicacion() {
	return ubicacion;
}
public void setUbicacion(String ubicacion) {
	this.ubicacion = ubicacion;
}







}
