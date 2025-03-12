package modelo.Refactorizar;

import java.util.Arrays;

public class PersonaRefactoriza {

	  String nombre;
	  IAccion [] acciones;

	  
	    /**
	 * @param nombre
	 */
	public PersonaRefactoriza(String nombre) {
		super();
		this.nombre = nombre;
		this.acciones = new IAccion[10];
	}



		public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public IAccion[] getAcciones() {
			return acciones;
		}



		public void setAcciones(IAccion[] acciones) {
			this.acciones = acciones;
		}



		public void identificarse() {
	        System.out.println("Soy una persona y me llamo " + nombre);
	    }



		@Override
		public String toString() {
			return "PersonaRefactoriza [nombre=" + nombre + ", acciones=" + Arrays.toString(acciones) + "]";
		}
	}







	/*class Empleado extends PersonaRefactoriza {
	    public Empleado(String nombre) {
			super(nombre);
			// TODO Auto-generated constructor stub
		}

		public void trabajar() {
	        System.out.println(nombre + " está trabajando.");
	    }
	}*/


	/*class Cliente extends PersonaRefactoriza {
	    public Cliente(String nombre) {
			super(nombre);
			// TODO Auto-generated constructor stub
		}

		public void comprar() {
	        System.out.println(nombre + " está comprando.");
	    }
	}/*


	// Agregamos más clases para hacer evidente el problema


	/*class Estudiante extends PersonaRefactoriza {
	    public Estudiante(String nombre) {
			super(nombre);
			// TODO Auto-generated constructor stub
		}

		public void estudiar() {
	        System.out.println(nombre + " está estudiando.");
	    }
	
		class EstudianteEmpleado extends Estudiante {
		    public EstudianteEmpleado(String nombre) {
				super(nombre);
				// TODO Auto-generated constructor stub
			}

			public void trabajar() {
		        System.out.println(nombre + " está estudiando y trabajando.");
		    }
		}

	
	}*/


