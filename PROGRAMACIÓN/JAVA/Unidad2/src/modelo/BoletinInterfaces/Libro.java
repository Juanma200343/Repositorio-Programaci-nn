package modelo.BoletinInterfaces;

public class Libro extends Recursos {

String autor;
String editorial;
String genero_literario;
int diasPrestados;


/**
 * @param id
 * @param ubicacion
 * @param autor
 * @param editorial
 * @param genero_literario
 * @param diasPrestados
 */

public Libro(String id, String ubicacion, String autor, String editorial, String genero_literario, int diasPrestados) {
	super(id, ubicacion,diasPrestados);
	this.autor = autor;
	this.editorial = editorial;
	this.genero_literario = genero_literario;
	this.diasPrestados = 21;
}

public String getAutor() {
	return autor;
}


public void setAutor(String autor) {
	this.autor = autor;
}



public String getEditorial() {
	return editorial;
}


public void setEditorial(String editorial) {
	this.editorial = editorial;
}



public String getGenero_literario() {
	return genero_literario;
}



public void setGenero_literario(String genero_literario) {
	this.genero_literario = genero_literario;
}



public int getDiasPrestados() {
	return diasPrestados;
}



public void setDiasPrestados(int diasPrestados) {
	this.diasPrestados = diasPrestados;
}



@Override
public boolean estaDisponible() {
	// TODO Auto-generated method stub
	return false;
}
@Override
public int getDevuelveDiasPrestados() {
	// TODO Auto-generated method stub
	return this.diasPrestados;
}


}
