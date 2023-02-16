package ejercicio1;

public class VentaBuildException extends Exception{
	
	public VentaBuildException(String mensaje) {
		super(mensaje);
		System.out.println(mensaje);
	}

}
