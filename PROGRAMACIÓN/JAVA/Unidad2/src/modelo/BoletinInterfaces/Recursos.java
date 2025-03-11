package modelo.BoletinInterfaces;

public abstract class Recursos implements IPrestable{

String id;
String ubicacion;
/**
 * @param id
 * @param ubicacion
 */
public Recursos(String id, String ubicacion) {
	super();
	this.id = id;
	this.ubicacion = ubicacion;
}

protected String getId() {
	return id;
}
protected void setId(String id) {
	this.id = id;
}
protected String getUbicacion() {
	return ubicacion;
}
protected void setUbicacion(String ubicacion) {
	this.ubicacion = ubicacion;
}







}
