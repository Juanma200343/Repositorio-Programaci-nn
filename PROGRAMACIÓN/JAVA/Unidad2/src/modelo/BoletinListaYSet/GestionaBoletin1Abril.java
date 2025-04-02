package controlador;

import java.time.LocalDate;

import modelo.Boletin1Abril.Animal;
import modelo.Boletin1Abril.Medio;
import modelo.Boletin1Abril.clasificacionComida;
import modelo.Boletin1Abril.clasificacionGestacion;

public class GestionaBoletin1Abril {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a1 = new Animal("SDf23414", "Roberto", "Perro", 3, LocalDate.now(), 46.7, Medio.TIERRA, clasificacionComida.OMNIVOROS, clasificacionGestacion.VIVIPAROS);
		Animal a2 = new Animal("AD3234d", "Alberto", "Pato", 2, LocalDate.now(), 22.0, Medio.AGUA, clasificacionComida.OMNIVOROS, clasificacionGestacion.VIVIPAROS);
		Animal a3 = new Animal("ASDD32414fsf", "Carlota", "Gallina", 5, LocalDate.now(), 10.0, Medio.TIERRA, clasificacionComida.OMNIVOROS, clasificacionGestacion.OVIPARAROS);
		Animal a4 = new Animal("DGD1442345", "Daniel", "Golondrina", 1, LocalDate.now(), 13.0, Medio.AIRE, clasificacionComida.OMNIVOROS, clasificacionGestacion.OVIPARAROS);

		
		System.out.println(a1);
		
		
	}

}
