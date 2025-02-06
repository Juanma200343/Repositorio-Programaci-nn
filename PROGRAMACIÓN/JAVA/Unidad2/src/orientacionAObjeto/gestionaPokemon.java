package orientacionAObjeto;

public class gestionaPokemon {

	public static void main(String[] args) {
		Pokemon pikachu = new Pokemon();
		pikachu.nombre = "Pikachu";  
		pikachu.nivel = 12;
		pikachu.tipo = "Eléctrico";
		
		Pokemon mew = new Pokemon();
		mew.nombre = "Mew";  
		mew.nivel = 20;
		mew.tipo = "Psíquico";
		
		String cadenaPikachu = pikachu.convierteEnCadena();
		System.out.println(cadenaPikachu);
		
		String cadenaMew = mew.convierteEnCadena();
		System.out.println(cadenaMew); 
		
		
		boolean gana = pikachu.luchar(mew);
		System.out.println("Pikachu gana a mew: " + gana);
		
		System.out.println("Pokemon 1 tiene un nombre: "+pikachu.nombre + " "+"su nivel es:"+pikachu.nivel +" "+ "su tipo es: "+pikachu.tipo);
		System.out.println("Pokemon 1 tiene un nombre: "+ mew.nombre +" " +"su nivel es: "+ " " + mew.nivel + "su tipo es: " + mew.tipo);

	}

}
