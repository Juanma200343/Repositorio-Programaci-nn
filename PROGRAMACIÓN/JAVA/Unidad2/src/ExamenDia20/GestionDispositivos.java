package ExamenDia20;

public class GestionDispositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dispositivo dis1 = new Dispositivo("Apple","Iphone",1000);
		System.out.println(dis1);
		
		Smartphone smart1 = new Smartphone("Apple","Iphone",1000,true,3);
		System.out.println(smart1);
		
		PCSobremesa orde1 = new PCSobremesa("Apple","Iphone",1000,true,3);
		System.out.println(smart1);
	}

}
