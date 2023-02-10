package ejercicio2;

public class Coche implements combustible{

	public void petróleo(String msg) {
		
		System.out.println("El coche usa gasolina");
		
		if(msg != "diesel") {
			
			System.out.println("Tu vehiculo no es un coche");
			
		}
		else {
			
			System.out.println("Tu vehiculo es un coche");
			
		}
		
	}
	
}
