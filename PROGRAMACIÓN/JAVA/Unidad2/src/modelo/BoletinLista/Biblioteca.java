package modelo.BoletinLista;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Libros> listaLibros;

	public Biblioteca(List<Libros> listaLibros) {
		super();
		this.listaLibros = new ArrayList<Libros>();
	}

	protected List<Libros> getListaLibros() {
		return listaLibros;
	}

	protected void setListaLibros(List<Libros> listaLibros) {
		this.listaLibros = listaLibros;
	}

	@Override
	public String toString() {
		return "Biblioteca [listaLibros=" + listaLibros + "]";
	}

	public void anyadirLibro(Libros l) {
		listaLibros.add(l);
	}

	public Libros buscarLibro(String titulo) {
		Libros libroEncontrado = null;
		for (Libros libro : listaLibros) {
			if (libro.getTitulo().equalsIgnoreCase(titulo)) {
				libroEncontrado = libro;
			}
		}
		return libroEncontrado;
	}

	public List<Libros> buscarLibroAutor(String autor) {
	    List<Libros> librosEncontrados = new ArrayList<>();
	    for (Libros libro : listaLibros) {
	        if (libro.getAutor().equalsIgnoreCase(autor)) {
	            librosEncontrados.add(libro);
	        }
	    }
	    return librosEncontrados;
	}
	
	public void prestarLibro(Libros l) throws BibliotecaException{
		if (l.getEstado() != EstadoLibro.PRESTADO) {
			l.setEstado(EstadoLibro.PRESTADO);
			System.out.println("El libro \"" + l.getTitulo() + "\" ha sido prestado.");
		
		} else {
			throw new BibliotecaException("El libro \"" + l.getTitulo() + "\" ya está prestado.");
		}

	}

	public void devolverLibro(Libros l) throws BibliotecaException {
		if (l.getEstado() != EstadoLibro.LIBRE) {
			l.setEstado(EstadoLibro.LIBRE);
			System.out.println("El libro \"" + l.getTitulo() + "\" ha sido devuelto.");
		} else {
			throw new BibliotecaException("El libro \"" + l.getTitulo() + "\" ya ha sido devuelto..");

		}

	}

}


