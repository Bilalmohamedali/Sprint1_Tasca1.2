package ejercicio1;

import java.util.ArrayList;

public class Venta {

	private ArrayList<Producto> productos = new ArrayList<>();
	private int precioTotal;
	
	public Venta() {
			super();
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public int getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(int precioTotal) {
		this.precioTotal = precioTotal;
	}

	@Override
	public String toString() {
		return "Venta [productos=" + productos + ", precioTotal=" + precioTotal + "]";
	}
	
	
	public void calcularTotal() throws VentaBuildException {
		
		int i = 0;
		int j = 5;
		
		for(i=0; i<j; i++) {
			precioTotal += productos.get(i).getPrecio();
		}
		
		System.out.println("El precio total es: " + precioTotal);
	}
	
	
}
