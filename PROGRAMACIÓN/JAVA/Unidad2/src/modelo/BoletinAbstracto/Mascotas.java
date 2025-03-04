package modelo.BoletinAbstracto;

import java.time.LocalDate;

public abstract class Mascotas {
	
	String nombre;
	int edad;
	String estado;
	LocalDate fechaNacimiento;


public abstract String muestra();
public abstract String habla();

public boolean cumpleaños() {
	
	
	
	return true;
}


public boolean  morir() {
	
	
	return true;
	
}





}
