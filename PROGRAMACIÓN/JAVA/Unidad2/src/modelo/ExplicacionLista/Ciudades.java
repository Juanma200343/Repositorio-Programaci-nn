package modelo.ExplicacionLista;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ciudades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> ciudades = new LinkedList<String>();
		ciudades.add("Madrid");
		ciudades.add("Barcelona");
		ciudades.add("Sevilla");
		ciudades.add("Madrid"); //repetido

		for (String cad : ciudades) {
			System.out.println(cad);
		}
		
		
		//Iteramos sobre el conjunto
		Iterator<String> itr = ciudades.iterator();
		while(itr.hasNext())
			 System.out.println(itr.next());
		
		
		
	}

}
