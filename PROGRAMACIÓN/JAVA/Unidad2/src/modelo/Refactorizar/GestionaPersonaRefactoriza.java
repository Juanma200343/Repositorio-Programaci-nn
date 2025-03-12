package modelo.Refactorizar;

public class GestionaPersonaRefactoriza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*PersonaRefactoriza carlos = new PersonaRefactoriza("Carlos R.");
	
	IAccion[] acciones = carlos.getAcciones();
	
	acciones[0] = new Estudiante();
	System.out.println(carlos);*/
	
	/*PersonaRefactoriza cristina = new PersonaRefactoriza("Cristina");

	IAccion[] a = cristina.getAcciones();
	a[0] = new Estudiante();
	a[1] = new Empleado();
	System.out.println(cristina);*/
	
		/*PersonaRefactoriza fernando = new PersonaRefactoriza("Fernando");

		IAccion[] f = fernando.getAcciones();
		f[0] = new Estudiante();
		f[1] = new Empleado();
		f[2] = new Cliente();
		System.out.println(fernando);*/
		
		PersonaRefactoriza LiLi = new PersonaRefactoriza("LiLi");

		IAccion[] l = LiLi.getAcciones();
		l[0] = new Estudiante();
		l[1] = new Empleado();
		l[2] = new Cliente();
		l[3] = new Artista();
		System.out.println(LiLi);
		
		
	
	}

}
