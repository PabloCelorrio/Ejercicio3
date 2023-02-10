package interfacelog;

import java.util.Date;

/**
 * Esta clase implementa la interface Interfaz, implementa el método log para visualizar los mensajes por pantalla
 * @author Pablo Celorrio
 * @version 09/02/2023
 */

public class LogConsola implements Interfaz{

	//Variable que indica la fecha del mensaje
	Date fecha;
	
	public LogConsola() {
		
		super();
		
	}
	
	/**
	 * Implementación del método log de la interface Interfaz para mostrar mensaje por pantalla con la fecha
	 */
	
	public void log(String msg) {
		
		fecha = new Date();
		System.out.println(PREFIJO + " " + fecha + " " + msg);
		
	}
	
}
