package orientacionAObjeto;

public class Alumnos {
String nombre;
String dni;
Float nota;

String pasoACadena() {
	String cadena = "Nombre:" + nombre + " "+ "DNI: "+ " "+ dni + " " +"Nota: "+ " " + nota;
	
	return cadena;
}

boolean estaAprobado() {
	boolean aprobado = true;
	if(nota >= 5)
	{
		aprobado = true;
	}
	else
	{
		aprobado = false;
	}
	return aprobado;
}
}
