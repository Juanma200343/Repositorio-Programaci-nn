package modelo.EjercicioInterfaz;

public class Animal extends SerVivo {

	public Animal(int edad) {
		super(edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean estaVivo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean seDesplaza() {
		// TODO Auto-generated method stub
		return false;
	}

	
	void come() {
		System.out.println("Los animales comen");
	}
	
	void respira() {
		System.out.println("Los animales respiran");
	}
	
}
