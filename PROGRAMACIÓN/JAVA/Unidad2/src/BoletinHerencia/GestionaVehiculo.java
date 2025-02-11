package BoletinHerencia;

public class GestionaVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo c1 = new Vehiculo("Juan",5,5);
		Vehiculo c2 = new Vehiculo("Pepe",3,4);
		
		boolean esVehiculo = c2 instanceof Vehiculo;
		System.out.println("Es vehiculo?" + esVehiculo);
	}

}
