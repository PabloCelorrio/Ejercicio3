package interfacelog;

/**
 * A partir de esta interfaz se van a poder almacenar mensajes en memoria, visualizarlos por pantalla, almacenarlos en ficheros, etc.
 * @author Pablo Celorrio
 * @version 09/02/2023
 *
 */


public interface Interfaz {

	/**
	 * La constante prefijo almacena un prefijo que llevarán todos los mensajes
	 * La constante totalMensajes cuenta los mensajes mostrados, almacenados.
	 * 
	 */
	
	public static final String PREFIJO = "Log>";
	public static final int TOTALMENSAJES = 0;
	
	public abstract void log(String msg);
	
}
