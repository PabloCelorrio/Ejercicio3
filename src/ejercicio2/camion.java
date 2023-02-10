package ejercicio2;

public class camion implements combustible{

	public void petróleo(String msg) {
		
		System.out.println("Un camion usa diesel");
		
		if(msg != "diesel") {
			
			System.out.println("Tu vehiculo no es un camión");
			
		}
		else {
			
			System.out.println("Tu vehiculo es un camión");
			
		}
		
	}
	
}
