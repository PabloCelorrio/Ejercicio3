package interfacelog;

import java.util.Date;

public class LogMemoria implements Interfaz{
	
	private Date fecha;
	private String[] logs;
	
	public LogMemoria(Date fecha) {
		
		super();
		this.fecha = fecha;
		
	}

	public void log(String msg) {
		
		fecha = new Date();
		añadirMensaje(PREFIJO + " " + fecha + " " + msg);
		
	}
	
	public void añadirMensaje(String msg) {
		
		String[] logsAumento = new String[logs.length + 1];
		
		int i;
		for (i = 0; i < logs.length; i++) {
			
			logsAumento[i] = logs[i]; 
			
		}
		
		logsAumento[i] = msg;
		logs = logsAumento;
		
	}
	
}
