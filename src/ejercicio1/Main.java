package ejercicio1;
 
public class Main {

	public static void main(String[] args) throws VentaBuildException {
		// TODO Auto-generated method stub
		
		Producto miProducto = new Producto("teclado", 10);
		
		Venta miVenta = new Venta();
		
		miVenta.getProductos().add(miProducto);
		
		try {
			miVenta.calcularTotal();
		} catch (IndexOutOfBoundsException d) {
			
			throw new VentaBuildException("Necesitas añadir un producto para realizar la compra");
		}

	}

}
