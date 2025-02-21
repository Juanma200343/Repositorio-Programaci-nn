package ExpresionesRegulares;

public class ValidaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String numero = "10107896x";
	String numeroconCaracter = "1010x";
	String caracter = "abcdjZhKTRSoP";
	

	System.out.println(numero.matches("\\d{8}[A-Za-z]{1}"));
	//numero.matches("[0-9]");
	
	//System.out.println(caracter.matches("[A-Za-z]{1}"));

	
	
	
	}

}
