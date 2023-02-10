package ejercicio2;

public class Avion implements combustible{

	public void petróleo(String msg) {
		
		System.out.println("El avion usa queroseno");
		
		if(msg != "queroseno") {
			
			System.out.println("Tu vehículo no es un avión");
			
		}
		else {
			
			System.out.println("Tu vehículo es un avión");
			
		}
		
	}
	
}
