package Practica1;

public class NullPointerExceptionEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String palabra = null;
		 if (palabra != null) {
			 int longitud = palabra.length();
			 System.out.println("Longitud de la palabra: " + longitud);
			 
		 } else  {
		 	System.out.println("Palabra es nulo");
		 }
	

	}

}
