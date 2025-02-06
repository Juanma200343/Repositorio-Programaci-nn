package condicionales;

public class EjemploFor {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		
		for (i = 1; i<=3; i++) {
			System.out.println("Bucle externo, i= " +i);
		}
		while(j <=i) {
			System.out.println("Bucle interno, j=" +j);
			j++;
		}
		
		
		
		
		
		
		
	}

}
