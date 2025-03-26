package controlador;

import java.util.ArrayList;
import java.util.List;

public class ExplicacionListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List < String > lista = new ArrayList <String> ();
		String [] tabla = new String[10];
		lista.add("Hola");
		lista.add("Adios");
		lista.add("Hola");
		lista.remove("Adios");
		
		for(String cadena : tabla) {
			
			System.out.println(cadena);
		}
		
		System.out.println(lista.size());
		
		
		
	}

}
